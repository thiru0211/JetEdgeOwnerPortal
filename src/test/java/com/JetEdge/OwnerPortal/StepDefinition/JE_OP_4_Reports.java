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

public class JE_OP_4_Reports {

	public WebDriver driver;
	public WebElement ele,ele1,ele2,ele3,ele4,ele5,ele6,ele7,ele8,ele9;
	public WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(5));


	@Given("To Check Reports User is navigating to JetEdge URL is {string}")
	public void user_is_navigating_to_jet_edge_Signin_url_is(String URL) {
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--headless=new");
		driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get(URL);
	}

	@When("To Check Reports User Enter Valid username and Valid password are {string} and {string}")
	public void username_and_password_are_and(String UserName, String Password) {
		driver.findElement(By.id("txtUserName")).sendKeys(UserName);
		driver.findElement(By.id("txtPassword")).sendKeys(Password);
		System.out.println("Username and password entered");
	}

	@And("click the login button To Check Reports")
	public void click_the_SignIn_button() {
		driver.findElement(By.id("ibLogin")).click();
		System.out.println("login button clicked");
	}

	@And("close the Reports Page")
	public void close_the_Signin_Page() {
		driver.quit();
		System.out.println("Page is closed");
	}

	@Then("Check Tail button Is Displayed Or Not To Check Reports")
	public void Check_Tail_button_Is_Displayed_Or_Not() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnContinueTail")));
		ele = driver.findElement(By.id("btnContinueTail"));
		boolean displayed = ele.isDisplayed();
		System.out.println("Tail button displayed is :"+displayed);
	}


	@Then("Select Valid Tail To Check Reports")
	public void Select_Valid_Tail_To_Check_MGReport() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ddlTail")));
		ele = driver.findElement(By.id("ddlTail"));
		Select sel=new Select(ele);
		sel.selectByVisibleText("N352JM - North Fifth Aviation LLC");
	}

	@And("Click Continue button To Check Reports")
	public void Click_Continue_button_To_Check_MGReport() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnContinueTail")));
		ele1 = driver.findElement(By.id("btnContinueTail"));
		ele1.click();
		Thread.sleep(20000);
	}

	@Then("Click Piolt Roster In Reports")
	public void Click_MSReport_In_To_Check_MGReport() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"liMainReports\"]/a/i[1]")));
		ele = driver.findElement(By.xpath("//*[@id=\"liMainReports\"]/a/i[1]"));
		ele.click();
		ele1 = driver.findElement(By.xpath("//*[@id=\"ancPLTROS\"]/span"));
		ele1.click();
	}

	@And("Select Valid Month In Calendar In Piolt Roster")
	public void Select_Valid_Month_In_Calendar_In_Piolt_Roster() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtFromMonth")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_txtFromMonth"));
