
public class mainApp {
	
	public static void main(String[] args) {
		//這是第一個版本
		System.out.println("1st version");
		Math cMath = new Math();
		System.out.println();
		System.out.println(cMath.add(10, 20));
	}

}

class Math{
	int add(int x, int y) {
		return x+y;
	}
}