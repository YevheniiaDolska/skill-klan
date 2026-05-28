package Homework_9;
//Створюємо драйвер
//Отримуємо сайт
//Отримуємо заголовок і перевіряємо його на відповідність вимозі
//Додаємо позитивний і негативний результати перевірки
//і їх виведення у консоль
//закриваємо браузер

//ДЗ10:
//Додаємо перевірку елементів на сторінці

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class LoginTest {
    public static void main(String[] args){
       WebDriver driver = new ChromeDriver();

            driver.get("https://www.saucedemo.com/");
            String title = driver.getTitle();
            Assert.assertTrue(title.contains("Swag Labs"));
            System.out.println("Pass");

            WebElement id = driver.findElement(By.id("root"));
            Assert.assertTrue(id.isDisplayed());
            System.out.println("Pass");

            WebElement className = driver.findElement(By.className(("login_wrapper")));
            Assert.assertTrue(className.isDisplayed());
            System.out.println("Pass");

            WebElement xpath_parent = driver.findElement(By.xpath("//div[@id='root']//input[@id='user-name']"));
            Assert.assertTrue(xpath_parent.isDisplayed());
            System.out.println("Pass");

            WebElement xpath_child = driver.findElement(By.xpath("//input[@id='user-name']/ancestor::div[@id='root']"));
            Assert.assertTrue(xpath_child.isDisplayed());
            System.out.println("Pass");

            System.out.println("Чудова робота!");

            driver.quit();
           }
       }

