package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class LoginPage {


        public LoginPage (WebDriver driver) {
            this.driver = driver;
        }

        private WebDriver driver;

        private String userNameInputXpath = "//*[@id=\"login-form-username\"]";
        private String passwordInputXpath = "//*[@id=\"login-form-password\"]";
        private String submitButtonXpath = "//*[@id=\"login-form-submit\"]";

    public  void enterUserName(String userName){
        driver.findElement(By.xpath(userNameInputXpath)).sendKeys(userName);

    }public  void enterPassword(String password){
        driver.findElement(By.xpath(passwordInputXpath)).sendKeys(password);

    }public  void clickSubmitButton (){
        driver.findElement(By.xpath(submitButtonXpath)).click();

    }
}

