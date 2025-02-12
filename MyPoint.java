public class MyPoint {
   private double x;
   private double y;
   
   
  public MyPoint(double x, double y){
      this.x = x;
      this.y = y;
      
  }
  
  public double getX(){
      return x;
  }
  
  public double getY(){
      return y;
  }
  
  public double distance(MyPoint p1) {
        return Math.sqrt((Math.pow(p1.getX() - this.x, 2) + Math.pow(p1.getY() - this.y, 2)));
      
  }
  

  public String toString(){
      return "x is: " + x + " and y is: " + y;
  }

   
    
}
