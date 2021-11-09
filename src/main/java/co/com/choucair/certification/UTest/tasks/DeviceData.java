package co.com.choucair.certification.UTest.tasks;

import co.com.choucair.certification.UTest.model.UTestData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;

import org.openqa.selenium.Keys;

import static co.com.choucair.certification.UTest.userinterface.UTestDeviceData.*;


public class DeviceData implements Task {
    UTestData uTestData;

    public DeviceData(UTestData uTestData){

        this.uTestData = uTestData;

    }

    public static DeviceData insertInto(UTestData uTestData){

        return  Tasks.instrumented(DeviceData.class, uTestData);

    }
    
    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Click.on(SELECT_OS),
               Enter.theValue(uTestData.getStrSO()).into(INPUT_OS),
               Hit.the(Keys.ENTER).into(INPUT_OS),

               Click.on(SELECT_OS_VERSION),
               Enter.theValue(uTestData.getStrSOVersion()).into(INPUT_OS_VERSION),
               Hit.the(Keys.ENTER).into(INPUT_OS_VERSION),

               Click.on(SELECT_OS_LANGUAGE),
               Enter.theValue(uTestData.getStrLanguage()).into(INPUT_OS_LANGUAGE),
               Hit.the(Keys.ENTER).into(INPUT_OS_LANGUAGE),

               Click.on(SELECT_BRAND),
               Enter.theValue(uTestData.getStrBrand()).into(INPUT_BRAND),
               Hit.the(Keys.ENTER).into(INPUT_BRAND),

               Click.on(SELECT_MODEL),
               Enter.theValue(uTestData.getStrModel()).into(INPUT_MODEL),
               Hit.the(Keys.ENTER).into(INPUT_MODEL),

               Click.on(SELECT_MOVIL_SO),
               Enter.theValue(uTestData.getStrMovilSO()).into(INPUT_MOVIL_SO),
               Hit.the(Keys.ENTER).into(INPUT_MOVIL_SO),

               Click.on(NEXT_LAST_STEP)
        );
    }
    }
