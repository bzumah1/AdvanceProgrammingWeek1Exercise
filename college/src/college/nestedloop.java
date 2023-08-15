package college;

public class nestedloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 2;
		for(int i = 0; i<=n; i++){
			System.out.println("A "+i);
			for(int j = 0;j<=i;j++) {
				System.out.println("B "+j);
			}
			
		}
	}

}
