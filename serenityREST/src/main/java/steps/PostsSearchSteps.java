package steps;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static org.hamcrest.Matchers.is;

public class PostsSearchSteps {
    private String BASE_URL = "http://localhost:3000/posts/";
    private Response response;

    @Step
    public void searchPostById(String id){
        System.out.println(BASE_URL + id);
        response = SerenityRest.when().get(BASE_URL + id);
    }

    @Step
    public void searchIsExecutedSuccesfully(){
        response.then().statusCode(200);
    }

    @Step
    public void iShouldGetPostWithNumber(int id){
        response.then().body("id", is(id));
    }
}