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

public class JE_OP_1_SignIn {

	public WebDriver driver;
	public WebElement ele,ele1,ele2,ele3,ele4,ele5,ele6,ele7,ele8,ele9;
	public WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(5));


	@Given("To Check Signin User is navigating to JetEdge URL is {string}")
	public void user_is_navigating_to_jet_edge_Signin_url_is(String URL) {
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--headless=new");
		driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get(URL);
	}

	@When("To Check Signin User Enter username and password are {string} and {string}")
	public void username_and_password_are_and(String UserName, String Password) {
		driver.findElement(By.id("txtUserName")).sendKeys(UserName);
		driver.findElement(By.id("txtPassword")).sendKeys(Password);
		System.out.println("Username and password entered");
	}

	@And("click the login button To Check Signin")
	public void click_the_SignIn_button() {
		driver.findElement(By.id("ibLogin")).click();
		System.out.println("login button clicked");
	}

	@And("close the Signin Page")
	public void close_the_Signin_Page() {
		driver.quit();
		System.out.println("Page is closed");
	}

	@Then("Check Tail button Is Displayed Or Not")
	public void Check_Tail_button_Is_Displayed_Or_Not() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnContinueTail")));
		ele = driver.findElement(By.id("btnContinueTail"));
		boolean displayed = ele.isDisplayed();
		System.out.println("Tail button displayed is :"+displayed);
	}
	
	@Then("Select Valid Tail To Check Signin")
	public void Select_Valid_Tail_To_Check_Signin() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ddlTail")));
		ele = driver.findElement(By.id("ddlTail"));
		Select sel=new Select(ele);
		sel.selectByVisibleText("N352JM - North Fifth Aviation LLC");
		
		//Click Continue button
		ele1 = driver.findElement(By.id("btnContinueTail"));
		ele1.click();
		Thread.sleep(20000);
	}
	
	@And("Check home page is displayed To Check Signin")
	public void Check_home_page_is_displayed_To_Check_Signin() {
//		Alert alert = driver.switchTo().alert();
//		alert.accept();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("lblOwnedTail2")));
		ele = driver.findElement(By.id("lblOwnedTail2"));
		boolean displayed = ele.isDisplayed();
		System.out.println("Page is displayed homepage");
	}
	
	@When("To Check Signin User Enter Valid username and Invalid password are {string} and {string}")
	public void To_Check_Signin_User_Enter_Valid_username_and_Invalid_password_are_and(String UserName, String Password) {
		driver.findElement(By.id("txtUserName")).sendKeys(UserName);
		driver.findElement(By.id("txtPassword")).sendKeys(Password);
		System.out.println("Username and password entered");
	}
	
	
	@When("To Check Signin User Enter Invalid username and Valid password are {string} and {string}")
	public void to_check_signin_user_enter_invalid_username_and_valid_password_are_and(String UserName, String Password) {
		driver.findElement(By.id("txtUserName")).sendKeys(UserName);
		driver.findElement(By.id("txtPassword")).sendKeys(Password);
		System.out.println("Username and password entered");
	}
	
	@Then("Check Page Behaviour To Check Signin")
	public void Check_Page_Behaviour_To_Check_Signin() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("lblInvalidLogin")));
		ele = driver.findElement(By.id("lblInvalidLogin"));
		String text = ele.getText();
		System.out.println("Error Messsage Displayed Like : "+text);
	}
	
	@And("Click Menu Icon In Home Page")
	public void Click_Menu_Icon_In_Home_Page() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"kt_header\"]/div[3]/div[4]/div[1]/span/i")));
		ele = driver.findElement(By.xpath("//*[@id=\"kt_header\"]/div[3]/div[4]/div[1]/span/i"));
		ele.click();
	}
	
	@Then("Click Signout button In Home Page")
	public void Click_Signout_button_In_Home_Page() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnSignOut")));
		ele = driver.findElement(By.id("btnSignOut"));
		ele.click();
	}
}

