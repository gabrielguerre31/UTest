package co.com.choucair.retotecnico.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class EnterAddressDataPage {
    public static final Target INPUT_CITY = Target.the(" where do we write the city of residence  ")
            .located(By.id("city"));
    public static final Target SUG_CITY = Target.the(" where do we write the city of residence  ")
            .located(By.xpath("/html/body/div[9]"));
    public static final Target SEL_CITY = Target.the(" where do we write the city of residence  ")
            .located(By.xpath(" /html/body/div[9]/div[1]/span[1]"));
    public static final Target INPUT_CPOSTAL = Target.the(" where we write the postal code of residence  ")
            .located(By.id("zip"));
    public static final Target INPUT_COUNTRY = Target.the(" where we select country space ")
            .located(By.xpath("//span[@class='ui-select-match-text pull-left']"));
    public static final Target TEXT_COUNTRY = Target.the(" where we write the country ")
            .located(By.xpath("//input[@placeholder='Select a country']"));
    public static final Target BUTTON_NEXT2 = Target.the(" where do we select the next page  ")
            .located(By.xpath("//a[@class='btn btn-blue pull-right']"));
}
