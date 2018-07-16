package test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.LoginPage;

    public class JiraLoginTest {


        @Test

        public void mainTest () {
            WebDriver driver = new ChromeDriver();
            LoginPage loginPage = new LoginPage(driver);
            driver.get("http://jira.hillel.it:8080/login.jsp");


            loginPage.enterUserName("webinar5");
            loginPage.enterPassword("webinar5");
            loginPage.clickSubmitButton();
            try {
                Thread.sleep(2000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }