package parallelprocessing.sum;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ParalleSuming {
public static void main(String[] args) {
	//Define variables 
	ArrayList<Integer> nums = new ArrayList<>(100000);
	//int[] array = new int [1000];
	List<Integer> numns2 =new ArrayList<Integer>();
	
	ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
}
}
