package com.techrains.login.logout;

import junit.framework.TestCase;

import org.junit.Test;
import org.openqa.selenium.By;

public class Logout extends TestCase  {

	@Test
	public void testLogout() throws Exception {
		LoginDetails.driver.findElement(By.xpath("//div[@id='userNav-arrow']")).click();
		LoginDetails.driver.findElement(By.xpath("//div[@id='userNav-menuItems']/a[4]")).click();
		LoginDetails.driver.close();
	}
}

