import java.util.Scanner;
public class Rectangle{
 public static void main(String[] args){
  float length,breadt,area,perimeter;
  Scanner s = new Scanner(System.in);
  System.out.println("enter length:");
  length=s.nextFloat();

  Scanner b = new Scanner(System.in);
  System.out.println("enter breadth:");
  breadt=b.nextFloat();

  area=length*breadt;
  System.out.println("area:"+area);
  perimeter=2*(length + breadt);
  System.out.println("perimeter:"+perimeter);

}
}
