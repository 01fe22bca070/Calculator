class Calculator {

    float a;
    float b;
    public void add(float a,float b)
    {
        float  c=a+b;
        System.out.println("the sum of " +a+ " and " +b+ " is" +c);
    }
    public void sub(float a,float b)
    {
        float  d=a-b;
        System.out.println("the difference of " +a+ " and " +b+ " is" +d);
    }
public void mul(float a,float b)
{
    float  e=a*b;
    System.out.println("the multiplication of " +a+ " and " +b+ " is" +e);
}

public void div(float a,float b)
{
    float  f=a/b;
    System.out.println("the division of  " +a+ "  and  " +b+ " is " +f);
}

    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        ExtendedCalculator c = new ExtendedCalculator();
        c1.add(3, 6);
        c1.sub(3, 7);
        c1.mul(3, 7);
        c1.div(4,6);
        c.square(4);
        c.cube(4);
        
    }
}