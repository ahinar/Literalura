package com.ahinardev.literalura;

import com.ahinardev.literalura.principal.Principal;
import com.ahinardev.literalura.repository.RepositorioAutor;
import com.ahinardev.literalura.repository.RepositorioLibros;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LiteraluraApplication implements CommandLineRunner {

	private final RepositorioLibros repositorioLibros;
	private final RepositorioAutor repositorioAutor;

	@Autowired
	public LiteraluraApplication(RepositorioLibros repositorioLibros, RepositorioAutor repositorioAutor) {
		this.repositorioLibros = repositorioLibros;
		this.repositorioAutor = repositorioAutor;
	}

	public static void main(String[] args) {
		SpringApplication.run(LiteraluraApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal(repositorioLibros, repositorioAutor);
		principal.mostrarMenu();
	}
}

