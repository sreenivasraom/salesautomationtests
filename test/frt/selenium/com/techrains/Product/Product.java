package com.techrains.Product;

import junit.framework.TestCase;

import org.junit.Test;
import org.openqa.selenium.By;

import com.techrains.WaitSeconds.UtilsData;
import com.techrains.login.logout.LoginDetails;

public class Product extends TestCase {
	@Test
	public void testa4product() {
		UtilsData.waitSeconds(2);
		LoginDetails.driver.findElement(By.linkText("Product")).click();
		UtilsData.waitSeconds(2);
		LoginDetails.driver.findElement(By.xpath("//td[@class='pbButton']/input")).click();
		UtilsData.waitSeconds(2);
		LoginDetails.driver.findElement(By.xpath("//div[@class='pbBody']/div[3]/table/tbody/tr[1]/td[2]/div/input")).sendKeys("prcode1");
		LoginDetails.driver.findElement(By.xpath("//div[@class='pbBody']/div[3]/table/tbody/tr[1]/td[4]/div/input")).sendKeys("precode");
		LoginDetails.driver.findElement(By.xpath("//div[@class='pbBody']/div[3]/table/tbody/tr[2]/td[2]/textarea")).sendKeys("Data for the Utilitys");
		LoginDetails.driver.findElement(By.xpath("//div[@class='pbBody']/div[3]/table/tbody/tr[2]/td[4]/input")).click();
		LoginDetails.driver.findElement(By.xpath("//div[@class='pbBody']/div[3]/table/tbody/tr[3]/td[2]/div/input")).sendKeys("40");
		LoginDetails.driver.findElement(By.xpath("//div[@class='pbBottomButtons']/table/tbody/tr/td[2]/input[1]")).click();
		UtilsData.waitSeconds(3);

	}
}
