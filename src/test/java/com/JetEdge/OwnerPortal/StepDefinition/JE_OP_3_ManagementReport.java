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

public class JE_OP_3_ManagementReport {

	public WebDriver driver;
	public WebElement ele,ele1,ele2,ele3,ele4,ele5,ele6,ele7,ele8,ele9;
	public WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(5));


	@Given("To Check MGReport User is navigating to JetEdge URL is {string}")
	public void user_is_navigating_to_jet_edge_Signin_url_is(String URL) {
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--headless=new");
		driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get(URL);
	}

	@When("To Check MGReport User Enter Valid username and Valid password are {string} and {string}")
	public void username_and_password_are_and(String UserName, String Password) {
		driver.findElement(By.id("txtUserName")).sendKeys(UserName);
		driver.findElement(By.id("txtPassword")).sendKeys(Password);
		System.out.println("Username and password entered");
	}

	@And("click the login button To Check MGReport")
	public void click_the_SignIn_button() {
		driver.findElement(By.id("ibLogin")).click();
		System.out.println("login button clicked");
	}

	@And("close the MGReport Page")
	public void close_the_Signin_Page() {
		driver.quit();
		System.out.println("Page is closed");
	}

	@Then("Check Tail button Is Displayed Or Not To Check MGReport")
	public void Check_Tail_button_Is_Displayed_Or_Not() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnContinueTail")));
		ele = driver.findElement(By.id("btnContinueTail"));
		boolean displayed = ele.isDisplayed();
		System.out.println("Tail button displayed is :"+displayed);
	}
	
	
	@Then("Select Valid Tail To Check MGReport")
	public void Select_Valid_Tail_To_Check_MGReport() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ddlTail")));
		ele = driver.findElement(By.id("ddlTail"));
		Select sel=new Select(ele);
		sel.selectByVisibleText("N352JM - North Fifth Aviation LLC");
	}
	
	@And("Click Continue button To Check MGReport")
	public void Click_Continue_button_To_Check_MGReport() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnContinueTail")));
		ele1 = driver.findElement(By.id("btnContinueTail"));
		ele1.click();
		Thread.sleep(25000);
	}
	
	@Then("Click MSReport In To Check MGReport")
	public void Click_MSReport_In_To_Check_MGReport() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"liMainMS\"]/a/i[1]")));
		ele = driver.findElement(By.xpath("//*[@id=\"liMainMS\"]/a/i[1]"));
		ele.click();
		ele1 = driver.findElement(By.xpath("//*[@id=\"ancDETV\"]/span"));
		ele1.click();
	}
	
	@And("Select Valid Month To Check MGReport")
	public void Select_Valid_Month_To_Check_MGReport() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtFromDate")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_txtFromDate"));
		ele.click();
		ele1 = driver.findElement(By.id("calendar1_month_0_0"));
		ele1.click();
	}
	
	@Then("Select First Report Type To Check MGReport")
	public void Select_First_Report_Type_To_Check_MGReport() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ddlReportBy")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_ddlReportBy"));
		Select sel=new Select(ele);
		sel.selectByIndex(0);
	}
	
	@Then("Select Second Report Type To Check MGReport")
	public void Select_Second_Report_Type_To_Check_MGReport() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ddlReportBy")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_ddlReportBy"));
		Select sel=new Select(ele);
		sel.selectByIndex(1);
	}
	
	@And("Click View button To Check MGReport")
	public void Click_View_button_To_Check_MGReport() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_Button1")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_Button1"));
		ele.click();
		Thread.sleep(5000);
	}
	
	@And("Click Excel button To Check MGReport")
	public void Click_Excel_button_To_Check_MGReport() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_imbExport")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_imbExport"));
		ele.click();
	}
	
	@Then("Click Summary Tab To Check MGReport")
	public void Click_Summary_Tab_To_Check_MGReport() throws InterruptedException {
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
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_ancSummary")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_ancSummary"));
		ele.click();
	}
	
	@Then("Click Monthly Expenses Tab To Check MGReport")
	public void Click_Monthly_Expenses_Tab_To_Check_MGReport() throws InterruptedException {
		Thread.sleep(10000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_ancMonthlyExpenses")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_ancMonthlyExpenses"));
		ele.click();
	}
	
	@And("Click Management Fee Tab To Check MGReport")
	public void Click_Management_Fee_Tab_To_Check_MGReport() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"dvExhibitA\"]/div/div/div[1]")));
		ele = driver.findElement(By.xpath("//*[@id=\"dvExhibitA\"]/div/div/div[1]"));
		ele.click();
	}
	
	@And("Click Trip Fuel Expense Tab To Check MGReport")
	public void Click_Trip_Fuel_Expense_Tab_To_Check_MGReport() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_lblOwnerglName")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_lblOwnerglName"));
		ele.click();
	}
	
	@And("Click Aircraft Supplies Tab To Check MGReport")
	public void Click_Aircraft_Supplies_Tab_To_Check_MGReport() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"dvExhibitD\"]/div/div/div[1]")));
		ele = driver.findElement(By.xpath("//*[@id=\"dvExhibitD\"]/div/div/div[1]"));
		ele.click();
	}
	
	@And("Click Aircraft Maintenance Tab To Check MGReport")
	public void Click_Aircraft_Maintenance_Tab_To_Check_MGReport() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"dvExhibitE\"]/div/div/div[1]")));
		ele = driver.findElement(By.xpath("//*[@id=\"dvExhibitE\"]/div/div/div[1]"));
		ele.click();
	}
	
	@Then("Click Attachement button In Aircraft Maintenance")
	public void Click_Attachement_button_In_Aircraft_Maintenance() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ContentPlaceHolder1_gvExplicitC_imbAttach_0\"]/i")));
		ele = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_gvExplicitC_imbAttach_0\"]/i"));
		ele.click();
	}
	
	@And("Click Close button In Attachement In Aircraft Maintenance")
	public void Click_Close_button_In_Attachement_In_Aircraft_Maintenance() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("imgclose")));
		ele = driver.findElement(By.id("imgclose"));
		ele.click();
	}
	
	@And("Click Aircraft Maintenance Programs Tab To Check MGReport")
	public void Click_Aircraft_Maintenance_Programs_Tab_To_Check_MGReport() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"dvExhibitF\"]/div/div/div[1]")));
		ele = driver.findElement(By.xpath("//*[@id=\"dvExhibitF\"]/div/div/div[1]"));
		ele.click();
	}
	
	@Then("Click Attachement button In Aircraft Maintenance Programs")
	public void Click_Attachement_button_In_Aircraft_Maintenance_Programs() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ContentPlaceHolder1_gvExplicitD_imbAttach_0\"]/i")));
		ele = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_gvExplicitD_imbAttach_0\"]/i"));
		ele.click();
	}
	
	@And("Click Close button In Attachement In Aircraft Maintenance Programs")
	public void Click_Close_button_In_Attachement_In_Aircraft_Maintenance_Programs() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("imgclose")));
		ele = driver.findElement(By.id("imgclose"));
		ele.click();
	}
	
	@And("Click Dues and Subscription Tab To Check MGReport")
	public void Click_Dues_and_Subscription_Tab_To_Check_MGReport() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"dvExhibitG\"]/div/div/div[1]")));
		ele = driver.findElement(By.xpath("//*[@id=\"dvExhibitG\"]/div/div/div[1]"));
		ele.click();
	}
	
	@And("Click Aircraft Storage Tab To Check MGReport")
	public void Click_Aircraft_Storage_Tab_To_Check_MGReport() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"dvExhibitG\"]/div/div/div[1]")));
		ele = driver.findElement(By.xpath("//*[@id=\"dvExhibitG\"]/div/div/div[1]"));
		ele.click();
	}
	
	@And("Click Communication Service Tab To Check MGReport")
	public void Click_Communication_Service_Tab_To_Check_MGReport() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"dvExhibitI\"]/div/div/div[1]")));
		ele = driver.findElement(By.xpath("//*[@id=\"dvExhibitI\"]/div/div/div[1]"));
		ele.click();
	}
	
	@And("Click Aircraft Crew Services Tab To Check MGReport")
	public void Click_Aircraft_Crew_Service_Tab_To_Check_MGReport() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"dvExhibitJ\"]/div/div/div[1]")));
		ele = driver.findElement(By.xpath("//*[@id=\"dvExhibitJ\"]/div/div/div[1]"));
		ele.click();
	}
	
	@And("Click Supplemental Crew Services Tab To Check MGReport")
	public void Click_Supplemental_Crew_Service_Tab_To_Check_MGReport() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"dvExhibitK\"]/div/div/div[1]")));
		ele = driver.findElement(By.xpath("//*[@id=\"dvExhibitK\"]/div/div/div[1]"));
		ele.click();
	}
	
	@And("Click Crew Benefits Tab To Check MGReport")
	public void Click_Crew_Benefits_Tab_To_Check_MGReport() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"dvExhibitL\"]/div/div/div[1]")));
		ele = driver.findElement(By.xpath("//*[@id=\"dvExhibitL\"]/div/div/div[1]"));
		ele.click();
	}
	
	@And("Click Cabin Attendant Tab To Check MGReport")
	public void Click_Cabin_Attendant_Tab_To_Check_MGReport() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"dvExhibitM\"]/div/div/div[1]")));
		ele = driver.findElement(By.xpath("//*[@id=\"dvExhibitM\"]/div/div/div[1]"));
		ele.click();
	}
	
	@And("Click Aircraft Miscellaneous Expenses Tab To Check MGReport")
	public void Click_Aircraft_Miscellaneous_Expenses_Tab_To_Check_MGReport() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"dvExhibitN\"]/div/div/div[1]")));
		ele = driver.findElement(By.xpath("//*[@id=\"dvExhibitN\"]/div/div/div[1]"));
		ele.click();
	}
	
	@And("Click Owner Trip Expenses Tab To Check MGReport")
	public void Click_Owner_Trip_Expenses_Tab_To_Check_MGReport() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"dvExhibitO\"]/div/div/div[1]")));
		ele = driver.findElement(By.xpath("//*[@id=\"dvExhibitO\"]/div/div/div[1]"));
		ele.click();
	}
	
	@And("Click Aircraft Cleaning Expenses Tab To Check MGReport")
	public void Click_Aircraft_Cleaning_Expenses_Tab_To_Check_MGReport() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"dvExhibitP\"]/div/div/div[1]")));
		ele = driver.findElement(By.xpath("//*[@id=\"dvExhibitP\"]/div/div/div[1]"));
		ele.click();
	}
	
	@And("Click Aircraft Training Expenses Tab To Check MGReport")
	public void Click_Aircraft_Training_Expenses_Tab_To_Check_MGReport() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"dvExhibitQ\"]/div/div/div[1]")));
		ele = driver.findElement(By.xpath("//*[@id=\"dvExhibitQ\"]/div/div/div[1]"));
		ele.click();
	}
	
	@And("Click Aircraft Insurance Tab To Check MGReport")
	public void Click_Aircraft_Insurance_Tab_To_Check_MGReport() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"dvExhibitR\"]/div/div/div[1]")));
		ele = driver.findElement(By.xpath("//*[@id=\"dvExhibitR\"]/div/div/div[1]"));
		ele.click();
	}
	
	@And("Click OCC Expense Tab To Check MGReport")
	public void Click_OCC_Expense_Tab_To_Check_MGReport() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"dvOCCMargin\"]/div/div/div[1]")));
		ele = driver.findElement(By.xpath("//*[@id=\"dvOCCMargin\"]/div/div/div[1]"));
		ele.click();
	}
	
	@And("Click Startup and Capital Expenses Tab To Check MGReport")
	public void Click_Startup_and_Capital_Expenses_Tab_To_Check_MGReport() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"headingOne5\"]/div/div/div[1]")));
		ele = driver.findElement(By.xpath("//*[@id=\"headingOne5\"]/div/div/div[1]"));
		ele.click();
	}
	
	@Then("Click Actual Flight Activity Tab To Check MGReport")
	public void Click_Actual_Flight_Activity_Tab_To_Check_MGReport() throws InterruptedException {
		Thread.sleep(10000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ancFlightActivity")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_ancFlightActivity"));
		ele.click();
	}
	
	@Then("Click Download Report button To Check MGReport")
	public void Click_Download_Report_button_To_Check_MGReport() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"liMainMS\"]/a/i[1]")));
		ele = driver.findElement(By.xpath("//*[@id=\"liMainMS\"]/a/i[1]"));
		ele.click();
		ele1 = driver.findElement(By.xpath("//*[@id=\"ancPRNTREP\"]/span"));
		ele1.click();
	}
	
	@And("Select Valid Month In Download Report")
	public void Select_Valid_Month_In_Download_Report() {
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
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtYear")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_txtYear"));
		ele.click();
		ele1 = driver.findElement(By.id("yp_year_0_3"));
		ele1.click();
	}
	
	@Then("Click Download button In Download Report")
	public void Click_Download_button_In_Download_Report() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_gvTailDetails_imbView_0")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_gvTailDetails_imbView_0"));
		ele.click();
	}
	
	@And("Click Close button In MS Report Statement")
	public void Click_Close_button_In_MS_Report_Statement() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("imgCloseMarketMx")));
		ele = driver.findElement(By.id("imgCloseMarketMx"));
		ele.click();
	}
	
	@And("Click Download button In MS Report Statement")
	public void Click_Download_button_In_MS_Report_Statement() throws InterruptedException {
		Thread.sleep(5000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_gvMultipMS_imbView_0")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_gvMultipMS_imbView_0"));
		ele.click();
	}
	
	@Then("Click Statement button To Check MGReport")
	public void Click_Statement_button_To_Check_MGReport() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"liMainMS\"]/a/i[1]")));
		ele = driver.findElement(By.xpath("//*[@id=\"liMainMS\"]/a/i[1]"));
		ele.click();
		ele1 = driver.findElement(By.xpath("//*[@id=\"ancSUMV\"]/span"));
		ele1.click();
	}
	
	@Then("Click OSA View button To Check MGReport")
	public void Click_OSA_View_button_To_Check_MGReport() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"liMainMS\"]/a/i[1]")));
		ele = driver.findElement(By.xpath("//*[@id=\"liMainMS\"]/a/i[1]"));
		ele.click();
		ele1 = driver.findElement(By.xpath("//*[@id=\"ancOSAVIEW\"]/span"));
		ele1.click();
	}
	
	@And("Select Valid Month In Calendar In OSA View")
	public void Select_Valid_Month_In_Calendar_In_OSA_View() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtFromDate")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_txtFromDate"));
		//ele.click();
	}
	
	@Then("Click Excel button In OSA View")
	public void Click_Excel_button_In_OSA_View() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_imbExport")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_imbExport"));
		ele.click();
	}
	
	@And("Select Valid From and TO date In Statement")
	public void Select_Valid_From_and_To_date_In_Statement() {
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
		ele1 = driver.findElement(By.id("calendar2_month_2_1"));
		ele1.click();
		//To Calendar
		ele1 = driver.findElement(By.id("ContentPlaceHolder1_txtToMonth"));
		ele1.click();
		ele1 = driver.findElement(By.id("calendar1_month_0_2"));
		ele1.click();
	}
	
	@Then("Click View button In Statement")
	public void Click_View_button_In_Statement() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ButSubmit")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_ButSubmit"));
		ele.click();
	}
	
	@And("Click Excel button In Statement")
	public void Click_Excel_button_In_Statement() throws InterruptedException {
		Thread.sleep(3000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_imbExport")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_imbExport"));
		ele.click();
	}
}

