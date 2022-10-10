import java.io.*;

//for generation of random 
import java.util.*;
public class PointCPTesting{

	private static int numOfTests; 

	public PointCPTesting(){
		this.numOfTests = 0;
	}
	public int getTotalNumOfTests(){
		return this.numOfTests;
	}

	public void pointCP2TimeTest(PointCP2[] arrayCP2, PointCP2[] arrayB, Test test){

		System.out.println("\nSTART OF TEST FOR PointCP2\n");
		//CONSTRUCTION TEST for POINTCP2
		long start = System.currentTimeMillis();
		test.construct(2,'P');
		long end = System.currentTimeMillis();
		System.out.println("Time taken to construct PointCP2 (milliseconds) giving Polar coordinates: " + (end-start));

		//CONSTRUCTION TEST for POINTCP2 giving C
		long startC = System.currentTimeMillis();
		test.construct(2,'C');
		long endC = System.currentTimeMillis();
		System.out.println("Time taken to construct PointCP2 (milliseconds) giving Cartesian coordinates: " + (endC-startC));


		//GETX TEST
		long s_getX = System.currentTimeMillis();
		for (int i=0; i<arrayCP2.length;i++ ){
			arrayCP2[i].getX();
		}
		long e_getX = System.currentTimeMillis();
		System.out.println("Time taken for getX for " +arrayCP2[0].getClass()+" (milliseconds): "+ (e_getX-s_getX));

		//GETY TEST
		long s_getY = System.currentTimeMillis();
		for (int i=0; i<arrayCP2.length;i++){
			arrayCP2[i].getY();
		}
		long e_getY = System.currentTimeMillis();
		System.out.println("Time taken for getY for " +arrayCP2[0].getClass()+" (milliseconds): "+ (e_getY-s_getY));

		//Get RHO

		long s_getR = System.currentTimeMillis();
		for (int i=0; i<arrayCP2.length;i++ ){
			arrayCP2[i].getRho();
		}
		long e_getR = System.currentTimeMillis();
		System.out.println("Time taken for getRho for " +arrayCP2[0].getClass()+" (milliseconds): "+ (e_getR-s_getR));

		//Get Theta

		long s_getT = System.currentTimeMillis();
		for (int i=0; i<arrayCP2.length;i++ ){
			arrayCP2[i].getTheta();
		}
		long e_getT = System.currentTimeMillis();
		System.out.println("Time taken for getTheta for " +arrayCP2[0].getClass()+" (milliseconds): "+ (e_getT-s_getT));

		//getDistance Test

		long s_getDist = System.currentTimeMillis();
		for (int i=0; i<arrayCP2.length;i++ ){
			arrayCP2[i].getDistance(arrayB[i]);
		}
		long e_getDist = System.currentTimeMillis();
		System.out.println("Time taken for getDistance for " +arrayCP2[0].getClass()+" (milliseconds): "+(e_getDist-s_getDist));

		//roatePoint Test 

		long s_getRot = System.currentTimeMillis();
		for (int i=0; i<arrayCP2.length;i++ ){
			double random = new Random().nextLong();
			arrayCP2[i].rotatePoint(random);
		}
		long e_getRot = System.currentTimeMillis();
		System.out.println("Time taken for rotatePoint for " +arrayCP2[0].getClass()+" (milliseconds): " + (e_getRot-s_getRot));

	System.out.println("\nEND OF TEST FOR PointCP2\n***\n");
	this.numOfTests++;

	}


