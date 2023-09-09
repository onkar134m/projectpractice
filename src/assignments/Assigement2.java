package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assigement2 {

	public static void main(String[] args)  {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("name")).sendKeys("ABC");
		driver.findElement(By.name("email")).sendKeys("abc@xyz.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("abcdefg");
		driver.findElement(By.id("exampleCheck1")).click();
		Select select = new Select(driver.findElement(By.id("exampleFormControlSelect1")));
		select.selectByVisibleText("Male");
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.name("bday")).sendKeys("11/04/1996");
		driver.findElement(By.className("btn-success")).click();
		System.out.println(driver.findElement(By.cssSelector(".alert.alert-success.alert-dismissible")).getText());
		}

}
