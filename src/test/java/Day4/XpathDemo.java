package Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class XpathDemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://accounts.lambdatest.com/register");
        driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

  //      WebElement ema = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div[2]/div[2]/form/div[1]/div/input"));
    //   ema.sendKeys("Ram");
      //ema.clear();

//relative xpath with id attribute
//driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Thiru");

//relative xpath OR oprator
     //   driver.findElement(By.xpath("//input[@type='ail' or @autocomplete='email']")).sendKeys("Guru");
//relative xpath with AND operator - both attributes should be correct and present in DOM
      //  driver.findElement(By.xpath("//input[@type='email' and @autocomplete='email']")).sendKeys("Prasad");
//Contains with attribute
      //  driver.findElement(By.xpath("//input[contains(@type,'em')]")).sendKeys("Ramesh");
      //contains with inner text
      //  driver.findElement(By.xpath("//a[contains(text(),'Terms of ')]")).click();
     //starts with inner text
       // driver.findElement(By.xpath("//a[starts-with(text(),'Terms of ')]")).click();
    //starts with attribute
    //    driver.findElement(By.xpath("//a[starts-with(@href,'https://www.lambdatest.com/terms')]")).click();
//xpath with text
        driver.findElement(By.xpath("//a[text()='Terms of Service']")).click();

    }


}
