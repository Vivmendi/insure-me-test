package com.selenium.test.Insure_me;

//import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
        System.out.println( "Hello World!" );
        
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().clearDriverCache().setup();
        
     // for Chrome browser execution
        WebDriver driver = new ChromeDriver(chromeOptions);
         
         System.out.println("Script Executing Successfully");
       
         //1. open the browser and get to the url
         driver.get("http://18.224.39.13:8081/contact.html");
         
       //enable wait of 3 seconds
         driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
         //Maximize the browser window
         driver.manage().window().maximize();
         
         //Click on Contact us link
         
         //Locate  name and enter text in it
         driver.findElement(By.id("inputName")).sendKeys("Vivek Mendiratta");
         //Locate Mobile number and enter text in it
         driver.findElement(By.id("inputNumber")).sendKeys("9958566337");
         //Locate email and enter text in it
         driver.findElement(By.id("inputMail")).sendKeys("vivek.mendi@gmail.com");
         //Locate email and enter text in it
         driver.findElement(By.id("inputMessage")).sendKeys("Please call me");
         //Locate the Send button and click on send button
         driver.findElement(By.id("my-button")).click();
         Thread.sleep(1000);
         
         String text = driver.findElement(By.id("response")).getText();
         System.out.println(text);
          
         //assertEquals("",text);
         driver.quit();
         System.out.println("Script Executed Successfully");
         Thread.sleep(1000);
    }
}
