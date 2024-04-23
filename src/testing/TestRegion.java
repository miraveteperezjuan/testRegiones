package testing;

import modelo.javabeans.Region;

public class TestRegion {

	public static void main(String[] args) {
		Region r1 = new Region(1, "Europa");
		System.out.println(r1);
		System.out.println(r1.getRegionName());

	}

}
