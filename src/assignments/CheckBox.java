package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckBox {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement option1 = driver.findElement(By.cssSelector("input[value='option1']"));
		Assert.assertFalse(option1.isSelected());
		option1.click();
		Assert.assertTrue(option1.isSelected());
		
		List<WebElement> countCheckbox = driver.findElements(By.cssSelector("input[type='checkbox']"));
		System.out.println(countCheckbox.size());;
	}

}
