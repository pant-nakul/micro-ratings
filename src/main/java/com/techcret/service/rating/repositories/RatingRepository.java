package com.techcret.service.rating.repositories;

import com.techcret.service.rating.entities.Rating;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RatingRepository extends JpaRepository<Rating, String> {
    //custom methods

    //    find all ratings by userId
    List<Rating> findByUserId(String id);
    List<Rating> findByHotelId(String id);
    //    find all ratings by hotelIdId
}
