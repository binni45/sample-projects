package excelpractice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Calendar;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PractiseExcel {

	public static String filename = System.getProperty("user.dir") + "\\src\\config\\testcases\\TestData.xlsx";
	public String path;
	public FileInputStream fis = null;
	public FileOutputStream fileOut = null;
	public XSSFWorkbook workbook = null;
	public XSSFSheet sheet = null;
	public XSSFRow row = null;
	public XSSFCell cell = null;

	public PractiseExcel(String path) {

		this.path = path;
		try {
			fis = new FileInputStream(path);
			workbook = new XSSFWorkbook(fis);
			sheet = workbook.getSheetAt(0);
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// returns the row count in a sheet
	public int getRowCount(String sheetName) {
		int index = workbook.getSheetIndex(sheetName);
		if (index == -1)
			return 0;
		else {
			sheet = workbook.getSheetAt(index);
			int number = sheet.getLastRowNum() + 1;
			return number;
		}

	}
	
	// returns the data from a cell
	
		public String getCellData(String sheetName,String colName,int rowNum){
			DataFormatter formatter = new DataFormatter();
			try{
				if(rowNum <=0)
					return "";
			
			int index = workbook.getSheetIndex(sheetName);
			int col_Num=-1;
			if(index==-1)
				return "";
			
			sheet = workbook.getSheetAt(index);
			row=sheet.getRow(0);
			//Iterator rowItr = sheet.rowIterator();

		   // while ( rowItr.hasNext() ) {
		    //    row = (XSSFRow) rowItr.next();
		    
			if(row== null){
				return"";
			}
			
			//System.out.println(sheet.getFirstRowNum());
					//System.out.println(sheet.getLastRowNum());
					//System.out.println(sheet.getRow(1).getLastCellNum());
					for(int j=0; j<=sheet.getLastRowNum();j++){
					
						if(sheet.getRow(j)!=null){
							for(int i=0;i<=sheet.getRow(j).getLastCellNum();i++){
						//System.out.println(sheet.getRow(j).getCell(i).getStringCellValue());
						if(sheet.getRow(j).getCell(i)!=null)
						{
							
						//System.out.println(sheet.getRow(j).getCell(i).getStringCellValue().trim());
							String text = formatter.formatCellValue(sheet.getRow(j).getCell(i));
						if(text.trim().equalsIgnoreCase(colName.trim()))
						{
							col_Num=i;
						    break;
						}   
						
						else{
							//System.out.println();
						}
						}
						
						}
							
						
					}
					}
			
			if(col_Num==-1)
				return "";
			
			sheet = workbook.getSheetAt(index);
			row = sheet.getRow(rowNum-1);
			if(row==null)
				return "";
			cell = row.getCell(col_Num);
			
			if(cell==null)
				return "";
			//System.out.println(cell.getCellType());
			if(cell.getCellType()==CellType.STRING)
				  return cell.getStringCellValue();
			else if(cell.getCellType()==CellType.NUMERIC || cell.getCellType()==CellType.FORMULA ){
				  
				  String cellText  = String.valueOf(cell.getNumericCellValue());
				  if (DateUtil.isCellDateFormatted(cell)) {
			           // format in form of M/D/YY
					  double d = cell.getNumericCellValue();

					  Calendar cal =Calendar.getInstance();
					  cal.setTime(DateUtil.getJavaDate(d));
			            cellText =
			             (String.valueOf(cal.get(Calendar.YEAR))).substring(2);
			           cellText = cal.get(Calendar.DAY_OF_MONTH) + "/" +
			                      cal.get(Calendar.MONTH)+1 + "/" + 
			                      cellText;
			           
			           //System.out.println(cellText);

			         }

				  
				  
				  return cellText;
			  }else if(cell != null || cell.getCellType()==CellType.BLANK)
			      return ""; 
			  else 
				  return String.valueOf(cell.getBooleanCellValue());
			
			}
		    
			catch(Exception e){
				
				e.printStackTrace();
				return "row "+rowNum+" or column "+colName +" does not exist in xls";
			}
		
		}
	
	public static void main(String[] args) {
		
		PractiseExcel practiseexcel = new PractiseExcel("D:\\sheet1.xlsx");
		System.out.println(practiseexcel.getRowCount("Sheet1"));
		System.out.println(practiseexcel.getCellData("Sheet1", "Project", 3));
	}

}
