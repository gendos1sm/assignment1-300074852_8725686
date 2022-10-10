import java.io.*;

//for generation of random 
import java.util.*;

public class Analysis{

	public static void main(String[] args){
		
		long timeStart = System.currentTimeMillis();
		System.out.println("\nPROGRAM STARTS TO RUN at " + timeStart);

		int numPoints = 2800000;
		int numberOfTestRuns = 1;

		for(int i = 0; i<numberOfTestRuns;i++){
		System.out.println("\n===========RUN" + (i+1)+"===========");
		Test analysePointCP = new Test(numPoints);
		analysePointCP.constructForTest();
		PointCPTesting currentTest = new PointCPTesting();

		//THESE FUNCTIONS CALL FOR TESTING OF SPECIFIC DESIGNS - to test only one of them comment out others
		currentTest.pointCP2TimeTest(analysePointCP.pointCP2ForAnalysis,analysePointCP.pointCP2PointB, analysePointCP);
		currentTest.pointCP3TimeTest(analysePointCP.pointCP3ForAnalysis,analysePointCP.pointCP3PointB,analysePointCP);
		currentTest.pointCP5TimeTest_D3(analysePointCP.pointCP5ForAnalysis,analysePointCP.pointCP5PointB,analysePointCP);
		currentTest.pointCP5TimeTest_D2(analysePointCP.pointCP5ForAnalysisConcretePoint2,analysePointCP.pointCP5PointB_2,analysePointCP);
		System.out.println("=======END OF RUN" + (i+1) + "========\n");

		}
		
		long timeEnd = System.currentTimeMillis();
		System.out.println("PROGRAM ENDS at " + timeEnd);
		System.out.println("Total RUNTIME: " + ((timeEnd - timeStart)/1000) + " seconds");



		//Test for math function 
		/*long start_m = System.currentTimeMillis();
		for (int i =0; i< analysePointCP.randomXorRho.length; i++){
			Math.toDegrees(Math.atan2(analysePointCP.randomXorRho[i], 2));
		}
		long end_m = System.currentTimeMillis();
		System.out.println("todegrees atang " + (end_m - start_m));
		//randomXorRho;

		long start_m2 = System.currentTimeMillis();
		for (int i =0; i< analysePointCP.randomXorRho.length; i++){
		Math.sqrt(Math.pow(analysePointCP.randomXorRho[i], 2) + Math.pow((analysePointCP.randomXorRho[i]+1), 2));		
	}
		long end_m2 = System.currentTimeMillis();
		System.out.println("sqrt,pow,add " + (end_m2 - start_m2));
		*/

	}

	
}
