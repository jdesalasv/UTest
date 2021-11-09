package co.com.choucair.certification.UTest.questions;



import co.com.choucair.certification.UTest.userinterface.WelcomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;


public class Answer implements Question<Boolean> {
    private String question;

    public Answer(String question) {
        this.question = question;
    }

    public static Answer toThe(String question) {
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String welcomeText = Text.of(WelcomePage.WELCOME_TEXT).viewedBy(actor).asString();
        if (question.equals(welcomeText)){
            result = true;
        }else{
            result = false;
        }
        return result;
    }
}