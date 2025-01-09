public class ConeAreaVolume {
    public void Area(double height,double radius){
    double area= 3.14*radius * (Math.sqrt(radius*radius + height*height));

    System.out.println("The area of cone is: " + area);
    }

    public void Volume(double height,double radius){
    double volume= 1.0/3.0 * 3.14*radius * radius * height;
    System.out.println("The volume of cone is: " + volume);
}

    public void slantheights(double height,double radius){
        double slantheight= Math.sqrt(radius*radius + height*height);
        System.out.println("The slant height of cone is: " + slantheight);
    }
  public static void main(String[] args) {
        ConeAreaVolume cone = new ConeAreaVolume(); cone.Area(15,20 );
        cone.Volume(15,20 );
        cone.slantheights(15,20 );
  }  
}
