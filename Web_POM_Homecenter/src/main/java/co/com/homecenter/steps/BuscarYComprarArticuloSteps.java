package co.com.homecenter.steps;

import co.com.homecenter.pageobjects.BuscarYComprarPageObjects;
import net.thucydides.core.annotations.Step;

public class BuscarYComprarArticuloSteps {

    BuscarYComprarPageObjects buscarYComprar = new BuscarYComprarPageObjects();

    @Step
    public void abrirAplicacionHomecenter() {
        buscarYComprar.open();
    }

    @Step
    public void cerrarAnuncioCovid() {
        buscarYComprar.cerrarAnuncioCovid();
    }

    @Step
    public void escribirProducto(String articulo) {
        buscarYComprar.escribirProducto(articulo);
    }

    @Step
    public void hacerScroll() {
        buscarYComprar.hacerScroll();
    }

    @Step
    public void aceptarLasCookies() {
        buscarYComprar.aceptarLasCookies();
    }

    public void seleccionarArticulo(String articuloAComprar) {
        buscarYComprar.seleccionarArticulo(articuloAComprar);
    }

    @Step
    public void agregarAlCarrito() {
        buscarYComprar.agregarAlCarrito();
    }

    @Step
    public void resumenDeLaCompra(String texto) {
        buscarYComprar.resumenDeLaCompra(texto);
    }
}