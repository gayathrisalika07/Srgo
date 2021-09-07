package com.Srgo.GenericLib;



	import java.io.FileInputStream;
	import java.io.FileOutputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.ss.usermodel.WorkbookFactory;

	public class Filelib
	{
		public String readExcelData(String path,String sheetname,int row,int cell) throws Throwable
		{          
			FileInputStream fis=new FileInputStream(path);
	          Workbook wb= WorkbookFactory.create(fis);
	          String excelvalue=wb.getSheet(sheetname).getRow(row).getCell(cell).toString();
	 
			return excelvalue;
			
		}
		public void WriteExcelData(String path,String sheetname,int row,int cell,String data) throws Throwable
		
		 {           FileInputStream fis=new FileInputStream(path);
		               Workbook wb= WorkbookFactory.create(fis);
		               wb.getSheet(sheetname).getRow(row).createCell(cell).setCellValue(data);
		               FileOutputStream fos= new FileOutputStream(path);
		               wb.write(fos);
		 
		}
		public int getRowCount(String path,String sheet) throws Throwable
		
		 {           FileInputStream fis=new FileInputStream(path);
		               Workbook wb= WorkbookFactory.create(fis);
		               int rowcount=wb.getSheet(sheet).getLastRowNum();
					return rowcount;
		

}
		public String readPropertyData(String proppath,String key) throws Throwable
		
		 {           FileInputStream fis=new FileInputStream(proppath);
		               Properties prop = new Properties();
		               prop.load(fis);
		               String propvalue=prop.getProperty(key, "wrong");
		               
					return propvalue;
	   }
}
	



