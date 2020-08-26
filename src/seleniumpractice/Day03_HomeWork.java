package seleniumpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day03_HomeWork {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/Users/Muaz/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);

        String sayfaTitle = driver.getTitle();
        System.out.println(sayfaTitle);

        if(sayfaTitle.contains("facebook")){
        System.out.println("facebook kelimesi var");
         }else {
        System.out.println("Dogru Title :"+sayfaTitle);
        }

        String faceUrl = driver.getCurrentUrl();
                 System.out.println("face url:"+faceUrl);
        if(faceUrl.contains("facebook")) {
            System.out.println("facebook iceriyor");
        } else {
            System.out.println("dogru url"+faceUrl);
        }
        driver.navigate().to("http://walmart.com");

        String walmartTitle = driver.getTitle();
        System.out.println(walmartTitle);

        if(walmartTitle.contains("Wallmart.com")) {
            System.out.println("Wallmart.com iceriyor");
        } else {
            System.out.println("Walmart.com icermiyor");
        }
        driver.navigate().back();
        driver.navigate().refresh();
        driver.manage().window().maximize();
        driver.close();
    }
}
