package cl.salmontt.util;

/**
 * MUESTRA Y RECORRE UN ARCHIVO EXCEL LINEA POR LIENA
 */

import cl.salmontt.model.CentroCultivo;
import cl.salmontt.model.Ubicacion;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

public class LectorArchivo {

    public List<CentroCultivo>cargarCentroDesdeExcel(String ruta){
        List<CentroCultivo> cargaDeCentros = new ArrayList<>();
        try(FileInputStream fileInputStream = new FileInputStream(ruta)){
            XSSFWorkbook libro = new XSSFWorkbook(fileInputStream);
            XSSFSheet hoja = libro.getSheetAt(0);

            for(int i =  1; i <= hoja.getLastRowNum(); i++){
                var fila = hoja.getRow(i);

                String nombreDelCentro =  fila.getCell(0).getStringCellValue();
                String nombreComuna =  fila.getCell(1).getStringCellValue();
                Ubicacion ubicacion = new Ubicacion(nombreComuna);
                int toneladasDeProduccion = (int) fila.getCell(2).getNumericCellValue();
                CentroCultivo centroCultivo = new CentroCultivo(nombreDelCentro, ubicacion, toneladasDeProduccion);

                cargaDeCentros.add(centroCultivo);
            }
            libro.close();

            // BUSCAR LA EXCEPTION QUE CONTIENE Y AGREGAR
        }catch(Exception e){
            System.out.println("Error al cargar Excel");
        }
        return cargaDeCentros;
    }
}
