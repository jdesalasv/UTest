package co.com.choucair.certification.UTest.userinterface;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class WelcomePage  {

    public static final Target WELCOME_TEXT = Target.the("Check the welcome text")
            .located(By.xpath("//*[@id=\"mainContent\"]/div/div/div[1]/div/h1"));


}
