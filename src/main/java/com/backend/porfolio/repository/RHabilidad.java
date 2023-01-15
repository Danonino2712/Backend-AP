package com.backend.porfolio.repository;

import com.backend.porfolio.entity.Habilidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RHabilidad extends JpaRepository <Habilidad, Integer>{
    
}
