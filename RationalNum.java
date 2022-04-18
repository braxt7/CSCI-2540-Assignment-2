/**
 * @author - Braxton Chambers
 * A class for rational numbers
 */
package assg2_chambersb19;

public class RationalNum 
{
   private int numeratorNum;
   private int denominatorNum;
   /**
   * Default Constructor
   */
   public RationalNum() 
   {
	   denominatorNum = 1;
	   numeratorNum = 0;
   }
   /**
   * Receives a single integer as a parameter
   * @param numeratorNum
   */
   public RationalNum(int numeratorNum) {
	   
       this.denominatorNum = 1;
	   this.numeratorNum = numeratorNum;
   }
   /**
   * Receives a single integer as a parameter
   * @param numeratorNum
   * @param denominatorNum
   */
   public RationalNum(int numeratorNum, int denominatorNum) {      
       // Checks if denominator is greater than 0
   if(denominatorNum > 0)
   {
       this.numeratorNum = numeratorNum;
       this.denominatorNum = denominatorNum;
   }
   // Checks if denominator is less than 0, multiplies both numerator and denominator by -1
   else if(denominatorNum < 0)
   {
       numeratorNum = numeratorNum * -1;
       denominatorNum = denominatorNum * -1;
       this.numeratorNum = numeratorNum;
       this.denominatorNum = denominatorNum;
   }
   else if(denominatorNum == 0)
   {
       System.out.println("Zero cannot be in the denominator");          
       }      
   }
   
   /**
   * Returns the rational number as a string
   * @return numeratorNum "/" denominatorNum as a string
   */
   @Override
   public String toString() {
       return (this.numeratorNum + "/" + this.denominatorNum);
   }
   
   /**
   * Returns whether the two rational numbers are equal
   * @param obj to Compare
   * @return true if numeratorNum1 == numeratorNum2, false if Otherwise
   */
   @Override
   public boolean equals(Object obj) {
       RationalNum rationalNum = (RationalNum)obj;
       int numeratorNum1 = this.numeratorNum;
       int denominatorNum1 = this.denominatorNum;
       int numeratorNum2 = rationalNum.numeratorNum;
       int denominatorNum2 = rationalNum.denominatorNum;
       numeratorNum1 = numeratorNum1 * denominatorNum2;
       denominatorNum1 = denominatorNum1 * denominatorNum2;
       numeratorNum2 = numeratorNum2 * denominatorNum1;
       denominatorNum2 = denominatorNum2 * denominatorNum1;
       if (numeratorNum1 == numeratorNum2)
       {
           return true;
       }
       else
       {
           return false;
       }      
   }
  
   /**
   * Retrieves the Denominator
   * @return denominatorNum
   */
   public int getdenominatorNum() 
   {
       return denominatorNum;
   }

   /**
   * Retrieves the Numerator
   * @return numeratorNum
   */
   public int getnumeratorNum() 
   {
       return numeratorNum;
   }
  
   /**
   * Adds Two Rational Numbers Together (A/B + C/D)
   * @param num
   * @return newRational number
   */
   public RationalNum add(RationalNum num)
   {
       RationalNum newRational = new RationalNum();
       int numeratorNum1 = this.numeratorNum;
       int denominatorNum1 = this.denominatorNum;
       int numeratorNum2 = num.numeratorNum;
       int denominatorNum2 = num.denominatorNum;
       newRational.numeratorNum = (numeratorNum1 * denominatorNum2 + numeratorNum2 * denominatorNum1);
       newRational.denominatorNum = denominatorNum1 * denominatorNum2;
       return newRational;
   }
  
   /**
   * Subtracts Two Rational Numbers Together (C/D - A/B)
   * @param num
   * @return newRational number
   */
   public RationalNum sub(RationalNum num)
   {
       RationalNum newRational = new RationalNum();
       int numeratorNum1 = this.numeratorNum;
       int denominatorNum1 = this.denominatorNum;
       int numeratorNum2 = num.numeratorNum;
       int denominatorNum2 = num.denominatorNum;
       newRational.numeratorNum = (numeratorNum1 * denominatorNum2 - numeratorNum2 * denominatorNum1);
       newRational.denominatorNum = denominatorNum1 * denominatorNum2;
       return newRational;
   }
  
   /**
   * Multiplies Two Rational Numbers (A/B * C/D)
   * @param num
   * @return newRational number
   */
   public RationalNum mul(RationalNum num)
   {
       RationalNum newRational = new RationalNum();
       int numeratorNum1 = this.numeratorNum;
       int denominatorNum1 = this.denominatorNum;
       int numeratorNum2 = num.numeratorNum;
       int denominatorNum2 = num.denominatorNum;
       newRational.numeratorNum = numeratorNum1*numeratorNum2;
       newRational.denominatorNum = denominatorNum1*denominatorNum2;
       return newRational;
   }
  
   /**
   * Divides Two Rational Numbers (A/B / C/D)
   * @param num
   * @return newRational number
   */
   public RationalNum div(RationalNum num)
   {
       RationalNum newRational = new RationalNum();
       int numeratorNum1 = this.numeratorNum;
       int denominatorNum1 = this.denominatorNum;
       int numeratorNum2 = num.numeratorNum;
       int denominatorNum2 = num.denominatorNum;
       newRational.numeratorNum = numeratorNum1 * denominatorNum2;
       newRational.denominatorNum = denominatorNum1 * numeratorNum2;
       return newRational;
   }
  
   /**
   * Negates a Rational Number (-A/B)
   * @param num
   * @return newRational number
   */
   public RationalNum neg()
   {
       RationalNum newRational = new RationalNum();
       int numeratorNum1 = -1 * this.numeratorNum;
       int denominatorNum1 = this.denominatorNum;      
       newRational.numeratorNum = numeratorNum1;
       newRational.denominatorNum = denominatorNum1;
       return newRational;
   }
}


