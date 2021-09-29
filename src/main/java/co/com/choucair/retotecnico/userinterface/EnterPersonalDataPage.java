package co.com.choucair.retotecnico.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class EnterPersonalDataPage {
    public static final Target INPUT_FIRSTNAME = Target.the(" where do we write the first name")
            .located(By.id("firstName"));
    public static final Target INPUT_LASTNAME = Target.the(" where do we write the last name  ")
            .located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the(" where do we write the email  ")
            .located(By.id("email"));
    public static final Target INPUT_MONTH = Target.the(" where do we select the month of the birthday  ")
            .located(By.id("birthMonth"));
    public static final Target INPUT_DAY = Target.the(" where do we select the day of the birthday  ")
            .located(By.id("birthDay"));
    public static final Target INPUT_YEAR = Target.the(" where do we select the year of the birthday  ")
            .located(By.id("birthYear"));
    public static final Target INPUT_LENGUAGE = Target.the(" where do we write the lenguague  ")
            .located(By.xpath("//input[@type='search']"));
    public static final Target BUTTON_NEXT = Target.the(" where do we select the next page  ")
            .located(By.xpath("//a[@class='btn btn-blue']"));

}
