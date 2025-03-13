package com.betancourt.app_newconection.repositorios;

import com.betancourt.app_newconection.entidades.Autor;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AutorRepository extends JpaRepository<Autor, Integer> {
}