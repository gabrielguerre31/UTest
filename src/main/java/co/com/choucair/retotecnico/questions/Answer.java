package co.com.choucair.retotecnico.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.choucair.retotecnico.userinterface.EnterPasswordAndPoliticsDataPage.REGISTER;

public class Answer implements Question<Boolean> {
    private String question;
    public Answer (String question){
        this.question = question;
    }
    public static Answer toThe(String question) {
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String register = Text.of(REGISTER).viewedBy(actor).asString();
        if (question.equals(register)){
            result = true;
        }else{
            result = false;
        }
        System.out.println(result);

        return result;
    }
}
