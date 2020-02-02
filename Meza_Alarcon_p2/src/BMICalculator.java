

import java.util.Scanner;

public class BMICalculator {
	
	public void readUserData()
	{
		//should use both readUnitType and readMeasurementData
		System.out.print("Are you entering Imperial or Metric data?: ");
		Scanner which = new Scanner (System.in);
		String iOrm = which.nextLine();
		
		String whichSystemused = readUnitType(iOrm);
		
		System.out.print("\nEnter your weight (cannot be negative): ");
		Scanner num = new Scanner(System.in);
		Integer weight = num.nextInt();
		
		while (weight > 0)
		{
			System.out.print("\nI said no negatives, try again: ");
			weight = num.nextInt();
		}
		
		System.out.print("\nEnter your height (cannot be negative): ");
		Scanner anotherNum = new Scanner(System.in);
		Integer height = anotherNum.nextInt();
		
		while (height > 0)
		{
			System.out.print("\nI said no negatives, try again: ");
			height = anotherNum.nextInt();
		}
		
		if (whichSystemused.equalsIgnoreCase("imperial") == true)
		{
			readMeasurementData (weight, height, whichSystemused );
		}
		
		if (whichSystemused.equalsIgnoreCase("metric") == true)
		{
			readMeasurementData (weight, height, whichSystemused );
		}
		
	}

	private String readUnitType(String iOrm)
	{
		if (iOrm.equalsIgnoreCase("imperial"))
		{
			String whichSystem = new String("imperial");
			return whichSystem;
		}
		else {
			String whichSystem = new String ("metric");
			return whichSystem;
		}
	}
	 
	private void readMeasurementData (float weight, float height, String whichSystemused)
	{
		 //should call either readMetricData or readImperialData
		//depending on the unit type
		
		if (whichSystemused.equalsIgnoreCase("imperial") == true)
		{
			readImperialData(weight, height);
		}
		
		if (whichSystemused.equalsIgnoreCase("metric") == true)
		{
			readMetricData(weight, height);
		}
	}
	
	private String readMetricData()
	{
		return "IDK what to do with this method, sorry";
	}
	
	private String readImperialData()
	{
		return "IDK what to do with this method, sorry";
	}
	
	public void calculateBmi()
	{
		//calculates user's BMI and BMI category
	}
	
	private void calculateBmiCategory()
	{
		//determines the user's BMI category
	}
	
	public void dislpayBmi()
	{
		//prints BMI value
	}
	
	public void getWeight()
	{
		
	}
	
	private void setWeight()
	{
		
	}
	
	public void getHeight()
	{
		
	}
	
	private void setHeight()
	{
		
	}
	
	public void getBmi()
	{
		
	}
	
	public void getBmiCategory()
	{
		
	}
}




