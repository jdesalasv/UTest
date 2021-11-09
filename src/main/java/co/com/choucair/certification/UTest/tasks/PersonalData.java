package co.com.choucair.certification.UTest.tasks;

import co.com.choucair.certification.UTest.model.UTestData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;


import static co.com.choucair.certification.UTest.userinterface.UTestPersonalData.*;


public class PersonalData implements Task {

    UTestData uTestData;

    public PersonalData(UTestData uTestData){

        this.uTestData = uTestData;

    }
    public static PersonalData userData(UTestData uTestData){

        return Tasks.instrumented(PersonalData.class,uTestData);

    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Enter.theValue(uTestData.getStrFirstName()).into(INPUT_FIRST_NAME),
                Enter.theValue(uTestData.getStrLastName()).into(INPUT_LAST_NAME),
                Enter.theValue(uTestData.getStrEmail()).into(INPUT_EMAIL),
                SelectFromOptions.byVisibleText(uTestData.getStrMonth()).from(SELECT_MONTH),
                SelectFromOptions.byVisibleText(uTestData.getStrDay()).from(SELECT_DAY),
                SelectFromOptions.byVisibleText(uTestData.getStrYear()).from(SELECT_YEAR),
                Enter.theValue(uTestData.getStrLanguage()).into(INPUT_LANGUAGE),
                Hit.the(Keys.ENTER).into(INPUT_LANGUAGE),
                Click.on(NEXT_BUTTON)

        );
    }

}
