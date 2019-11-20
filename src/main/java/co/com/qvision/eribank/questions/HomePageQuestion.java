package co.com.qvision.eribank.questions;

import co.com.qvision.eribank.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.annotations.Subject;
import net.serenitybdd.screenplay.questions.SelectedStatus;
import net.serenitybdd.screenplay.targets.Target;

@Subject("The Home Page is Visible")
public class HomePageQuestion implements Question<Boolean>{

	@Override
	public Boolean answeredBy(Actor actor) {
		Boolean itmChecked = SelectedStatus.of(HomePage.MAKE_PAYMENT_BUTTON).viewedBy(actor).as(Boolean.class);
		return HomePage.MAKE_PAYMENT_BUTTON.resolveFor(actor).isVisible();
	}

	public static HomePageQuestion isVisible() {
		return new HomePageQuestion();
	}
	
	

}
