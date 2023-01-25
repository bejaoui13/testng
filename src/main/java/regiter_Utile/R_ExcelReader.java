package regiter_Utile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class R_ExcelReader {

	FileInputStream fis = null;
	public static DataFormatter formatter = new DataFormatter();

	public FileInputStream getfileinput() {
		String filepath = System.getProperty("user.dir") + "/src/test/java/data/UserData.xlsx";
		File filesrc = new File(filepath);
		try {
			fis = new FileInputStream(filesrc);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		return fis;
	}

	public Object[][] getdataexcel() throws IOException {
		String[][] arraydata = null;

		try {

			fis = getfileinput();
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sheet = wb.getSheetAt(0);

			int rowNum = sheet.getLastRowNum() + 1;
			int colNum = sheet.getRow(0).getLastCellNum();

			arraydata = new String[rowNum][colNum];

			for (int i = 0; i < rowNum; i++) {
				XSSFRow row = sheet.getRow(i);

				for (int j = 0; j < colNum; j++) {
					if (row == null)

						arraydata[i][j] = "";

					else {

						XSSFCell cell = row.getCell(j);

						if (cell == null)

							arraydata[i][j] = "";

						else {

							String value = formatter.formatCellValue(cell);
							arraydata[i][j] = value.trim();

						}

					}

				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return arraydata;

	}
}
