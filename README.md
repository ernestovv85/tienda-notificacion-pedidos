git add# Sistema de Notificación de Pedidos

Este proyecto es una aplicación de escritorio desarrollada en Java que utiliza Spring Boot para la gestión de notificaciones de pedidos, implementando una interfaz gráfica con Swing y manejo de hilos para el procesamiento.

## Características

- Interfaz gráfica de usuario (GUI) construida con Java Swing.
- Procesamiento en segundo plano de notificaciones de pedidos mediante hilos (`HiloNotificacionPedidos`).
- Generación de archivos de resultados (`GeneradorResultado`).
- Integración con Spring Boot para la estructura de la aplicación.

## Estructura del Proyecto

- `src/main/java/mx/unadm/dpo3_u2_a2_ervv/`: Código fuente principal.
  - `vista/`: Clases de la interfaz gráfica (`VentanaMenuPrincipal`, `FormularioNotificacion`).
  - `hilo/`: Lógica de procesamiento en hilos (`HiloNotificacionPedidos`).
  - `util/`: Clases de utilidad (`GeneradorResultado`).
  - `NotificacionPedidosApplication`: Clase principal de inicio.
- `src/main/resources/`: Recursos del proyecto, incluyendo imágenes y configuración (`application.properties`).

## Cómo ejecutar

1. Asegúrate de tener instalado JDK 11 o superior.
2. Abre una terminal en la raíz del proyecto.
3. Ejecuta el siguiente comando para iniciar la aplicación:

   ```bash
   ./mvnw spring-boot:run
   ```

## Autor

Esta es una actividad académica para la asignatura de Programación Orientada a Objetos III.
