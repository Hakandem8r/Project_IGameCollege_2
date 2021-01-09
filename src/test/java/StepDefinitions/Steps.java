package StepDefinitions;

import Pages.DialogContent;
import Utilities.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.eo.Se;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Steps {

    WebDriver driver;

    DialogContent dialogContent=new DialogContent();
    Select selects;

    @Given("^Navigate to International Game College$")
    public void navigateToInternationalGameCollege() {
        driver = Driver.getDriver();
        driver.get("https://igamecollege.com/");

    }

    @Then("^Click Grants$")
    public void clickGrants() {
        dialogContent.findElementAndClickFunction("grants");
    }

    @Then("^Click Apply For a Our Scholarship$")
    public void clickApplyForAOurScholarship() {
        dialogContent.findElementAndClickFunction("applyScholarshipBtn");
        dialogContent.findElementAndClickFunction("cookies");

    }

    @Then("^Write Personal Info$")
    public void writePersonalInfo() {
        //dialogContent.scrollToElement();
        dialogContent.findElementAndClickFunction("nameInput");
        dialogContent.findElementAndSendKeysFunction("nameInput","Hakan");
        dialogContent.findElementAndClickFunction("surnameInput");
        dialogContent.findElementAndSendKeysFunction("surnameInput","Demir");
        dialogContent.findElementAndClickFunction("emailInput");
        dialogContent.findElementAndSendKeysFunction("emailInput","hakandem8r@gmail.com");
        dialogContent.findElementAndClickFunction("countryInput");
        dialogContent.findElementAndSendKeysFunction("countryInput","Germany");
        dialogContent.findElementAndClickFunction("stateInput");
        dialogContent.findElementAndSendKeysFunction("stateInput", "Baden-Württemberg");
        dialogContent.findElementAndClickFunction("phoneInput");
        dialogContent.findElementAndSendKeysFunction("phoneInput","004917525885211");

        selects = new Select(dialogContent.getSelect("day"));
        selects.selectByVisibleText("2"); // Bu da text'tir. İnceleme bölümünde tırnak içerisinde ve yanında tırnaksız  rakam var

        selects = new Select(dialogContent.getSelect("month"));
        selects.selectByVisibleText("10");

        selects = new Select(dialogContent.getSelect("year"));
        selects.selectByVisibleText("1990");

    }

    @Given("^Siblings Info$")
    public void siblingsInfo() throws InterruptedException {
        selects=new Select(dialogContent.getSelect("siblings"));
        selects.selectByVisibleText("Yes");
        Thread.sleep(2000);
        selects=new Select(dialogContent.getSelect("siblingsNum"));
        selects.selectByVisibleText("2");

        dialogContent.findElementAndSendKeysFunction("sibling1","21");

        dialogContent.findElementAndSendKeysFunction("sibling2","22");

        selects=new Select(dialogContent.getSelect("student"));
        selects.selectByVisibleText("2");

        selects=new Select(dialogContent.getSelect("scholarship"));
        selects.selectByVisibleText("Yes");

        dialogContent.findElementAndSendKeysFunction("siblingsNames","Sami,Emir");

        dialogContent.findElementAndSendKeysFunction("income","4000");

        selects=new Select(dialogContent.getSelect("otherSchool"));
        selects.selectByVisibleText("Yes");

        dialogContent.findElementAndSendKeysFunction("otherSchoolName","İlköğretim");

        dialogContent.findElementAndSendKeysFunction("secondarySchool", "Ortaokul");

        selects=new Select(dialogContent.getSelect("graduationDay"));
        selects.selectByVisibleText("12");

        selects=new Select(dialogContent.getSelect("graduationMonth"));
        selects.selectByVisibleText("6");

        selects=new Select(dialogContent.getSelect("graduationYear"));
        selects.selectByVisibleText("2003");

        dialogContent.findElementAndSendKeysFunction("score","70");

        //dialogContent.findElementAndClickFunction("diploma");
        dialogContent.findElementAndSendKeysFunction("diploma","C:\\Users\\Hakan\\Desktop\\IGameCollege\\Screenshot_1.png");

        selects=new Select(dialogContent.getSelect("contact"));
        selects.selectByVisibleText("Email");


        dialogContent.findElementAndSendKeysFunction("email","hakandem8r@gmail.com");
        //Thread.sleep(3000);
        dialogContent.findElementAndClickFunction("submitBtn");






    }

    @Then("^Write the Income$")
    public void writeTheIncome() {
    }

    @Then("^School Info$")
    public void schoolInfo() {
    }

    @Then("^Contact Info$")
    public void contactInfo() {
    }
}
