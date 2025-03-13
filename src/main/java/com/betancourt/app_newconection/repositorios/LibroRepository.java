package com.betancourt.app_newconection.repositorios;

import com.betancourt.app_newconection.entidades.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibroRepository extends JpaRepository<Libro, Integer> {
}