	public void pointCP3TimeTest(PointCP3[] arrayCP3, PointCP3[] arrayB, Test test){

		System.out.println("\nSTART OF TEST FOR PointCP3\n");
		//CONSTRUCTION TEST for POINTCP2
		long start = System.currentTimeMillis();
		test.construct(3,'C');
		long end = System.currentTimeMillis();
		System.out.println("Time taken to construct for PointCP3 inputting Cartesian (milliseconds): " + (end-start));

		//CONSTRUCTION TEST for POINTCP2
		long startP = System.currentTimeMillis();
		test.construct(3,'P');
		long endP = System.currentTimeMillis();
		System.out.println("Time taken to construct for PointCP3 inputting Polar (milliseconds): " + (endP-startP));


		//GETX TEST
		long s_getX = System.currentTimeMillis();
		for (int i=0; i<arrayCP3.length;i++ ){
			arrayCP3[i].getX();
		}
		long e_getX = System.currentTimeMillis();
		System.out.println("Time taken for getX for " +arrayCP3[0].getClass()+" (milliseconds): "+ (e_getX-s_getX));

		//GETY TEST
		long s_getY = System.currentTimeMillis();
		for (int i=0; i<arrayCP3.length;i++){
			arrayCP3[i].getY();
		}
		long e_getY = System.currentTimeMillis();
		System.out.println("Time taken for getY for " +arrayCP3[0].getClass()+" (milliseconds): "+ (e_getY-s_getY));

		//Get RHO

		long s_getR = System.currentTimeMillis();
		for (int i=0; i<arrayCP3.length;i++ ){
			arrayCP3[i].getRho();
		}
		long e_getR = System.currentTimeMillis();
		System.out.println("Time taken for getRho for " +arrayCP3[0].getClass()+" (milliseconds): "+ (e_getR-s_getR));

		//Get Theta

		long s_getT = System.currentTimeMillis();
		for (int i=0; i<arrayCP3.length;i++ ){
			arrayCP3[i].getTheta();
		}
		long e_getT = System.currentTimeMillis();
		System.out.println("Time taken for getTheta for " +arrayCP3[0].getClass()+" (milliseconds): "+ (e_getT-s_getT));

		//getDistance Test

		long s_getDist = System.currentTimeMillis();
		for (int i=0; i<arrayCP3.length;i++ ){
			arrayCP3[i].getDistance(arrayB[i]);
		}
		long e_getDist = System.currentTimeMillis();
		System.out.println("Time taken for getDistance for " +arrayCP3[0].getClass()+" (milliseconds): "+(e_getDist-s_getDist));

		//roatePoint Test 

		long s_getRot = System.currentTimeMillis();
		for (int i=0; i<arrayCP3.length;i++ ){
			double random = new Random().nextLong();
			arrayCP3[i].rotatePoint(random);
		}
		long e_getRot = System.currentTimeMillis();
		System.out.println("Time taken for rotatePoint for " +arrayCP3[0].getClass()+" (milliseconds): "+ (e_getRot-s_getRot));

	System.out.println("\nEND OF TEST FOR PointCP3\n***\n");
	this.numOfTests++;

	}

	public void pointCP5TimeTest_D3(PointCP5[] arrayCP5, PointCP5[] arrayB, Test test){

		System.out.println("\nSTART OF TEST FOR PointCP5 with concrete class PointCP3_5\n");
		//CONSTRUCTION TEST for POINTCP5 concrete CP3
		long start = System.currentTimeMillis();
		//Note design 5 with concrete class POINTCP3 is 8
		test.construct(8,'C');
		long end = System.currentTimeMillis();
		System.out.println("Time taken to construct for PointCP5 inputting Cartesian (milliseconds): " + (end-start));

		//CONSTRUCTION TEST for POINTCP2 given 
		long startP = System.currentTimeMillis();
		//Note design 5 with concrete class POINTCP3 is 8
		test.construct(8, 'P');
		long endP = System.currentTimeMillis();
		System.out.println("Time taken to construct for PointCP5 inputting Polar (milliseconds): " + (endP-startP));

		//GETX TEST
		long s_getX = System.currentTimeMillis();
		for (int i=0; i<arrayCP5.length;i++ ){
			arrayCP5[i].getX();
		}
		long e_getX = System.currentTimeMillis();
		System.out.println("Time taken for getX for Design 5 for " +arrayCP5[0].getClass()+" (milliseconds): "+ (e_getX-s_getX));

		//GETY TEST
		long s_getY = System.currentTimeMillis();
		for (int i=0; i<arrayCP5.length;i++){
			arrayCP5[i].getY();
		}
		long e_getY = System.currentTimeMillis();
		System.out.println("Time taken for getY for Design 5 for " +arrayCP5[0].getClass()+" (milliseconds): "+ (e_getY-s_getY));

		//Get RHO

		long s_getR = System.currentTimeMillis();
		for (int i=0; i<arrayCP5.length;i++ ){
			arrayCP5[i].getRho();
		}
		long e_getR = System.currentTimeMillis();
		System.out.println("Time taken for getRho for Design 5 for " +arrayCP5[0].getClass()+" (milliseconds): "+ (e_getR-s_getR));

		//Get Theta

		long s_getT = System.currentTimeMillis();
		for (int i=0; i<arrayCP5.length;i++ ){
			arrayCP5[i].getTheta();
		}
		long e_getT = System.currentTimeMillis();
		System.out.println("Time taken for getTheta for Design 5 for " +arrayCP5[0].getClass()+" (milliseconds): "+ (e_getT-s_getT));

		//getDistance Test

		long s_getDist = System.currentTimeMillis();
		for (int i=0; i<arrayCP5.length;i++ ){
			arrayCP5[i].getDistance(arrayB[i]);
		}
		long e_getDist = System.currentTimeMillis();
		System.out.println("Time taken for getDistance for Design 5 for " +arrayCP5[0].getClass()+" (milliseconds): "+(e_getDist-s_getDist));

		//roatePoint Test 

		long s_getRot = System.currentTimeMillis();
		for (int i=0; i<arrayCP5.length;i++ ){
			double random = new Random().nextLong();
			arrayCP5[i].rotatePoint(random);
		}
		long e_getRot = System.currentTimeMillis();
		System.out.println("Time taken for rotatePoint for Design 5 for " +arrayCP5[0].getClass()+" (milliseconds): "+ (e_getRot-s_getRot));

	System.out.println("\nEND OF TEST FOR PointCP5 with concrete class PointCP3_5\n***\n");
	this.numOfTests++;

	}

