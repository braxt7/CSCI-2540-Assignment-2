/**
 * @author - Braxton Chambers
 * A class to test rational numbers
 */
package assg2_chambersb19;

public class RationalNumDemo 
{

   /**
   * @param args
   */
   public static void main(String[] args) 
   {
	   // Initialization of two rational numbers
	   RationalNum rationalNum1 = new RationalNum();
	   System.out.println("Rational number 1: "+rationalNum1.toString());
	   RationalNum rationalNum2 = new RationalNum();
	   System.out.println("Rational number 2: "+rationalNum2.toString());
	   
	   // Test add method
	   String addition = rationalNum1.add(rationalNum2).toString();
	   System.out.println("Addition of 2 rational numbers: " + addition);
	   
	   // Test subtract method
	   String subtraction = rationalNum2.sub(rationalNum1).toString();
	   System.out.println("Subtraction of 2 rational numbers: " + subtraction);
	   
	   // Test multiplication method
	   String multiplication = rationalNum1.mul(rationalNum2).toString();
	   System.out.println("Multiplication of 2 rational numbers: " + multiplication);
	   
	   // Test division method
	   String division = rationalNum1.div(rationalNum2).toString();
	   System.out.println("Division of 2 rational numbers: " + division);
	   
	   // Test negation method
	   String negation1 = rationalNum1.neg().toString();
	   System.out.println("Negation of 1st rational number: " + negation1);
	   String negation2 = rationalNum2.neg().toString();
	   System.out.println("Negation of 2nd rational number: " + negation2);
	   
	   System.out.println(rationalNum1.equals(rationalNum2));
   }
}

