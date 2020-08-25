package seleniumpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_IlkTekrar {

    public static void main(String[] args) {
        System.setProperty("webdriwer.chrome.driver","C:\\Users\\Muaz\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();

        driver.get("https://google.com");
        driver.close();




    }
}
