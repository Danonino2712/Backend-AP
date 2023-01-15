package com.backend.porfolio.repository;

import com.backend.porfolio.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
    public interface RPersona extends JpaRepository <Persona, Integer> {

}
