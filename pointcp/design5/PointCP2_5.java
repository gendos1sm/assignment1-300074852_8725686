// This file contains material supporting section 2.9 of the textbook:
// "Object Oriented Software Engineering" and is issued under the open-source
// license found at http://www.site.uottawa.ca/school/research/lloseng/

/**
 * This class contains instances of coordinates in either polar or
 * cartesian format.  It also provides the utilities to convert
 * them into the other type. It is not an optimal design, it is used
 * only to illustrate some design issues.
 *
 * @author Fran&ccedil;ois B&eacute;langer
 * @author Dr Timothy C. Lethbridge
 * @version July 2000
 */


//MODIFIED POINT CP --> Design 2
//only stores polar coorinates only
//*********************************
// Assignment 1 SEG
// Part1
//*********************************


public class PointCP2_5 extends PointCP5
{
  //Instance variables ************************************************

  
  /**
   * Contains the current value of X or RHO depending on the type
   * of coordinates.
   */
  private double Rho;
  
  /**
   * Contains the current value of Y or THETA value depending on the
   * type of coordinates.
   */
  private double Theta;
	
  
  //Constructors ******************************************************

  /**
   * Constructs a coordinate object, with a type identifier.
   */
  public PointCP2_5(char type,double xOrRho, double yOrTheta)
  {
    //if polar coordinates are provided
    
    if(type != 'C' && type != 'P')
      throw new IllegalArgumentException();

    if(type == 'P'){
      this.Rho = xOrRho;
      this.Theta = yOrTheta;
    }
      //the constructor lets the user to input Cartesian coordinates
      //but they will be converted to Polar and stored as polar only
      else{
        this.Rho = Math.sqrt(Math.pow(xOrRho, 2) + Math.pow(yOrTheta, 2));
        this.Theta = Math.toDegrees(Math.atan2(yOrTheta, xOrRho));

      }

    }

  
  //Instance methods **************************************************
 
  //computes on demand 
  public double getX()
  {
      return (Math.cos(Math.toRadians(Theta)) * Rho);
  }
  
  //computes on demand
  public double getY()
  {
      return (Math.sin(Math.toRadians(Theta)) * Rho);
  }
  
  public double getRho()
  {
      return Rho;
      }
  
  public double getTheta()
  {
      return Theta;
      }
  
	
 
	public PointCP5 convertStorageToPolar()
  {
    return this;
  }
  /**
   * Converts Polar coordinates to Cartesian coordinates and returns PointCP3_5.
   */
  
  public PointCP5 convertStorageToCartesian()
  {
    //Note: pointCP3 will construct and store as cartesian, but here we pass 
    //polar stored in PointCP2
    PointCP5 returnPoint = new PointCP3_5('P',this.Rho,this.Theta);
    return returnPoint;
  }

  /**
   * Returns information about the coordinates.
   *
   * @return A String containing information about the coordinates.
   */
  public String toString()
  {
    return "Stored as polar coordinates " + "\n" +
        
       "Polar [" + getRho() + "," + getTheta() + "]" + "\n" + "Cartesian conversion (" + getX() + "," + getY() + ")" ;
  }

}
