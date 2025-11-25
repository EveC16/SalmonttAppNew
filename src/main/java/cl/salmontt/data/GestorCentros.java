package cl.salmontt.data;

/**
 * REPRESENTA LA GESTION DE LOS DATOS DEL ARCHIVO EXCEL, PERMITE FILTRAR,
 * AGREGAR, Y LISTAR LOS CENTROS CULTIVOS
 */

import cl.salmontt.model.CentroCultivo;
import cl.salmontt.util.LectorArchivo;

import java.util.ArrayList;
import java.util.List;

public class GestorCentros {

        private final List<CentroCultivo> centros = new ArrayList<>();
        private static final String rutaArchivo = "centroCultivo.xlsx";


        public GestorCentros(){
                LectorArchivo lectorArchivo = new LectorArchivo();
                this.centros.addAll(lectorArchivo.cargarCentroDesdeExcel(rutaArchivo));
        }

        public void agregar(CentroCultivo centroCultivo) {
            centros.add(centroCultivo);
        }

        public void listarTodosCentros(){
            mostrarencabezado();
            for(CentroCultivo centroCultivo : centros){
                System.out.println(centroCultivo);
            }
        }
        public List<CentroCultivo> filtrarPorUbicacion(String comuna) {
            List<CentroCultivo> resultado = new ArrayList<>();

            for(CentroCultivo centroCultivo : centros){
                if(centroCultivo.getUbicacion().getComuna().equalsIgnoreCase(comuna)) {
                    resultado.add(centroCultivo);
                }
            }
            return resultado;
        }

        public static void  mostrarencabezado(){
            System.out.println("=================================");
            System.out.println("------CENTROS DE PRODUCCIÓN------");
            System.out.println("=================================");
        }
}