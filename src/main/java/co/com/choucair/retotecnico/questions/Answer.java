package co.com.choucair.retotecnico.questions;

import co.com.choucair.retotecnico.model.Utest_Data;
import co.com.choucair.retotecnico.userinterface.UtestFormularioPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

public class Answer implements Question<Boolean> {

    private List<Utest_Data> data;

    public Answer(List<Utest_Data> data) {
        this.data = data;
    }

    public static Answer toThe(List<Utest_Data> data) {
        return new Answer(data);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String confirm_button = Text.of(UtestFormularioPage.BUTTON_COMPLETE).viewedBy(actor).asString();
        return data.get(0).getStrConfirmButton().equals(confirm_button);
    }
}
