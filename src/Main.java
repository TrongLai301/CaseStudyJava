import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Mobile mobile=new Mobile("iphone","vàng","M00001",4,1,0,10);
        mobile.setManufacturer("Samsung");
        mobile.setColor("Màu vàng");
        mobile.setWidth(15);
        mobile.displayInfo();

        Mobile mobile1=new Mobile("iphone","vàng","M00002",4,1,0,10);
        mobile1.setHeight(12);
        mobile1.setWidth(20);
        mobile1.setEnergy(100);
        mobile1.displayInfo();
    }
}