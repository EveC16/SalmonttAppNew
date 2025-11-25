package cl.salmontt.model;

/**
 * REPRESENTA LA UBICACION DE UN CENTRO Y TIENE UNA RELACION
 * DE COMPOSICION CON CENTRO CULTIVO
 */

public class Ubicacion {

    private String comuna;

    public Ubicacion() {
    }

    public Ubicacion(String comuna) {
        this.comuna = comuna;
    }

    public String getComuna() {
        return comuna;
    }

    @Override
    public String toString() {
        return "Ubicacion{" +
                "Comuna:'" + comuna + '\'' +
                '}';
    }
}
