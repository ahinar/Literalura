package com.ahinardev.literalura.repository;


import com.ahinardev.literalura.model.Lenguaje;
import com.ahinardev.literalura.model.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;


public interface RepositorioLibros extends JpaRepository<Libro, Long> {
    @Query("SELECT l FROM Autor a JOIN a.libros l ORDER BY l.titulo")
    List<Libro> librosRegistrados();

    @Query("SELECT l FROM Autor a JOIN a.libros l WHERE l.lenguaje = :lenguaje")
    List<Libro> librosPorIdioma(@Param("lenguaje") Lenguaje lenguaje);

    boolean existsByTitulo(String titulo);

    @Query("SELECT l FROM Libro l ORDER BY l.numeroDeDescargas DESC")
    List<Libro> findTop5ByOrderByNumeroDeDescargasDesc();
}
