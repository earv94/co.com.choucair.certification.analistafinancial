package co.com.choucair.certification.analistafinancial.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features",
        tags = "@Regresion",
        glue = "co.com.choucair.certification.analistafinancial.stepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class RunnerTags {

}