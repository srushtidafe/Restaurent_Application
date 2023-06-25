package com.example.Application.Properties.controller;

import com.example.Application.Properties.model.Restaurant;
import com.example.Application.Properties.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Method;
import java.util.List;

@RestController
@RequestMapping(value = "/RestaurantManagement")
public class RestaurantController {
    @Autowired
    RestaurantService restaurantService;
    @GetMapping(value ="/Restaurant/All")
    public List<Restaurant> getAllRestaurant(){
        return restaurantService.getAllRestaurant();
    }
    //adding the product
    @PostMapping(value ="/Restaurant")
    String AddProduct(@RequestBody Restaurant restaurant){
        return restaurantService.addRestaurant(restaurant);
    }
    @RequestMapping(value ="/getRestaurant/{id}", method = RequestMethod.GET)
    public Restaurant getRestaurantById(String id){
        return restaurantService.getRestaurantBaseOnId(id);
    }

    @DeleteMapping(value ="/Delete/{id}")
    public String deleteDetailById(@PathVariable String id){
        return restaurantService.removeRestaurantById(id);
    }
    @PutMapping(value = "/updateDetail/{id}/{specialty}")
    public String updateRestaurantById(@PathVariable String id ,@PathVariable String specialty){
        return restaurantService.updateRestaurantById(id ,specialty) ;
    }
}
