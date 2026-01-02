package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Locatorsdemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");

        /*We can find elements using this below locators
        id, name, classname, linktext, partial linktext, tagname and these related methods are already exist in selenium
        and using css selector and xpath also we can do but we have to manually write xpaths and css selectors
         */

        //id
      //  WebElement search_box = driver.findElement(By.id("small-searchterms"));
//search_box.sendKeys("Mobile");

//we can reduce the above code to one line, and we do that when we have only action need to be perfomed with element and not much
       // driver.findElement(By.id("small-searchterms")).sendKeys("Tab");

        //name
      //  driver.findElement(By.name("q")).sendKeys("Laptop");

      //classname -- Actually classname will be same for multiple elements ex.sliders or img's, menu items
        List<WebElement> menu = driver.findElements(By.className("item-box"));
        System.out.println(menu.size());

     //linktext - you locate the element with the full link text
        boolean status = driver.findElement(By.linkText("Sitemap")).isDisplayed();
        System.out.println(status);

     //partial link text - you locate the element with the partial link text
      //  driver.findElement(By.partialLinkText("Site")).click();

        //tagname - it will locate all the elements with this tag and will store in list of webelements
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links.size());

        List<WebElement> imgs = driver.findElements(By.tagName("img"));
       System.out.println(imgs.size());
//one element use both find elements and find element
       //   driver.findElement(By.id("small-searchterms")).sendKeys("mobile");
        // List<WebElement> search_box1 = driver.findElements(By.id("small-searchterms"));
        // System.out.println(search_box1.size());
//more elements both find elements and find element
      //  WebElement menu_i = driver.findElement(By.className("menu__item"));
        //menu_i.click();
       List<WebElement> menut_it = driver.findElements(By.className("menu__item"));
       System.out.println(menut_it.size());

        //no webelement both find elements and find element
       // driver.findElement(By.className("xyz")).click();

        List<WebElement> m11 = driver.findElements(By.className("xud"));
        System.out.println(menut_it.size());


    }



}
