package com.techcret.service.rating.impl;

import com.techcret.service.rating.entities.Rating;
import com.techcret.service.rating.exceptions.ResourceNotFoundException;
import com.techcret.service.rating.repositories.RatingRepository;
import com.techcret.service.rating.services.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class RatingServiceImpl implements RatingService {

    @Autowired
    RatingRepository ratingRepository;


    /**
     * @param rating
     * @return
     */
    @Override
    public Rating saveRating(Rating rating) {
        rating.setRatingId(UUID.randomUUID().toString());
        return ratingRepository.save(rating);
    }

    /**
     * @return
     */
    @Override
    public List<Rating> getAllRatings() {
        return ratingRepository.findAll();
    }

    /**
     * @param hotelId
     * @return
     */
    @Override
    public Rating getRating(String hotelId) {
        return ratingRepository.findById(hotelId).orElseThrow(() -> new ResourceNotFoundException("Rating not found on server with id :- " + hotelId));
    }

    @Override
    public List<Rating> getRatingByUserId(String id) {
        return ratingRepository.findByUserId(id);
    }

    @Override
    public List<Rating> getRatingByHotelId(String id) {
        return ratingRepository.findByHotelId(id);
    }
}
