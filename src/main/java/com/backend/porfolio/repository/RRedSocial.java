package com.backend.porfolio.repository;

import com.backend.porfolio.entity.RedSocial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RRedSocial extends JpaRepository <RedSocial, Integer>{
    
}
