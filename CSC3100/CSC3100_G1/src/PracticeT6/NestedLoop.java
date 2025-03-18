package PracticeT6;

public class NestedLoop {
	public static void main(String[]args) {
		for (int x=1; x<=5; x++) {
			int y =10;
			while (y>=0) {
				System.out.println(x+"\t"+ y);
				y-=2;
			}
			System.out.println("----------------");
		}System.out.println("**************");
	}


}
