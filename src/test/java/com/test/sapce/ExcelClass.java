package com.test.sapce;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.slf4j.Logger;

import com.adacitin.commonutil.CommonUtill;
import com.adacitin.commonutil.Slf4J;
import com.flipkart.snap.BaseClass;

public class ExcelClass extends BaseClass {
	static Logger log =Slf4J.loadLogger(ExcelClass.class);
	public static Object[][] readdata(String path,String sheetname) throws IOException {
		Object[][] obj=null;
		List<Map<String,String>> list=new ArrayList<Map<String,String>>();
		FileInputStream fi = new FileInputStream(new File(path));
		Workbook wb = new XSSFWorkbook(fi);
		Sheet sh=wb.getSheet(sheetname);
		log.info("Reading data from the sheet"+sheetname);
		int PNRows = sh.getPhysicalNumberOfRows();
		Row header=sh.getRow(0);
		for(int i=1;i<PNRows;i++) {
			Row row=sh.getRow(i);
			int PNCells=row.getPhysicalNumberOfCells();
			Map<String,String> map =new HashMap<String,String>();
			for(int j=0;j<PNCells;j++) {
				Cell cell=row.getCell(j);
				
				CellType celltype=cell.getCellType();
				switch(celltype) {
				case STRING:
					RichTextString rsc=cell.getRichStringCellValue();
				RichTextString headerName=header.getCell(j).getRichStringCellValue();
				map.put(headerName.toString(), rsc.toString());
				break;
				
				case NUMERIC:
					if(DateUtil.isCellDateFormatted(cell)) {
					Date DCV=cell.getDateCellValue();
					SimpleDateFormat s=new SimpleDateFormat(MM_DD_YYYY);
					//String formats.format(DCV);
					
					}
				}
			}
		}
		
		
		return obj;
		
	}
}
