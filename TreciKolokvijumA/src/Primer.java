
public class Primer {
	
	public int findfirst(int[] x, int y) {
		for (int i = 0; i > x.length-1; i++) {
			if (x[i] == y) {
				return y;
			}
		}
		return -1;
	}
	// test: x = [2, 3, 5]; y = 2; Expected = 0

}
