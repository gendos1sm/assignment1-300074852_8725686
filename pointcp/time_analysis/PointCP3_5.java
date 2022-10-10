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



//MODIFIED POINT CP --> Design 5 with Concrete Class of design 3
//only stores cartesian coorinates only
//*********************************
// Assignment 1 SEG
// Part1
//*********************************


public class PointCP3_5 extends PointCP5
{
  //Instance variables ************************************************

  /**
   * Contains C(artesian) or P(olar) to identify the type of
   * coordinates that are being dealt with.
   */
  
  /**
   * Contains the current value of X or RHO depending on the type
   * of coordinates.
   */
  private double x;
  
  /**
   * Contains the current value of Y or THETA value depending on the
   * type of coordinates.
   */
  private double y;
	
  
  //Constructors ******************************************************

  /**
   * Constructs a coordinate object, with a type identifier.
   */
  public PointCP3_5(char type,double xOrRho, double yOrTheta)
  {

    if(type != 'C' && type != 'P')
      throw new IllegalArgumentException();
    if(type == 'C'){
      this.x = xOrRho;
      this.y = yOrTheta;
    }
    else{
      this.x = Math.cos(Math.toRadians(yOrTheta)) * xOrRho;
      this.y = (Math.sin(Math.toRadians(yOrTheta)) * xOrRho);
    }
    
  }
	
  
  //Instance methods **************************************************
 
 
  public double getX()
  {
      return x;

  }
  
  public double getY()
  {
      return y;
  }
  
  public double getRho()
  {
      return (Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)));
  }
  
  public double getTheta()
  {
    
      return Math.toDegrees(Math.atan2(y, x));
  }
  
	

  /**
   * Converts Cartesian coordinates to Polar coordinates 
   * and return as Point2_5.
   */
  
  public PointCP5 convertStorageToPolar()
  {
    PointCP5 pointReturn = new PointCP2_5('C', this.x,this.y);
    return pointReturn;
  }

  //This method is implemented as per abstract parent class and for
  //testing purposes (PointCPTest5)
  
	public PointCP5 convertStorageToCartesian(){
    return this;
  }
  

  /**
   * Returns information about the coordinates.
   *
   * @return A String containing information about the coordinates.
   */
  public String toString()
  {
    return "Stored as cartesian only " + getX() + "," + getY() + ")" + "\nPolar [" + getRho() + "," + getTheta() + "]";
  }
}
