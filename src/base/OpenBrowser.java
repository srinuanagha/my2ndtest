package base;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OpenBrowser {
	
	
	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://facebook.com");
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(3000);
		
//		WebElement days=driver.findElement(By.id("day"));
//		Select sc = new Select(days);
//		List<WebElement> dayslist=sc.getOptions();
		
	//	System.out.println(dayslist);
		
		//int daycount= sc.getSize();
		
		//for(WebElement daysnames :dayslist ) {
			
		//	System.out.println(daysnames.getText());
//			
//			if(daysnames.getText().equals("14")) {
//				
//				daysnames.click();
//				
//				Thread.sleep(3000);
//			}
//		}
		
		
		List<WebElement>  rbutton = driver.findElements(By.name("sex"));
		System.out.println(rbutton.size());
		
		for(int i=0 ; i<rbutton.size();i++) {
			
			String gen= rbutton.get(i).getAttribute("value");
			System.out.println(gen);
			
			//.out.println(gname.getAttribute("value"));
			
		if(gen.equals("1")) {
	
			 rbutton.get(i).click();
			 break;
			
		}
	
		}

	}
		}
