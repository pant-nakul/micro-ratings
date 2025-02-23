package com.techcret.service.rating.services;

import com.techcret.service.rating.entities.Rating;

import java.util.List;

public interface RatingService {

    //User operations
    //create
    Rating saveRating(Rating rating);

    List<Rating> getAllRatings();

    Rating getRating(String ratingId);

    //TODO:Delete

    //TODO:Update

}
