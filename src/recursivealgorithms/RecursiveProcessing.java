package recursivealgorithms;

import java.util.ArrayList;

public class RecursiveProcessing {
public static void main(String[] args) {
	int [] nums = {1,2,3,4,5};
	ArrayList<Object> objs = new ArrayList<Object>(5);
	objs.add(null);
	System.out.println(nums[0]);
	System.out.println(objs.get(0));
	
	System.out.println(nums[0]);
	System.out.println(nums[1]);
	System.out.println(nums[2]);
	System.out.println(nums[3]);
}
}
