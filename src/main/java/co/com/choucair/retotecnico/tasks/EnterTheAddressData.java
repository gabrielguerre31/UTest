package co.com.choucair.retotecnico.tasks;

import co.com.choucair.retotecnico.model.UTestUserData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static co.com.choucair.retotecnico.userinterface.EnterAddressDataPage.*;


public class EnterTheAddressData implements Task {
    UTestUserData uTestUserData;

    public EnterTheAddressData(UTestUserData uTestUserData) {
        this.uTestUserData = uTestUserData;
    }

    public static EnterTheAddressData onTheRegistrationPage(UTestUserData uTestUserData) {
        return Tasks.instrumented(EnterTheAddressData.class,uTestUserData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
        Enter.theValue(uTestUserData.getStrPostal()).into(INPUT_CPOSTAL),
        Click.on(INPUT_COUNTRY),Enter.theValue(uTestUserData.getStrCountry()).into(TEXT_COUNTRY).thenHit(Keys.TAB),
        Click.on(BUTTON_NEXT2)
        );
    }
}
