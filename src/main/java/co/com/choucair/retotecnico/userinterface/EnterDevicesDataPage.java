package co.com.choucair.retotecnico.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class EnterDevicesDataPage {

    public static final Target INPUT_COMPUTER = Target.the(" where do we select the computer space  ")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[1]/div[2]/div/div[1]/span"));
    public static final Target TEXT_COMPUTER = Target.the(" where do we write the computer information  ")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[1]/div[2]/div/input[1]"));
    public static final Target INPUT_VERSION = Target.the(" where do we select the version space ")
            .located(By.xpath("//span[@aria-label='Select a Version']"));
    public static final Target TEXT_VERSION = Target.the(" where do we write the computer version  ")
            .located(By.xpath("//input[@placeholder='Select a Version']"));
    public static final Target INPUT_LANGUAGE = Target.the(" where do we select the language space  ")
            .located(By.xpath("//span[@aria-label='Select OS language']"));
    public static final Target TEXT_LANGUAGE = Target.the(" where do we write the computer language  ")
            .located(By.xpath("//input[@placeholder='Select OS language']"));
    public static final Target INPUT_DEVICE = Target.the(" where do we select the device space  ")
            .located(By.xpath("//span[@aria-label='Select Brand']"));
    public static final Target TEXT_DEVICE = Target.the(" where do we write the device information  ")
            .located(By.xpath("//input[@placeholder='Select Brand']"));
    public static final Target INPUT_MODEL = Target.the(" where do we select the model space  ")
            .located(By.xpath("//span[@aria-label='Select a Model']"));
    public static final Target TEXT_MODEL = Target.the(" where do we write the device model  ")
            .located(By.xpath("//input[@placeholder='Select a Model']"));
    public static final Target INPUT_OS = Target.the(" where do we select the os space  ")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[3]/div[2]/div/div[1]/span"));
    public static final Target TEXT_OS = Target.the(" where do we write the device os  ")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[3]/div[2]/div/input[1]"));
    public static final Target BUTTON_NEXT2 = Target.the(" where do we select the next page  ")
            .located(By.xpath("//a[@class='btn btn-blue pull-right']"));
}
