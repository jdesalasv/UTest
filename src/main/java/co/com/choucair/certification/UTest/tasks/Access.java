package co.com.choucair.certification.UTest.tasks;


import co.com.choucair.certification.UTest.userinterface.UTestAccesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;



public class Access implements Task {




    public static Access onThePage() {

        return Tasks.instrumented(Access.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(UTestAccesPage.JOIN_BUTTON)


        );


    }
}
