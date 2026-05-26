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

public class LoginTest {
    public static void main(String[] args){
       WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://www.saucedemo.com/");
            String title = driver.getTitle();

           if (title.contains("Swag Labs")) {
               System.out.println("PASS. Фактична назва: " + title);
           } else {
               System.out.println("FAIL. Фактична навза " + title);
           }

           try {
               WebElement id = driver.findElement(By.id("root"));
               System.out.println("ID знайдено!");
           } catch (Exception e) {
               System.out.println("ID не знайдено:(");
            }

           try {
               WebElement className = driver.findElement(By.className(("login_wrapper")));
               System.out.println("Ім'я класу знайдено!");
           } catch (Exception e) {
               System.out.println("Ім'я класу не знайдено:(");
           }

           try {
               WebElement xpath = driver.findElement(By.xpath("//*[@id='root']/div/div[2]"));
               System.out.println("XPath знайдено!");
           }
           catch (Exception e) {
               System.out.println("XPath не знайдено:(");
            }

           try {
               WebElement css = driver.findElement(By.cssSelector("#root > div > div.login_wrapper"));
               System.out.println("CSS селектор знайдено!");
           } catch (Exception e) {
                System.out.println("CSS селектора на знайдено:(");
            }
       }finally{
               driver.quit();
           }
       }
    }
