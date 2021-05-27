package com.cg.stepdef;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef {

	WebDriver driver;
	ChromeOptions options;
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
	    System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
	    driver = new ChromeDriver();
	    options = new ChromeOptions();
	    options.addArguments("--disable-notifications");
	    driver.get("https://www.shoppersstop.com/#login");
	    driver.manage().window().maximize();
	}
	@When("user enters {string} & {string}")
	public void user_enters_un_pw(String str1, String str2) {
	   driver.findElement(By.xpath("//*[@id=\"j_username\"]")).sendKeys(str1);
	   driver.findElement(By.xpath("//*[@id=\"j_password\"]")).sendKeys(str2); 
	}
		
	@When("user clicks on submit btn")
	public void user_clicks_on_submit_btn() {
	    //driver.findElement(By.xpath("//*[@id=\"loginajax\"]")).submit();
	}
	@Then("user is on home page")
	public void user_is_on_home_page() {
	    Assert.assertTrue(driver.getTitle().contains("Shopping India"));
	}
	
	@Then("user is on same page")
	public void user_is_on_same_page() {
	    Assert.assertTrue(driver.getTitle().contains("Shopping India"));
	}

	
	@Given("user is on registration page")
	public void user_is_on_registration_page() {
	   
	}
	@When("user enters details")
	public void user_enters_details(io.cucumber.datatable.DataTable dataTable) {
	    Map<String, String> map = dataTable.asMap(String.class, String.class);
	    System.out.println(map.get("username"));
	    System.out.println(map.get("password"));
	    System.out.println(map.get("cpassword"));
	    System.out.println(map.get("mob"));
	    System.out.println(map.get("comp"));
	}
	@Then("user is successfully registered")
	public void user_is_successfully_registered() {
	    
	}

}
