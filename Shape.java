import java.util.Scanner;

public class Shape {
    int l,b,r,h,w,side,x,y,z;
    double x1,x2,y1,y2;
    int Area,Per,Circum,dis;
    final int T = 2;
    final float PI = 3.141f;
    final int F = 4;
    final float HALF = 1/2f;
    Scanner sc = new Scanner(System.in);
    public void setRectangle(int l , int b)
    {
        this.l=l;
        this.b=b;
    }
    public void scanRectangle()
    {
        l=sc.nextInt();
        b=sc.nextInt();
    }
    public void setSquare(int side)
    {
        this.side=side;
    }
    public void scanSquare()
    {
        side=sc.nextInt();
    }
    public void setTriangle(int h,int w)
    {
        this.h=h;
        this.w=w;
    }
    public void scanTriangle()
    {
        h=sc.nextInt();
        w=sc.nextInt();
    }
    public void setCircle(int r)
    {
        this.r=r;
    }
    public void scanCircle()
    {
        r=sc.nextInt();
    }
    public void setLine(int x1,int x2,int y1,int y2)
    {
        this.x1=x1;
        this.x2=x2;
        this.y1=y1;
        this.y2=y2;
    }
    public void scanLine()
    {
        x1 = sc.nextInt();
        x2 = sc.nextInt();
        y1 = sc.nextInt();
        y2 = sc.nextInt();
    }

}
