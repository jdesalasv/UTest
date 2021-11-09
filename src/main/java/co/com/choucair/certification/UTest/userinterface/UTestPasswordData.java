package co.com.choucair.certification.UTest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UTestPasswordData {

    public static final Target INPUT_PASSWORD = Target.the("Insert password")
            .located(By.id("password"));
    public static final Target INPUT_CONFIRM_PASSWORD = Target.the("Insert confirm password")
            .located(By.id("confirmPassword"));
    public static final Target STAY_INFORMED = Target.the("accept stay informed")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[4]/label/span"));
    public static final Target ACCEPT_TERMS = Target.the("accept terms of use")
            .located(By.id("termOfUse"));
    public static final Target ACCEPT_PRIVACY = Target.the("accept privacy and security policy")
            .located(By.id("privacySetting"));
    public static final Target COMPLETE_SETUP = Target.the("button to complete setup and register")
            .located(By.xpath("//*[@id=\"laddaBtn\"]/span"));
}
