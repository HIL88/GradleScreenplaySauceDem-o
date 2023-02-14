package question;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.questions.Text;
import ui.HomeUI;
import net.serenitybdd.screenplay.questions.TextContent;

public class LoginQuestion implements Question<java.lang.String> {

    public static Question<String>value() {
        return new LoginQuestion();
    }

    @Override
    public java.lang.String answeredBy(Actor actor) {

       return BrowseTheWeb.as(actor).find(HomeUI.TEXT_VALID).getText();


    }
}