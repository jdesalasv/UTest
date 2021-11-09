package co.com.choucair.certification.UTest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UTestPersonalData {

    public static final Target INPUT_FIRST_NAME = Target.the("Insert First Name")
            .located(By.id("firstName"));
    public static final Target INPUT_LAST_NAME = Target.the("Insert Last Name")
            .located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("Insert the Email")
            .located(By.id("email"));
    public static final Target SELECT_MONTH = Target.the("Select Birth Month")
            .located(By.xpath("//*[@id=\"birthMonth\"]"));
    public static final Target SELECT_DAY = Target.the("Select Birth Day")
            .located(By.xpath("//*[@id=\"birthDay\"]"));
    public static final Target SELECT_YEAR= Target.the("Select Birth Year")
            .located(By.xpath("//*[@id=\"birthYear\"]"));
    public static final Target INPUT_LANGUAGE = Target.the("Insert Language")
            .located(By.xpath("//*[@id=\"languages\"]/div[1]/input"));
    public static final Target NEXT_BUTTON = Target.the("button to go the next location")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a/span"));
}
