package com.springreact.cardatabase.web;

import com.springreact.cardatabase.domain.CarRepository;
import com.springreact.cardatabase.entity.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;


@RestController
public class CarController {
    @Autowired
    private CarRepository carRepository;

    @RequestMapping(value="/")
    public String defaultRoute(){
        return "<h1>Welcome to the car database back end!</h1>";
    }

    @RequestMapping(value = "/cars")
    public Iterable<Car> getCars(){
        return carRepository.findAll();
    }

    @DeleteMapping(value = "/cars/{id}")
    public void deleteById(@PathVariable long id) {
        carRepository.deleteById(id);
    }

    @PostMapping(value = "/cars", consumes = "application/json", produces = "application/json")
    public Car create(@RequestBody Car car) {
        return carRepository.save(car);
    }

}
