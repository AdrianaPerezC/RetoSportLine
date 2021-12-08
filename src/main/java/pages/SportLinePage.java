package pages;

import org.openqa.selenium.By;

public class SportLinePage {
    By txtBuscador=By.xpath("//input[@id='search' and @class='input-text']");
    By btnElementoBusqueda;
    By txtElementoBusqueda;

    public By getTxtBuscador() {
        return txtBuscador;
    }

    public By getBtnElementoBusqueda() {
        return btnElementoBusqueda;
    }
    public By getTxtElementoBusqueda() {
        return txtElementoBusqueda;
    }

    public void setBtnElementoBusqueda(String producto) {
        this.btnElementoBusqueda =By.xpath("//strong[@class='product name product-item-name']//a[contains(text(),'"
                +producto+"')]");
    }

    public void setTxtElementoBusqueda(String producto) {
        this.txtElementoBusqueda=By.xpath("//div[@class='product-info-main']/div[@class='page-title-wrapper']" +
                "/h1[@class='page-title']//span[contains(text(),'"+producto+"')]");
    }
}
