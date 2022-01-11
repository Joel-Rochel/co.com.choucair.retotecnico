package co.com.choucair.retotecnico.tasks;

import co.com.choucair.retotecnico.model.Utest_Data;
import co.com.choucair.retotecnico.userinterface.UtestFormularioPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;

import java.util.List;

public class Formulario implements Task {

    private List<Utest_Data> data;

    public Formulario(List<Utest_Data> data) {
        this.data = data;
    }

    public static Formulario userData(List<Utest_Data> data) {
        return Tasks.instrumented(Formulario.class, data);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(data.get(0).getStrName()).into(UtestFormularioPage.INPUT_NAME),
                Enter.theValue(data.get(0).getStrLastName()).into(UtestFormularioPage.INPUT_LASTNAME),
                Enter.theValue(data.get(0).getStrEmail()).into(UtestFormularioPage.INPUT_EMAIL),
                SelectFromOptions.byVisibleText(data.get(0).getStrMonth()).from(UtestFormularioPage.SELECT_MONTH),
                SelectFromOptions.byVisibleText(data.get(0).getStrDay()).from(UtestFormularioPage.SELECT_DAY),
                SelectFromOptions.byVisibleText(data.get(0).getStrYear()).from(UtestFormularioPage.SELECT_YEAR),
                Enter.theValue(data.get(0).getStrLanguagePage()).into(UtestFormularioPage.INPUT_LANGUAGE_PAGE),
                Hit.the(Keys.ENTER).into(UtestFormularioPage.INPUT_LANGUAGE_PAGE),
                Click.on(UtestFormularioPage.BUTTON_LOCATION),

                Enter.theValue(data.get(0).getStrCiudad()).into(UtestFormularioPage.INPUT_CITY),
                Hit.the(Keys.ARROW_DOWN).into(UtestFormularioPage.INPUT_CITY),
                Hit.the(Keys.ENTER).into(UtestFormularioPage.INPUT_CITY),
                Enter.theValue(data.get(0).getStrPostal()).into(UtestFormularioPage.INPUT_ZIP),
                Click.on(UtestFormularioPage.SELECT_COUNTRY),
                Enter.theValue(data.get(0).getStrPais()).into(UtestFormularioPage.INPUT_COUNTRY),
                Click.on(UtestFormularioPage.BUTTON_DEVICES),

                Click.on(UtestFormularioPage.SELECT_COMPUTER),
                Enter.theValue(data.get(0).getStrComputer()).into(UtestFormularioPage.INPUT_COMPUTER),
                Hit.the(Keys.ENTER).into(UtestFormularioPage.INPUT_COMPUTER),
                Click.on(UtestFormularioPage.SELECT_VERSION),
                Enter.theValue(data.get(0).getStrVersion()).into(UtestFormularioPage.INPUT_VERSION),
                Hit.the(Keys.ENTER).into(UtestFormularioPage.INPUT_VERSION),
                Click.on(UtestFormularioPage.SELECT_LANGUAGE),
                Enter.theValue(data.get(0).getStrLanguage()).into(UtestFormularioPage.INPUT_LANGUAGE),
                Hit.the(Keys.ENTER).into(UtestFormularioPage.INPUT_LANGUAGE),
                Click.on(UtestFormularioPage.SELECT_MOBILE),
                Enter.theValue(data.get(0).getStrMobile()).into(UtestFormularioPage.INPUT_MOBILE),
                Hit.the(Keys.ENTER).into(UtestFormularioPage.INPUT_MOBILE),
                Click.on(UtestFormularioPage.SELECT_MODEL),
                Enter.theValue(data.get(0).getStrModel()).into(UtestFormularioPage.INPUT_MODEL),
                Hit.the(Keys.ENTER).into(UtestFormularioPage.INPUT_MODEL),
                Click.on(UtestFormularioPage.SELECT_SO),
                Enter.theValue(data.get(0).getStrSo()).into(UtestFormularioPage.INPUT_SO),
                Hit.the(Keys.ENTER).into(UtestFormularioPage.INPUT_SO),
                Click.on(UtestFormularioPage.BUTTON_LASTSTEP),

                Enter.theValue(data.get(0).getStrPassword()).into(UtestFormularioPage.INPUT_PASSWORD),
                Enter.theValue(data.get(0).getStrPassword()).into(UtestFormularioPage.INPUT_CONFIRM_PASSWORD),
                Click.on(UtestFormularioPage.CHECKBOX_INFORMED),
                Click.on(UtestFormularioPage.CHECKBOX_TERMS),
                Click.on(UtestFormularioPage.CHECKBOX_PRIVACY),
                Click.on(UtestFormularioPage.BUTTON_COMPLETE)

        );

    }
}
