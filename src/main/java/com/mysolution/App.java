package com.mysolution;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;
import java.io.FileNotFoundException;
import java.io.IOException;

import java.io.FileReader;

/***
 * This is the initial class
 * 
 * @author tarunsi
 *
 */
public class App {

	// Main method
	public static void main(String[] args) {

		String inputFile=null;
		if (args.length <= 0) {
			System.out.println("Please provide the file name");
			System.exit(0);
		} else
		{
			inputFile = args[0];
			System.out.println("File path");
			
		}
		try {
			if(inputFile !=null) {
				
				App app = new App();
				List<String> lstCards = app.readInputFile(inputFile);
				//draw the games per line in the file
				for(String cards: lstCards) {
					CardsDraw cardsDraw = new CardsDraw(cards);
					cardsDraw.Draw();
				}
				
				
			}
		}catch(FileNotFoundException exp) {
			System.out.println(exp.getMessage());
		}catch(Exception exp) {
			System.out.println(exp.getMessage());
		}

	}
	
	/***
	 * Take the file path as input param and read the input file content
	 * @throws IOException ntent
	 * @param filePath
	 * @return
	 * @throws F throws IOExceptionileNotFoundException 
	 */
	protected List<String> readInputFile(String filePath) throws IOException {

	    List<String> lstCards = new ArrayList<String>();
		BufferedReader br = new BufferedReader(new FileReader(filePath));
		try {

		    String line = br.readLine();

		    while (line != null) {
		        lstCards.add (line);
		        line = br.readLine();
		    }
		    
		} finally {
		    br.close();
		}
		return lstCards;
	}

	
}
