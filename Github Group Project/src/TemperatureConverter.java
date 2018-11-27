import java.util.Scanner;
public class TemperatureConverter
	{
		static boolean firstTempFarenheit = false;
		static boolean firstTempCelsius = false;
		static boolean firstTempKelvin = false;
		static boolean convertToFarenheit = false;
		static boolean convertToCelsius = false;
		static boolean convertToKelvin = false;
		static double firstTemp = 0;
		static String originalTempUnit = "";
		static int firstTempUnit = 0;
		static String convertedUnit = "";
		static int conversionUnit = 0;
		static Scanner userInput = new Scanner(System.in);
		static double convertedTemp = 0;
		public static void main(String[] args)
			{
				convertTemperature();
			}
		public static void convertTemperature()
			{
				boolean running = true;
				while (running)
					{
						System.out.println("Enter the number that corresponds with the unit that your temperature is in.");
						System.out.println("(1) Farenheit");
						System.out.println("(2) Celcius");
						System.out.println("(3) Kelvin");
						firstTempUnit = userInput.nextInt();
						if (firstTempUnit == 1 || firstTempUnit == 2 || firstTempUnit == 3)
							{
								running = false;
								if (firstTempUnit == 1)
									{
										firstTempFarenheit = true;
										originalTempUnit = "Farenheit";
									}
								else if (firstTempUnit == 2)
									{
										firstTempCelsius = true;
										originalTempUnit = "Celcius";
									}
								else if (firstTempUnit == 3)
									{
										firstTempKelvin = true;
										originalTempUnit = "Kelvin";
									}
							}
					}
				System.out.println("Enter the number that corresponds with the unit you want to convert " + firstTemp + " degrees " + originalTempUnit + " into.");
				System.out.println("(1) Farenheit");
				System.out.println("(2) Celcius");
				System.out.println("(3) Kelvin");
				firstTempUnit = userInput.nextInt();
				if (firstTempUnit != 1 && firstTempUnit != 2 && firstTempUnit != 3)
					{
						running = true;
						while (running)
							{
								System.out.println("Enter the number that corresponds with the unit you want to convert " + firstTemp + " degrees " + originalTempUnit + " into.");
								System.out.println("(1) Farenheit");
								System.out.println("(2) Celcius");
								System.out.println("(3) Kelvin");
								conversionUnit = userInput.nextInt();
								if (firstTempUnit == 1 || firstTempUnit == 2 || firstTempUnit == 3)
									{
										running = false;
									}
							}
					}
				else if (conversionUnit == firstTempUnit)
					{
						running = true;
						while (running)
							{
								System.out.println("Your original temperature is in " + originalTempUnit + ".");
								System.out.println("Please choose a unit other than " + originalTempUnit + " to convert " + firstTemp + " degrees " + originalTempUnit + " into.");
								System.out.println("(1) Farenheit");
								System.out.println("(2) Celcius");
								System.out.println("(3) Kelvin");
								conversionUnit = userInput.nextInt();
								if (conversionUnit == 1 || conversionUnit == 2 || conversionUnit == 3)
									{
										if (conversionUnit != firstTempUnit)
											{
												running = false;
												if (conversionUnit == 1)
													{
														convertToFarenheit = true;
														convertedUnit = "Farenheit";
													}
												else if (conversionUnit == 2)
													{
														convertToCelsius = true;
														convertedUnit = "Celcius";
													}
												else if (conversionUnit == 3)
													{
														convertToKelvin = true;
														convertedUnit = "Kelvin";
													}
											}
									}
							}
					}
				else if (conversionUnit == 1)
					{
						convertToFarenheit = true;
						convertedUnit = "Farenheit";
					}
				else if (conversionUnit == 2)
					{
						convertToCelsius = true;
						convertedUnit = "Celcius";
					}
				else if (conversionUnit == 3)
					{
						convertToKelvin = true;
						convertedUnit = "Kelvin";
					}
				if (firstTempFarenheit && convertToCelsius)
					{
						convertedTemp = firstTemp - 32;
					}
				else if (firstTempFarenheit && convertToKelvin)
					{
						convertedTemp = firstTemp + 255.372;
					}
				else if (firstTempCelsius && convertToFarenheit)
					{
						convertedTemp = firstTemp + 32;
					}
				else if (firstTempCelsius && convertToKelvin)
					{
						convertedTemp = firstTemp + 273.15;
					}
				else if (firstTempKelvin && convertToFarenheit)
					{
						convertedTemp = firstTemp - 255.372;
					}
				else if (firstTempKelvin && convertToCelsius)
					{
						convertedTemp = firstTemp - 273.15;
					}
				System.out.println(firstTemp + " degrees " + originalTempUnit + " is equal to " + convertedTemp + " degrees " + convertedUnit + ".");
			}
	}
