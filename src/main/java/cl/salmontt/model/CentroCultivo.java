package cl.salmontt.model;

/**
 * REPRESENTA UN CENTRO CULTIVO CON ATRIBUTOS COMO NOMBRE, UBICACION Y
 * TONELADAS PRODUCIDAS
 * TIENE UNA RELACION DE COMPOSICION CON UBICACION PARA ACCEDER AL ATRIBUTO COMUNA
 */

public class CentroCultivo {

    private String nombre;
    private Ubicacion ubicacion;
    private int toneladasProducidas;

    public CentroCultivo() {
    }

    public CentroCultivo(String nombre, Ubicacion ubicacion, int toneladasProducidas) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.toneladasProducidas = toneladasProducidas;
    }

    public String getNombre() {
        return nombre;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    public double getToneladasProducidas() {
        return toneladasProducidas;
    }

    @Override
    public String toString() {
        return "CentroCultivo{" +
                "Nombre del Centro: " + nombre + '\'' +
                ", Ubicación: comuna de " + this.ubicacion.getComuna() + '\'' +
                ", Toneladas Producidas: " + toneladasProducidas +
                '}';
    }
}