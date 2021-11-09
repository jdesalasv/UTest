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


import static co.com.choucair.certification.UTest.userinterface.UTestAddresData.*;



public class AddresData implements Task {

    UTestData uTestData;

    public AddresData(UTestData uTestData){

        this.uTestData = uTestData;

    }

    public static AddresData insertInto(UTestData uTestData){

        return  Tasks.instrumented(AddresData.class, uTestData);

    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Enter.theValue(uTestData.getStrCity()).into(INPUT_CITY),
                Enter.theValue(uTestData.getStrZip()).into(INPUT_ZIP),
                Click.on(SELECT_COUNTRY),
                Enter.theValue(uTestData.getStrCountry()).into(INPUT_COUNTRY),
                Hit.the(Keys.ENTER).into(INPUT_COUNTRY),
                Click.on(NEXT_DEVICES)
        );
    }
}
