package com.techcret.service.rating.repositories;

import com.techcret.service.rating.entities.Rating;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RatingRepository extends JpaRepository<Rating, String> {
    //custom methods
}