//		ele.click();
//		ele1 = driver.findElement(By.id("calendar1_month_0_3"));
//		ele1.click();
	}

	@Then("Click Excel button In Piolt Roster")
	public void Click_Excel_button_In_Piolt_Roster() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_imbExport")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_imbExport"));
		ele.click();
	}

	@And("Click Duty button In Piolt Roster")
	public void Click_Duty_button_In_Piolt_Roster() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_gvRoaster_lblCrewName_0")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_gvRoaster_lbl4_5"));
		if(ele.isDisplayed()) {
			ele.click();
			Thread.sleep(3000);
			ele1 = driver.findElement(By.id("Button1"));
			ele1.click();
		}
		else {
			System.out.println("Duty Button is not present in the selected month");
		}
	}


	@Then("Click Flight Activity In Reports")
	public void Click_Flight_Activity_In_Reports() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"liMainReports\"]/a/i[1]")));
		ele = driver.findElement(By.xpath("//*[@id=\"liMainReports\"]/a/i[1]"));
		ele.click();
		ele1 = driver.findElement(By.xpath("//*[@id=\"ancFLACT\"]/span"));
		ele1.click();
	}

	@And("Click Excel button In Flight Activity")
	public void Click_Excel_button_In_Flight_Activity() {
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
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_imbExport")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_imbExport"));
		ele.click();
	}

	@And("Select Valid From and To Month In Flight Activity")
	public void Select_Valid_From_and_To_Month_In_Flight_Activity() {
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
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtFromMonth")));
		//From Calendar
		ele = driver.findElement(By.id("ContentPlaceHolder1_txtFromMonth"));
		ele.click();
		ele1 = driver.findElement(By.id("calendar2_month_0_0"));
		ele1.click();
	}

	@Then("Click View button In Flight Activity")
	public void Click_View_button_In_Flight_Activity() {
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
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ButSubmit")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_ButSubmit"));
		ele.click();
	}

	@Then("Click Leg Radio button In Flight Activity")
	public void Click_Leg_Radio_button_In_Flight_Activity() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_rdoType_1")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_rdoType_1"));
		ele.click();
	}

	@Then("Click Flight Activity 1.0 In Reports")
	public void Click_Flight_Activity_10_In_Reports() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"liMainReports\"]/a/i[1]")));
		ele = driver.findElement(By.xpath("//*[@id=\"liMainReports\"]/a/i[1]"));
		ele.click();
		ele1 = driver.findElement(By.xpath("//*[@id=\"ancFLACT1\"]/span[1]"));
		ele1.click();
	}

	@And("Click Excel button In Flight Activity 1.0")
	public void Click_Excel_button_In_Flight_Activity_10() {
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
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_imbExport")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_imbExport"));
		ele.click();
	}

	@And("Select Valid From and To Month In Flight Activity 1.0")
	public void Select_Valid_From_and_To_Month_In_Flight_Activity_10() throws InterruptedException {
		try {
			Alert alert = driver.switchTo().alert();
			String text = alert.getText();
			System.out.println("Alert Message Displayed Like : "+text);
			alert.accept();
		}
		catch (NoAlertPresentException e) {
			System.out.println("No Alert Message Is Displayed");
		}
		Thread.sleep(2000);
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
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtFromMonth")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_txtFromMonth"));
		ele.click();
		ele1 = driver.findElement(By.id("calendar2_month_0_0"));
		ele1.click();
	}

	@And("Click View button In Flight Activity 1.0")
	public void Click_View_button_In_Flight_Activity_10() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ButSubmit")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_ButSubmit"));
		ele.click();
	}

	@Then("Click Leg Radio button In Flight Activity 1.0")
	public void Click_Leg_Radio_button_In_Flight_Activity_10() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_rdoType_1")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_rdoType_1"));
		ele.click();
	}

	@Then("Click Owner Trip Expense In Reports")
	public void Click_Owner_Trip_Expense_In_Reports() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"liMainReports\"]/a/i[1]")));
		ele = driver.findElement(By.xpath("//*[@id=\"liMainReports\"]/a/i[1]"));
		ele.click();
		ele1 = driver.findElement(By.xpath("//*[@id=\"ancOWNTRPEXP\"]/span"));
		ele1.click();
	}

	@And("Select Valid From and To Month In Owner Trip Expense")
	public void Select_Valid_From_and_To_Month_In_Owner_Trip_Expense() {
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
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtFromMonth")));
		//From Calendar
		ele = driver.findElement(By.id("ContentPlaceHolder1_txtFromMonth"));
		ele.click();
		ele1 = driver.findElement(By.id("calendar2_month_0_0"));
		ele1.click();

		//To Calendar
		ele2 = driver.findElement(By.id("ContentPlaceHolder1_txtToMonth"));
		ele2.click();
		ele3 = driver.findElement(By.id("calendar1_month_0_3"));
		ele3.click();
	}

	@Then("Enter Valid Trip Number In Owner Trip Expense")
	public void Enter_Valid_Trip_Number_In_Owner_Trip_Expense() {
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
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtTrip")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_txtTrip"));
		ele.sendKeys("6974401");
	}

	@And("Click View button In Owner Trip Expense")
	public void Click_View_button_In_Owner_Trip_Expense() {
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
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ButSubmit")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_ButSubmit"));
		ele.click();
	}

	@Then("Click Any View button In Owner Trip Expense")
	public void Click_Any_View_button_In_Owner_Trip_Expense() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_gvActualSummary_imbView_1")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_gvActualSummary_imbView_1"));
		ele.click();
	}

	@And("Click Back button In Owner Trip Expense")
	public void Click_Back_button_In_Owner_Trip_Expense() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnBack")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_btnBack"));
		ele.click();
	}

	@And("Click Excel button In Owner Trip Expense")
	public void Click_Excel_button_In_Owner_Trip_Expense() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_imbExport")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_imbExport"));
		ele.click();
	}

	@Then("Click 380 Trip Expense In Reports")
	public void Click_380_Trip_Expense_In_Reports() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"liMainReports\"]/a/i[1]")));
		ele = driver.findElement(By.xpath("//*[@id=\"liMainReports\"]/a/i[1]"));
		ele.click();
		ele1 = driver.findElement(By.xpath("//*[@id=\"ancOWNTRP380\"]/span[1]"));
		ele1.click();
	}

	@And("Select Valid From and To Month In 380 Trip Expense")
	public void Select_Valid_From_and_To_Month_In_380_Trip_Expense() {
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
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtFromMonth")));
		//From Calendar
		ele = driver.findElement(By.id("ContentPlaceHolder1_txtFromMonth"));
		ele.click();
		ele1 = driver.findElement(By.id("calendar2_month_0_0"));
		ele1.click();

		//To Calendar
		ele2 = driver.findElement(By.id("ContentPlaceHolder1_txtToMonth"));
		ele2.click();
		ele3 = driver.findElement(By.id("calendar1_month_0_3"));
		ele3.click();
	}

	@And("Click View button In 380 Trip Expense")
	public void Click_View_button_In_380_Trip_Expense() {
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
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ButSubmit")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_ButSubmit"));
		ele.click();
		ele1=driver.findElement(By.id("ContentPlaceHolder1_gvActualSummary"));
		String text = ele1.getText();
		System.out.println("Page Displayed Like : "+ text);
	}

	@Then("Click Charter Trip Expense In Reports")
	public void Click_Charter_Trip_Expense_In_Reports() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"liMainReports\"]/a/i[1]")));
		ele = driver.findElement(By.xpath("//*[@id=\"liMainReports\"]/a/i[1]"));
		ele.click();
		ele1 = driver.findElement(By.xpath("//*[@id=\"ancCHTRTRPEXP\"]/span"));
		ele1.click();
	}

	@And("Select Valid From and To Month In Charter Trip Expense")
	public void Select_Valid_From_and_To_Month_In_Charter_Trip_Expense() {
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
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtFromMonth")));
		//From Calendar
		ele = driver.findElement(By.id("ContentPlaceHolder1_txtFromMonth"));
		ele.sendKeys("Jan/2024");

		//To Calendar
		ele2 = driver.findElement(By.id("ContentPlaceHolder1_txtToMonth"));
		ele2.sendKeys("Apr/2024");
	}

	@And("Click View button In Charter Trip Expense")
	public void Click_View_button_In_Charter_Trip_Expense() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ButSubmit")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_ButSubmit"));
		ele.click();
	}

	@Then("Click GL Wise Expense In Reports")
	public void ClickGLWiseExpenseInReports() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"liMainReports\"]/a/i[1]")));
		ele = driver.findElement(By.xpath("//*[@id=\"liMainReports\"]/a/i[1]"));
		ele.click();
		ele1 = driver.findElement(By.xpath("//*[@id=\"ancGLCode\"]/span[1]"));
		ele1.click();
	}

	@And("Select Valid From and To Month In GL Wise Expense")
	public void Select_Valid_From_and_To_Month_In_GL_Wise_Expense() throws InterruptedException {
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
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtFromMonth")));
		//From Month
		ele = driver.findElement(By.id("ContentPlaceHolder1_txtFromMonth"));
		ele.click();
		ele1 = driver.findElement(By.id("calendar2_month_0_0"));
		ele1.click();
		Thread.sleep(7000);
		//To Month
		ele2 = driver.findElement(By.id("ContentPlaceHolder1_txtToMonth"));
		ele2.click();
		ele3 = driver.findElement(By.id("calendar1_month_0_3"));
		ele3.click();
	}
	
	@Then("Select Single Expense Checkbox In GL Wise Expense")
	public void Select_Single_Expense_Checkbox_In_GL_Wise_Expense() throws InterruptedException {
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtTripType")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_txtTripType"));
		ele.click();
		Thread.sleep(2000);
		ele1 = driver.findElement(By.id("ContentPlaceHolder1_cbTripType_0"));
		ele1.click();
	}
	
	@And("Click View button In GL Wise Expense")
	public void Click_View_button_In_GL_Wise_Expense() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ButSubmit")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_ButSubmit"));
		ele.click();
	}
	
	@Then("Select Multiple Expense Checkbox In GL Wise Expense")
	public void Select_Multiple_Expense_Checkbox_In_GL_Wise_Expense() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtTripType")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_txtTripType"));
		ele.click();
		Thread.sleep(2000);
		ele1 = driver.findElement(By.id("ContentPlaceHolder1_cbTripType_0"));
		ele1.click();
		Thread.sleep(2000);
		ele2 = driver.findElement(By.id("ContentPlaceHolder1_cbTripType_1"));
		ele2.click();
		Thread.sleep(2000);
		ele3 = driver.findElement(By.id("ContentPlaceHolder1_cbTripType_2"));
		ele3.click();
	}
	
	@Then("Select All Expense Checkbox In GL Wise Expense")
	public void Select_All_Expense_Checkbox_In_GL_Wise_Expense() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtTripType")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_txtTripType"));
		ele.click();
		ele1 = driver.findElement(By.id("ContentPlaceHolder1_cbTripTypeALL"));
		ele1.click();
	}
	
	@Then("Click Excel button In GL Wise Expense")
	public void Click_Excel_button_In_GL_Wise_Expense() throws InterruptedException {
		Thread.sleep(6000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_imbExport")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_imbExport"));
		ele.click();
	}
	
	@Then("Click Owner Revenue Payable In Reports")
	public void Click_Owner_Revenue_Payable_In_Reports() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"liMainReports\"]/a/i[1]")));
		ele = driver.findElement(By.xpath("//*[@id=\"liMainReports\"]/a/i[1]"));
		ele.click();
		ele1 = driver.findElement(By.xpath("//*[@id=\"ancOWNPAY\"]/span"));
		ele1.click();
	}
	
	@And("Select Valid From and To Month In Owner Revenue Payable")
	public void Select_Valid_From_and_To_Month_In_Owner_Revenue_Payable() throws InterruptedException {
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
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtFromMonth")));
		//From Month
		ele = driver.findElement(By.id("ContentPlaceHolder1_txtFromMonth"));
		ele.click();
		Thread.sleep(2000);
		ele1 = driver.findElement(By.id("calendar2_title"));
		ele1.click();
		Thread.sleep(2000);
		ele2 = driver.findElement(By.id("calendar2_year_0_3"));
		ele2.click();
		Thread.sleep(2000);
		ele3 = driver.findElement(By.id("calendar2_month_0_0"));
		ele3.click();

//		//To Month
//		ele4 = driver.findElement(By.id("ContentPlaceHolder1_txtToMonth"));
//		ele4.click();
//		ele5 = driver.findElement(By.id("calendar1_month_0_3"));
//		ele5.click();
	}
	
	@And("Click View button In Owner Revenue Payable")
	public void Click_View_button_In_Owner_Revenue_Payable() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ButSubmit")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_ButSubmit"));
		ele.click();
	}
	
	@Then("Click Excel button In Owner Revenue Payable")
	public void Click_Excel_button_In_Owner_Revenue_Payable() {
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
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_imbExport")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_imbExport"));
		ele.click();
	}
	
	@Then("Click Payment History In Reports")
	public void Click_Payment_History_In_Reports() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"liMainReports\"]/a/i[1]")));
		ele = driver.findElement(By.xpath("//*[@id=\"liMainReports\"]/a/i[1]"));
		ele.click();
		ele1 = driver.findElement(By.xpath("//*[@id=\"ancPAYHIS\"]/span"));
		ele1.click();
	}
	
	@And("Select Valid From and To Month In Payment History")
	public void Select_Valid_From_and_To_Month_In_Payment_History() throws InterruptedException {
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
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtFromMonth")));
		//From Month
		ele = driver.findElement(By.id("ContentPlaceHolder1_txtFromMonth"));
		ele.click();
		Thread.sleep(2000);
		ele3 = driver.findElement(By.id("calendar2_month_0_0"));
		ele3.click();

		//To Month
//		ele4 = driver.findElement(By.id("ContentPlaceHolder1_txtToMonth"));
//		ele4.click();
//		ele5 = driver.findElement(By.id("calendar1_month_0_3"));
//		ele5.click();
	}
	
	@And("Click View button In Payment History")
	public void Click_View_button_In_Payment_History() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ButSubmit")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_ButSubmit"));
		ele.click();
	}
	
	@Then("Click Excel button In Payment History")
	public void Click_Excel_button_In_Payment_History() throws InterruptedException {
		Thread.sleep(5000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_imbExport")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_imbExport"));
		ele.click();
	}
	
	@Then("Click Fuel Uplift In Reports")
	public void Click_Fuel_Uplift_In_Reports() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"liMainReports\"]/a/i[1]")));
		ele = driver.findElement(By.xpath("//*[@id=\"liMainReports\"]/a/i[1]"));
		ele.click();
		ele1 = driver.findElement(By.xpath("//*[@id=\"ancFUELUP\"]/span"));
		ele1.click();
	}
	
	@And("Select Valid From and To Month In Fuel Uplift")
	public void Select_Valid_From_and_To_Month_In_Fuel_Uplift() throws InterruptedException {
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
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtFromMonth")));
		//From Month
		ele = driver.findElement(By.id("ContentPlaceHolder1_txtFromMonth"));
		ele.click();
		ele3 = driver.findElement(By.id("calendar2_month_0_0"));
		ele3.click();

		//To Month
//		ele4 = driver.findElement(By.id("ContentPlaceHolder1_txtToMonth"));
//		ele4.click();
//		ele5 = driver.findElement(By.id("calendar1_month_0_3"));
//		ele5.click();
	}
	
	@And("Click View button In Fuel Uplift")
	public void Click_View_button_In_Fuel_Uplift() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ButSubmit")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_ButSubmit"));
		ele.click();
	}
	
	@Then("Click View button In The Table")
	public void Click_View_button_In_The_Table() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_gvSummary_imbView_1")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_gvSummary_imbView_1"));
		ele.click();
	}
	
	@Then("Click Back button In Fuel Uplift")
	public void Click_Back_button_In_Fuel_Uplift() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnSummary")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_btnSummary"));
		ele.click();
	}
	
	@Then("Click Pilot Salary In Reports")
	public void Click_Pilot_Salary_In_Reports() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"liMainReports\"]/a/i[1]")));
		ele = driver.findElement(By.xpath("//*[@id=\"liMainReports\"]/a/i[1]"));
		ele.click();
		Thread.sleep(2000);
		ele1 = driver.findElement(By.xpath("//*[@id=\"ancPLTSALRY\"]/span"));
		ele1.click();
	}
	
	@And("Select Valid Year In Pilot Salary")
	public void Select_Valid_Year_In_Pilot_Salary() {
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
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtFromMonth")));
		//From Month
		ele = driver.findElement(By.id("ContentPlaceHolder1_txtFromMonth"));
		ele.click();
		ele1 = driver.findElement(By.id("cal16_year_0_3"));
		ele1.click();
	}
	
	@Then("Click View button In Pilot Salary")
	public void Click_View_button_In_Pilot_Salary() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ButSubmit")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_ButSubmit"));
		ele.click();
	}
	
	@And("Click View button In The Table In Pilot Salary")
	public void Click_View_button_In_The_Table_In_Pilot_Salary() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_gvSummary_imbEdit_0")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_gvSummary_imbEdit_0"));
		if(ele.isDisplayed()) {
			ele.click();			
		}
		else {
			System.out.println("Table is not displayed");
			
			
		}
		
	}
		
	@Then("Click Back button In Pilot Salary")
	public void Click_Back_button_In_Pilot_Salary() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnBack")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_btnBack"));
		ele.click();
	}
		
	@Then("Click Major Events In Reports")
	public void Click_Major_Events_In_Reports() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"liMainReports\"]/a/i[1]")));
		ele = driver.findElement(By.xpath("//*[@id=\"liMainReports\"]/a/i[1]"));
		ele.click();
		Thread.sleep(2000);
		ele1 = driver.findElement(By.xpath("//*[@id=\"ancMJREVNT\"]/span"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", ele1);
		Thread.sleep(2000);
		ele2 = driver.findElement(By.xpath("//*[@id=\"ancMJREVNT\"]/span"));
		ele2.click();
	}
	
	@And("Select Valid From and To Month In Major Events")
	public void Select_Valid_From_and_To_Month_In_Major_Events() {
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
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtFromMonth")));
		//From Month
		ele = driver.findElement(By.id("ContentPlaceHolder1_txtFromMonth"));
		ele.click();
		ele3 = driver.findElement(By.id("calendar2_month_0_0"));
		ele3.click();

		//To Month
//		ele4 = driver.findElement(By.id("ContentPlaceHolder1_txtToMonth"));
//		ele4.click();
//		ele5 = driver.findElement(By.id("calendar1_month_0_3"));
//		ele5.click();
	}
	
	@Then("Click View button In Major Events")
	public void Click_View_button_In_Major_Events() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ButSubmit")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_ButSubmit"));
		ele.click();
		ele1 = driver.findElement(By.id("ContentPlaceHolder1_gvMajorEvents"));
		String text = ele1.getText();
		System.out.println("Page Displayed Like : "+text);
	}
	
	@Then("Click Lost Revenue In Reports")
	public void Click_Lost_Revenue_In_Reports() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"liMainReports\"]/a/i[1]")));
		ele = driver.findElement(By.xpath("//*[@id=\"liMainReports\"]/a/i[1]"));
		ele.click();
		ele1 = driver.findElement(By.xpath("//*[@id=\"ancOWNDEN\"]/span"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", ele1);
		Thread.sleep(2000);
		ele2 = driver.findElement(By.xpath("//*[@id=\"ancOWNDEN\"]/span"));
		ele2.click();
	}
	
	@And("Select Valid From and To Month In Lost Revenue")
	public void Select_Valid_From_and_To_Month_In_Lost_Revenue() {
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
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtFromMonth")));
		//From Month
		ele = driver.findElement(By.id("ContentPlaceHolder1_txtFromMonth"));
		ele.click();
		ele3 = driver.findElement(By.id("calendar2_month_0_0"));
		ele3.click();

		//To Month
//		ele4 = driver.findElement(By.id("ContentPlaceHolder1_txtToMonth"));
//		ele4.click();
//		ele5 = driver.findElement(By.id("calendar1_month_0_3"));
//		ele5.click();
	}
	
	@Then("Click View button In Lost Revenue")
	public void Click_View_button_In_Lost_Revenue() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ButSubmit")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_ButSubmit"));
		ele.click();
		ele1 = driver.findElement(By.id("ContentPlaceHolder1_gvSummary"));
		String text = ele1.getText();
		System.out.println("Page Displayed Like : "+text);
	}
	
}

