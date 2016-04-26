package taro;

import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class FileXLS {

	public void Create() {

		PeremennieDlyaFila per = new PeremennieDlyaFila();

		try {

			String filename = GUI.SaveFile;

			@SuppressWarnings("resource")
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("Taro");
			HSSFRow rowhead = sheet.createRow((short) 0);

			rowhead.createCell(0).setCellValue("Имя");
			rowhead.createCell(1).setCellValue("Значение");
			rowhead.createCell(2).setCellValue("описание");

			HSSFRow row = sheet.createRow((short) 1);
			row.createCell(0).setCellValue("1 = ");
			row.createCell(1).setCellValue(Matematica.Const1);
			row.createCell(2).setCellValue(per.PerConst1);

			HSSFRow row1 = sheet.createRow((short) 2);
			row1.createCell(0).setCellValue("2 = ");
			row1.createCell(1).setCellValue(Matematica.Const2);
			row1.createCell(2).setCellValue(per.PerConst2);

			HSSFRow row2 = sheet.createRow((short) 3);
			row2.createCell(0).setCellValue("3 = ");
			row2.createCell(1).setCellValue(Matematica.Const3);
			row2.createCell(2).setCellValue(per.PerConst3);

			HSSFRow row3 = sheet.createRow((short) 4);
			row3.createCell(0).setCellValue("4 = ");
			row3.createCell(1).setCellValue(Matematica.Const4);
			row3.createCell(2).setCellValue(per.PerConst4);

			HSSFRow row4 = sheet.createRow((short) 5);
			row4.createCell(0).setCellValue("5 = ");
			row4.createCell(1).setCellValue(Matematica.Const5);
			row4.createCell(2).setCellValue(per.PerConst5);

			HSSFRow row5 = sheet.createRow((short) 6);
			row5.createCell(0).setCellValue("6 = ");
			row5.createCell(1).setCellValue(Matematica.Const6);
			row5.createCell(2).setCellValue(per.PerConst6);

			HSSFRow row6 = sheet.createRow((short) 7);
			row6.createCell(0).setCellValue("7 = ");
			row6.createCell(1).setCellValue(Matematica.Const7);
			row6.createCell(2).setCellValue(per.PerConst7);

			HSSFRow row7 = sheet.createRow((short) 8);
			row7.createCell(0).setCellValue("8 = ");
			row7.createCell(1).setCellValue(Matematica.Const8);
			row7.createCell(2).setCellValue(per.PerConst8);

			HSSFRow row8 = sheet.createRow((short) 9);
			row8.createCell(0).setCellValue("9 = ");
			row8.createCell(1).setCellValue(Matematica.Const9);
			row8.createCell(2).setCellValue(per.PerConst9);

			HSSFRow row9 = sheet.createRow((short) 10);
			row9.createCell(0).setCellValue("10 = ");
			row9.createCell(1).setCellValue(Matematica.Const10);
			row9.createCell(2).setCellValue(per.PerConst10);

			HSSFRow row10 = sheet.createRow((short) 11);
			row10.createCell(0).setCellValue("11 = ");
			row10.createCell(1).setCellValue(Matematica.Const11);
			row10.createCell(2).setCellValue(per.PerConst11);

			HSSFRow row11 = sheet.createRow((short) 12);
			row11.createCell(0).setCellValue("12 = ");
			row11.createCell(1).setCellValue(Matematica.Const12);
			row11.createCell(2).setCellValue(per.PerConst12);

			HSSFRow row12 = sheet.createRow((short) 13);
			row12.createCell(0).setCellValue("13 = ");
			row12.createCell(1).setCellValue(Matematica.Const13);
			row12.createCell(2).setCellValue(per.PerConst13);

			HSSFRow row13 = sheet.createRow((short) 14);
			row13.createCell(0).setCellValue("A = ");
			row13.createCell(1).setCellValue(Matematica.A);
			row13.createCell(2).setCellValue(per.PerA);

			HSSFRow row14 = sheet.createRow((short) 15);
			row14.createCell(0).setCellValue("B = ");
			row14.createCell(1).setCellValue(Matematica.B);
			row14.createCell(2).setCellValue(per.PerB);

			HSSFRow row15 = sheet.createRow((short) 16);
			row15.createCell(0).setCellValue("C = ");
			row15.createCell(1).setCellValue(Matematica.C);
			row15.createCell(2).setCellValue(per.PerC);

			HSSFRow row16 = sheet.createRow((short) 17);
			row16.createCell(0).setCellValue("D = ");
			row16.createCell(1).setCellValue(Matematica.D);
			row16.createCell(2).setCellValue(per.PerD);

			HSSFRow row17 = sheet.createRow((short) 18);
			row17.createCell(0).setCellValue("E = ");
			row17.createCell(1).setCellValue(Matematica.E);
			row17.createCell(2).setCellValue(per.PerE);

			HSSFRow row18 = sheet.createRow((short) 19);
			row18.createCell(0).setCellValue("F = ");
			row18.createCell(1).setCellValue(Matematica.F);
			row18.createCell(2).setCellValue(per.PerF);

			HSSFRow row19 = sheet.createRow((short) 20);
			row19.createCell(0).setCellValue("G1max = ");
			row19.createCell(1).setCellValue(Matematica.G1max);
			row19.createCell(2).setCellValue(per.PerG1max);

			HSSFRow row20 = sheet.createRow((short) 21);
			row20.createCell(0).setCellValue("G2help = ");
			row20.createCell(1).setCellValue(Matematica.G2help);
			row20.createCell(2).setCellValue(per.PerG2help);

			HSSFRow row21 = sheet.createRow((short) 22);
			row21.createCell(0).setCellValue("H = ");
			row21.createCell(1).setCellValue(Matematica.H);
			row21.createCell(2).setCellValue(per.PerH);

			HSSFRow row22 = sheet.createRow((short) 23);
			row22.createCell(0).setCellValue("I = ");
			row22.createCell(1).setCellValue(Matematica.I);
			row22.createCell(2).setCellValue(per.PerI);

			HSSFRow row23 = sheet.createRow((short) 24);
			row23.createCell(0).setCellValue("J = ");
			row23.createCell(1).setCellValue(Matematica.J);
			row23.createCell(2).setCellValue(per.PerJ);

			HSSFRow row24 = sheet.createRow((short) 25);
			row24.createCell(0).setCellValue("K = ");
			row24.createCell(1).setCellValue(Matematica.K);
			row24.createCell(2).setCellValue(per.PerK);

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