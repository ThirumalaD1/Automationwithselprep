package Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automatestart {
    public static void main(String[] args) {
String Expected_title="nopCommerce demo store. Home page title";
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
         String act_title = driver.getTitle();

         if (act_title.equals(Expected_title)){
             System.out.println("Test is passed");
         }else{
             System.out.println("Test is failed");
        }

driver.quit();

    }




}
