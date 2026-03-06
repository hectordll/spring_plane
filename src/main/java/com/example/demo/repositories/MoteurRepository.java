package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Moteur;

@Repository
public interface MoteurRepository extends JpaRepository<Moteur, String> {
}
