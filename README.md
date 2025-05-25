# EndpointGet-con-springboot

Esta es una aplicación web sencilla desarrollada con Spring Boot y Thymeleaf que muestra la estructura familiar en una lista anidada y con diseño moderno usando Bootstrap.

## Características
- Endpoint GET `/familia` que muestra una página HTML con los datos de los padres y los hijos.
- Uso de la librería Model de Spring para pasar los datos a la vista.
- Plantilla HTML con Bootstrap para un diseño atractivo y responsivo.

## Estructura de la familia
- Padre
- Madre
  - Hijos (lista)

## Estructura del proyecto
- `src/main/java/com/example/familia/FamiliaApplication.java`: Clase principal de la aplicación.
- `src/main/java/com/example/familia/FamiliaController.java`: Controlador que maneja la petición GET y pasa los datos al modelo.
- `src/main/resources/templates/familia.html`: Plantilla Thymeleaf para mostrar la familia.

## Cómo ejecutar
1. Asegúrate de tener Java 17+ y Maven instalados.
2. En la terminal, navega a la carpeta del proyecto y ejecuta:
   ```bash
   ./mvnw spring-boot:run
   ```
3. Abre tu navegador y visita: [http://localhost:8080/familia](http://localhost:8080/familia)

## Personalización
Puedes modificar los nombres de los padres e hijos en el archivo `FamiliaController.java`.

---

**Autor:** Alexander
