package co.com.choucair.retotecnico.tasks;

import co.com.choucair.retotecnico.userinterface.OpenUpPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import static net.serenitybdd.screenplay.actions.Open.browserOn;

public class OpenUp implements Task {
    private OpenUpPage uTestPage;

    public static OpenUp thePage() {
        return Tasks.instrumented(OpenUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(browserOn(uTestPage));
    }
}
