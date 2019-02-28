package fr.seb.test2;

public class NumeralToRoman {
	
	public String getRoman(Integer nbentier) {
		String roman="";
		while(nbentier!=0){
			if(nbentier>=1000) {
				roman+="M";
				nbentier-=1000;
			}
		
			if(nbentier>=500) {
				roman+="D";
				nbentier-=500;
			}
		
			if(nbentier>=100) {
				roman+="C";
				nbentier-=100;
			}
		
			if(nbentier>=50) {
				roman+="L";
				nbentier-=50;
			}
		
			if(nbentier>=10) {
				roman+="X";
				nbentier-=10;
			}
		
			if(nbentier>=5) {
				roman+="V";
				nbentier-=5;
			}
		
			if(nbentier>=1) {
				roman+="I";
				nbentier-=1;
			}
		}
		return roman;
	}
		
}
