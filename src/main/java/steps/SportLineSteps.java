package steps;

import drivers.GoogleChromeDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.SportLinePage;

public class SportLineSteps {
    SportLinePage sportLinePage =new SportLinePage();

    public void abrirPagina(){
        GoogleChromeDriver.ChromeWebDriver("https://sportline.com.co/");
    }
    public void buscarElementoEnMerccadoLibre(String producto){
        GoogleChromeDriver.driver.findElement(sportLinePage.getTxtBuscador()).sendKeys(producto);
        GoogleChromeDriver.driver.findElement(sportLinePage.getBtnBuscador()).click();
        sportLinePage.setBtnElementoBusqueda(producto);
        GoogleChromeDriver.driver.findElement(sportLinePage.getBtnElementoBusqueda()).click();
        sportLinePage.setTxtElementoBusqueda(producto);
        GoogleChromeDriver.driver.findElement(sportLinePage.getTxtElementoBusqueda()).getText();
    }
    public void validarElementoEnPantalla(String producto){
        Assert.assertEquals(producto.replace("  "," "),GoogleChromeDriver.driver.findElement(sportLinePage.getTxtElementoBusqueda()).getText());
        GoogleChromeDriver.driver.quit();
    }
  /*  public void buscarElementoEnMercadoLibre(String producto){
        escribirEnTexto(sportLinePage.getTxtBuscador(),producto);
        clickEnElemento(sportLinePage.getBtnBuscador());
        sportLinePage.setBtnElementoBusqueda(producto);
        clickEnElemento(sportLinePage.getBtnElementoBusqueda());
        sportLinePage.setTxtElementoBusqueda(producto);
        GoogleChromeDriver.driver.findElement(sportLinePage.getTxtElementoBusqueda()).getText();
    }
    public void escribirEnTexto(By elemento, String texto){
        GoogleChromeDriver.driver.findElement(elemento).sendKeys(texto);
    }
    public void clickEnElemento(By elemento){
        GoogleChromeDriver.driver.findElement(elemento).click();
    }*/
}
