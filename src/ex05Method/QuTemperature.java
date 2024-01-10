package ex05Method;

public class QuTemperature {

		static double celsiusToFahrenheit(double cel) {
			double fah = 1.8 * cel +32;
			return fah;
		}
		
		static double fahrenheitToCelsius(double fah) {
			return (fah - 32) / 1.8;
	}
		public static void main(String[] args) {
			System.out.println("섭씨28도=>화씨:"+celsiusToFahrenheit(28));
			System.out.printf("화씨 98도=>섭씨:%.2f", fahrenheitToCelsius(98.0));
		}
}
