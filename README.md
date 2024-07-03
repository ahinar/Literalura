# LiterAlura

**LiterAlura** es una aplicación para gestionar una base de datos de libros y autores, que permite buscar libros por título, listar autores y libros, y realizar consultas específicas sobre los datos de libros y autores. La aplicación se integra con una API externa https://gutendex.com/ para obtener información sobre libros y proporciona funcionalidades para almacenar y consultar datos en una base de datos PostgreSQL.
![image](https://github.com/ahinar/Literalura/assets/21250506/15fa276c-5d1a-41d9-b47f-86a3512a1c31)




## Características

- **Buscar libros por título**: Consulta libros a través de una API externa y almacena los datos en la base de datos , en el caso de que el libro ya este en la base de datos este no seguardara y enviara un mensaje al usuario.
  
 ![image](https://github.com/ahinar/Literalura/assets/21250506/55a1705c-6a96-4211-9af2-858cf3973799) ![image](https://github.com/ahinar/Literalura/assets/21250506/31a7d8b6-18d8-4475-be94-6b06d993f135)


- **Listar libros registrados**: Muestra todos los libros almacenados en la base de datos.
- **Listar autores registrados**: Muestra todos los autores en la base de datos, en el caso de que un  autor este registrado con mas libros estos se listaran como por ejemplo en la imagen se ve a William Shakespeare.
  
  ![image](https://github.com/ahinar/Literalura/assets/21250506/f1edcd62-8bd5-4def-9732-026a928b109f)

- **Listar autores vivos en un año determinado**: Consulta y muestra autores vivos en un año específico.
  ![image](https://github.com/ahinar/Literalura/assets/21250506/fbc15812-97a3-4cbb-8ba6-ab755f727fb6)

- **Listar libros por idioma**: Filtra y muestra libros según el idioma para el ejemplo filtramos por español.
  ![image](https://github.com/ahinar/Literalura/assets/21250506/c90577bb-30ce-45ac-bd77-b854d82ec0aa)

- **Top 5 libros**: Obtiene el top 5 libros con más descargas.
  
  ![image](https://github.com/ahinar/Literalura/assets/21250506/d81f30bf-df5b-42c1-865d-bdac553b809a)

- **Buscar autor por nombre**: Consulta autores por nombre.
  
  ![image](https://github.com/ahinar/Literalura/assets/21250506/cf278b1f-6252-45fe-8e1a-2635332f210c)



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

# Video del funcionamiento
https://youtu.be/k_TV2Xwv8g4?si=UIUN9j5xdvFuDyl6

