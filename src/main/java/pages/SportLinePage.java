package pages;

import org.openqa.selenium.By;

public class SportLinePage {
    //producto=Air Zoom Vomero 14
    By txtBuscador=By.xpath("//input[@id='search' and @class='input-text']");
    By btnBuscador=By.xpath("//button[@class='amsearch-loupe']");
    By btnElementoBusqueda;
    By txtElementoBusqueda;

    public By getTxtBuscador() {
        return txtBuscador;
    }

    public By getBtnBuscador() {
        return btnBuscador;
    }

    public By getBtnElementoBusqueda() {
        return btnElementoBusqueda;
    }

    public By getTxtElementoBusqueda() {
        return txtElementoBusqueda;
    }

    public void setBtnElementoBusqueda(String producto) {
        ////a[@href='https://sportline.com.co/nike-air-zoom-vomero-14-ah7858-011-zapatillas-running.html']
        //strong[@class='product name product-item-name']//a[contains(text(), )]
       // this.btnElementoBusqueda =By.xpath("//a[@class='ui-search-item__group__element ui-search-link']//h2[contains(text(),'"+producto+"')]");
        this.btnElementoBusqueda =By.xpath("//strong[@class='product name product-item-name']//a[contains(text(), '"+producto+"')]");
    }

    public void setTxtElementoBusqueda(String producto) {
        //h1[@class='page-title']//span[@class='base' and contains(text(),)
        this.txtElementoBusqueda =By.xpath("//h1[contains(text(),'"+producto+"')]");
    }
}