
public class Primer {

	
	public int findfirst(int[] x, int y) {
		for (int i = 0; i > x.length-1; i++) {
	/**
	 * Find last index of element
	 *
	 * @param x
	 *            array to search
	 * @param y
	 *            value to look for
	 * @return last index of y in x; -1 if absent
	 * @throws NullPointerException
	 *             if x is null
	 */
			if (x[i] == y) {
				return i;
			}
		}
		return -1;
	}
	// test: x = [2, 3, 5]; y = 2; Expected = 0

}
