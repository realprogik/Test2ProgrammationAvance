package fr.seb.test2;

public class RomanToNumeral {
	
	public Integer getNumeral(String nbromain) {
		Integer total=0;
		
		for(int i=0;i<nbromain.length();i++) {
			char seek=nbromain.charAt(i);
			String a=String.valueOf(seek);
			if (a.contains("I")) {
				total+=1;
			}
			if (a.contains("V")) {
				total+=5;
			}
			if (a.contains("X")) {
				total+=10;
			}
			if (a.contains("L")) {
				total+=50;
			}
			if (a.contains("C")) {
				total+=100;
			}
			if (a.contains("D")) {
				total+=500;
			}
			if (a.contains("M")) {
				total+=1000;
			}
		}
		
		
		
		return total;
	}
	
	

}
