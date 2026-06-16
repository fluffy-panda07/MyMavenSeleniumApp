package com.example;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       WebDriver driver=new ChromeDriver();
       try{
       		driver.get("https://www.saucedemo.com/");
       		driver.manage().window().maximize();
       		Thread.sleep(2000);
       		driver.findElement(By.id("user-name")).sendKeys("standard_user");
       		driver.findElement(By.id("password")).sendKeys("secret_sauce");
       		Thread.sleep(2000);
       		driver.findElement(By.id("login-button")).click();
       		Thread.sleep(2000);
       		}
       	catch(InterruptedException e){
       		e.printStackTrace();
       		}
        
        
        
        
    }
}
