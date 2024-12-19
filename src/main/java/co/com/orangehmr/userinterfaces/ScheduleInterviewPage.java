package co.com.orangehmr.userinterfaces;

import com.jhlabs.image.SparkleFilter;
import net.serenitybdd.screenplay.targets.Target;

public class ScheduleInterviewPage {

    public static final Target TXT_INTERVIEWTITLE = Target.the("Interview Title")
            .locatedBy("(//input[@class='oxd-input oxd-input--active'])[6]");
    public static final Target TXT_INTERVIEWER = Target.the("Interviewer")
            .locatedBy("//input[@include-employees='onlyCurrent']");
    public static final Target TXT_DATE = Target.the("Date")
            .locatedBy("//input[@placeholder='yyyy-dd-mm']");
    public static final Target TXT_TIME = Target.the("Time")
            .locatedBy("//input[@placeholder='hh:mm']");
    public static final Target TXT_NOTESINTER = Target.the("Notes")
            .locatedBy("//textarea[@placeholder='Type here']");
    public static final Target BTN_SAVE = Target.the("Button Save")
            .locatedBy("//button[@type='submit']");
    public static final Target BTN_INTERVIEWPASSED = Target.the("Mark Interview Passed")
            .locatedBy("//button[normalize-space()='Mark Interview Passed']");
    public static final Target BTN_OFFERJOB = Target.the("Offer Job")
            .locatedBy("//button[normalize-space()='Offer Job']");
    public static final Target BTN_HIRED = Target.the("Button Hire")
            .locatedBy("//button[normalize-space()='Hire']");


}
