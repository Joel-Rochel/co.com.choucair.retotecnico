package co.com.choucair.retotecnico.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class UtestRegistroPage extends PageObject {
    public static final Target REGISTRO_BUTTON = Target.the("Boton que nos muestra el registro")
            .located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']"));
}
