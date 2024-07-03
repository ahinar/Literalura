package com.ahinardev.literalura.service;

import com.ahinardev.literalura.model.Autor;
import com.ahinardev.literalura.model.Libro;
import com.ahinardev.literalura.repository.RepositorioAutor;
import com.ahinardev.literalura.repository.RepositorioLibros;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ServicioLibros {

    @Autowired
    private RepositorioLibros repositorioLibros;

    @Autowired
    private RepositorioAutor repositorioAutores;

    @Transactional
    public void guardarLibro(Libro libro, Autor autor) {
        autor.addLibro(libro); // Asocia el libro con el autor
        repositorioAutores.save(autor); // Guarda el autor junto con sus libros
    }
}
