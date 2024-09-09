package Java_Package;

public class Fibonacci_1 {

public void Fib()
{
	int a=0;
	int b=1;
	int c=0;
		for(int i=1;i<=7;i++)
		{
		a=b;
		b=c;
		//c=a+b;
		System.out.println("My Fibnocci is" + ":" + c);
		c=a+b;
		}
}
}
