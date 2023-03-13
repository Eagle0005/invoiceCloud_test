package interview_test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AddElementsPage;

public class InterviewTest {

	@Test(description = "Add Element, validate added elements count and delete all")
	public void addAndDeleteElements() {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
		
		AddElementsPage page = new AddElementsPage(driver);
		
		int random = (int )(Math.random() * 15 + 1);
		
		for (int i = 0; i < random; i++) {
			page.clickOnAddElementButton();
			try {
				Thread.sleep(500);
			} catch(Exception e) {
				
			} 
		}
		int addedElementsCount = page.getAddedElementsCount();
		Assert.assertEquals(random, addedElementsCount);
		for (int i = 0; i < random; i++) {
			page.clickOnDeleteElementButton();
			try {
				Thread.sleep(500);
			} catch(Exception e) {
				
			}
		}
		driver.quit();
	}
}
