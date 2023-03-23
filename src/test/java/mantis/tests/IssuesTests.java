package mantis.tests;

import mantis.pages.MantisSite;
import org.assertj.core.api.SoftAssertions;
import mantis.pages.ReportIssuePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IssuesTests extends BaseTest {
    private MantisSite mantisSite;

    @Test
    public void checkIssuesNumber() throws InterruptedException {
        mantisSite = new MantisSite(driver);
        mantisSite.login("admin", "admin20");
        mantisSite.getMainPage().goToViewIssuesPage();
        Thread.sleep(3000);
        int actualIssuesNumber = mantisSite.getViewIssuesPage().countIssues();
        Assertions.assertEquals(50, actualIssuesNumber);
    }

    @Test
    public void reportIssueTest() throws InterruptedException {
        mantisSite = new MantisSite(driver);
        SoftAssertions softAssert = new SoftAssertions();
        mantisSite.login("admin", "admin20");
        mantisSite.getMainPage().goToReportIssuePage();
        mantisSite.reportIssueSummary("summary");
        mantisSite.reportIssueDescription("description");
        mantisSite.reportIssueSubmit();
        mantisSite.getMainPage().goToViewIssuesPage();
        Thread.sleep(3000);

        softAssert.assertThat(oneIssueSummary).isEqualTo("summary", oneIssueSummary);

        Thread.sleep(8000);
        mantisSite.reportIssueCheckbox();
        mantisSite.selectActionIssue();
        mantisSite.optionActionDelete();
        mantisSite.submitSelectOk();
        mantisSite.submitDeleteIssue();
        Thread.sleep(3000);

        softAssert.assertThat(oneIssueSummary).isNotEqualTo("summary", oneIssueSummary);
        Thread.sleep(3000);
    }
}
