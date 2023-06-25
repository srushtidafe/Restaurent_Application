package com.example.Application.Properties.service;

import com.example.Application.Properties.model.Restaurant;
import com.example.Application.Properties.repository.RestaurantDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class RestaurantService {

    @Autowired
    RestaurantDao restaurantDao;
    public List<Restaurant> getAllRestaurant() {
        return restaurantDao.fetchAll();
    }
    public String addRestaurant(Restaurant restaurant) {
        boolean status = restaurantDao.save(restaurant);
        if(status){
            return"Added......!!!!";
        }else{
            return "Not Added..!!";
        }
    }
    public Restaurant getRestaurantBaseOnId(String id) {

        if(id != null) {
            List<Restaurant> restaurantList = restaurantDao.getRestaurantFromDatabase();
            for (Restaurant restaurant : restaurantList) {
                if (restaurant.getId().equals(id)) {
                    return restaurant;
                }
            }
        }
        return null;
    }
    public String removeRestaurantById(String id) {
        boolean deleteResponce = false;
        String status;
        if(id != null){
            List<Restaurant> restaurantList = restaurantDao.getRestaurantFromDatabase();
            for(Restaurant restaurant: restaurantList){
                if(restaurant.getId().equals(id)){
                    deleteResponce = restaurantDao.remove(restaurant);
                    if(deleteResponce){
                        status = "Restaurant with id"+ id +" was deleted...!";
                    }else{
                        status ="Restaurant with id"+ id +" was not deleted...!";
                    }
                    return status;
                }
            }
           return "Restaurant with id"+ id +" Does not exist...!";
        }else{
            return "Invalid id";
        }
    }

    public String updateRestaurantById(String id , String specialty) {
        boolean updateStatus = restaurantDao.update(id ,specialty);
        if(updateStatus){
            return"Restaurant with id"+ id +" was deleted...!";
        }else{
            return"Restaurant with id"+ id +" was not deleted...!";
        }
    }

}
