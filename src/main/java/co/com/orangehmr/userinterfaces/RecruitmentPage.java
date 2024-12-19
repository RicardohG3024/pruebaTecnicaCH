package co.com.orangehmr.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.apache.poi.ss.formula.functions.T;

public class RecruitmentPage {

    public static final Target MENU_RECRUITMENT = Target.the("Menu Recruitment")
            .locatedBy("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][normalize-space()='Recruitment']");
    public static final Target BTN_ADD = Target.the("Botton Add")
            .locatedBy("//button[normalize-space()='Add']");
    public static final Target TXT_FIRSTNAME = Target.the("First Name")
            .locatedBy("//input[@placeholder='First Name']");
    public static final Target TXT_MIDDLENAME = Target.the("Middle Name")
            .locatedBy("//input[@placeholder='Middle Name']");
    public static final Target TXT_LASTNAME = Target.the("Last Name")
            .locatedBy("//input[@placeholder='Last Name']");
    public static final Target SLC_VACANCY = Target.the("Vacancy")
            .locatedBy("//div[@class='oxd-select-text-input']");
    public static final Target TXT_EMAIL = Target.the("Email")
            .locatedBy("(//input[@placeholder='Type here'])[1]");
    public static final Target TXT_CONTACTNUMBER = Target.the("Contact Number")
            .locatedBy("(//input[@placeholder='Type here'])[2]");
    public static final Target TXT_KEYWORDS = Target.the("Keywords")
            .locatedBy("//input[@class='oxd-input oxd-input--active' and @placeholder='Enter comma seperated words...']");
    public static final Target TXT_NOTES = Target.the("Notes")
            .locatedBy("//textarea[@placeholder='Type here']");
    public static final Target TXT_DATE = Target.the("Date of Application")
            .locatedBy("//input[@placeholder='yyyy-dd-mm']");
    public static final Target BTN_SAVE = Target.the("Button Save")
            .locatedBy("//button[@type='submit']");
    public static final Target CHK_CONSENT = Target.the("Check Consent")
            .locatedBy("//i[@class='oxd-icon bi-check oxd-checkbox-input-icon']");
    public static final Target ROW_TABLE = Target.the("Name in row")
            .locatedBy("//div[@class='oxd-table']//div[text()='John  Doe']");





}
