package tests;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Proces {

	static final String URL = "http://192.168.56.101/";
	static final String btn = ".btn.btn-dark.btn-lga";
	By empezar = By.id("start_button");
	By input = By.id("input");
	By next = By.id("next");
	By help = By.id("help");
	By txt = By.id("txt");
	
	WebDriver driver;
	WebDriver driver1;
	
	
	@Before
	public void setUp() throws Exception {
		ChromeOptions options = new ChromeOptions();
		ArrayList<String> optionList = new ArrayList<>();
		optionList.add("--start-maximized");
		optionList.add("--incognito");
		options.addArguments(optionList);
		
		driver = new ChromeDriver(options);

		//Open URL
		driver.get(URL);
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void click1 () {
				
		driver.findElement(empezar).click();
		
}
	
	@Test
	public void click2 () {
	
	driver.findElement(input).sendKeys("selenium");
	driver.findElement(next).click();
	
	}
	
	@Test
	public void click3 () {
		

		driver.findElement(input).sendKeys("I am doing Selenium stuff!");
		driver.findElement(next).click();
	
	}
	
	
	@Test
	public void click4 () {
		
	driver.findElements(By.cssSelector(btn)).get(0).click();
	driver.findElements(By.cssSelector(btn)).get(1).click();
	driver.findElements(By.cssSelector(btn)).get(2).click();
	driver.findElements(By.cssSelector(btn)).get(3).click();
	
	}
	
	
	@Test
	public void click5 () {
	
		driver.findElement(By.linkText("Enlace!")).click();
	}
	
	
	
	@Test
	public void click678 () {
	
	((JavascriptExecutor)driver).executeScript("changePage()");

	String popPage = driver.getWindowHandle();
	System.out.println(popPage);
	
	driver.findElement(input).sendKeys("4m4z1ngP455w0rD");
	driver.findElement(next).click();
	}
	
}
