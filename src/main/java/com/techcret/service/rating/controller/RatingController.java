package com.techcret.service.rating.controller;

import com.techcret.service.rating.entities.Rating;
import com.techcret.service.rating.services.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingController {

    @Autowired
    RatingService ratingService;

    //create

    @PostMapping
    public ResponseEntity<Rating > createRating(@RequestBody Rating rating) {
        Rating rating1 = ratingService.saveRating(rating);
        return ResponseEntity.status(HttpStatus.CREATED).body(rating1);
    }

    //get single
    @GetMapping("/{ratingId}")
    public ResponseEntity<Rating > getSingleRating(@PathVariable String ratingId) {
        Rating hotel = ratingService.getRating(ratingId);
        return ResponseEntity.ok(hotel);
    }

    //get all
    @GetMapping
    public ResponseEntity<List<Rating >> getRatings() {
        return ResponseEntity.ok(ratingService.getAllRatings());
    }

    @GetMapping("/hotels/{userId}")
    public ResponseEntity<List<Rating >> getRatingsByUserId(@PathVariable String userId) {
        return ResponseEntity.ok(ratingService.getRatingByUserId(userId));
    }

    @GetMapping("/hotels/{hotelId}")
    public ResponseEntity<List<Rating >> getRatingsByHotelId(@PathVariable String hotelId) {
        return ResponseEntity.ok(ratingService.getRatingByHotelId(hotelId));
    }
}
