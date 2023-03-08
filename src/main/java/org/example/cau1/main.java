package org.example.cau1;

public class main {
    public static void main(String[] args) {
        // Circle[r = 1]
        Circle c1 = new Circle();
        System.out.println(c1.getArea());
        System.out.println(c1.getCircumference());
        System.out.println(c1);


        // Test Error
        try{
            Circle c2 = new Circle(-2);
        }
        catch (Exception e){
            System.out.println(e);
        }

        try{
            Circle c3 = new Circle(3);
            c3.setRadius(-4);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
