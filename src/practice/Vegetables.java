package practice;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vegetables {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();

		String[] veggies = { "Brocolli", "Tomato", "Cucumber" };

		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		List<WebElement> button = driver.findElements(By.xpath("//button[text()='ADD TO CART']"));

		/*
		 * for(int i=0;i<products.size();i++) { String vegetable =
		 * products.get(i).getText();
		 * 
		 * for(int j=0;j<veggies.length;j++) { if(vegetable.contains(veggies[j])) {
		 * button.get(i).click(); } } }
		 */

		for (int i = 0; i < products.size(); i++) {
			String vegetable = products.get(i).getText();
			List<String> vegName = Arrays.asList(veggies);

			if (vegName.contains(vegetable)) {
				button.get(i).click();
			}
		}

	}

}
