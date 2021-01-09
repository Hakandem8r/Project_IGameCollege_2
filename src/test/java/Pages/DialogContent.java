package Pages;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.security.cert.X509Certificate;

public class DialogContent extends Parent {

    WebElement myElement;

    public DialogContent() {
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "(//a[text()='Grants'])[2]")
    private WebElement grants;

    @FindBy(xpath = "//a[contains(@title,'Apply For a Scholarship')]")
    private WebElement applyScholarshipBtn;

    @FindBy(xpath = "//a[@id='cn-accept-cookie']")
    private WebElement cookies;

    @FindBy(css = "input[name='your-name']")
    private WebElement nameInput;

    @FindBy(css = "input[name='surname']")
    private WebElement surnameInput;

    @FindBy(css = "input[name='your-email']")
    private WebElement emailInput;

    @FindBy(css = "input[name='country']")
    private WebElement countryInput;

    @FindBy(css = "input[name='state-city']")
    private WebElement stateInput;

    @FindBy(css = "input[name='phone']")
    private WebElement phoneInput;

    @FindBy(css = "select[name='brthday']")
    private WebElement day;

    @FindBy(css = "select[name='brthmonth']")
    private WebElement month;

    @FindBy(css = "select[name='brthyear']")
    private WebElement year;

    @FindBy(css = "select[name='siblings']")
    private WebElement siblings;

    @FindBy(css = "select[name='siblingshave']")
    private WebElement siblingsNum;

    @FindBy(css = "input[name='sibling21old']")
    private WebElement sibling1;

    @FindBy(css = "input[name='sibling22old']")
    private WebElement sibling2;

    @FindBy(css = "select[name='siblingsmany2']")
    private WebElement student;

    @FindBy(css = "select[name='scholarshipwe2']")
    private WebElement scholarship;

    @FindBy(css = "input[name='siblings2name']")
    private WebElement siblingsNames;

    @FindBy(css = "input[name='imcome-family']")
    private  WebElement income;

    @FindBy(css = "select[name='enrolledschool-select']")
    private WebElement otherSchool;

    @FindBy(css = "input[name='enrolledschool-another']")
    private WebElement otherSchoolName;

    @FindBy(css = "input[name='secondary-school']")
    private WebElement secondarySchool;

    @FindBy(css = "select[name='brthday']")
    private WebElement graduationDay;

    @FindBy(css = "select[name='datemount']")
    private WebElement graduationMonth;

    @FindBy(css = "select[name='dateyear']")
    private WebElement graduationYear;

    @FindBy(css = "input[name='graduation-score']")
    private WebElement score;

    @FindBy(css = "input[id='diploma']")
    private WebElement diploma;

    @FindBy(css = "select[name='contactmethod']")
    private WebElement contact;

    @FindBy(css = "input[name='email']")
    private WebElement email;

    @FindBy(css = "input[type='submit']")
    private WebElement submitBtn;

    public void findElementAndClickFunction(String ElementName) {

        switch (ElementName) {
            case "grants" : myElement = grants; break;
            case "applyScholarshipBtn" : myElement = applyScholarshipBtn; break;
            case "cookies" : myElement=cookies; break;
            case "nameInput" : myElement = nameInput; break;
            case "surnameInput" : myElement = surnameInput; break;
            case "emailInput" : myElement = emailInput; break;
            case "countryInput" : myElement = countryInput; break;
            case "stateInput" : myElement = stateInput; break;
            case "phoneInput" : myElement = phoneInput; break;
            //case "diploma" : myElement = diploma; break;
            case "submitBtn" : myElement = submitBtn; break;
        }
        clickFunction(myElement);

    }

    public void findElementAndSendKeysFunction(String ElementName, String value) {

        switch (ElementName) {
            case "nameInput" : myElement = nameInput; break;
            case "surnameInput" : myElement = surnameInput; break;
            case "emailInput" : myElement = emailInput; break;
            case "countryInput" : myElement = countryInput; break;
            case "stateInput" : myElement = stateInput; break;
            case "phoneInput" :  myElement = phoneInput; break;
            case "sibling1": myElement = sibling1; break;
            case "sibling2": myElement = sibling2; break;
            case "siblingsNames": myElement = siblingsNames; break;
            case "income": myElement = income; break;
            case "otherSchoolName": myElement = otherSchoolName; break;
            case "secondarySchool": myElement = secondarySchool; break;
            case "score": myElement = score; break;
            case "email": myElement = email; break;
            case "diploma": myElement = diploma; break;
        }
        sendKeysFunction(myElement,value);
    }

    public WebElement getSelect(String ElementName) {
        switch (ElementName) {
            case  "day": return  day;
            case "month": return month;
            case "year": return year;
            case "siblings": return siblings;
            case "siblingsNum": return siblingsNum;
            case "student": return student;
            case "scholarship": return scholarship;
            case "otherSchool": return otherSchool;
            case "graduationDay": return graduationDay;
            case "graduationMonth": return graduationMonth;
            case "graduationYear": return graduationYear;
            case "contact": return contact;

        }
        return null;
    }

    /*public void scrollToElement() {
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0,600)");
    } */
}
