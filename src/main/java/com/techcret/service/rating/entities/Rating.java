package com.techcret.service.rating.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "micro_ratings")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Rating {

    @Id
    @Column(name = "id")
    private String ratingId;
    private String userId;
    private String hotelId;
    private int rating;
    private String feedback;


}
