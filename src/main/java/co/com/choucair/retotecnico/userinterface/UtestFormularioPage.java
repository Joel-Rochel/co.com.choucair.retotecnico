package co.com.choucair.retotecnico.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class UtestFormularioPage extends PageObject {
    public static final Target INPUT_NAME = Target.the("Escribimos el nombre del usuario")
            .located(By.id("firstName"));
    public static  final Target INPUT_LASTNAME = Target.the("Escribimos el apellido del usuario")
            .located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("Escribimos el correo del usuario")
            .located(By.id("email"));
    public static final Target SELECT_MONTH = Target.the("Seleccionamos el mes")
            .located(By.id("birthMonth"));
    public static final Target SELECT_DAY = Target.the("Seleccionamos el dia")
            .located(By.id("birthDay"));
    public static final Target SELECT_YEAR = Target.the("Seleccionamos el año")
            .located(By.id("birthYear"));
    public static final Target INPUT_LANGUAGE_PAGE = Target.the("Escribimos la ciudad")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[5]/div[2]/div[1]/input"));
    public static final Target BUTTON_LOCATION = Target.the("Boton next:location")
            .located(By.xpath("//a[contains(@class, 'btn btn-blue')]"));

    public static final Target  INPUT_CITY = Target.the("Escribimos la ciudad")
            .located(By.id("city"));
    public static final Target  INPUT_ZIP = Target.the("Escribimos la postal")
            .located(By.id("zip"));
    public static final Target  SELECT_COUNTRY = Target.the("Seleccionamos el pais")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div"));
    public static final Target  INPUT_COUNTRY = Target.the("Escribimos el pais")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));
    public static final Target BUTTON_DEVICES = Target.the("Boton next:devives")
            .located(By.xpath("//a[contains(@class, 'btn btn-blue pull-right')]"));

    public static final Target  SELECT_COMPUTER = Target.the("Seleccionamos el computador")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[1]/div[2]/div"));
    public static final Target  INPUT_COMPUTER = Target.the("Escribimos el computador")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[1]/div[2]/div/input[1]"));
    public static final Target  SELECT_VERSION = Target.the("Seleccionamos la version del SO")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[2]/div[2]/div"));
    public static final Target  INPUT_VERSION = Target.the("Escribimos la version del SO")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[2]/div[2]/div/input[1]"));
    public static final Target  SELECT_LANGUAGE = Target.the("Seleccionamos el idioma")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[3]/div[2]/div"));
    public static final Target  INPUT_LANGUAGE = Target.the("Escribimos el idioma")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[3]/div[2]/div/input[1]"));
    public static final Target  SELECT_MOBILE = Target.the("Seleccionamos el celular")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[1]/div[2]/div"));
    public static final Target  INPUT_MOBILE = Target.the("Escribimos el celular")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[1]/div[2]/div/input[1]"));
    public static final Target  SELECT_MODEL = Target.the("Seleccionamos el modelo")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/div[2]/div"));
    public static final Target  INPUT_MODEL = Target.the("Escribimos el modelo")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/div[2]/div/input[1]"));
    public static final Target  SELECT_SO = Target.the("Seleccionamos el SO del celular")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[3]/div[2]/div"));
    public static final Target  INPUT_SO = Target.the("Escribimos el SO del celular")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[3]/div[2]/div/input[1]"));
    public static final Target BUTTON_LASTSTEP = Target.the("Boton next:Last Step")
            .located(By.xpath("//a[contains(@class, 'btn btn-blue pull-right')]"));

    public static final Target  INPUT_PASSWORD = Target.the("Escribimos la contraseña")
            .located(By.id("password"));
    public static final Target  INPUT_CONFIRM_PASSWORD = Target.the("Confirmamos la contraseña")
            .located(By.id("confirmPassword"));
    public static final Target  CHECKBOX_INFORMED  =  Target.the("Marcamos para mantener informado")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[4]/label/span"));
    public static final Target  CHECKBOX_TERMS  =  Target.the("Marcamos para aceptar los terminos")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target  CHECKBOX_PRIVACY  =  Target.the("Marcamos para aceptar la privacidad")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    public static final Target BUTTON_COMPLETE = Target.the("Boton next:Last Step")
            .located(By.xpath("//a[contains(@class, 'btn btn-blue')]"));


}
