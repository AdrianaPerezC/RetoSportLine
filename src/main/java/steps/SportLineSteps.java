package steps;

import drivers.GoogleChromeDriver;
import excel.Excel;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.SportLinePage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class SportLineSteps {
    SportLinePage sportLinePage =new SportLinePage();
    public ArrayList<Map<String, String>> listaProductos;

    public void abrirPagina(){
        GoogleChromeDriver.ChromeWebDriver("https://sportline.com.co/");
    }

    public void cargarDatos() throws IOException {
        listaProductos = Excel.leerDatosDeHojaDeExcel("productosSportLine.xlsx","Hoja1");
    }
    public void buscarYValidadElementosEnSportLine(){
        for (int i = 0; i < listaProductos.size(); i++){
            GoogleChromeDriver.driver.findElement(sportLinePage.getTxtBuscador()).sendKeys(listaProductos.get(i).get("NombreProducto"));
            GoogleChromeDriver.driver.findElement(sportLinePage.getTxtBuscador()).sendKeys(Keys.ENTER);
            sportLinePage.setBtnElementoBusqueda(listaProductos.get(i).get("NombreProducto"));
            sportLinePage.setTxtElementoBusqueda(listaProductos.get(i).get("NombreProducto"));
            Assert.assertEquals(listaProductos.get(i).get("NombreProducto").replaceAll("\\s+",""), GoogleChromeDriver.driver.findElement(sportLinePage.getTxtElementoBusqueda()).getText().toString().replaceAll("\\s+",""));
        }
    }
    public void cerrarNavegador(){
        GoogleChromeDriver.driver.quit();
    }
}
