package co.com.homecenter.pageobjects;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

@DefaultUrl("https://www.homecenter.com.co/homecenter-co/")
public class BuscarYComprarPageObjects extends PageObject {

    By CERRAR_ANUNCIO_COVID = By.xpath("//i[@class='fas fa-times-circle closeModalDevoluciones']");
    By TXT_ARTICULO = By.xpath("//input[@placeholder='¿Qué estás buscando?']");
    By TXT_ARTICULO_A_COMPRAR = By.xpath("(//*[contains(text(),'Sofá Murano 2 Puestos 155x89x76 cm Gris')])[1]");
    By BTN_ACEPTAR = By.xpath("(//button[contains(text(),Aceptar)])[1]");
    By BTN_AGREGAR_AL_CARRITO = By.xpath("(//button[@id='testId-btn-add-to-cart'])[1]");
    //By BTN_IR_AL_CARRO_DE_COMPRAS = By.xpath("//*[contains(text(),'Ir al carro de compras')]");
    By BTN_CARRITO = By.xpath("//div[@class='jsx-3084516841 icon go-to-cart']");
    By TXT_ARTICULO_COMPRADO = By.xpath("//*[contains(text(),'Sofá Murano 2 Puestos 155x89x76 cm...')]");

    public void cerrarAnuncioCovid() {
        getDriver().findElement(CERRAR_ANUNCIO_COVID).click();
    }

    public void hacerScroll() {
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(false);",
                getDriver().findElement(TXT_ARTICULO_A_COMPRAR));
    }

    public void escribirProducto(String producto) {
        getDriver().findElement(TXT_ARTICULO).click();
        getDriver().findElement(TXT_ARTICULO).sendKeys(producto);
        getDriver().findElement(TXT_ARTICULO).sendKeys(Keys.ENTER);
    }

    public void aceptarLasCookies() {
        getDriver().findElement(BTN_ACEPTAR).click();
    }

    public void seleccionarArticulo(String articuloAComprar) {
        getDriver().findElement(TXT_ARTICULO_A_COMPRAR).click();
    }

    public void agregarAlCarrito() {
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(false);",
                getDriver().findElement(BTN_AGREGAR_AL_CARRITO));
        WebDriverWait wait = new WebDriverWait(getDriver(), 20);
        wait.until(ExpectedConditions.elementToBeClickable(BTN_AGREGAR_AL_CARRITO));
        getDriver().findElement(BTN_AGREGAR_AL_CARRITO).click();
        //Actions actions = new Actions(getDriver());
        //System.out.println(getDriver().findElement(BTN_CARRITO).isDisplayed());
        getDriver().findElement(BTN_CARRITO).click();
        //actions.moveToElement(getDriver().findElement(BTN_CARRITO)).click().perform();

    }
    public void resumenDeLaCompra(String texto){
        String textoObtenido = getDriver().findElement(TXT_ARTICULO_COMPRADO).getText();
        assertThat(textoObtenido, containsString(texto));
    }

}