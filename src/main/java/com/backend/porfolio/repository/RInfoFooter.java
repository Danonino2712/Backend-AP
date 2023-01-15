package com.backend.porfolio.repository;

import com.backend.porfolio.entity.InfoFooter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RInfoFooter extends JpaRepository <InfoFooter, Integer> {
    
}
