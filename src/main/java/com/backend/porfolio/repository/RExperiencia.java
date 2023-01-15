package com.backend.porfolio.repository;

import com.backend.porfolio.entity.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RExperiencia extends JpaRepository <Experiencia, Integer> {
    
}
