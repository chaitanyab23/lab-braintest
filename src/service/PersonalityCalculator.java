package service;

public class PersonalityCalculator{
	
	public String findYourBrainType(String options) {
		int option[] = findAnswers(options);
		int A = option[0]+option[1]+option[2]+option[4]+option[7]+option[9]+option[10]+option[11]+option[13]+option[17]+option[19];
		int B = option[3]+option[5]+option[6]+option[12]+option[14]+option[15]+option[16]+option[18];
		int X = 66-A+B;
		System.out.println("Your total score "+X);
		
		if((X>=20)&&(X<=55)) {
			return "Left-brained ";
		}
		else if((X>=56)&&(X<=64)) {
			return "No clear preference ";
		}
		else if ((X>=65 && X<=100)) {
			return "Right-brained";
		}
		
		else {
	         return "False";
		}
	}
	
public int findAnswers(String options) {
	String Z[] =options.split(",");
	int n = Z.length;
	int a[] = new int[n];
	int count=1;
	for(int i=0;i<n;i++) {
		a[i]= Integer.parseInt(Z[i]);
		count = count +1;
		System.out.println("The answer for question - "+count+" is "+a[i]);
	};
	return a;
		
	}
	