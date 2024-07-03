# LiterAlura

**LiterAlura** es una aplicación para gestionar una base de datos de libros y autores, que permite buscar libros por título, listar autores y libros, y realizar consultas específicas sobre los datos de libros y autores. La aplicación se integra con una API externa para obtener información sobre libros y proporciona funcionalidades para almacenar y consultar datos en una base de datos PostgreSQL.

## Características

- **Buscar libros por título**: Consulta libros a través de una API externa y almacena los datos en la base de datos.
- **Listar libros registrados**: Muestra todos los libros almacenados en la base de datos.
- **Listar autores registrados**: Muestra todos los autores en la base de datos.
- **Listar autores vivos en un año determinado**: Consulta y muestra autores vivos en un año específico.
- **Listar libros por idioma**: Filtra y muestra libros según el idioma.
- **Top 5 libros**: Obtiene estadísticas de libros o autores (ejemplo: top 5 libros con más descargas).
- **Buscar autor por nombre**: Consulta autores por nombre.


## Tecnologías

- **Java**: Lenguaje de programación principal.
- **Spring Boot**: Framework para la gestión de la aplicación.
- **Spring Data JPA**: Para la gestión de la persistencia de datos.
- **PostgreSQL**: Base de datos relacional.
- **API Externa**: Para obtener información de libros.

## Requisitos

- **Java 17** o superior.
- **Maven** para la gestión de dependencias.
- **PostgreSQL** para la base de datos.
- **Internet** para acceder a la API externa.

## Instalación

1. **Clonar el Repositorio**

   ```bash
   git clone https://github.com/tu_usuario/literalura.git
   cd literalura
