package com.languages.languages.repositories;



import org.springframework.data.jpa.repository.JpaRepository;
import com.languages.languages.models.Language;

public interface LanguageRepository extends JpaRepository<Language, Long> {
}

