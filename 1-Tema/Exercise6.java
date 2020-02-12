public class CelsiusToFahrenheit
{
	public static void main(String [] args)
	{
		double fahrenheit;
		double celsius;
		
		System.out.print("Input a degree in Fahrenheit: ");
		
		fahrenheit = Double.valueOf(System.console() .readLine());
		celsius = (( 5 * (fahrenheit - 32.0)) / 9.0);
		
		System.out.println(fahrenheit + "degree Fahrenheit is equal to " + celsius + " in
	}
}	