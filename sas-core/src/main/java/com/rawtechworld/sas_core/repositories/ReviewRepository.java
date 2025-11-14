package com.rawtechworld.sas_core.repositories;

import com.rawtechworld.sas_core.entities.Review;
import org.hibernate.validator.constraints.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewRepository extends JpaRepository<Review, UUID> {
    List<Review> findByArticleId(UUID articleId);
    List<Review> findByReviewerId(UUID reviewerId);
}
