package model;

import java.util.ArrayList;
import java.util.Scanner;

public class Pcodes {
	
	private ArrayList<String> pCodes = new ArrayList<>();

	public Pcodes() {
		
	}
	
	public String search(String input) {
        String returnString = "";
        for(String code : pCodes) {
        	Scanner sc = new Scanner(code);
        	sc.useDelimiter(",");
        	String pcode = sc.next();
        	String dsc = sc.next();
        	if(pcode.equals(input)) {
        		returnString += pcode + " " + dsc + "\n";
        	} 
        }
        return returnString;
	}
	
	public void addPcode(String pCode) {
		pCodes.add(pCode);
		System.out.println("adding: " + pCode);
	}
}
