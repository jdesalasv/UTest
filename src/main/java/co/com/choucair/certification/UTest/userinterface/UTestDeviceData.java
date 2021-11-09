package co.com.choucair.certification.UTest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UTestDeviceData {

    public static final Target SELECT_OS = Target.the("Select OS INPUT")
            .located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/div[1]"));
    public static final Target INPUT_OS = Target.the("Insert OS selected")
            .located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/input[1]"));

    public static final Target SELECT_OS_VERSION = Target.the("Select OS Version INPUT")
            .located(By.xpath("//*[@id=\"web-device\"]/div[2]/div[2]/div/div[1]"));
    public static final Target INPUT_OS_VERSION = Target.the("Insert OS Version selected")
            .located(By.xpath("//*[@id=\"web-device\"]/div[2]/div[2]/div/input[1]"));

    public static final Target SELECT_OS_LANGUAGE = Target.the("Select OS language INPUT")
            .located(By.xpath("//*[@id=\"web-device\"]/div[3]/div[2]/div/div[1]"));
    public static final Target INPUT_OS_LANGUAGE = Target.the("Insert OS language selected")
            .located(By.xpath("//*[@id=\"web-device\"]/div[3]/div[2]/div/input[1]"));


    public static final Target SELECT_BRAND = Target.the("Select movil device brand")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/div[1]"));
    public static final Target INPUT_BRAND = Target.the("insert movil device brand")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/input[1]"));

    public static final Target SELECT_MODEL = Target.the("Select movil device model")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]/div/div[1]"));
    public static final Target INPUT_MODEL = Target.the("insert movil device model")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]/div/input[1]"));

    public static final Target SELECT_MOVIL_SO = Target.the("Select movil device SO")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/div[1]"));
    public static final Target INPUT_MOVIL_SO = Target.the("insert movil device SO")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/input[1]"));

    public static final Target NEXT_LAST_STEP = Target.the("button to go the next last step")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/div[2]/div/a"));
}
