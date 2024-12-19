package co.com.orangehmr.questions;

import co.com.orangehmr.userinterfaces.RecruitmentPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class CompareName implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(RecruitmentPage.ROW_TABLE).viewedBy(actor).asString();
    }

    public static CompareName compare(){
        return new CompareName();
    }
}
