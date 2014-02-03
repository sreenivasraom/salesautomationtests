package com.techrains.Distributor.SalesExecutive;

import static com.techrains.utils.utilities.popupwindowhandler;
import junit.framework.TestCase;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriverException;

import com.techrains.WaitSeconds.UtilsData;
import com.techrains.login.logout.LoginDetails;

public class SalesExecutive extends TestCase{
	@Test
	public void testa3salesExecutive()  {
		UtilsData.waitSeconds(2);
		LoginDetails.driver.findElement(By.linkText("SalesExecutive")).click();
		UtilsData.waitSeconds(2);
		LoginDetails.driver.findElement(By.xpath("//td[@class='pbButton']/input")).click();
		UtilsData.waitSeconds(2);
		LoginDetails.driver.findElement(By.xpath("//div[@class='pbBody']/div[3]/table/tbody/tr[1]/td[2]/div/input")).sendKeys("John");
		LoginDetails.driver.findElement(By.xpath("//div[@class='pbBody']/div[3]/table/tbody/tr[1]/td[4]/div/input")).sendKeys("Kumar");
		LoginDetails.driver.findElement(By.xpath("//div[@class='pbBody']/div[3]/table/tbody/tr[2]/td[4]/div/input")).sendKeys("9886564534");
		LoginDetails.driver.findElement(By.xpath("//div[@class='pbBody']/div[3]/table/tbody/tr[3]/td[2]/div/input")).sendKeys("john@gmail.com");
		// lookup
		LoginDetails.driver.findElement(By.xpath("//div[@class='bPageBlock brandSecondaryBrd bEditBlock secondaryPalette']/div[2]/div[3]/table/tbody/tr[3]/td[4]/div/span/a")).click();
		UtilsData.waitSeconds(2);
		String winHandleBefore = LoginDetails.driver.getWindowHandle();
		String secondWinHandle = popupwindowhandler();
		LoginDetails.driver.switchTo().window(secondWinHandle);
		UtilsData.waitSeconds(2);
		LoginDetails.driver.switchTo().frame("resultsFrame");
		UtilsData.waitSeconds(2);
		try
		{
			LoginDetails.driver.findElement(By.xpath("//div[@class='bPageBlock brandSecondaryBrd secondaryPalette']/div[2]/table/tbody/tr[2]/th/a")).click();

		}catch (WebDriverException  e) {
		}
		UtilsData.waitSeconds(2); 
		LoginDetails.driver.switchTo().window(winHandleBefore);
		UtilsData.waitSeconds(2);

		// Address Information
		LoginDetails.driver.findElement(By.xpath("//div[@class='pbBody']/div[5]/table/tbody/tr[1]/td[2]/div/textarea")).sendKeys("Louis Arsenal");
		LoginDetails.driver.findElement(By.xpath("//div[@class='pbBody']/div[5]/table/tbody/tr[1]/td[4]/div/input")).sendKeys("Louis Arsenal");
		LoginDetails.driver.findElement(By.xpath("//div[@class='pbBody']/div[5]/table/tbody/tr[2]/td[2]/div/input")).sendKeys("New Orleans");
		LoginDetails.driver.findElement(By.xpath("//div[@class='pbBody']/div[5]/table/tbody/tr[2]/td[4]/div/input")).sendKeys("500034");
		LoginDetails.driver.findElement(By.xpath("//div[@class='pbBody']/div[5]/table/tbody/tr[3]/td[2]/div/input")).sendKeys("St.Louis County");
		LoginDetails.driver.findElement(By.xpath("//div[@class='pbBody']/div[5]/table/tbody/tr[3]/td[4]/div/input")).sendKeys("9887453423");
		LoginDetails.driver.findElement(By.xpath("//div[@class='pbBottomButtons']/table/tbody/tr/td[2]/input[1]")).click();
		UtilsData.waitSeconds(3);
	}

	
	}
