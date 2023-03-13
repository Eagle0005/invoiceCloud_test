package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddElementsPage {
	
	private WebDriver driver;
	public AddElementsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By buttonAddElement = By.xpath("//button[text()='Add Element']");
	
	By buttonDeleteElement = By.cssSelector("button[class='added-manually']");
	
	
	public void clickOnAddElementButton() {
		driver.findElement(buttonAddElement).click();
	}
	
	public int getAddedElementsCount() {
		return driver.findElements(buttonDeleteElement).size();
	}
	
	public void clickOnDeleteElementButton() {
		driver.findElement(buttonDeleteElement).click();
	}

}
