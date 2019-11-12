package tests;


import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import steps.PostsSearchSteps;

@RunWith(SerenityRunner.class)
public class PostsSearchTests {

    @Steps
    PostsSearchSteps postsSearchSteps;


    @Test
    public void verifyThatWeCanGetIdOfFirstPost() {

        // Given
        postsSearchSteps.searchPostById("1");
        // When
        postsSearchSteps.searchIsExecutedSuccesfully();
        // Then
        postsSearchSteps.iShouldGetPostWithNumber(1);


    }

    @Test
    public void verifyThatWeCanGetIdOfSecondPost(){
        // Given
        postsSearchSteps.searchPostById("2");
        // When
        postsSearchSteps.searchIsExecutedSuccesfully();
        // Then
        postsSearchSteps.iShouldGetPostWithNumber(2);
    }

    @Test
    public void verifyThatWeCanGetIdOfThirdPost(){
        // Given
        postsSearchSteps.searchPostById("3");
        // When
        postsSearchSteps.searchIsExecutedSuccesfully();
        // Then
        postsSearchSteps.iShouldGetPostWithNumber(3);
    }
}