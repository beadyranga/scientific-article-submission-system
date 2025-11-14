package com.rawtechworld.sas_api.dto;

import lombok.*;
import java.time.Instant;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ReviewDTO {
    private UUID id;
    private UUID articleId;
    private UUID reviewerId;
    private String reviewerName;
    private String comments;
    private String status;
    private Instant createdAt;
}
