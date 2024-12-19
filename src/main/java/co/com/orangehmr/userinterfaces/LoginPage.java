package co.com.orangehmr.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {

    public static final Target TXT_USERNAME = Target.the("enter user")
            .locatedBy("//input[@placeholder='Username']");
    public static final Target TXT_PASSWORD = Target.the("enter password")
            .locatedBy("//input[@placeholder='Password']");
    public static final Target BTN_LOGIN = Target.the("clic buttom login")
            .locatedBy("//button[@type='submit']");
}
