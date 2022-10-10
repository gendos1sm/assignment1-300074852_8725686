import java.io.*;

//for generation of random 
import java.util.*;
public  class Test{
		
		//private int design;
		private int numberOfPoints;

		private double [] randomXorRho;
		private double [] randomYorTheta;

		public PointCP2 [] pointCP2ForAnalysis;
		public PointCP3 [] pointCP3ForAnalysis;
		public PointCP5 [] pointCP5ForAnalysis;
		public PointCP5 [] pointCP5ForAnalysisConcretePoint2;

		public PointCP2 [] pointCP2PointB;
		public PointCP3 [] pointCP3PointB;
		public PointCP5 [] pointCP5PointB;
		public PointCP5 [] pointCP5PointB_2;

		

		public Test(int numberOfPoints){
			
			this.numberOfPoints = numberOfPoints;

			this.randomXorRho = randomXorRho(numberOfPoints);
			this.randomYorTheta = randomYorTheta(numberOfPoints);

		}
		//getters for verification
		public double[] getrandomXorRho(){
			return this.randomXorRho;
		}

		private double [] randomXorRho(int number){
			double [] randomXorRhoArray = new double [number];
			for (int i=0; i<number;i++){
				double randomRho = new Random().nextLong();
				randomXorRhoArray[i] = randomRho;
		}
		return randomXorRhoArray;
	}

		private double [] randomYorTheta(int number){
			double [] randomYorThetaArray = new double [number];
			for (int i=0; i<number;i++){
				double randomTheta = new Random().nextLong();
				randomYorThetaArray[i] = randomTheta;
		}
		return randomYorThetaArray;
	}



		//used to test the time
		public Object[] construct(int design, char type){

			if(design==2 && type == 'P'){
				Object[] arrayPointCP2P = new PointCP2[numberOfPoints];
				for (int i =0; i<numberOfPoints; i++){
					arrayPointCP2P[i] = new PointCP2('P',this.randomXorRho[i],this.randomYorTheta[i]);
					}
				return arrayPointCP2P;
			}

			if(design==2 && type == 'C'){
				Object[] arrayPointCP2C = new PointCP2[numberOfPoints];
				for (int i =0; i<numberOfPoints; i++){
					arrayPointCP2C[i] = new PointCP2('C',this.randomXorRho[i],this.randomYorTheta[i]);
					}
				return arrayPointCP2C;
			}

			else if(design == 3 && type == 'C'){
				Object[] arrayPointCP3C = new PointCP3[numberOfPoints];
				for (int i =0; i<numberOfPoints; i++){
					arrayPointCP3C[i] = new PointCP3('C',this.randomXorRho[i],this.randomYorTheta[i]);
					}
				return arrayPointCP3C;
			}

			else if(design == 3 && type == 'P'){
				Object[] arrayPointCP3P = new PointCP3[numberOfPoints];
				for (int i =0; i<numberOfPoints; i++){
					arrayPointCP3P[i] = new PointCP3('P',this.randomXorRho[i],this.randomYorTheta[i]);
					}
				return arrayPointCP3P;
			}

			else if (design == 8 && type == 'C'){
				//PointCP5 --> PointCP3_5
				Object[] arrayPointCP5_3 = new PointCP5[numberOfPoints];
				for (int i =0; i<numberOfPoints; i++){
					arrayPointCP5_3[i] = new PointCP3_5('C',this.randomXorRho[i],this.randomYorTheta[i]);
					}
				return arrayPointCP5_3;
			}

			else if (design == 8 && type == 'P'){
				//PointCP5 --> PointCP3_5
				Object[] arrayPointCP5_3 = new PointCP5[numberOfPoints];
				for (int i =0; i<numberOfPoints; i++){
					arrayPointCP5_3[i] = new PointCP3_5('P',this.randomXorRho[i],this.randomYorTheta[i]);
					}
				return arrayPointCP5_3;
			}

			else if (design == 7 && type == 'P'){
				//PointCP5 --> PointCP3_5
				Object[] arrayPointCP5_2 = new PointCP5[numberOfPoints];
				for (int i =0; i<numberOfPoints; i++){
					arrayPointCP5_2[i] = new PointCP2_5('P',this.randomXorRho[i],this.randomYorTheta[i]);
					}
				return arrayPointCP5_2;
			}
			else{
				Object[] arrayPointCP5_2 = new PointCP5[numberOfPoints];
				for (int i =0; i<numberOfPoints; i++){
					arrayPointCP5_2[i] = new PointCP2_5('C',this.randomXorRho[i],this.randomYorTheta[i]);
					}
				return arrayPointCP5_2;

			}

			
		}


		public void constructForTest(){


			double [] pointBxOrRho = randomXorRho(this.numberOfPoints);
			double [] pointByOrTheta = randomYorTheta(this.numberOfPoints);

			PointCP2[] arrayPointCP2 = new PointCP2[numberOfPoints];
			PointCP2[] arrayPointCP2B = new PointCP2[numberOfPoints];

			for (int i =0; i<numberOfPoints; i++){
					arrayPointCP2[i] = new PointCP2('P',this.randomXorRho[i],this.randomYorTheta[i]);
					arrayPointCP2B[i] = new PointCP2('P',pointBxOrRho[i],pointByOrTheta[i]);
				}
				this.pointCP2ForAnalysis = arrayPointCP2;
				this.pointCP2PointB = arrayPointCP2B;

			PointCP3[] arrayPointCP3 = new PointCP3[numberOfPoints];
			PointCP3[] arrayPointCP3B = new PointCP3[numberOfPoints];

			for (int i =0; i<numberOfPoints; i++){
					arrayPointCP3[i] = new PointCP3('C',this.randomXorRho[i],this.randomYorTheta[i]);
					arrayPointCP3B[i] = new PointCP3('C',pointBxOrRho[i],pointByOrTheta[i]);

				}
				this.pointCP3ForAnalysis = arrayPointCP3;
				this.pointCP3PointB = arrayPointCP3B;


			PointCP5[] arrayPointCP5 = new PointCP3_5[numberOfPoints];
			PointCP5[] arrayPointCP5B = new PointCP3_5[numberOfPoints];

			for (int i =0; i<numberOfPoints; i++){
					arrayPointCP5[i] = new PointCP3_5('C',this.randomXorRho[i],this.randomYorTheta[i]);
					arrayPointCP5B[i] = new PointCP3_5('C',pointBxOrRho[i],pointByOrTheta[i]);

				}
				this.pointCP5ForAnalysis = arrayPointCP5;
				this.pointCP5PointB = arrayPointCP5B;


			PointCP5 [] arrayPointCP5_2 = new PointCP2_5[numberOfPoints];
			PointCP5 [] arrayPointCP5B_2 = new PointCP2_5[numberOfPoints];

			for (int i =0; i<numberOfPoints; i++){
					arrayPointCP5_2[i] = new PointCP2_5('P',this.randomXorRho[i],this.randomYorTheta[i]);
					arrayPointCP5B_2[i] = new PointCP2_5('P',pointBxOrRho[i],pointByOrTheta[i]);

				}
				this.pointCP5ForAnalysisConcretePoint2 = arrayPointCP5_2;
				this.pointCP5PointB_2 = arrayPointCP5B_2;


			}


	}