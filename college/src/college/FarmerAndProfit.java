package college;

public class FarmerAndProfit {

	public static void main(String[] args) {
		int mondayEggs = 100, 
				tuesdayEggs = 121, 
				wednesdayEggs = 117;
		double dailyAverage = (mondayEggs + tuesdayEggs + wednesdayEggs) / 3;
		double monthlyAverage = dailyAverage * 30;
		double profitPerEgg = 0.18, totalProfit = monthlyAverage * profitPerEgg;
		System.out.printf("Daily Average: ", dailyAverage);
		System.out.printf("Monthly Average: ", monthlyAverage);
		System.out.printf("Total Monthly Profit: ", totalProfit);

	}

}
