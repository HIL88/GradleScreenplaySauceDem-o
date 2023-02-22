package question;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import ui.HomeUI;

public class LoginQuestion implements Question {

    private final String validtexto;

    public LoginQuestion(String validtexto) {
        this.validtexto = validtexto;
    }
    /*public static Question<String>value() {
        return new LoginQuestion();
    }*/

    @Override
    public Object answeredBy(Actor actor) {

        if(Text.of(HomeUI.TEXT_VALID).answeredBy(actor).contains(validtexto.toString()))
        return true;
        else
            return false;
    }

    public static LoginQuestion loginvalidtext(String validtexto){
        return new LoginQuestion(validtexto);
    }
}


