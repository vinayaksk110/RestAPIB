package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Steps {
	
	private static final String USER_ID = "9b5f49ab-eea9-45f4-9d66-bcf56a531b85";
	private static final String USERNAME = "TOOLSQA-Test";
	private static final String PASSWORD = "Test@@123";
	private static final String BASE_URL = "https://bookstore.toolsqa.com";

	private static String token;
	private static Response response;
	private static String jsonString;
	private static String bookId;
	
	@Given("I am an authorized user")
	public void i_am_an_authorized_user() {
	    RestAssured.baseURI = BASE_URL;
	    RequestSpecification httpRequest = RestAssured.given();  
	    httpRequest.header("Content-Type", "application/json");
	    response = httpRequest.body("{ \"userName\":\"" + USERNAME + "\", \"password\":\"" + PASSWORD + "\"}").post("/Account/v1/GenerateToken");
	    String jsonString = response.asString();
	    token = JsonPath.from(jsonString).get("token");
	}
	@Given("A list of books are available")
	public void a_list_of_books_are_available() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("I add a book to my reading list")
	public void i_add_a_book_to_my_reading_list() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("the book is added")
	public void the_book_is_added() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("I remove a book from my reading list")
	public void i_remove_a_book_from_my_reading_list() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("the book is removed")
	public void the_book_is_removed() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
