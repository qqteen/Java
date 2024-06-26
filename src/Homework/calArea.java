package Homework;

public class calArea
{
    public static void main(String[] args) {
        calArea object = new calArea();

        int area = object.calculateArea(30,10);
        System.out.println("This area is " + area);
    }
    public static int calculateArea (int weightRec, int heightofRec ) {
        int area = weightRec * heightofRec;
        return area;
    }
}