	public void pointCP5TimeTest_D2(PointCP5[] arrayCP5, PointCP5[] arrayB, Test test){

		System.out.println("\nSTART OF TEST FOR PointCP5 with concrete class PointCP2_5\n");
		//CONSTRUCTION TEST for POINTCP5 with concrete PointCP2_5
		long start = System.currentTimeMillis();
		//Note design 5 with concrete class POINTCP2 is 7
		test.construct(7,'P');
		long end = System.currentTimeMillis();
		System.out.println("Time taken to construct for PointCP5 inputting Polar (milliseconds): " + (end-start));

		long startC = System.currentTimeMillis();
		//Note design 5 with concrete class POINTCP2 is 7
		test.construct(7,'C');
		long endC = System.currentTimeMillis();
		System.out.println("Time taken to construct for PointCP5 inputting Cartesian (milliseconds): " + (endC-startC));

		//System.out.println("\nIMPORTANT" + (arrayCP5[0] instanceof PointCP5));
		//GETX TEST
		long s_getX = System.currentTimeMillis();
		for (int i=0; i<arrayCP5.length;i++ ){
			arrayCP5[i].getX();
		}
		long e_getX = System.currentTimeMillis();
		System.out.println("Time taken for getX for Design 5 for " +arrayCP5[0].getClass()+" (milliseconds): "+ (e_getX-s_getX));

		//GETY TEST
		long s_getY = System.currentTimeMillis();
		for (int i=0; i<arrayCP5.length;i++){
			arrayCP5[i].getY();
		}
		long e_getY = System.currentTimeMillis();
		System.out.println("Time taken for getY for Design 5 for " +arrayCP5[0].getClass()+" (milliseconds): "+ (e_getY-s_getY));

		//Get RHO

		long s_getR = System.currentTimeMillis();
		for (int i=0; i<arrayCP5.length;i++ ){
			arrayCP5[i].getRho();
		}
		long e_getR = System.currentTimeMillis();
		System.out.println("Time taken for getRho for Design 5 for " +arrayCP5[0].getClass()+" (milliseconds): "+ (e_getR-s_getR));

		//Get Theta

		long s_getT = System.currentTimeMillis();
		for (int i=0; i<arrayCP5.length;i++ ){
			arrayCP5[i].getTheta();
		}
		long e_getT = System.currentTimeMillis();
		System.out.println("Time taken for getTheta for Design 5 for " +arrayCP5[0].getClass()+" (milliseconds): "+ (e_getT-s_getT));

		//getDistance Test

		long s_getDist = System.currentTimeMillis();
		for (int i=0; i<arrayCP5.length;i++ ){
			arrayCP5[i].getDistance(arrayB[i]);
		}
		long e_getDist = System.currentTimeMillis();
		System.out.println("Time taken for getDistance for Design 5 for " +arrayCP5[0].getClass()+" (milliseconds): "+(e_getDist-s_getDist));

		//roatePoint Test 

		long s_getRot = System.currentTimeMillis();
		for (int i=0; i<arrayCP5.length;i++ ){
			double random = new Random().nextLong();
			arrayCP5[i].rotatePoint(random);
		}
		long e_getRot = System.currentTimeMillis();
		System.out.println("Time taken for rotatePoint for Design 5 for " +arrayCP5[0].getClass()+" (milliseconds): "+ (e_getRot-s_getRot));

	System.out.println("\nEND OF TEST FOR PointCP5 with concrete class PointCP2_5\n***\n");
	this.numOfTests++;

	}
	

}