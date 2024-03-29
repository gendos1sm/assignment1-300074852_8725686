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


//MODIFIED POINTCP --> Design 2
//only stores polar coorinates only
//*********************************
// Assignment 1 SEG
// Part 1
//*********************************


public class PointCP2
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
  public PointCP2(char type,double xOrRho, double yOrTheta)
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
	
  /**
   * Returns PointCP3 which stores cartesian coordinates
   */
  
  public PointCP3 convertStorageToCartesian()
  {
    //Note: pointCP3 will construct and store as cartesian, but here we pass 
    //polar stored in PointCP2
    PointCP3 returnPoint = new PointCP3('P',this.Rho,this.Theta);
    return returnPoint;
  }
  

  /**
   * Calculates the distance in between two points using the Pythagorean
   * theorem  (C ^ 2 = A ^ 2 + B ^ 2). Not needed until E2.30.
   *
   * @param pointA The first point.
   * @param pointB The second point.
   * @return The distance between the two points.
   */
  public double getDistance(PointCP2 pointB)
  {
    // Obtain differences in X and Y, sign is not important as these values
    // will be squared later.
    double deltaX = getX() - pointB.getX();
    double deltaY = getY() - pointB.getY();
    
    return Math.sqrt((Math.pow(deltaX, 2) + Math.pow(deltaY, 2)));
  }

  /**
   * Rotates the specified point by the specified number of degrees.
   * Not required until E2.30
   *
   * @param point The point to rotate
   * @param rotation The number of degrees to rotate the point.
   * @return The rotated image of the original point.
   */
  public PointCP2 rotatePoint(double rotation)
  {
    double radRotation = Math.toRadians(rotation);
    double X = getX();
    double Y = getY();
        
    return new PointCP2('C',
      (Math.cos(radRotation) * X) - (Math.sin(radRotation) * Y),
      (Math.sin(radRotation) * X) + (Math.cos(radRotation) * Y));
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
