package com.example.loginbackend.Services;

import com.example.loginbackend.Entity.Places;

import java.util.List;

public interface PlacesServiceInterface {
    Places savePlaces(Places places);
    List<Places> getAllPlaces();
}
