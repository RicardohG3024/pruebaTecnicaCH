package co.com.orangehmr.tasks;

import co.com.orangehmr.userinterfaces.CantidatesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class CandidateTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(CantidatesPage.BTN_SHORTLIST));
        actor.attemptsTo(Enter.theValue("Para entrevista pruebas").into(CantidatesPage.TXT_FNOTES));
        actor.attemptsTo(Click.on(CantidatesPage.BTN_SAVE));
        actor.attemptsTo(Click.on(CantidatesPage.BTN_SCHEDULE));

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static CandidateTask dataCandidate(){
        return Tasks.instrumented(CandidateTask.class);
    }
}
