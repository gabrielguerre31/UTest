package co.com.choucair.retotecnico.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SingUpPage {
    public static final Target SINGUP_BUTTON = Target.the("Button that show us the form to SingUp ")
            .located(By.className("unauthenticated-nav-bar__sign-up"));
}
