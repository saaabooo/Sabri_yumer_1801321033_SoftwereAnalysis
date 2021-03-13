import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import ui.CreatingComicForm;
import ui.HomeScreen;

public class CreatingComicTest {
	
	private HomeScreen homeScreen;
	private CreatingComicForm creatingComicForm;
	
	@Given("^Админа е в началната страница$")
	public void админа_е_в_началната_страница() throws Throwable {
	    homeScreen = new HomeScreen();
	}

	@When("^Натиска бутона за създаване на комикс$")
	public void натиска_бутона_за_създаване_на_комикс() throws Throwable {
	    creatingComicForm = homeScreen.openCreateComic();
	}

	@When("^Отваря се страницата за създаване на комикс$")
	public void отваря_се_страницата_за_създаване_на_комикс() throws Throwable {
	    assertNotNull(creatingComicForm);
	}

	@When("^Натискане на бутона за създаване на комикс$")
	public void натискане_на_бутона_за_създаване_на_комикс() throws Throwable {
	   creatingComicForm.create();
	}

	@Then("^Появява се съобщение \"([^\"]*)\"$")
	public void появява_се_съобщение(String message) throws Throwable {
	    assertEquals(message, creatingComicForm.getMessage());
	}

	@When("^Въвежда в полето за title : \"([^\"]*)\"$")
	public void въвежда_в_полето_за_title(String title) throws Throwable {
	    creatingComicForm.setTitle(title);
	}

	@When("^Въвежда в полето за id : \"([^\"]*)\"$")
	public void въвежда_в_полето_за_id(String id) throws Throwable {
	    creatingComicForm.setId(id);

	}
}

