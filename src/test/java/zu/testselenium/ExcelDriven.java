package zu.testselenium;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelDriven {

    public static void main(String[] args) throws IOException {

        FileInputStream file = new FileInputStream("/Users/alexzoo/Documents/projects/pageobjectseleniumtest/data.xls");

        XSSFWorkbook wb = new XSSFWorkbook(file);
        XSSFSheet sheet = wb.getSheet("script");
        XSSFRow row = sheet.getRow(2);
        XSSFCell cell = row.getCell(2);
        String value = cell.getStringCellValue();

        









    }







}
