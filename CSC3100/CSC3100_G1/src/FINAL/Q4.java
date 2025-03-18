package FINAL;
public class Q4 {
	public static void main(String[]args) {
		int[][]array= new int [] []
				{{14,21,15,12,33},
				{21,71,15,16,31},
				{55,35,21,41,15},
				{14,25,51,19,33}};
		for (int i =0 ;i<array.length; i++) {
			double sum=0.0;
			int min= array [i][0];
			for (int j =0; j< array[i].length; j++) {
				if (array[i][j]< min)
					min=array[i][j];
				sum+=array[i][j];
			}
			System.out.println("The lowest case for country "+i+" is "+ min);
			System.out.println("The average case for country "+i+" is "+ sum/array[i].length);
		}
		
		
	

}
}
