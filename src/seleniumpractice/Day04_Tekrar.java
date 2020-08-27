package seleniumpractice;

import org.omg.CORBA.TIMEOUT;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day04_Tekrar {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:/Users/Muaz/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);

        driver.get("http://facebook.com");

        String faceTitle = driver.getTitle();
        System.out.println(faceTitle);

        if(faceTitle.contains("Facebook")){
            System.out.println("facebook kelimesi var");
        }else {
            System.out.println("Dogru Title :"+faceTitle);
        }
        String faceUrl = driver.getCurrentUrl();
        System.out.println("");
        if (faceUrl.contains("facebook")){
            System.out.println("Url'de facebook kelimesi var");
        } else {
            System.out.println("Url'de facebook kelimesi yok" + faceUrl);
        }

        driver.navigate().to("http://walmart.com");

        String walmartTitle = driver.getTitle();
        System.out.println(walmartTitle);

        if(walmartTitle.contains("wallmart.com")) {
            System.out.println("Title Wallmart.com iceriyor");
        } else {
            System.out.println("Title Walmart.com icermiyor");
        }
        driver.navigate().back();
        driver.navigate().refresh();
        driver.close();

    }
}
