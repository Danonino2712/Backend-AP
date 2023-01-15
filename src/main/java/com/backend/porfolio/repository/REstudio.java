package com.backend.porfolio.repository;

import com.backend.porfolio.entity.Estudio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface REstudio extends JpaRepository <Estudio, Integer>{
    
}
