package com.techrains.Region;

import junit.framework.TestCase;

import org.junit.Test;
import org.openqa.selenium.By;

import com.techrains.WaitSeconds.UtilsData;
import com.techrains.login.logout.LoginDetails;

public class Region extends TestCase {
	
	@Test
	public void testRegion() {
		UtilsData.waitSeconds(2);
		LoginDetails.driver.findElement(By.xpath("//li[@id='01r900000007oST_Tab']/a")).click();
		UtilsData.waitSeconds(2);
        LoginDetails.driver.findElement(By.xpath("//td[@class='pbButton']/input")).click();
        UtilsData.waitSeconds(2);
		LoginDetails.driver.findElement(By.xpath("//input[@id='Name']")).sendKeys("ralce");
		UtilsData.waitSeconds(2);
		LoginDetails.driver.findElement(By.xpath("//div[@class='pbSubsection']/table/tbody/tr[2]/td[2]/div/input")).sendKeys("Ralcorp");
		/*String UserName = loginProps.getProperty("DUMMYUSER");
		LoginDetails.driver.findElement(By.id("Name")).sendKeys(UserName, Keys.TAB);
		UtilsData.setNewUserName(UserName);*/
		LoginDetails.driver.findElement(By.xpath("//div[@class='pbSubsection']/table/tbody/tr[2]/td[4]/div/input")).sendKeys("50000");
		LoginDetails.driver.findElement(By.xpath("//div[@class='pbSubsection']/table/tbody/tr[3]/td[2]/div/input")).sendKeys("St.Louis County");
		LoginDetails.driver.findElement(By.xpath("//div[@class='pbSubsection']/table/tbody/tr[3]/td[4]/div/input")).sendKeys("500048");
		LoginDetails.driver.findElement(By.xpath("//div[@class='pbSubsection']/table/tbody/tr[4]/td[4]/div/input")).sendKeys("USA");
		LoginDetails.driver.findElement(By.xpath("//td[@id='bottomButtonRow']/input[@name='save']")).click();
		UtilsData.waitSeconds(3);
	}
	
	
	
}
