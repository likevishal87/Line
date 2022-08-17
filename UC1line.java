import java.util.Scanner;

public class UC1line {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.println("Enter x1 coordinate:");
	        double x1  = sc.nextInt();
	        System.out.println("Enter x2 coordinate:");
	        double x2  = sc.nextInt();
	        System.out.println("Enter y1 coordinate:");
	        double y1  = sc.nextInt();
	        System.out.println("Enter y2 coordinate:");
	        double y2  = sc.nextInt();
	        double LineOflength =Math.sqrt(Math.pow((x2-x1),2))+Math.sqrt(Math.pow((y2-y1),2));

	        System.out.println("..........");
	        System.out.println("length of Line: " + LineOflength);


	}

}
