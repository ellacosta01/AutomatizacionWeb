package co.com.homecenter.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src\\test\\resources\\buscar_y_comprar_producto.feature",
        glue = "co.com.homecenter.stepdefinitions",
        snippets = SnippetType.CAMELCASE)



public class BuscarYComprarProdcutoRunner {
}
