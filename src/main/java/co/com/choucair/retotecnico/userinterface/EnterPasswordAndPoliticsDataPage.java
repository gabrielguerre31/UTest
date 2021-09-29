package co.com.choucair.retotecnico.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class EnterPasswordAndPoliticsDataPage {

    public static final Target INPUT_PASS = Target.the(" where do we write the password  ")
            .located(By.id("password"));
    public static final Target INPUT_REPASS = Target.the(" where do we write the password confirmation  ")
            .located(By.id("confirmPassword"));
    public static final Target INPUT_TERMS = Target.the(" where do we confirmation of terms  ")
            .located(By.xpath("//span[@ng-class='{error: userForm.termOfUse.$error.required}']"));
    public static final Target INPUT_POLICY = Target.the(" where do we confirmation of politics  ")
            .located(By.xpath("//span[@ng-class='{error: userForm.privacySetting.$error.required}']"));
    public static final Target REGISTER = Target.the(" where do we Confirmation of registration ")
            .located(By.xpath("//div[@class='image-box-header']"));
    public static final Target BUTTON_NEXT = Target.the(" where do we select the next page  ")
            .located(By.xpath("//a[@class='btn btn-blue']"));
}
