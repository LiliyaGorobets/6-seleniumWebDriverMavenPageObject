package mantis.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MantisSite {
    private final WebDriver driver;
    private LoginPage loginPage;
    private PasswordPage passwordPage;
    private MainPage mainPage;
    private ViewIssuesPage viewIssuesPage;

    private ReportIssuePage reportIssuePage;

    public MantisSite(WebDriver driver) {
        this.driver = driver;

        loginPage = new LoginPage(driver);
        passwordPage = new PasswordPage(driver);
        mainPage = new MainPage(driver);
        viewIssuesPage = new ViewIssuesPage(driver);
        reportIssuePage = new ReportIssuePage(driver);
    }

    public void login(String login, String password) {
        loginPage.login(login);
        passwordPage.login(password);
    }

    public void reportIssueSummary(String summary) {
        reportIssuePage.reportIssueSummary(summary);
    }

    public void reportIssueDescription(String description) {
        reportIssuePage.reportIssueDescription(description);
    }

    public void reportIssueSubmit() {
        reportIssuePage.reportIssueSubmit();
    }

    public void reportIssueCheckbox() {
        reportIssuePage.reportIssueCheckbox();
    }

    public void selectActionIssue() {
        reportIssuePage.selectActionIssue();
    }

    public void optionActionDelete() {
        reportIssuePage.optionActionDelete();
    }

    public void submitSelectOk() {
        reportIssuePage.submitSelectOk();
    }

    public void submitDeleteIssue() {
        reportIssuePage.submitDeleteIssue();
    }

    public LoginPage getLoginPage() {

        return loginPage;
    }

    public PasswordPage getPasswordPage() {

        return passwordPage;
    }

    public MainPage getMainPage() {

        return mainPage;
    }

    public ViewIssuesPage getViewIssuesPage() {

        return viewIssuesPage;
    }

    public ReportIssuePage getReportIssuePage() {

        return reportIssuePage;
    }
}
