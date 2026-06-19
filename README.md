# 🚗 Trabajo Práctico N.º 2 - Concesionaria de Vehículos

## 📖 Descripción
Proyecto desarrollado en Java utilizando Spring Boot, Maven y Lombok, aplicando conceptos de Programación Orientada a Objetos (POO), Collections Framework y Streams API para simular el funcionamiento de una concesionaria de vehículos. La aplicación permite gestionar automóviles y motocicletas, realizar consultas sobre los vehículos cargados y mostrarlos ordenados según distintos criterios.

---

## 🛠️ Tecnologías utilizadas
* **Java 21**
* **Spring Boot**
* **Maven**
* **Lombok**
* **Collections Framework**
* **Java Streams API**
* **Git / GitHub**

---

## 📂 Estructura del proyecto

### Vehiculo
Clase abstracta que representa un vehículo genérico.
* **Atributos:** Marca, Modelo, Precio.
* **Responsabilidades:** 
  * Centralizar atributos y comportamientos comunes.
  * Formatear precios utilizando el formato argentino.
  * Implementar `Comparable<Vehiculo>` para definir el orden natural.

### Auto
Clase que hereda de `Vehiculo`.
* **Atributos:** Puertas.

### Moto
Clase que hereda de `Vehiculo`.
* **Atributos:** Cilindrada.

### Concesionario
Clase encargada de administrar la colección de vehículos y realizar operaciones de búsqueda, filtrado y ordenamiento.

### IConcesionario
Interfaz que define los comportamientos relacionados con consultas de precios.

### TestConcesionaria
Clase principal encargada de ejecutar y probar las funcionalidades del sistema.

---

## ⚙️ Funcionalidades
* Mostrar todos los vehículos cargados con su formato específico.
* Obtener el vehículo más caro.
* Obtener el vehículo más barato.
* Buscar vehículos cuyo modelo contenga una letra determinada.
* Ordenar vehículos por precio de mayor a menor.
* Ordenar vehículos utilizando su orden natural mediante `Comparable`.

---

## 💡 Conceptos aplicados
* **Programación Orientada a Objetos (POO):** Abstracción, Encapsulamiento, Herencia y Polimorfismo.
* **Interfaces y Clases abstractas.**
* **Uso de Comparable** para ordenamiento personalizado.
* **Collections Framework y Streams API** junto a Expresiones Lambda.
* **Lombok** para la reducción de código repetitivo (Boilerplate).

---

## ▶️ Ejecución
1. **Clonar el repositorio:**
   ```bash
   git clone https://github.com
   ```
2. **Abrir el proyecto** en IntelliJ IDEA, Eclipse o VS Code.
3. **Verificar que Maven** descargue todas las dependencias (Lombok).
4. **Ejecutar la clase** principal: `TestConcesionaria`.

---

## 👨‍💻 Autor
**Pablo Cubero**  
Trabajo práctico realizado para la materia Java - Programación Orientada a Objetos.

---

## 🎯 Objetivo académico
Aplicar conceptos fundamentales de Programación Orientada a Objetos mediante el desarrollo de una aplicación que utilice herencia, abstracción, interfaces, Collections Framework, Streams API, Lombok y Spring Boot siguiendo las mejores prácticas de desarrollo de software.
