# Máquina de Café — TDD

Práctica de Test Driven Development (JUnit 4).

## Estructura
- `src/main/java/` → `Vaso`, `Cafetera`, `Azucarero`, `MaquinaDeCafe`, `Main` (versión por consola)
- `src/test/java/` → `TestVaso`, `TestCafetera`, `TestAzucarero`, `TestMaquinaDeCafe`

## Cómo correrlo en Eclipse
1. File → Import → Maven → Existing Maven Projects → seleccionar la carpeta `MaquinaCafe`.
   (Si no usas Maven: crea un Java Project, copia las clases a `src`, y en
   Build Path → Add Library → JUnit 4).
2. Clic derecho en `src/test/java` → Run As → JUnit Test → deben salir 19/19 en verde.
3. Clic derecho en `Main.java` → Run As → Java Application para usar la máquina.

## Con Maven por consola
```
mvn test
```

## Ciclo TDD aplicado
1. **Rojo**: se escribieron las pruebas de la guía; no compilaban porque las clases no existían.
2. **Verde**: se creó el código mínimo en cada clase (`hasX` compara con `>=`, `giveX` resta).
3. **Refactor**: `MaquinaDeCafe.getVasoDeCafe` valida en el orden del diagrama de
   secuencia (vasos → café → azúcar) y solo descuenta inventario si todo está disponible.
