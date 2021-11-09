package co.com.choucair.certification.UTest.tasks;

import co.com.choucair.certification.UTest.model.UTestData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;



import static co.com.choucair.certification.UTest.userinterface.UTestPasswordData.*;

public class PasswordData implements Task {

    UTestData uTestData;

    public PasswordData(UTestData uTestData){

        this.uTestData = uTestData;

    }

    public static PasswordData insertInto(UTestData uTestData){

        return  Tasks.instrumented(PasswordData.class, uTestData);

    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Enter.theValue(uTestData.getStrPassword()).into(INPUT_PASSWORD),
                Enter.theValue(uTestData.getStrPassword()).into(INPUT_CONFIRM_PASSWORD),
                Click.on(STAY_INFORMED),
                Click.on(ACCEPT_TERMS),
                Click.on(ACCEPT_PRIVACY),
                Click.on(COMPLETE_SETUP)
        );
    }
}
