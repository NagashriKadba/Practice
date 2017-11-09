package com.basics;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

class ExcelLib{
	public static void readData() throws EncryptedDocumentException, InvalidFormatException, IOException{
		File file = new File("/home/tyss/Desktop/Input.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook wb = WorkbookFactory.create(file);
		Sheet sh = wb.getSheet("Sheet1");
		Row row = sh.getRow(0);
		Cell cel = row.getCell(0);
		String data = cel.toString();
		cel = row.getCell(1);
		String data2 = cel.toString();
		System.out.println(data);
		System.out.println(data2);
	}
	
	
	public static void writeData() throws EncryptedDocumentException, InvalidFormatException, IOException{
		File file = new File("/home/tyss/Desktop/Softwares/Test.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook wb = WorkbookFactory.create(file);
		Sheet sh = wb.getSheet("Sheet1");
		Row row = sh.getRow(0);
		Cell cel = row.createCell(2);
		cel.setCellValue("test Yanta");
		
		FileOutputStream fos = new FileOutputStream("/home/tyss/Desktop/Softwares/Test.xlsx");
		wb.write(fos);
		wb.close();
		fos.close();
		System.out.println("write complete");
	}
}
public class Run {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		
		ExcelLib.writeData();
	}

}
