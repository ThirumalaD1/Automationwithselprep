package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSselectordemo {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

        /*
        There are 4 ways you can use the css and below mentioned are those
        input#id or #id
        input.classname or classname
        input[attribute='value']
        input.classname[attribute='value']
         */
     //Using tagname#id/#id
        //driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("THIRU");
       // driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("RAMU");

//Using tagname.classname

        //driver.findElement(By.cssSelector("a.MV3Tnb")).click();

        //Using tagname[attribute='value']
      //  driver.findElement(By.cssSelector("textarea[title='Search']")).sendKeys("Oneplus");

        //using tagname.classname[attribute='value']
        driver.findElement(By.cssSelector(".gLFyf[name='q']")).sendKeys("Ca");

    }




}
