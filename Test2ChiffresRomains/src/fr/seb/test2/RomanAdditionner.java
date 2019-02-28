package fr.seb.test2;

public class RomanAdditionner {
	
	public String compute(String str1,String str2, String operation) {
		String result="";
		
		RomanToNumeral a = new RomanToNumeral();
		
		Integer nb1= a.getNumeral(str1);
		
		Integer nb2= a.getNumeral(str2);
		
		NumeralToRoman b=new NumeralToRoman();
		
		if(operation=="-") {
			result=b.getRoman(nb1-nb2);
		}
		else {
			result=b.getRoman(nb1+nb2);
		}
		
		
		return result;
	}

}
