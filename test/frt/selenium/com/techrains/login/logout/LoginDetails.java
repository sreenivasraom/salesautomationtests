package com.techrains.login.logout;


import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import junit.framework.TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.techrains.WaitSeconds.UtilsData;

public class LoginDetails extends TestCase{

	public static  WebDriver driver;
	
	public LoginDetails() throws IOException {
		
	String iePath = null;
	String chromePath = null;	
	String RTA_HOME = System.getenv("RTA_HOME");
	String filePath = RTA_HOME + File.separator + "webdrivers" + File.separator + "browser.properties";
	FileReader reader1 = new FileReader(filePath);	
	Properties properties1 = new Properties();
	properties1.load(reader1);
	String browser = properties1.getProperty("browser");
	String os = properties1.getProperty("os");
	String version = properties1.getProperty("version");
	if (browser.equals("iexplore") && os.equalsIgnoreCase("windows")) {
		if (version.equals("64")) {
			iePath =  RTA_HOME + File.separator + "webdrivers" + File.separator + "iexplore" + File.separator + "windows" + File.separator + "64" + File.separator + "IEDriverServer.exe";
			System.setProperty("webdriver.ie.driver",iePath);
		} else {
			iePath =  RTA_HOME + File.separator + "webdrivers" + File.separator + "iexplore" + File.separator + "windows" + File.separator + "32" + File.separator + "IEDriverServer.exe";
			System.setProperty("webdriver.ie.driver",iePath);
		}
		DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
		capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,	true);
		capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		driver = new InternetExplorerDriver(capabilities);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	} else if (browser.equals("firefox")) {
		FirefoxProfile p = new FirefoxProfile();
		p.setEnableNativeEvents(false);
		driver = new FirefoxDriver(p);
		driver.manage().window().maximize();
	} else if (browser.equals("chrome") && os.equalsIgnoreCase("windows")) {
		chromePath = RTA_HOME + File.separator + "webdrivers" + File.separator + "chrome" + File.separator + "windows" + File.separator + "chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromePath);
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		driver = new ChromeDriver(options);
	} else if (browser.equals("chrome") && os.equalsIgnoreCase("linux")) {
		
		if (version.equals("64")) {
			chromePath = RTA_HOME + File.separator + "webdrivers" + File.separator + "chrome" + File.separator + "linux" + File.separator + "64" + File.separator + "chromedriver.sh";
			System.setProperty("webdriver.chrome.driver", chromePath);
		} else {
			chromePath = RTA_HOME + File.separator + "webdrivers" + File.separator + "chrome" + File.separator + "linux" + File.separator + "32" + File.separator + "chromedriver.sh";
			System.setProperty("webdriver.chrome.driver", chromePath);
		}
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		driver = new ChromeDriver(options);
	}
	filePath = "resources/logindetails.properties";
	FileReader reader = new FileReader(filePath);
	Properties properties = new Properties();
	properties.load(reader);
	String url = properties.getProperty("url");
	String username = properties.getProperty("username");
	String password = properties.getProperty("password");
	System.out.println(url);
	System.out.println(username);
	System.out.println(password);
	driver.get(url);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
	
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
	driver.findElement(By.xpath("//button[@id='Login']")).click();
	String dddd = "Sales Automation";
	String data = driver.findElement(By.id("tsidLabel")).getText();
	if (dddd.equals(driver.findElement(By.id("tsidLabel")).getText())) {
		System.out.println("in Demo Data " + data);
	} else {
		driver.findElement(By.id("tsid-arrow")).click();
		UtilsData.waitSeconds(2);
		driver.findElement(By.linkText("Sales Automation")).click();
	}
  }
}


