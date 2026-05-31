package Homework_12.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public WebDriver driver;

    public LoginPage(WebDriver driver){

        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    public void enterUsername(String username){

        driver.findElement(By.id("user-name")).sendKeys(username);
    }

    public void enterPassword(String password){

        driver.findElement(By.id("password")).sendKeys(password);
    }

    public void clickLogin(){
        driver.findElement(By.id("login-button")).click();
    }

}


