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

public class JE_OP_5_Aircraft {

	public WebDriver driver;
	public WebElement ele,ele1,ele2,ele3,ele4,ele5,ele6,ele7,ele8,ele9;
	public WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(5));


	@Given("To Check Aircraft User is navigating to JetEdge URL is {string}")
	public void user_is_navigating_to_jet_edge_Signin_url_is(String URL) {
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--headless=new");
		driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get(URL);
	}

	@When("To Check Aircraft User Enter Valid username and Valid password are {string} and {string}")
	public void username_and_password_are_and(String UserName, String Password) {
		driver.findElement(By.id("txtUserName")).sendKeys(UserName);
		driver.findElement(By.id("txtPassword")).sendKeys(Password);
		System.out.println("Username and password entered");
	}

	@And("click the login button To Check Aircraft")
	public void click_the_SignIn_button() {
		driver.findElement(By.id("ibLogin")).click();
		System.out.println("login button clicked");
	}

	@And("close the Aircraft Page")
	public void close_the_Aircraft_Page() {
		driver.quit();
		System.out.println("Page is closed");
	}

	@Then("Check Tail button Is Displayed Or Not To Check Aircraft")
	public void Check_Tail_button_Is_Displayed_Or_Not() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnContinueTail")));
		ele = driver.findElement(By.id("btnContinueTail"));
		boolean displayed = ele.isDisplayed();
		System.out.println("Tail button displayed is :"+displayed);
	}


	@Then("Select Valid Tail To Check Aircraft")
	public void Select_Valid_Tail_To_Check_MGReport() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ddlTail")));
		ele = driver.findElement(By.id("ddlTail"));
		Select sel=new Select(ele);
		sel.selectByVisibleText("N352JM - North Fifth Aviation LLC");
	}

	@And("Click Continue button To Check Aircraft")
	public void Click_Continue_button_To_Check_MGReport() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnContinueTail")));
		ele1 = driver.findElement(By.id("btnContinueTail"));
		ele1.click();
		Thread.sleep(20000);
	}

	@Then("Click Tail Details In Aircraft")
	public void Click_Tail_Details_In_Aircraft() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"liMainAircraft\"]/a/i[1]")));
		ele = driver.findElement(By.xpath("//*[@id=\"liMainAircraft\"]/a/i[1]"));
		ele.click();
		ele1 = driver.findElement(By.xpath("//*[@id=\"ancTAILDET\"]/span"));
		ele1.click();
	}
	
	@And("Click Aircraft Details button In Tail Details")
	public void Click_Aircraft_Details_button_In_Tail_Details() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ContentPlaceHolder1_dvAircraft\"]/div[1]/div")));
		ele1 = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_dvAircraft\"]/div[1]/div"));
		ele1.click();
	}
	
	@Then("Click Tail Gallery In Aircraft")
	public void Click_Tail_Gallery_In_Aircraft() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"liMainAircraft\"]/a/i[1]")));
		ele = driver.findElement(By.xpath("//*[@id=\"liMainAircraft\"]/a/i[1]"));
		ele.click();
		ele1 = driver.findElement(By.xpath("//*[@id=\"ancTAILGALL\"]/span"));
		ele1.click();
	}
	
	@And("Check Data Displayed Or Not In Tail Gallery")
	public void Check_Data_Displayed_Or_Not_In_Tail_Gallery() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"kt_content\"]/div/div[2]")));
		ele = driver.findElement(By.xpath("//*[@id=\"kt_content\"]/div/div[2]"));
		String text = ele.getText();
		System.out.println("Page Displayed Like : "+text);
	}
	
	@Then("Click Specs Sheet In Aircraft")
	public void Click_Specs_Sheet_In_Aircraft() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"liMainAircraft\"]/a/i[1]")));
		ele = driver.findElement(By.xpath("//*[@id=\"liMainAircraft\"]/a/i[1]"));
		ele.click();
		ele1 = driver.findElement(By.xpath("//*[@id=\"ancSPECHSHEET\"]/span"));
		ele1.click();
	}
	
	@And("Click Print button In Specs Sheet")
	public void Click_Print_button_In_Specs_Sheet() throws InterruptedException {
		try {
			Alert alert = driver.switchTo().alert();
			String text = alert.getText();
			System.out.println("Alert Message Displayed Like : "+text);
			alert.accept();
		}
		catch (NoAlertPresentException e) {
			System.out.println("No Alert Message Is Displayed");
		}
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"Div2\"]/div/div[2]/div/div")));
		ele1 = driver.findElement(By.xpath("//*[@id=\"Div2\"]/div/div[2]/div/div"));
		boolean displayed = ele1.isDisplayed();
		System.out.println("Print Button Is Working :"+ displayed);
		
	}
}

