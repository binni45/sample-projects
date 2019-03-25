package excelpractice;
import java.io.File;
import java.io.FileInputStream;

import java.io.FileOutputStream;
 
import org.apache.poi.xssf.usermodel.XSSFSheet;
 
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Practics5 {
	 public static void main(String []args){
	 
	  try {
	 
	  File src=new File("D:\\Sheet1.xlsx");
	  FileInputStream fis=new FileInputStream(src);
	 
	   XSSFWorkbook wb=new XSSFWorkbook(fis);
	    XSSFSheet sh1= wb.getSheetAt(0);
	 System.out.println(sh1.getRow(0).getCell(1).getStringCellValue());
	 
	 System.out.println(sh1.getRow(0).getCell(2).getStringCellValue());
	 System.out.println(sh1.getRow(1).getCell(3).getStringCellValue());
	 
	 System.out.println(sh1.getRow(1).getCell(1).getStringCellValue());
	 
	 System.out.println(sh1.getRow(2).getCell(0).getStringCellValue());
	 
	 System.out.println(sh1.getRow(2).getCell(1).getStringCellValue());
	 sh1.getRow(0).createCell(2).setCellValue("");
	 
	 sh1.getRow(1).createCell(2).setCellValue("");
	 
	 sh1.getRow(2).createCell(2).setCellValue("");
	  FileOutputStream fout=new FileOutputStream(new File("D:\\Sheet1.xlsx"));
	   wb.write(fout);
	   fout.close();
	 
	  } catch (Exception e) {
	 
	   System.out.println(e.getMessage());
	 
	  }
	 
	 }
	 
	}


