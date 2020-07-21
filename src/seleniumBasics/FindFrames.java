package seleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindFrames {

	public static void main(String[] args) throws Exception {
		
		String path = "C:\\UL\\Automation\\selenium\\chromeDriver79\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.guru99.com/handling-iframes-selenium.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		int size = driver.findElements(By.tagName("iFrame")).size();
		System.out.println(size);
		for(int i=0; i<size; i++){
			System.out.println(i);
		    driver.switchTo().frame(i);
		    Thread.sleep(3000);
		    int total=driver.findElements(By.xpath("html/body/a/img")).size();
		    if(total==1) 
		    	break;
		}
	    driver.findElement(By.xpath("html/body/a/img")).click();
	    driver.switchTo().defaultContent();
	}

}
