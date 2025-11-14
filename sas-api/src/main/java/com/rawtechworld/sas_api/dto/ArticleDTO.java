package com.rawtechworld.sas_api.dto;

import lombok.*;

import java.time.Instant;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ArticleDTO {
    private UUID id;
    private String title;
    private String abstractText;
    private String field;
    private String status;
    private Instant createdAt;
    private List<UserDTO> authors;
}