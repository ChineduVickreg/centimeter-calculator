package udemyFullCourse.TimBuchalkaExpressionsAndStatements;
//An Application that converts feet and inches to centimeter.

public class CentimeterConverter {

    public static void main(String[] args) {
	double centimeters = calcFeetAndInchesToCentimeters(6, 0.0);
	if (centimeters < 0.0){
        System.out.println("Invalid parameters");
    }
	calcFeetAndInchesToCentimeters(157);

            }
    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
     //validating feet and inches as >= 0, >= 0 && <= 12 respectively;
        ;
     if ((feet >= 0) || ((inches >= 0) || (inches <= 12))) {
         //System.out.println("Invalid feet or inches parameters");
         return -1;
     }
     double centimeter = feet * 12 * 2.54;
     centimeter += inches * 2.54;
        System.out.println(feet + "feet, " + inches + "inches = " + centimeter + "cm");
     return centimeter;
    }


    public static double calcFeetAndInchesToCentimeters(double inches){
        if (inches < 0) {
            return -1;
        }
        System.out.println("inches = " + inches);
        //since one foot is 12 inches
        double feet = (int)inches / 12;
        double remainingInches = (int)inches % 12;
        System.out.println(inches + " inches = " + feet + " feet and " + remainingInches + " inches");
         return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }
}
