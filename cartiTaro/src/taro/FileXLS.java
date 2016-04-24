package taro;


import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class FileXLS  {

	public void Create() {

 PeremennieDlyaFila per = new PeremennieDlyaFila();

GUI gui =new GUI();

 
 Matematica matem = new Matematica();
	
	//matem.Matematica(gui.day, gui.month, gui.year);
	

	System.out.println(matem.Const1);
	
	

		try {
			
			String filename = "E:/Taro.xls";

			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("Taro");
			HSSFRow rowhead = sheet.createRow((short) 0);
		
			
			rowhead.createCell(0).setCellValue("Имя");
			rowhead.createCell(1).setCellValue("Значение");
			rowhead.createCell(2).setCellValue("описание");
	
			  
	        
			HSSFRow row = sheet.createRow((short) 1);
			row.createCell(0).setCellValue("1");
			row.createCell(1).setCellValue(matem.Const1);
			row.createCell(2).setCellValue(per.PerConst1);
			
			
			
			
			HSSFRow row1 = sheet.createRow((short) 2);
			row1.createCell(0).setCellValue("2");
			row1.createCell(1).setCellValue(matem.Const2);
			row1.createCell(2).setCellValue(per.PerConst2);
			
			
			
			
			

			// Меняем размер столбца - ставится в конце
		       sheet.autoSizeColumn(1);	
		       sheet.autoSizeColumn(2);	
		       sheet.autoSizeColumn(3);	

			FileOutputStream fileOut = new FileOutputStream(filename);
			workbook.write(fileOut);
			fileOut.close();
			System.out.println("Your excel file has been generated!");

		} catch (Exception ex) {
			System.out.println(ex);
		}

	}
}