package co.com.orangehmr.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class CantidatesPage {

    public static final Target BTN_SHORTLIST = Target.the("Shortlist")
            .locatedBy("//button[normalize-space()='Shortlist']");
    public static final Target TXT_FNOTES = Target.the("Form Notes")
            .locatedBy("//textarea[@placeholder='Type here']");
    public static final Target BTN_SAVE = Target.the("Button Save")
            .locatedBy("//button[@type='submit']");
    public static final Target BTN_SCHEDULE = Target.the("Button Schedule Interview")
            .locatedBy("//button[normalize-space()='Schedule Interview']");


}
