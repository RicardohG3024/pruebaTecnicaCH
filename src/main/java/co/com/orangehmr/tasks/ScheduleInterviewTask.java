package co.com.orangehmr.tasks;

import co.com.orangehmr.interactions.WaitElement;
import co.com.orangehmr.userinterfaces.ScheduleInterviewPage;
import javafx.scene.Scene;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

public class ScheduleInterviewTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("Entrevista QA automatizacion").into(ScheduleInterviewPage.TXT_INTERVIEWTITLE));
        actor.attemptsTo(Enter.theValue("Rahul").into(ScheduleInterviewPage.TXT_INTERVIEWER));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
       actor.attemptsTo(WaitElement.untilAppears(ScheduleInterviewPage.TXT_INTERVIEWER));
        actor.attemptsTo(Hit.the(Keys.ARROW_DOWN).into(ScheduleInterviewPage.TXT_INTERVIEWER));
        actor.attemptsTo(Hit.the(Keys.ENTER).into(ScheduleInterviewPage.TXT_INTERVIEWER));
        actor.attemptsTo(Enter.theValue("2024-19-12").into(ScheduleInterviewPage.TXT_DATE));
        actor.attemptsTo(Enter.theValue("04:00 PM").into(ScheduleInterviewPage.TXT_TIME));
        actor.attemptsTo(Enter.theValue("Prueba Nota").into(ScheduleInterviewPage.TXT_NOTESINTER));
        actor.attemptsTo(Click.on(ScheduleInterviewPage.BTN_SAVE));
        actor.attemptsTo(Click.on(ScheduleInterviewPage.BTN_INTERVIEWPASSED));
        actor.attemptsTo(Click.on(ScheduleInterviewPage.BTN_SAVE));
        actor.attemptsTo(Click.on(ScheduleInterviewPage.BTN_OFFERJOB));
        actor.attemptsTo(Click.on(ScheduleInterviewPage.BTN_SAVE));
        actor.attemptsTo(Click.on(ScheduleInterviewPage.BTN_HIRED));
        actor.attemptsTo(Click.on(ScheduleInterviewPage.BTN_SAVE));

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public static ScheduleInterviewTask interviewCandidate(){
        return Tasks.instrumented(ScheduleInterviewTask.class);
    }
}

