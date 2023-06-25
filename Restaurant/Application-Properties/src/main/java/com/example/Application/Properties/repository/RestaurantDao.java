package com.example.Application.Properties.repository;

import com.example.Application.Properties.model.Restaurant;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class RestaurantDao {

    List<Restaurant> detail;
    public RestaurantDao(){
        System.out.println("This is a dummy");
        detail= new ArrayList<>();
        detail.add(new Restaurant("0","Sai restaurant" ,"warud","9545293148" ,10 , "Biryani"));
    }

    public List<Restaurant> fetchAll() {
        return detail;
    }
    public boolean save(Restaurant restaurant) {
        detail.add(restaurant);
        return true;
    }
    public List<Restaurant> getRestaurantFromDatabase(){
        return detail;
    }
    public boolean remove(Restaurant restaurant) {
        detail.remove(restaurant);
        return true;
    }
    public boolean update(String id , String specialty){
        boolean updateStatus = false;
        for(Restaurant restaurant: detail){
            //remove
            remove(restaurant);
            //update
            restaurant.setSpecialty(specialty);
            //add
            save(restaurant);
           return true;
        }
        return false;
    }
}
