package es.santander.ascender.ejerc003.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import es.santander.ascender.ejerc003.models.Pen;

public interface PenRepository extends JpaRepository<Pen, Long> {

}