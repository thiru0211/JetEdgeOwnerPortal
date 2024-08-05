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

public class JE_OP_2_HomePage {

	public WebDriver driver;
	public WebElement ele,ele1,ele2,ele3,ele4,ele5,ele6,ele7,ele8,ele9;
	public WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(5));


	@Given("To Check HomePage User is navigating to JetEdge URL is {string}")
	public void user_is_navigating_to_jet_edge_Signin_url_is(String URL) {
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--headless=new");
		driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get(URL);
	}

	@When("To Check HomePage User Enter Valid username and Valid password are {string} and {string}")
	public void username_and_password_are_and(String UserName, String Password) {
		driver.findElement(By.id("txtUserName")).sendKeys(UserName);
		driver.findElement(By.id("txtPassword")).sendKeys(Password);
		System.out.println("Username and password entered");
	}

	@And("click the login button To Check HomePage")
	public void click_the_SignIn_button() {
		driver.findElement(By.id("ibLogin")).click();
		System.out.println("login button clicked");
	}

	@And("close the HomePage Page")
	public void close_the_Signin_Page() {
		driver.quit();
		System.out.println("Page is closed");
	}

	@Then("Check Tail button Is Displayed Or Not To Check HomePage")
	public void Check_Tail_button_Is_Displayed_Or_Not() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnContinueTail")));
		ele = driver.findElement(By.id("btnContinueTail"));
		boolean displayed = ele.isDisplayed();
		System.out.println("Tail button displayed is :"+displayed);
	}
	
	@Then("Check Homepage Is Displayed Or Not")
	public void Check_Homepage_Is_Displayed_Or_Not() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_Image1")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_Image1"));
		if(ele.isDisplayed()) {
			System.out.println("Home Page Is Displayed");
		}
		else {
			System.out.println("Page doesnot laded to Homepage");
		}
	}
	
	@Then("Select Valid Tail To Check HomePage")
	public void Select_Valid_Tail_To_Check_Signin() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ddlTail")));
		ele = driver.findElement(By.id("ddlTail"));
		Select sel=new Select(ele);
		sel.selectByVisibleText("N352JM - North Fifth Aviation LLC");
	}
	
	@And("Click Continue button To Check HomePage")
	public void Click_Continue_button_To_Check_HomePage() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnContinueTail")));
		ele1 = driver.findElement(By.id("btnContinueTail"));
		ele1.click();
		Thread.sleep(20000);
	}
	
	
	
	@Then("Click Month Radio button To Check HomePage")
	public void Click_Month_Radio_button_To_Check_HomePage() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_rblReportType_1")));
		ele1 = driver.findElement(By.id("ContentPlaceHolder1_rblReportType_1"));
		ele1.click();
		Thread.sleep(10000);
	}
	
	@And("Select Valid Month In The Caledar To Check HomePage")
	public void Select_Valid_Month_In_The_Caledar_To_Check_HomePage() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(2));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtFromDate")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_txtFromDate"));
		ele.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("calendar1_month_0_0")));
		ele1 = driver.findElement(By.id("calendar1_month_0_0"));
		ele1.click();
	}
	
	@Then("Click Flight Name Dropdown To Check HomePage")
	public void Click_Flight_Name_Dropdown_To_Check_HomePage() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("lblOwnedTail2")));
		ele1 = driver.findElement(By.id("lblOwnedTail2"));
		ele1.click();
	}
	
	@And("Click Close button In View Gallery")
	public void Click_Close_button_In_View_Gallery() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"Div1\"]/div[1]/img[1]")));
		ele = driver.findElement(By.xpath("//*[@id=\"Div1\"]/div[1]/img[1]"));
		ele.click();
	}
	
	@Then("Click Outstanding Balance Dropdown button")
	public void Click_Outstanding_Balance_Dropdown_button() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("lblCurentBalance")));
		ele1 = driver.findElement(By.id("lblCurentBalance"));
		ele1.click();
	}
	
	@And("Click Statement button In Outstanding Balance")
	public void Click_Statement_button_In_Outstanding_Balance() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"kt_header\"]/div[3]/div[2]/div[2]/div[1]/div/label/a")));
		ele = driver.findElement(By.xpath("//*[@id=\"kt_header\"]/div[3]/div[2]/div[2]/div[1]/div/label/a"));
		ele.click();
	}
	
	@Then("Select Valid Date In From and To Calendar")
	public void Select_Valid_Date_In_From_and_To_Calendar() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtFromMonth")));
		//From Calendar
		ele = driver.findElement(By.id("ContentPlaceHolder1_txtFromMonth"));
		ele.click();
		ele1 = driver.findElement(By.id("calendar2_month_2_3"));
		ele1.click();
	}
	
	@And("Click View button To Check HomePage")
	public void Click_View_button_To_Check_HomePage() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ButSubmit")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_ButSubmit"));
		ele.click();
	}
	
	@Then("Click Excel button To Check HomePage")
	public void Click_Excel_button_To_Check_HomePage() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_imbExport")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_imbExport"));
		ele.click();
	}
	
	@Then("Click Total Revenue button To Check HomePage")
	public void Click_Total_Revenue_button_To_Check_HomePage() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_lblTotalRevenue")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_lblTotalRevenue"));
		ele.click();
	}
	
	@And("Click Excel button In Total Revenue")
	public void Click_Excel_button_In_Total_Revenue() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_imbExport")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_imbExport"));
		ele.click();
	}
	
	@And("Click Close button In Total Revenue")
	public void Click_Close_button_In_Total_Revenue() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("imgClose")));
		ele = driver.findElement(By.id("imgClose"));
		ele.click();
	}
	
	@Then("Click Flight Revenue button To Check HomePage")
	public void Click_Flight_Revenue_button_To_Check_HomePage() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_lblFlightRevenue")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_lblFlightRevenue"));
		ele.click();
	}
	
	@And("Click Close button In Flight Revenue")
	public void Click_Close_button_In_Flight_Revenue() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("imgClose")));
		ele = driver.findElement(By.id("imgClose"));
		ele.click();
	}
	
	@Then("Click Total Expense button To Check HomePage")
	public void Click_Total_Expense_button_To_Check_HomePage() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_lblExpense")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_lblExpense"));
		ele.click();
	}
	
	@And("Click Close button In Total Expense")
	public void Click_Close_button_In_Total_Expense() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("imgClose")));
		ele = driver.findElement(By.id("imgClose"));
		ele.click();
	}
	
	@Then("Click Trip Expense button To Check HomePage")
	public void Click_Trip_Expense_button_To_Check_HomePage() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_lblTripExpense")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_lblTripExpense"));
		ele.click();
	}
	
	@And("Click Close button In Trip Expense")
	public void Click_Close_button_In_Trip_Expense() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("imgClose")));
		ele = driver.findElement(By.id("imgClose"));
		ele.click();
	}
	
	@Then("Click Fuel Expense button To Check HomePage")
	public void Click_Fuel_Expense_button_To_Check_HomePage() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_lblFuelExpense")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_lblFuelExpense"));
		ele.click();
	}
	
	@And("Click Close button In Fuel Expense")
	public void Click_Close_button_In_Fuel_Expense() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("imgClose")));
		ele = driver.findElement(By.id("imgClose"));
		ele.click();
	}
	
	@Then("Click Additional Expense button To Check HomePage")
	public void Click_Additional_Expense_button_To_Check_HomePage() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_lblLegalBill")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_lblLegalBill"));
		ele.click();
	}
	
	@And("Click Close button In Additional Expense")
	public void Click_Close_button_In_Additional_Expense() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("imgClose")));
		ele = driver.findElement(By.id("imgClose"));
		ele.click();
	}
	
	@Then("Click Capital Expense button To Check HomePage")
	public void Click_Capital_Expense_button_To_Check_HomePage() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_lblCapitalExpense")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_lblCapitalExpense"));
		ele.click();
	}
	
	@And("Click Close button In Capital Expense")
	public void Click_Close_button_In_Capital_Expense() {
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
		wait.until(ExpectedConditions.elementToBeClickable(By.id("imgClose")));
		ele = driver.findElement(By.id("imgClose"));
		ele.click();
	}
	
	@Then("Click DOC Hour button To Check HomePage")
	public void Click_DOC_Hour_button_To_Check_HomePage() throws InterruptedException {
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
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_lblDOCHour")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_lblDOCHour"));
		ele.click();
		
	}
	
	@And("Click Close button In DOC Hour")
	public void Click_Close_button_In_DOC_Hour() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("imgCloseDoc")));
		ele = driver.findElement(By.id("imgCloseDoc"));
		ele.click();
	}
	
	@Then("Click Fixed Cost Hour button To Check HomePage")
	public void Click_Fixed_Cost_Hour_button_To_Check_HomePage() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_lblFixedHour")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_lblFixedHour"));
		ele.click();
	}
	
	@And("Click Close button In Fixed Cost Hour")
	public void Click_Close_button_In_Fixed_Cost_Hour() throws InterruptedException {
		Thread.sleep(3000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("imgCloseDoc1")));
		ele = driver.findElement(By.id("imgCloseDoc1"));
		ele.click();
	}
	
	@Then("Click Print button To Check HomePage")
	public void Click_Print_button_To_Check_HomePage() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnPrint")));
		ele = driver.findElement(By.id("btnPrint"));
		ele.click();
	}
	
	@Then("Click Dashboard button In Homepage")
	public void Click_Dashboard_button_In_Homepage() {
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
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ancTopSDASH")));
		ele = driver.findElement(By.id("ancTopSDASH"));
		ele.click();
	}
	
	@And("Click Statement button In Financial Data")
	public void Click_Statement_button_In_Financial_Data() {
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
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_lnkSummaryView")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_lnkSummaryView"));
		ele.click();
	}
	
	@Then("Click Close button In Financial Data")
	public void Click_Close_button_In_Financial_Data() {
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
		wait.until(ExpectedConditions.elementToBeClickable(By.id("imgClose")));
		ele = driver.findElement(By.id("imgClose"));
		ele.click();
	}
	
	@And("Click Expand button In Trip Details")
	public void Click_Expand_button_In_Trip_Details() throws InterruptedException {
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
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_lnkbtnCal")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_lnkbtnCal"));
		ele.click();
	}
	
	@Then("Click Close button In Trip Details")
	public void Click_Close_button_In_Trip_Details() throws InterruptedException {
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
		wait.until(ExpectedConditions.elementToBeClickable(By.id("imgClose")));
		ele = driver.findElement(By.id("imgClose"));
		ele.click();
	}
	
	@And("Click Expand button In Fuel Uplift")
	public void Click_Expand_button_In_Fuel_Uplift() throws InterruptedException {
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
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_lnkFuelUplift")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_lnkFuelUplift"));
		ele.click();
	}
	
	@Then("Click Close button In Fuel Uplift")
	public void Click_Close_button_In_Fuel_Uplift() throws InterruptedException {
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
		wait.until(ExpectedConditions.elementToBeClickable(By.id("imgClose")));
		ele = driver.findElement(By.id("imgClose"));
		ele.click();
	}
	
	@Then("Click View button In Request Flight")
	public void Click_View_button_In_Request_Flight(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_gvRequestSummary_imbView_0")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_gvRequestSummary_imbView_0"));
		ele.click();
	}
	
	@And("Click Expand button In Lost Revenue")
	public void Click_Expand_button_In_Lost_Revenue() throws InterruptedException {
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
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_lnkTripDenials")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_lnkTripDenials"));
		ele.click();
	}
	
	@Then("Click Close button In Lost Revenue")
	public void Click_Close_button_In_Lost_Revenue() throws InterruptedException {
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
		wait.until(ExpectedConditions.elementToBeClickable(By.id("imgClose")));
		ele = driver.findElement(By.id("imgClose"));
		ele.click();
	}
	
	@Then("Click Calendar button In Homepage")
	public void Click_Calendar_button_In_Homepage() throws InterruptedException {
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
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ancTopcalender")));
		ele = driver.findElement(By.id("ancTopcalender"));
		ele.click();
	}
	
	@And("Click Next Month button In Calendar View")
	public void Click_Next_Month_button_In_Calendar_View() throws InterruptedException {
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
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_imgNext1")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_imgNext1"));
		ele.click();
		Thread.sleep(2000);
		ele1 = driver.findElement(By.id("ContentPlaceHolder1_imgNext"));
		ele1.click();
	}
	
	@Then("Click Previous Month button In Calendar View")
	public void Click_Previous_Month_button_In_Calendar_View() throws InterruptedException {
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
		Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_imgPrev")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_imgPrev"));
		ele.click();
		Thread.sleep(4000);
		ele1 = driver.findElement(By.id("ContentPlaceHolder1_imgPrev1"));
		ele1.click();
	}
	
	@And("Click Today button In Calendar View")
	public void Click_Today_button_In_Calendar_View() throws InterruptedException {
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
		Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_imgToday1")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_imgToday1"));
		ele.click();
	}
	
	@And("Click Book Owner Flight button In Calendar View")
	public void Click_Book_Owner_Flight_button_In_Calendar_View() throws InterruptedException {
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
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnHold")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_btnHold"));
		ele.click();
	}
	
	@Then("Click Close button In Book Owner Flight")
	public void Click_Close_button_In_Book_Owner_Flight() throws InterruptedException {
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
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnCFClose")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_btnCFClose"));
		ele.click();
	}
	
	@Then("Click Add Leg button In Book Owner Flight")
	public void Click_Add_Leg_button_In_Book_Owner_Flight() throws InterruptedException {
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
		Thread.sleep(2000);
		//WebElement FrameElement=driver.findElement(By.id("ContentPlaceHolder1_frmCFProgram"));
		driver.switchTo().frame("ContentPlaceHolder1_frmCFProgram");
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(2));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_btnAddToList")));
		ele= driver.findElement(By.id("ContentPlaceHolder1_btnAddToList"));
		ele.click();
		try {
			Alert alert = driver.switchTo().alert();
			String text = alert.getText();
			System.out.println("Alert Message is : "+text);
			alert.accept();
		}
		catch(NoAlertPresentException e) {
			System.out.println("No Alert Message Is Displayed");
		}
	}
	
	@And("Click MX button In Calendar View")
	public void Click_MX_button_In_Calendar_View() throws InterruptedException {
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
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_lblFirstMonth")));
		ele= driver.findElement(By.id("ContentPlaceHolder1_imgPrev1"));
		ele.click();
		Thread.sleep(5000);
		ele1= driver.findElement(By.id("ContentPlaceHolder1_repTest_rptInnerDates_2_lnkCHATOWN_0"));
		ele1.click();
	}
	
	@Then("Click Close button In Day Activity")
	public void Click_Close_button_In_Day_Activity() throws InterruptedException {
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
		wait.until(ExpectedConditions.elementToBeClickable(By.id("imgClose")));
		ele = driver.findElement(By.id("imgClose"));
		ele.click();
	}
	
	@And("Click Main button In Calendar View")
	public void Click_Main_button_In_Calendar_View() throws InterruptedException {
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
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_lblFirstMonth")));
		ele= driver.findElement(By.id("ContentPlaceHolder1_imgPrev1"));
		ele.click();
		Thread.sleep(5000);
		ele1= driver.findElement(By.id("ContentPlaceHolder1_repTest_rptInnerDates_6_lnkCHATOWN_1"));
		ele1.click();
	}
	
	@Then("Click Live Hours button In Homepage")
	public void Click_Live_Hours_button_In_Homepage() throws InterruptedException {
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
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ancTopLVHRS")));
		ele = driver.findElement(By.id("ancTopLVHRS"));
		ele.click();
	}
	
	@Then("Click Add request button In Request Flight")
	public void Click_Add_request_button_In_Request_Flight() throws InterruptedException {
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
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnAddNewRequest")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_btnAddNewRequest"));
		ele.click();
	}
	
	@And("Click Excel button In Live Hours")
	public void Click_Excel_button_In_Live_sHours() throws InterruptedException {
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
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_imbExport")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_imbExport"));
		ele.click();
	}
	
	@And("Click Calendar button In Live Hours")
	public void Click_Calendar_button_In_Live_sHours() throws InterruptedException {
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
		Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_lblLiveHrsLabel")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_lblLiveHrsLabel"));
		ele.click();
	}
	
	@Then("Click First Option In Live Hours")
	public void Click_First_Option_In_Live_Hours() throws InterruptedException {
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
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_lnkToday")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_lnkToday"));
		ele.click();
	}
	
	@And("Click Second Option In Live Hours")
	public void Click_Second_Option_In_Live_Hours() throws InterruptedException {
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
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_lnkTomorrow")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_lnkTomorrow"));
		ele.click();
	}
	
	@Then("Click Third Option In Live Hours")
	public void Click_Third_Option_In_Live_Hours() throws InterruptedException {
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
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_lnkNextWeek")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_lnkNextWeek"));
		ele.click();
	}
	
	@And("Click Fourth Option In Live Hours")
	public void Click_Fourth_Option_In_Live_Hours() throws InterruptedException {
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
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_lnkCurrentMonth")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_lnkCurrentMonth"));
		ele.click();
	}
	
	@Then("Click Last Option In Live Hours")
	public void Click_Last_Option_In_Live_Hours() throws InterruptedException {
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
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_lnkCustomMonth")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_lnkCustomMonth"));
		ele.click();
	}
	
	@And("Select Valid From and To date In Live Hours")
	public void Select_Valid_From_and_To_date_In_Live_Hours() throws InterruptedException {
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
		Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ContentPlaceHolder1_calRangeFromMonth\"]/tbody/tr[3]/td[1]/a")));
		ele = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_calRangeFromMonth\"]/tbody/tr[3]/td[1]/a"));
		ele.click();
		Thread.sleep(2000);
		ele1 = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_calRangeToMonth\"]/tbody/tr[8]/td[7]/a"));
		ele1.click();
	}
	
	@Then("Click Cancel button In Live Hours")
	public void Click_Cancel_button_In_Live_Hours() throws InterruptedException {
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
		Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ContentPlaceHolder1_dvdaterangepicker\"]/div[3]/div/button")));
		ele = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_dvdaterangepicker\"]/div[3]/div/button"));
		ele.click();
	}
	
	@Then("Click Apply button In Live Hours")
	public void Click_Apply_button_In_Live_Hours() throws InterruptedException {
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
		Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnApply")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_btnApply"));
		ele.click();
	}
	
	@Then("Click Home button To Check HomePage")
	public void Click_Home_button_To_Check_HomePage() throws InterruptedException {
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
		Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/form/div[4]/div/div[1]/div[2]/div/ul/li[1]/a/i[1]")));
		ele = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div[2]/div/ul/li[1]/a/i[1]"));
		ele.click();
	}
	
	@And("Click Request Flight button In Home button")
	public void Click_Request_Flight_button_In_Home_button() throws InterruptedException {
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
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/form/div[4]/div/div[1]/div[2]/div/ul/li[1]/div/ul/li[5]/a/span")));
		ele = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div[2]/div/ul/li[1]/div/ul/li[5]/a/span"));
		ele.click();
	}
	
	@Then("Click Add Leg button In Request Flight")
	public void Click_Add_Leg_button_In_Request_Flight() throws InterruptedException {
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
		Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnAddToList")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_btnAddToList"));
		ele.click();
		Thread.sleep(2000);
		try {
			Alert alert = driver.switchTo().alert();
			String text = alert.getText();
			System.out.println("Alert Message is : "+text);
			alert.accept();
			}
		catch (NoAlertPresentException e) {
			System.out.println("No Alert Message is displayed");
		}
	}
	
	@Then("Click Back button In Request Flight")
	public void Click_Back_button_In_Request_Flight() throws InterruptedException {
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
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnViewRequest")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_btnViewRequest"));
		ele.click();
	}
	
	@Then("Enter Valid Details In Add Leg Tab")
	public void Enter_Valid_Details_In_Add_Leg_Tab() throws InterruptedException {
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
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnViewRequest")));
		//Enter PAX
		ele = driver.findElement(By.id("ContentPlaceHolder1_txtPAX"));
		ele.sendKeys("10");
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtDate")));
		//Select depature date
		ele1 = driver.findElement(By.id("ContentPlaceHolder1_txtDate"));
		ele1.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_CalendarExtender3_day_2_5")));
		ele2 = driver.findElement(By.id("ContentPlaceHolder1_CalendarExtender3_day_2_5"));
		ele2.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ddlSTHours")));
		//Select start time
		ele3 = driver.findElement(By.id("ContentPlaceHolder1_ddlSTHours"));
		Select sel=new Select(ele3);
		sel.selectByIndex(3);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ddlSTMinutes")));
		ele4 = driver.findElement(By.id("ContentPlaceHolder1_ddlSTMinutes"));
		Select sel1=new Select(ele4);
		sel.selectByIndex(3);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtStartAirport")));
		//Enter Departure airport
		ele5 = driver.findElement(By.id("ContentPlaceHolder1_txtStartAirport"));
		ele5.sendKeys("Test -  - TEST");
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtEndAirport")));
		//Enter Arrival Airport
		ele6 = driver.findElement(By.id("ContentPlaceHolder1_txtEndAirport"));
		ele6.sendKeys("Test -  - TEST");
		Thread.sleep(2000);
		ele6.click();
	}
	
	@And("Click Delete button In Request Flight")
	public void Click_Delete_button_In_Request_Flight() throws InterruptedException {
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
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_gvLegDetails_imbDelete_0")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_gvLegDetails_imbDelete_0"));
		ele.click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println("Alert Message Displayed Like : "+text);
		alert.dismiss();
		ele.click();
		alert.accept();
	}
	
	@And("Enter Valid Details In Notes")
	public void Enter_Valid_Notes_In_Add_Leg_Tab() throws InterruptedException {
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
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtNotes")));
		//Enter PAX
		ele = driver.findElement(By.id("ContentPlaceHolder1_txtNotes"));
		ele.sendKeys("Test");
	}
	
	@Then("Click Clear button In Add Leg Tab")
	public void Click_Clear_button_In_Add_Leg_Tab() throws InterruptedException {
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
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnClear")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_btnClear"));
		ele.click();
	}
	
	@Then("Click Calendar View button In Request Flight")
	public void Click_Calendar_View_button_In_Request_Flight() throws InterruptedException {
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
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnCalnderView")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_btnCalnderView"));
		ele.click();
	}
	
	
}

