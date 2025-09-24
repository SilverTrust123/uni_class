public class Point 
{
   private int x;  // 點的x座標
   private int y;  // 點的y座標
   // no-argument constructor; x and y default to 0
   public Point()
   {  
      //無引數建構子將點座標設定為原點  this(0, 0);
      setX(0); 
      setY(0); 
   } //end no-argument constructor

   //二引數constructor  
   public Point( int xValue, int yValue )
   {
      // implicit call to Object constructor occurs here
      setX(xValue);  
      setY(yValue);  
   } //end two-argument constructor
 
   // set x in coordinate pair
   public void setX( int xValue )
   {
      x = xValue;  // no need for validation
   } //end method setX

   // return x from coordinate pair
   public int getX()
   {
      return x;
   } //end method getX

   // set y in coordinate pair
   public void setY( int yValue )
   {
      y = yValue;  // no need for validation
   } //end method setY

   // return y from coordinate pair
   public int getY()
   {
      return y;
   } //end method getY

   // override abstract method getName to return "Point"
   public String getName()
   {
      return "Point";
   } //end method getName

   // override toString to return String representation of Point
   public String toString()
   {
      return "(" + getX() + ", " + getY() + ")";
   } //end method toString
} // end class Point
