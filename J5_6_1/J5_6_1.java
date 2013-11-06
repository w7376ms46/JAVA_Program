import java.text.*;
public class J5_6_1 {
	public static void main(String[] argc)
	{
		double d1=12345.765;
		NumberFormat nf1=NumberFormat.getInstance();
		System.out.println(nf1.format(d1));
		System.out.println(NumberFormat.getCurrencyInstance().format(d1));
		
	}
}
