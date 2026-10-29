# Laboratorio de Testing — Java 17 + Maven + JUnit 4 + Mockito

**Proyecto para estudiantes.** Contexto: una pequeña librería universitaria. Contiene una pila, consulta de libros mediante un supuesto servicio remoto, carrito de compras y registro de pedidos. **No se necesita internet para ejecutar el código de negocio ni hacer llamadas a servicios externos**; Maven sí necesita descargar las dependencias la primera vez.

## Requisitos e importación en IntelliJ IDEA

- JDK **17** (o superior) y **Maven 3.8+**. Puede utilizarse el Maven integrado de IntelliJ.
- Abrir IntelliJ IDEA → **Open** → seleccionar la **carpeta que contiene `pom.xml`**.
- Aceptar la importación Maven y comprobar el **Project SDK: 17+**.
- Los tests usan **JUnit 4** (`org.junit.Test`, `org.junit.Before`, `org.junit.Ignore`), no JUnit 5.

```bash
mvn test                            # ejecuta los tests habilitados
mvn -Dtest=SimpleStackTest test     # solo tests de la pila
mvn -Dtest=BookSearchMockitoTest test
mvn -Dtest=ShoppingCartTddTest test
mvn verify                          # tests + cobertura JaCoCo
```

Después de `mvn verify`, abrir `target/site/jacoco/index.html`. No usar un porcentaje alto de cobertura como sustituto de buenos casos de prueba.

## ¿Cómo se realizan los ejercicios?

Los tests aún pendientes están marcados con **`@Ignore`** y contienen `TODO` + `fail(...)`. Para cada actividad:

1. Leer las **reglas de negocio** en `GUIA_ESTUDIANTE.md`.
2. Elegir un caso. **Quitar `@Ignore`**, reemplazar el `fail(...)` por preparación, acción y `assert`.
3. Ejecutar **solo ese test**, observar la barra roja si encuentra un defecto o funcionalidad pendiente.
4. En la actividad de **TDD**, modificar `ShoppingCart.java` para llevar el caso a verde. En pila, detectar y corregir el defecto.
5. Ejecutar todos los tests y revisar que una modificación no rompió los anteriores.

**No sustituir las pruebas por impresiones (`System.out.println`) ni comentar pruebas que fallen.**

## Recorrido recomendado y diapositivas

| Bloque | Diapositivas del PDF | Archivo de trabajo | Producto esperado |
|---|---|---|---|
| 1. Unidad, `@Before`, `assert`, excepciones | 15–24 | `SimpleStackTest` | Detectar error LIFO y arreglarlo |
| 2. FIRST, cobertura | 26–35 | los tests anteriores | Independencia y ramas cubiertas |
| 3. Doble manual / Mockito | 40–49 | `FakeBookService`, `BookSearchMockitoTest` | Stub de respuestas y verificación de llamadas |
| 4. TDD rojo–verde–refactor | 51–61 | `ShoppingCartTddTest` y `ShoppingCart` | Carrito funcional guiado por pruebas |
| 5. Integración | 62–67 | `OrderServiceIntegrationTest` | Servicio + repositorio real en memoria |

## Estructura

- `src/main/java`: clases de negocio y dependencias.
- `src/test/java`: pruebas por completar y doble manual.
- `GUIA_ESTUDIANTE.md`: enunciados, especificaciones y ticket de salida.
- `pom.xml`: versiones y configuración de Maven.

**Nota:** `SimpleStack` contiene un comportamiento defectuoso por descubrir; `ShoppingCart` está incompleto a propósito. La suite inicial puede aparecer verde porque los ejercicios no habilitados aún están ignorados. El objetivo final es eliminar todos los `@Ignore` de actividades y lograr una suite completa en verde.
