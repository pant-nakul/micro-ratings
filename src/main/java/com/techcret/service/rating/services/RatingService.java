package com.techcret.service.rating.services;

import com.techcret.service.rating.entities.Rating;

import java.util.List;

public interface RatingService {

    //User operations
    //create
    Rating saveRating(Rating rating);

    List<Rating> getAllRatings();

    Rating getRating(String id);

    List<Rating> getRatingByUserId(String id);

    List<Rating> getRatingByHotelId(String id);

    //TODO:Delete

    //TODO:Update

}
