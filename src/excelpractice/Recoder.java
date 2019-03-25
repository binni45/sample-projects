package excelpractice;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;
public class Recoder {
		
		static String tr;
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","D:\\chrome\\chromedriver.exe");
			/*WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();*/
			
			/*driver.get("https://www.irctc.co.in/nget/train-search");*/
			File file = new File("D://Image//test.png");
			
			//C:/Users/admin/Downloads/testImage.png
			Tesseract te = new Tesseract();
			//System.setProperty("jna.library.path", "E://Tess4j//Tess4J//tessdata");
			te.setDatapath("D:\\Tess\\Tess4J\\Tess4J\\tessdata");
			try{
				
				tr = te.doOCR(file);
				System.out.println(tr);
				String str=tr;
				String[] str1=str.split("Type");
				String text1 = str1[0];
				String text2 = str1[1];
				System.out.println(text1+"----"+text2);
				
				String text3=text2.split("In")[0].trim();
				System.out.println(text3);
				
				String finaltext = text3.replace("+", "").replace("", "");
				System.out.println(finaltext);
			}
			catch(TesseractException e){
				System.out.println(e.getMessage());
			}
			
			if(tr.contains("Create a Youtube metadata crawler using Java")){
				System.out.println("Pass");
			}
			else{
				System.out.println("Fail");
			}
		}
		

	}


