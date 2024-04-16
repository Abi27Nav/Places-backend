package com.example.loginbackend.Controller;

import com.example.loginbackend.Entity.Places;
import com.example.loginbackend.Services.PlacesService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/places")
public class PlacesController {
    private PlacesService placesService;

    public PlacesController(PlacesService placesService) {
        super();
        this.placesService = placesService;
    }

   // <--- create new place
    @PostMapping()
    public ResponseEntity<Places> savePlaces(@RequestBody Places places){
        return new ResponseEntity<>(placesService.savePlaces(places), HttpStatus.CREATED);
    }
    // <--- get place by ID
    @GetMapping(path = "{id}")
    public ResponseEntity<Places> getPlacesById(@PathVariable("id") int id){
        return new ResponseEntity<>(placesService.getPlacesById(id),HttpStatus.FOUND);
    }

    // <--- get All places
    @GetMapping()
    public List<Places> getAllPlaces(){
        return placesService.getAllPlaces();
    }

    // <-- Update places
    @PutMapping(path="{id}")
    public ResponseEntity<Places> updatePlaces(@PathVariable("id") int id,@RequestBody Places places){
        return new ResponseEntity<>(placesService.updatePlaces(places,id),HttpStatus.OK);
    }


    // <-- Delete places by ID
    @DeleteMapping(path="{id}")
    public void deletePlaces(@PathVariable("id")int id){
        placesService.deletePlaces(id);
    }










}
