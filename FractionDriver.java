public class FractionDriver(){
	public static void main(String[] args){
		Fraction f1 = new Fraction(1, 3);
		Fraction f2 = new Fraction();
		Fraction f3 = new Fraction("1/3");
		System.out.println(f1.getNum + "/" + f1.getDenom);
		System.out.println(f2.getNum + "/" + f2.getDenom);
	}
	
}
