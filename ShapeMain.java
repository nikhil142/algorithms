public class ShapeMain {
    public static void main(String args[])
    {
        Rectangle rectangle =new Rectangle();
        Square square = new Square();
        Triangle triangle = new Triangle();
        System.out.println("enter the length and breadth of recctangle");
        rectangle.scanRectangle();
        int a=rectangle.areaRectangle();
        int p=rectangle.perimetreRectangle();
        System.out.println("area of rectangle is" + a);
        System.out.println("perimeter of rectangle is" + p);
        System.out.println("enter the side of square");
        square.scanSquare();
        System.out.println("the area  of square = "+square.areaSquare());
        System.out.println("the perimeter of square = "+square.perSquare());
        System.out.println("enter the height and width");
        triangle.scanTriangle();
        System.out.println("the area of triangle =" + triangle.areaTriangle());
        System.out.println("the perimeter of triangle =" + triangle.perimetreTriangle());
    }
}
