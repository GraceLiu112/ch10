public class Fraction(){
	int Numerator;
	int Denominator; 
	public static void Fraction(){
		Numerator = 1;
		Denominator = 1;
	}
	public static void Fraction(int n, int d){
		Numerator = n;
		if(d != 0){
			Denominator = d;
		}
		else{
			Denominator = 1;
			System.out.println("Error: denominator cannot be zero");
		}
	}

}

public void setNum(int n){
	Numerator = n;
}

public void setDenom(int d){
	if(d != 0){
		Denominator = d;
	}
	else{
		Denominator = 1;
		System.out.println("Error: denominator cannot be zero");
	}
}




























