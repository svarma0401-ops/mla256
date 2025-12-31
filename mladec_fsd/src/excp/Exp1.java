package excp;

public class Exp1 {

	public static void main(String[] args) {
		
		try
		{
			System.out.println(10/4);
			
			String str = "java";
			System.out.println(str.charAt(1));
			
			int x = Integer.parseInt("11.00");
			System.out.println(x);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Dont Enter Zero for denominator" );
		}
		catch(NullPointerException npe)
		{
			System.out.println("String input Mandatory");
		}
		catch(Exception e)
		{
			System.out.println("check ur input");
		}
		
		finally {
			System.out.println("Let go");
		}
	}
}
