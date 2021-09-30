package co.com.choucair.retotecnico.tasks;

import co.com.choucair.retotecnico.model.UTestUserData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static co.com.choucair.retotecnico.userinterface.EnterDevicesDataPage.*;


public class EnterTheDevicesData implements Task {
    UTestUserData uTestUserData;

    public EnterTheDevicesData(UTestUserData uTestUserData) {
        this.uTestUserData = uTestUserData;
    }

    public static EnterTheDevicesData onTheRegistrationPage(UTestUserData uTestUserData) {
        return Tasks.instrumented(EnterTheDevicesData.class,uTestUserData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(INPUT_COMPUTER),
                Enter.theValue(uTestUserData.getStrComputer()).into(TEXT_COMPUTER).thenHit(Keys.TAB),
                Click.on(INPUT_VERSION),
                Enter.theValue(uTestUserData.getStrVersion()).into(TEXT_VERSION).thenHit(Keys.TAB),
                Click.on(INPUT_LANGUAGE),
                Enter.theValue(uTestUserData.getStrLanguagePc()).into(TEXT_LANGUAGE).thenHit(Keys.TAB),
                Click.on(INPUT_DEVICE),
                Enter.theValue(uTestUserData.getStrDevice()).into(TEXT_DEVICE).thenHit(Keys.TAB),
                Click.on(INPUT_MODEL),
                Enter.theValue(uTestUserData.getStrModel()).into(TEXT_MODEL).thenHit(Keys.TAB),
                Click.on(INPUT_OS),
                Enter.theValue(uTestUserData.getStrOs()).into(TEXT_OS).thenHit(Keys.TAB),
                Click.on(BUTTON_NEXT2));

    }
}
