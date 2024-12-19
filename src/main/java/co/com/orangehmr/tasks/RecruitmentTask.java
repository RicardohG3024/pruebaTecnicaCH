package co.com.orangehmr.tasks;

import co.com.orangehmr.interactions.WaitElement;
import co.com.orangehmr.userinterfaces.RecruitmentPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

public class RecruitmentTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(RecruitmentPage.MENU_RECRUITMENT));
        actor.attemptsTo(Click.on(RecruitmentPage.BTN_ADD));
        actor.attemptsTo(Enter.theValue("Primer Nombre Rprueba").into(RecruitmentPage.TXT_FIRSTNAME));
        actor.attemptsTo(Enter.theValue("Segundo Nombre Aprueba").into(RecruitmentPage.TXT_MIDDLENAME));
        actor.attemptsTo(Enter.theValue("Apellido HGprueba").into(RecruitmentPage.TXT_LASTNAME));
        actor.attemptsTo(Click.on(RecruitmentPage.SLC_VACANCY));
        //actor.attemptsTo(WaitElement.untilAppears(RecruitmentPage.SLC_VACANCY));
        actor.attemptsTo(Hit.the(Keys.ARROW_DOWN).into(RecruitmentPage.SLC_VACANCY));
        actor.attemptsTo(Hit.the(Keys.ARROW_DOWN).into(RecruitmentPage.SLC_VACANCY));
        actor.attemptsTo(Hit.the(Keys.ARROW_DOWN).into(RecruitmentPage.SLC_VACANCY));
        actor.attemptsTo(Hit.the(Keys.ARROW_DOWN).into(RecruitmentPage.SLC_VACANCY));
        actor.attemptsTo(Hit.the(Keys.ARROW_DOWN).into(RecruitmentPage.SLC_VACANCY));
        actor.attemptsTo(Hit.the(Keys.ENTER).into(RecruitmentPage.SLC_VACANCY));
        actor.attemptsTo(Enter.theValue("ing.pruebasrh@pruebacorreo.com").into(RecruitmentPage.TXT_EMAIL));
        actor.attemptsTo(Enter.theValue("12345678").into(RecruitmentPage.TXT_CONTACTNUMBER));
        actor.attemptsTo(Enter.theValue("Ingeniero, Pruebas, Testing, QA").into(RecruitmentPage.TXT_KEYWORDS));
        actor.attemptsTo(Enter.theValue("Mensaje de nota del empleado.").into(RecruitmentPage.TXT_NOTES));
        actor.attemptsTo(Enter.theValue("2024-19-12").into(RecruitmentPage.TXT_DATE));
        actor.attemptsTo(Click.on(RecruitmentPage.CHK_CONSENT));
        actor.attemptsTo(Click.on(RecruitmentPage.BTN_SAVE));


        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static RecruitmentTask dataRegister (){
        return Tasks.instrumented(RecruitmentTask.class);
    }
}
