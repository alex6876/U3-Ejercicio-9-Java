
Aquí tienes la estructura en formato Markdown lista para el `README.md` de este código de **Simulación de Control de Velocidad y Tacómetro (Encapsulamiento y Restricciones de Rango en Java)**, manteniendo el enfoque exclusivo de **Programación Orientada a Objetos en memoria** (sin bases de datos):

---

# 🏎️ Simulación de Control de Velocidad y Tacómetro (Encapsulamiento y Validaciones en Java)

Este proyecto es una aplicación en Java que modela el sistema de control y supervisión de la velocidad de un vehículo, aplicando límites máximos permitidos y operaciones seguras de aceleración y frenado. Pone en práctica conceptos fundamentales de la **Programación Orientada a Objetos (POO)** como el **encapsulamiento de atributos privados**, el control de estado defensivo mediante constructores y la validación de reglas de negocio restrictivas en memoria.

---

## 🧩 Clases y Estructura del Sistema

El diseño del software se organiza a través de una clase de dominio encapsulada y un punto de ejecución:

* **`ControlVelocidad`**: Modela el tacómetro y protege la integridad de los límites de velocidad y la marcha actual del vehículo.
* **Atributos privados (`private`)**: `velocidadActual` y `velocidadMaximaPermitida`, impidiendo alteraciones directas desde fuera de la clase.
* **Constructor**: Inicializa el sistema validando de forma defensiva que el límite máximo permitido sea mayor a cero. Si se ingresa un valor inválido, asigna por defecto `120 km/h` e informa una advertencia por consola, estableciendo la velocidad inicial en cero.
* **Métodos accesores (*getters*)**: Permiten consultar de forma controlada la velocidad actual del vehículo.
* **Métodos operativos de negocio**:
* `acelerar(double incremento)`: Incrementa la velocidad siempre que el valor de subida sea positivo y **no supere** el límite máximo permitido establecido ($\text{velocidadActual} + \text{incremento} \le \text{velocidadMaximaPermitida}$). Si excede el tope, rechaza la operación.
* `frenar(double decremento)`: Reduce la velocidad actual validando que el decremento sea positivo. Si el valor a frenar supera o iguala la velocidad actual, detiene por completo el vehículo dejándolo en `0`.




* **`Main`**: Punto de entrada del programa. Instancia el control de velocidad con un límite máximo (ej. 158 km/h), ejecuta pruebas sucesivas de aceleración y frenado, y muestra por consola la velocidad final resultante.

---

## ⚙️ Reglas de Negocio y Control de Validación

1. **Restricción de Velocidad Máxima:** El método `acelerar` evalúa que el incremento solicitado no rompa el umbral de velocidad permitido (`velocidadActual + incremento <= velocidadMaximaPermitida`), previniendo excesos de velocidad.
2. **Frenado Seguro y Acotado:** El método `frenar` controla que la desaceleración no genere valores negativos en el tacómetro. Si el decremento es mayor que la velocidad actual, el sistema frena por completo el vehículo de manera segura (`velocidadActual = 0`).
3. **Encapsulamiento Estricto:** Oculta los campos de velocidad, garantizando que el estado del vehículo solo pueda modificarse mediante transacciones lógicas y controladas.

---

## 💻 Salida por Consola

Al ejecutar la clase `Main`, el programa genera el siguiente resultado:

```text
Aceleración realizada.
Frenado realizado.
El vehículo quedó detenido.
Aceleración no permitida.
0.0

```

---

## 🚀 Conceptos de Programación Aplicados

* **Encapsulamiento de Estado:** Ocultamiento de las variables internas de velocidad para proteger la coherencia del tacómetro frente a operaciones inválidas.
* **Invariantes de Dominio:** Garantía estricta de que el vehículo mantenga un comportamiento físico lógico (respetando topes máximos y evitando velocidades negativas).
* **Diseño Modular:** Clara separación entre la lógica de control del vehículo (`ControlVelocidad`) y el flujo de pruebas ejecutado en el cliente (`Main`).
