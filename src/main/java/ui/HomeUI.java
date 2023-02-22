package ui;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomeUI {

    //public static By TEXT_VALID = By.xpath("//*[@class='header_secondary_container']//*[text()='Products']");
    public static final Target TEXT_VALID = Target.the("validar texto").located(By.xpath("//*[@class='header_secondary_container']//*[text()='Products']"));
}
