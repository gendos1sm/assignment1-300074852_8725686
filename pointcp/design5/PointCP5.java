public abstract class PointCP5{


	public abstract double getX();
	public abstract double getY();
	public abstract double getRho();
	public abstract double getTheta();


	public abstract PointCP5 convertStorageToPolar();
	public abstract PointCP5 convertStorageToCartesian();


	public double getDistance(PointCP5 pointB)
  	{
    // Obtain differences in X and Y, sign is not important as these values
    // will be squared later.
    double deltaX = getX() - pointB.getX();
    double deltaY = getY() - pointB.getY();
    
    return Math.sqrt((Math.pow(deltaX, 2) + Math.pow(deltaY, 2)));
  	}

  	public PointCP5 rotatePoint(double rotation)
  	{
    double radRotation = Math.toRadians(rotation);
    double X = getX();
    double Y = getY();
        
    return new PointCP3_5('C',
      (Math.cos(radRotation) * X) - (Math.sin(radRotation) * Y),
      (Math.sin(radRotation) * X) + (Math.cos(radRotation) * Y));
  	}


}
