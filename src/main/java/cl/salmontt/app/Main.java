package cl.salmontt.app;

import cl.salmontt.data.GestorCentros;
import cl.salmontt.model.CentroCultivo;
import cl.salmontt.model.Ubicacion;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        GestorCentros gestorCentros = new GestorCentros();
        gestorCentros.listarTodosCentros();

        Ubicacion nuevaUbicacion = new Ubicacion("Colina");
        CentroCultivo nuevoCentroCultivo = new CentroCultivo
                ("Zodiacal Nuevo ", nuevaUbicacion, 5400);

        gestorCentros.agregar(nuevoCentroCultivo);
        mostrarSeparador();
        System.out.println("Centro Cultivo " + nuevoCentroCultivo.getNombre() +
                "agregado con exito");
        gestorCentros.listarTodosCentros();

        String buscarPorComuna = "La Florida";
        List<CentroCultivo> centrosFiltrados =
                gestorCentros.filtrarPorUbicacion(buscarPorComuna);

        if(centrosFiltrados.isEmpty()){
            mostrarSeparador();
            System.out.println("No existe centro cultivo de Salmontt en " + buscarPorComuna);
        }else{
            mostrarSeparador();
            System.out.println("Se encontro " + centrosFiltrados.size() + " centro cultivo de Salmontt en " + buscarPorComuna);
            for(CentroCultivo centro : centrosFiltrados) {
                System.out.println("--> " + centro.toString());
            }
        }
        mostrarSeparador();
    }

    public static void mostrarSeparador(){
        System.out.println("-----------------------------");
    }
}