package com.JetEdge.OwnerPortal.StepDefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class JE_OP_9_Profile {

	public WebDriver driver;
	public WebElement ele,ele1,ele2,ele3,ele4,ele5,ele6,ele7,ele8,ele9;
	public WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(5));


	@Given("To Check Profile User is navigating to JetEdge URL is {string}")
	public void user_is_navigating_to_jet_edge_Signin_url_is(String URL) {
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--headless=new");
		driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get(URL);
	}

	@When("To Check Profile User Enter Valid username and Valid password are {string} and {string}")
	public void username_and_password_are_and(String UserName, String Password) {
		driver.findElement(By.id("txtUserName")).sendKeys(UserName);
		driver.findElement(By.id("txtPassword")).sendKeys(Password);
		System.out.println("Username and password entered");
	}

	@And("click the login button To Check Profile")
	public void click_the_SignIn_button() {
		driver.findElement(By.id("ibLogin")).click();
		System.out.println("login button clicked");
	}

	@And("close the Profile Page")
	public void close_the_Aircraft_Page() {
		driver.quit();
		System.out.println("Page is closed");
	}

	@Then("Select Valid Tail To Check Profile")
	public void Select_Valid_Tail_To_Check_Profile() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ddlTail")));
		ele = driver.findElement(By.id("ddlTail"));
		Select sel=new Select(ele);
		sel.selectByVisibleText("N352JM - North Fifth Aviation LLC");
	}

	@And("Click Continue button To Check Profile")
	public void Click_Continue_button_To_Check_Profile() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnContinueTail")));
		ele1 = driver.findElement(By.id("btnContinueTail"));
		ele1.click();
		Thread.sleep(20000);
	}
	
	@Then("Click Owner Profile button in profile")
	public void click_owner_profile_button_in_profile() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/form/div[4]/div/div[1]/div[2]/div/ul/li[7]/a/i[1]")));
		ele = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div[2]/div/ul/li[7]/a/i[1]"));
		ele.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/form/div[4]/div/div[1]/div[2]/div/ul/li[7]/div/ul/li[2]/a/span")));
		ele1 = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div[2]/div/ul/li[7]/div/ul/li[2]/a/span"));
		ele1.click();
	}
	
	@And("Check page landed to Owner Profile page or not")
	public void check_page_landed_to_owner_profile_page_or_not() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/form/div[4]/div/div[3]/div[3]/div[2]/div/div/div[2]/div/div[1]/div/span")));
		ele = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[3]/div[3]/div[2]/div/div/div[2]/div/div[1]/div/span"));
		String text = ele.getText();
		if(ele.isDisplayed()) {
			System.out.println("Page landed to Owner Profile Page");
			System.out.println("Text Displayed in the page is : "+text);
		}
		else {
			System.out.println("Page doesnot landed to Owner Profile Page");
		}
		
	}
	
	@Then("Click Contact Us button in profile")
	public void click_contact_us_button_in_profile() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/form/div[4]/div/div[1]/div[2]/div/ul/li[7]/a/i[1]")));
		ele = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div[2]/div/ul/li[7]/a/i[1]"));
		ele.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/form/div[4]/div/div[1]/div[2]/div/ul/li[7]/div/ul/li[3]/a/span")));
		ele1 = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div[2]/div/ul/li[7]/div/ul/li[3]/a/span"));
		ele1.click();
	}
	@And("Check page landed to contact us page or not")
	public void check_page_landed_to_contact_us_page_or_not() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/form/div[4]/div/div[3]/div[3]/div[2]/div/div/div[2]/div/div[1]/div/div/div[2]/a")));
		ele = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[3]/div[3]/div[2]/div/div/div[2]/div/div[1]/div/div/div[2]/a"));
		String text = ele.getText();
		if(ele.isDisplayed()) {
			System.out.println("Page landed to Contact Us Page");
			System.out.println("Text Displayed in the page is : "+text);
		}
		else {
			System.out.println("Page doesnot landed to Contact Us Page");
		}
	}
	
	
}

