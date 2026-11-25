import java.util.Scanner;
public class EstimatingPi{

	public static void main(String[] args)
    {
		Fraction MILU = new Fraction( 355, 113 );
		final double EPSILON = Math.abs( Math.PI - MILU.toDouble() );
		System.out.prinln(EPSILON);
	}
		
	

}
