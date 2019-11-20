package co.com.qvision.eribank.tasks;

import co.com.qvision.eribank.userinterfaces.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class LoginToTheApp implements Task {
	
	private String userName;
	private String userPassword;
	

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue("company").into(LoginPage.NAME_USER),
				        (Enter.theValue("company").into(LoginPage.PASS_USER)),
				        (Click.on(LoginPage.BUTTON_LOGIN))
				        );
		
	}

	public static LoginToTheApp withUserData() {
		return Tasks.instrumented(LoginToTheApp.class);
		
	}
	
	

}
