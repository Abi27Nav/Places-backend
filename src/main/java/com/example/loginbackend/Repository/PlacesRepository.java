package com.example.loginbackend.Repository;

import com.example.loginbackend.Entity.Places;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlacesRepository extends JpaRepository<Places,Integer> {
}
