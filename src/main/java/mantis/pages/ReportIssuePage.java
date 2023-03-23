package mantis.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReportIssuePage {
    private final WebDriver driver;
    private final WebDriverWait wait;
    @FindBy(xpath = "//*[@id='summary']")
    private WebElement summaryField;
    @FindBy(xpath = "//*[@id='description']")
    private WebElement descriptionField;
    @FindBy(xpath = "//*[@type='submit']")
    private WebElement submitIssue;
    @FindBy(xpath = "//div[@class='checkbox no-padding no-margin']/label")
    private WebElement checkboxIssue;
    @FindBy(xpath = "//*[@name='action']")
    private WebElement selectAction;
    @FindBy(xpath = "//*[@value='DELETE']")
    private WebElement actionDelete;
    @FindBy(xpath = "//*[@value='OK']")
    private WebElement submitOk;
    @FindBy(xpath = "//*[@value='Delete Issues']")
    private WebElement deleteIssue;

    public ReportIssuePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 30, 500);
        PageFactory.initElements(driver, this);
    }

    public void reportIssueSummary(String summary) {
        summaryField.sendKeys(summary);
    }

    public void reportIssueDescription(String description) {
        descriptionField.sendKeys(description);
    }

    public void reportIssueSubmit() {
        submitIssue.click();
    }

    public void reportIssueCheckbox() {

        checkboxIssue.click();
    }

    public void selectActionIssue() {
        selectAction.click();
    }

    public void optionActionDelete() {
        actionDelete.click();
    }

    public void submitSelectOk() {
        submitOk.click();
    }

    public void submitDeleteIssue() {
        deleteIssue.click();
    }
}
