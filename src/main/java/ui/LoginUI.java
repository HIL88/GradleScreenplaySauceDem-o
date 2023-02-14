package ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginUI {

    public static final Target INPUT_USER_NAME = Target.the("Ingresa el usuario").located(By.xpath("//input[@id='user-name']"));
    public static final Target INPUT_PASSWORD = Target.the("Ingresa el password").located(By.xpath("//input[@id='password']"));
    public static final Target BUTTON_LOGIN = Target.the("Click en boton").located(By.xpath("//input[@id='login-button']"));

}
