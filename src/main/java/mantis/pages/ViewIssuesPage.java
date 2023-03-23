package mantis.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class ViewIssuesPage {
    private final WebDriver driver;
    private final WebDriverWait wait;
    @FindBy(css = "#buglist tbody tr")
    private List<WebElement> issues;
    @FindBy(xpath = "//*[@id='bug_action']")
    private WebElement viewingIssuesBlock;
    @FindBy(xpath = "//td[@class='column-summary']")
    private WebElement oneIssueSummary;

    public ViewIssuesPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 30, 500);
        PageFactory.initElements(driver, this);
    }

    public int countIssues() {

        return issues.size();
    }

    public void ViewIssueSummary(String summary) {
        oneIssueSummary.sendKeys(summary);
    }
}

