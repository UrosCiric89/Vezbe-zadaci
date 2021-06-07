package domaciPOI;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ZadatakSumaBrojeva {

	public static void main(String[] args) {
/*Napisati program koji racuna sumu brojeva koji se nalaze prvom sheet-u excel tabele koji se zove Brojevi. 
 * U tabeli svi brojevi se nalaze u prvoj koloni. Program treba da cita red po red iz tabele i upisane brojeve dodaje na sumu. 
* Ukupnu sumu na kraju treba ispisati na standardnom izlazu. 
 * Potrebno je omoguciti da program radi i ukoliko se u datu tabelu doda jos brojeva.*/
		
        File f = new File("domaci.xlsx");
		
		try {
			InputStream is = new FileInputStream(f);
			XSSFWorkbook workbook =new XSSFWorkbook(is);
		DataFormatter formatter = new DataFormatter();
		Sheet sheet = workbook.getSheetAt(0);
		Integer zbir = 0;
		for (Row row : sheet) {
		  for (Cell c : row) {
			  
		     Integer x = Integer.valueOf(formatter.formatCellValue(c));
		     zbir=zbir+x;
		  }
		  System.out.println("Trenutni zbir je: " + zbir);
		}
		
		} catch (IOException e) {
			System.out.println("Odgovarajuci fajl nije pronadjen!");
			e.printStackTrace();
		}
		

	}

}
