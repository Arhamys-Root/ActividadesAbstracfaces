# Coche híbrido

Para implementar una clase que represente a un coche híbrido, se podría partir de la clase `CocheCombustion`, ya que un coche híbrido también tiene motor de combustión y combustible.

Además, habría que añadir una parte eléctrica mediante nuevos atributos y una interfaz.

## Nuevos atributos

La clase `CocheHibrido` podría tener los siguientes atributos:

- `motorElectricoEncendido`: indica si el motor eléctrico está encendido.
- `porcentajeBateria`: indica el nivel de batería del coche.
- `modoElectrico`: indica si el coche está usando el motor eléctrico.
- `capacidadBateria`: indica la capacidad máxima de batería.

## Interfaz para la parte eléctrica

Se podría crear una interfaz llamada `SistemaElectrico` con estos métodos:

```java
public interface SistemaElectrico {
    void arrancarMotorElectrico();
    void pararMotorElectrico();
    void cargarBateria(int cantidad);
    void moverEnModoElectrico();
}