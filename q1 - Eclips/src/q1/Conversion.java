package q1;

public class Conversion {

	double GramsToOunces(double weight)
	{
		double ans;
		ans = weight / 28.35;
		System.out.println(ans);
		return ans;
	}
	double OunToGrams(double weight) 
	{
		double ans;
		ans = weight * 28.35;
		return ans;
	}
	double KgToStone(double weight) 
	{
		double ans;
		ans = weight / 6.35;
		return ans;
	}
	double StoneToKg (double weight) 
	{
		double ans;
		ans = weight * 6.35;
		return ans;
	}
	double PoundsToGram(double weight)
	{
		double ans;
		ans = weight * 453.592;
		return ans;
	}
	double GramToPound (double weight) 
	{
		double ans;
		ans = weight / 453.592;
		return ans;
	}
}
