package co.com.homecenter.stepdefinitions;

import co.com.homecenter.steps.BuscarYComprarArticuloSteps;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

import java.util.List;

public class BuscarYComprarProductosStepdefinition {

    @Steps
    BuscarYComprarArticuloSteps buscarYComprarArticuloSteps;

    @Dado("^que estoy en la pagina de homcenter$")
    public void queEstoyEnLaPaginaDeHomcenter() {
        buscarYComprarArticuloSteps.abrirAplicacionHomecenter();
        buscarYComprarArticuloSteps.cerrarAnuncioCovid();
    }

    @Cuando("^busco la siguiente palabra:$")
    public void buscoLaSiguientePalabra(List<String> List1) {
        buscarYComprarArticuloSteps.aceptarLasCookies();
        buscarYComprarArticuloSteps.escribirProducto(List1.get(0));
        buscarYComprarArticuloSteps.hacerScroll();
    }

    @Cuando("^selecciono el siguiente articulo:$")
    public void seleccionoElSiguienteArticulo(List<String> List2) {
        buscarYComprarArticuloSteps.seleccionarArticulo(List2.get(0));
    }

    @Cuando("^lo agrego al carrito de compra$")
    public void loAgregoAlCarritoDeCompra() {
        buscarYComprarArticuloSteps.agregarAlCarrito();
    }

    @Entonces("^valido en el carro de compras aparezca el producto seleccionado$")
    public void validoEnElCarroDeComprasAparezcaElProductoSeleccionado(List<String> List3) {
        buscarYComprarArticuloSteps.resumenDeLaCompra(List3.get(0));
    }

}
