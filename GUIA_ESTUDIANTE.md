# Guía práctica de laboratorio — Pruebas automatizadas

**Objetivo:** diseñar casos de prueba, detectar defectos, utilizar dobles manuales y Mockito, aplicar TDD y distinguir pruebas unitarias de integración.

## Actividad 1 — Pila (20 min; diapositivas 15–24)

**Archivo:** `src/test/java/cl/edu/testing/stack/SimpleStackTest.java`.

Contrato: una pila sigue **LIFO** (*last in, first out*); `pop` de pila vacía lanza `EmptyStackException`; `push` incrementa `size`, y las instancias no comparten estado. Completar cuatro pruebas con `@Before`, `assertEquals`, `assertTrue`/`assertFalse` y `@Test(expected=...)`. Escribir una secuencia que permita distinguir una pila LIFO de una cola FIFO. Cuando aparezca una prueba roja, corregir la clase en `src/main/java`.

**Discusión:** ¿por qué un test que solo comprueba `size()` puede pasar aunque `pop()` sea incorrecto?

## Actividad 2 — Doble manual (10 min; diapositivas 40–46)

**Archivos:** `FakeBookService.java` y `BookSearchManualTest.java`.

Un servicio remoto de libros, `BookService.search(isbn)`, responde con un JSON que tiene la clave **`titulo`**. Contrato: para ISBN **1234** el doble manual devuelve `{"titulo":"Ingenieria de Software Moderna"}`; para otros ISBN devuelve `null`. `BookSearch.getBook` entrega el título o lanza `BookNotFoundException` cuando no se encuentra. Implementar el doble y completar los tests sin usar red.

**Pregunta:** ¿qué parte de esta prueba es real y cuál está reemplazada?

## Actividad 3 — Mockito (15 min; diapositivas 47–49)

**Archivo:** `BookSearchMockitoTest.java`.

Observar el ejemplo ya habilitado. Crear y configurar mocks mediante `mock(...)`, `when(...).thenReturn(...)` y comprobar interacciones con `verify(...)`. Cubrir como mínimo: ISBN conocido, desconocido, inválido (sin consultar el servicio), JSON sin título y número de consultas.

**Discusión:** ¿por qué `verifyNoInteractions(...)` permite probar un requisito distinto al del valor retornado?

## Actividad 4 — TDD: carrito (25 min; diapositivas 51–61)

**Archivos:** `ShoppingCartTddTest.java` y `ShoppingCart.java`.

**Reglas de negocio:**

- Un carrito vacío tiene cantidad y total 0.
- `add(CartItem)` agrega **una unidad** (es posible agregar dos ejemplares con el mismo ISBN).
- `getItemCount()` retorna número de ejemplares agregados.
- `getTotal()` suma los precios como `BigDecimal`.
- `removeByIsbn(isbn)` elimina **un solo** ejemplar que coincida y retorna `true`; si no lo encuentra retorna `false`.
- `add(null)` no está permitido y lanza `NullPointerException`.

**Secuencia:** (1) habilitar **solo** `agregarDosLibrosCalculaTotal`; (2) ejecutar y comprobar rojo; (3) implementar lo mínimo para lograr verde; (4) ejecutar el conjunto; (5) repetir con los demás tests; (6) refactorizar manteniendo todos en verde. No completar la clase productiva antes del primer test rojo.

**Pregunta:** ¿qué diferencia hay entre el primer verde conseguido con una solución artificial y un comportamiento que satisface varios casos?

## Actividad 5 — Integración (10 min; diapositivas 62–67)

**Archivo:** `OrderServiceIntegrationTest.java`.

En este bloque **no se usa Mockito**: `OrderService` colabora con `InMemoryOrderRepository` y `ShoppingCart`. Completar el test que crea una compra para el cliente `A01`, confirma el pedido y recupera su contenido por `id`. Validar también que un carrito vacío produce `IllegalStateException`.

**Precisión:** esto prueba la integración de varios objetos reales dentro del proceso Java, pero **no** equivale a integrar una base de datos persistente ni a una prueba E2E con navegador.

## Ticket de salida (5 min)

1. Describe un caso de prueba que el simple `size()` de la pila no detectaría.
2. Explica una razón concreta para usar un mock del servicio de libros.
3. Escribe la diferencia entre **`assertEquals`** y **`verify`**.
4. Indica qué archivo modificaste siguiendo **rojo → verde → refactorizar**.

## Evidencias para entregar

Captura o copia de: (a) ejecución de `mvn test`; (b) una prueba que inicialmente falló y la corrección que la hizo pasar; (c) un test con Mockito que use `verify`. Entregar además el proyecto fuente sin la carpeta `target/`.
