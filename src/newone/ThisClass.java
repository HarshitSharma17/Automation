package newone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThisClass {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\harsh\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
    	driver.get("http://www.practiceselenium.com/");
        driver.findElement(By.xpath("//a[@id='wsb-button-00000000-0000-0000-0000-000450914890']//span[@class='button-content wsb-button-content']")).click();
        driver.findElement(By.xpath("//a[@id='wsb-button-00000000-0000-0000-0000-000451955160']//span[@class='button-content wsb-button-content']")).click();
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("harshit123@gmal.com");
        driver.findElement(By.xpath("//input[@id='name']")).sendKeys("harshit");
        driver.findElement(By.xpath("//textarea[@id='address']")).sendKeys("kolkata India");
        driver.findElement(By.xpath("(//select[@id='card_type']/option)[2]")).click();
        driver.findElement(By.xpath("//input[@id='card_number']")).sendKeys("4591789478947894");
        driver.findElement(By.xpath("//input[@id='cardholder_name']")).sendKeys("harshit sharma");
        driver.findElement(By.xpath("//input[@id='verification_code']")).sendKeys("123");
        driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
        
        Thread.sleep(4000);
        driver.close();

	}

}
