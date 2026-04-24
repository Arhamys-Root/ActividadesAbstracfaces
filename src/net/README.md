
# ActividadesAbstracfaces

Proyecto de Java para practicar **interfaces**, **clases abstractas**, **herencia** y **sobrescritura de métodos**.

## Estructura del proyecto

```text
ACTIVIDADESABSTRACFACES/
├── src/
│   └── net/
│       └── salesianoslacuesta/
│           ├── actividad1/
│           │   ├── calculoGeometricoBidimensional/
│           │   │   └── CalculoGeometricoBidimensional.java
│           │   ├── circulo/
│           │   │   └── Circulo.java
│           │   ├── rectangulo/
│           │   │   └── Rectangulo.java
│           │   └── App.java
│           └── actividad2/
│               ├── vehiculo/
│               │   ├── cocheCombustion/
│               │   │   └── CocheCombustion.java
│               │   └── Vehiculo.java
│               ├── App.java
│               └── CocheHibrido.md
└── README.md
```

## Actividad 1

La actividad 1 trabaja con figuras geométricas.

Se crea la interfaz `CalculoGeometricoBidimensional`, que obliga a implementar dos métodos:

```java
calcularArea();
calcularPerimetro();
```

Las clases `Rectangulo` y `Circulo` implementan esta interfaz y calculan su área y perímetro usando sus propios atributos.

La clase `App.java` pide los datos al usuario, crea los objetos correspondientes y muestra los resultados por pantalla.

## Actividad 2

La actividad 2 trabaja con vehículos.

Se crea una clase abstracta `Vehiculo`, que contiene atributos comunes como color, número de puertas, número de ruedas, modelo y matrícula.

También define los métodos abstractos:

```java
arrancar();
pararMotor();
mover();
```

La clase `CocheCombustion` hereda de `Vehiculo` y añade el control del motor y del combustible.

Esta clase permite:

- Arrancar el coche consumiendo combustible.
- Parar el motor.
- Mover el coche consumiendo combustible.
- Impedir el movimiento si el motor está apagado o no hay combustible.

La clase `App.java` de la actividad 2 prueba el funcionamiento del coche.

## CocheHibrido.md

El archivo `CocheHibrido.md` explica cómo podría implementarse un coche híbrido partiendo de `CocheCombustion`, añadiendo una parte eléctrica con nuevos atributos e interfaz.

## Cómo ejecutar

Actividad 1:

```cmd
javac -d bin src/net/salesianoslacuesta/actividad1/calculoGeometricoBidimensional/*.java src/net/salesianoslacuesta/actividad1/rectangulo/*.java src/net/salesianoslacuesta/actividad1/circulo/*.java src/net/salesianoslacuesta/actividad1/App.java
java -cp bin net.salesianoslacuesta.actividad1.App
```

Actividad 2:

```cmd
javac -d bin src/net/salesianoslacuesta/actividad2/vehiculo/*.java src/net/salesianoslacuesta/actividad2/vehiculo/cocheCombustion/*.java src/net/salesianoslacuesta/actividad2/App.java
java -cp bin net.salesianoslacuesta.actividad2.App
```

## Conceptos trabajados

- Interfaces
- Clases abstractas
- Herencia
- Encapsulación
- Constructores
- Getters y setters
- Sobrescritura de métodos
- Organización en paquetes

## Autor

Proyecto realizado para practicar clases abstractas e interfaces en Java.