package com.CoffeMapper.coffe.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;



@RestController
@RequestMapping("/api/"+VersionApp.version+"/coffee")
public class CoffeePointController {


    @Autowired
    private UserRepository coffeePointRepository;

    @GetMapping("/{id}")
    public ResponseEntity<Coffe_point> getCoffeePointById(@PathVariable long id) {
        Optional<Coffe_point> coffeePoint = coffeePointRepository.findById(Math.toIntExact(id));
        if (coffeePoint.isPresent()) {
            return new ResponseEntity<>(coffeePoint.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}