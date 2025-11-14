package com.rawtechworld.sas_api.dto;

import lombok.*;
import java.time.Instant;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ArticleFileDTO {
    private UUID id;
    private String filename;
    private String fileType;
    private String storagePath;
    private Instant createdAt;
}
