package POM_CLASS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Auto_Pom_Class {
	WebDriver driver; //Declard globally for Actions Class
	
	//Declaration
		@FindBy(xpath="//input[@name='firstname']") private WebElement UserName;
		@FindBy(xpath="//input[@name='lastname']") private WebElement LastName;
		@FindBy(xpath="//input[@name='reg_email__']") private WebElement MobileNo;
		
		@FindBy(xpath="//input[@name='reg_passwd__']") private WebElement RegPassword;
		
		@FindBy(xpath="(//input[@type='radio'])[2]") private WebElement Gender;
	//Day, Month, Year
		@FindBy(xpath="//select[@id='day']") private WebElement Day;
		@FindBy(xpath="//select[@id='month']") private WebElement Month;
		@FindBy(xpath="//select[@id='year']") private WebElement Year;
		
	//Initilization
		Auto_Pom_Class(WebDriver Dri){
			driver = Dri;
			 PageFactory.initElements(Dri, this);
		 }

	 //Usage
		 public void enterUserName(String name) {
			 UserName.sendKeys(name);
		 }
		 public void enterLastName(String lastname) {
			 LastName.sendKeys(lastname);
		 }
		 public void entermobileno(String mblno) {
			 MobileNo.sendKeys(mblno);
		 }
		 public void enterPassword(String password) {
			 RegPassword.sendKeys(password);
		 }
		 public void selectGender() {
			 Gender.click();
		 }
		 
	//Day, Month, Year
		 public void selectDay(int day) {
			Select s1 = new Select(Day);
			s1.selectByIndex(day);
		 }
		 public void selectMonth(String month) {
			 Select s2= new Select(Month);
			 s2.selectByVisibleText(month);
		 }
		 public void selectYear(String year) {
			 Select s3 = new Select(Year);
			 s3.selectByValue(year);
		 }
		 
		 
		 
}
