import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import ui.HomeScreen;
import ui.SearchingComicForm;

public class SearchingComicTest {
	
	private HomeScreen homeScreen;
	private SearchingComicForm searchingComicForm;
	
	@Given("^Потребителя се намира в началната страница$")
	public void потребителя_се_намира_в_началната_страница() throws Throwable {
	   homeScreen = new HomeScreen();
	}

	@When("^Натиска бутона за търсене на комикс$")
	public void натиска_бутона_за_търсене_на_комикс() throws Throwable {
	    searchingComicForm = homeScreen.openSearchComic();
	}

	@When("^Отваря се прозореца за търсене на комикс$")
	public void отваря_се_прозореца_за_търсене_на_комикс() throws Throwable {
	    assertNotNull(searchingComicForm);
	}

	@When("^Кликане на бутона за търсене$")
	public void кликане_на_бутона_за_търсене() throws Throwable {
	    searchingComicForm.search();
	}

	@Then("^Показва се съобщение \"([^\"]*)\"$")
	public void показва_се_съобщение(String message) throws Throwable {
	    assertEquals(message, searchingComicForm.getMessage());
	}

	@When("^Въвеждане в полето id : \"([^\"]*)\"$")
	public void въвеждане_в_полето_id(String id) throws Throwable {
	    searchingComicForm.setId(id);
	}

	@When("^Въвеждане в полето title : \"([^\"]*)\"$")
	public void въвеждане_в_полето_title(String title) throws Throwable {
	    searchingComicForm.setTitle(title);
	}

	@Then("^Показват се получените данни$")
	public void показват_се_получените_данни() throws Throwable {
	    assertNotNull(searchingComicForm.getSearchResult());
	}

	@Then("^Нищо не се показва$")
	public void нищо_не_се_показва() throws Throwable {
	    assertNull(searchingComicForm.getSearchResult());
	}


}
