package co.com.choucair.certification.UTest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UTestAddresData {

    public static final Target INPUT_CITY = Target.the("Insert city")
            .located(By.xpath("//*[@id=\"city\"]"));
    public static final Target INPUT_ZIP = Target.the("Insert Zip Code")
            .located(By.xpath("//*[@id=\"zip\"]"));
    public static final Target SELECT_COUNTRY = Target.the("Insert country")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/div[1]"));
    public static final Target INPUT_COUNTRY = Target.the("Insert country")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));
    public static final Target NEXT_DEVICES = Target.the("button to go the next devices")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/div/a/span"));

}
