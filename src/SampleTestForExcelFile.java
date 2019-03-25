import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SampleTestForExcelFile {

	
	XSSFWorkbook workbook = null;
	XSSFSheet sheet = null;
	XSSFRow row = null;
	XSSFCell cell = null;
	FileInputStream fileinputstream = null;
	String path =null;
	
	public SampleTestForExcelFile(String path) {
		
		this.path=path;
		try {
			fileinputstream = new FileInputStream(path);
			workbook = new XSSFWorkbook(fileinputstream);
			sheet = workbook.getSheetAt(0);
			//fileinputstream.close();
		} catch (Exception e) {
			e.getMessage();
		} 
	}
		
	// returns the row count in a sheet
			public int getRowCount(String sheetName){
				int index = workbook.getSheetIndex(sheetName);
				if(index==-1)
					return 0;
				else{
				sheet = workbook.getSheetAt(index);
				int number=sheet.getLastRowNum()+1;
				return number;
				}
				
			}
	
	 public static void main(String[] args) {
		
		 SampleTestForExcelFile sampleTestForExcelFile1  = new SampleTestForExcelFile("D:\\sheet1.xlsx");
		 System.out.println(sampleTestForExcelFile1.getRowCount("Sheet1")); 
	}
}
