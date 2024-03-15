import java.time.Duration;

//import org.openqa.selenium.Alert;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

//import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

public class prg_9_16{

 
public static void main(String[] args) throws InterruptedException{

 
System.setProperty("webdriver.chrome.driver", 

"C:\\Users\\saish\\OneDrive\\Desktop\\computer science\\javapro\\Software 

Testing\\demo\\src\\drivers\\chromedriver.exe");

 
WebDriver driver=new ChromeDriver();

 
driver.get("https://store.steampowered.com/news/");

 
new WebDriverWait(driver, 

Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(new 

By.ByXPath("/html/body/div[1]/div[7]/div[6]/div[3]/div/div/div[1]/div/div[3]/div[6]/div"))).click();

 
Thread.sleep(400000);

 
driver.quit();

 
}

    
