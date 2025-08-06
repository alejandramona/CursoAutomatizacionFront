package demoqa.org.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterDemoQAPages extends PageObject {

    @FindBy(id = "firstName")
    WebElement nombre;

    public void openUrlPrueba(String url){
        getDriver().get(url);
        getDriver().manage().window().maximize();
    }

    public void sendkeyPrimerNombre(String name){
        nombre.sendKeys(name); // Usa el parámetro correctamente
    }
}
