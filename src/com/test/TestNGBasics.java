package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {

	
	@BeforeSuite	
	public void setup() {
		
		System.out.println("Setup system property for chrome");
	} 
	@BeforeTest
	public void userlogin() {
		
		System.out.println("login to app");
	} 
	
	@BeforeClass
	public void launchBrowser() {
		
		System.out.println("launch browser");
	} 
	@BeforeMethod
	public void hitURL() {
		
		System.out.println("hit URL");
	} 
	
	@Test
	public void googleTitleTest() {
		
		System.out.println("Google title test");
	} 
	@Test
	public void searchTest() {
		
		System.out.println("Google search test");
	} 
	
	
	@AfterMethod
	public void logout() {
		
		System.out.println("logout from the app");
	} 
	@AfterClass
	public void DeleteCookies() {
		
		System.out.println("logout from the app");
	} 
	@AfterTest
	public void CloseBrowser() {
		
		System.out.println("logout from the app");
	} 
	
}
