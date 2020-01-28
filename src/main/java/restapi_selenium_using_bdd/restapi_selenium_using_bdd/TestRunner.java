package restapi_selenium_using_bdd.restapi_selenium_using_bdd;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features="/restapi_selenium_using_bdd/Feature files/Find_pet_by_ID.feature",glue="bdd_project")
public class TestRunner extends AbstractTestNGCucumberTests {

}