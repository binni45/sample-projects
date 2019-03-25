package excelpractice;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Practics3
{
	 XSSFWorkbook workbook;
	 XSSFSheet sheet;
	 XSSFRow row;
	 XSSFCell cell;
	 FileInputStream fileinputstream; // use needs to pass the file into workbook class.
	 String path;
	 
	 public Practics3(String path) throws IOException {
	  this.path=path;
	  fileinputstream = new FileInputStream(path);
	  workbook = new XSSFWorkbook(fileinputstream);
	 }
	 public String readingData(String sheetName, int columnNo, int rowNo) throws IOException{
	  
	  fileinputstream = new FileInputStream("D://Suite.xlsx");
	  workbook = new XSSFWorkbook(fileinputstream);
	  sheet = workbook.getSheet(sheetName);
	  System.out.println(sheet.getSheetName());
	  row = sheet.getRow(rowNo);
	  System.out.println(row.getCell(columnNo));
	  
	  for(int i=0; i<sheet.getLastRowNum(); i++){
	   
	          row=sheet.getRow(i);
	   
	   for(int j=0; j<row.getLastCellNum(); j++){
	    
	    System.out.println(row.getCell(columnNo).toString());
	   }
	  }
	  return row.getCell(columnNo).toString();
	  
	 }
	 
	 public void readingAllData(String sheetName){
	  
	  sheet = workbook.getSheet(sheetName);
	  //System.out.println(sheet.getSheetName());
	  row = sheet.getRow(0);
	  //System.out.println(row.getCell(columnNo));
	  
	  for(int i=0; i<=sheet.getLastRowNum(); i++){
	   
	   row=sheet.getRow(i);
	   
	   for(int j=0; j<row.getLastCellNum(); j++){
	    
	    System.out.print("  "+row.getCell(j).toString());
	   }
	   System.out.println();
	  }
	 }
	 
	 public static void main(String[] args) throws IOException {
	  
	  Practics3 excel = new Practics3("D:\\Sheet1.xlsx");
	  //System.out.println(excel.readingData("Sheet1", 1, 1));
	  excel.readingAllData("Sheet1");
	  
	 }

	}
