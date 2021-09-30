package co.com.choucair.retotecnico.tasks;

import co.com.choucair.retotecnico.model.UTestUserData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;

import static co.com.choucair.retotecnico.userinterface.EnterPersonalDataPage.*;


public class EnterThePersonalData implements Task {
    UTestUserData uTestUserData;

    public EnterThePersonalData(UTestUserData uTestUserData) {
        this.uTestUserData = uTestUserData;
    }

    public static EnterThePersonalData onTheRegistrationPage(UTestUserData uTestUserData) {
        return Tasks.instrumented(EnterThePersonalData.class,uTestUserData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo( Enter.theValue(uTestUserData.getStrFirstName()).into(INPUT_FIRSTNAME),
                Enter.theValue(uTestUserData.getStrLastName()).into(INPUT_LASTNAME),
                Enter.theValue(uTestUserData.getStrEmail()).into(INPUT_EMAIL),
                SelectFromOptions.byVisibleText(uTestUserData.getStrMonth()).from(INPUT_MONTH),
                SelectFromOptions.byVisibleText(uTestUserData.getStrDay()).from(INPUT_DAY),
                SelectFromOptions.byVisibleText(uTestUserData.getStrYear()).from(INPUT_YEAR),
                Enter.theValue(uTestUserData.getStrLanguage()).into(INPUT_LENGUAGE).thenHit(Keys.ENTER),
                Click.on(BUTTON_NEXT)
                );

    }
}
