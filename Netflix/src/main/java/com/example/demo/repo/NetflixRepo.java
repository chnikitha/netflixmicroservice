package com.example.demo.repo;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.Netflix;

@Repository
public interface NetflixRepo extends JpaRepository<Netflix, Long>{

}
