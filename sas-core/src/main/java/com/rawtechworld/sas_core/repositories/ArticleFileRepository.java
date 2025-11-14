package com.rawtechworld.sas_core.repositories;

import com.rawtechworld.sas_core.entities.ArticleFile;
import org.hibernate.validator.constraints.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticleFileRepository extends JpaRepository<ArticleFile, UUID> {
    List<ArticleFile> findByArticleId(UUID articleId);
}
