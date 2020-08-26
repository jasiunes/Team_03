package seleniumpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_IfElse {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/Users/Muaz/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.amazon.com/");

        String amazonTitle = driver.getTitle();
        System.out.println(amazonTitle);

        if (amazonTitle.contains("Computers")) {
            System.out.println("Computers kelimesi var");
        } else {
            System.out.println("Computers kelimesi yok");
        }
        driver.quit();
    }
    }
