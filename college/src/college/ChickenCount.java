package college;

public class ChickenCount {

	public static void main(String[] args) {
		int eggsPerChicken = 5, chickenCount = 3;
		int total_eggs_monday = chickenCount * eggsPerChicken;
		int total_eggs_Tuesday = (chickenCount + 1) * eggsPerChicken;
		chickenCount++;
		int total_eggs_Wednesday = (chickenCount / 2) * eggsPerChicken;
        int totalEggs = total_eggs_monday +  total_eggs_Tuesday + total_eggs_Wednesday;
        System.out.print("Total eggs on Monday " + total_eggs_monday);
        System.out.print("\nTotal eggs on Tuesday " + total_eggs_Tuesday);
        System.out.print("\nTotal eggs on Wednesday " + total_eggs_Wednesday);
        System.out.print("\nTotal Eggs " + totalEggs);

	}

}
