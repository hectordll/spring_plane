package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.FlottesPassagers;
import java.util.List;

@Repository
public interface FlottesPassagersRepository extends JpaRepository<FlottesPassagers, String> {
    List<FlottesPassagers> findByIdCompagnie(String idCompagnie);
}
