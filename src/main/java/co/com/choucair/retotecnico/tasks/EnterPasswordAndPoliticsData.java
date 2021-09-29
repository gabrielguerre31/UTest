package co.com.choucair.retotecnico.tasks;

import co.com.choucair.retotecnico.model.UTestUserData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.choucair.retotecnico.userinterface.EnterPasswordAndPoliticsDataPage.*;


public class EnterPasswordAndPoliticsData implements Task {
    UTestUserData uTestUserData;

    public EnterPasswordAndPoliticsData(UTestUserData uTestUserData) {
        this.uTestUserData = uTestUserData;
    }

    public static EnterPasswordAndPoliticsData onThePageRegisterPasswordData(UTestUserData uTestUserData) {
        return Tasks.instrumented(EnterPasswordAndPoliticsData.class,uTestUserData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(uTestUserData.getStrPassword()).into(INPUT_PASS),
                Enter.theValue(uTestUserData.getStrPassword()).into(INPUT_REPASS),
                Click.on(INPUT_TERMS),
                Click.on(INPUT_POLICY),Click.on(BUTTON_NEXT)
        );

    }
}
