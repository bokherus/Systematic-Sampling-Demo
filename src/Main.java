import java.util.Arrays;

import sampler.StringSampler;

public class Main {
	public static void main(String[] args) {
		String[] dataSet = { "Kr", "Ca", "Ra", "Mrok", "Cru",
		         "Ray", "Bre", "Zed", "Drak", "Mor", "Jag", "Mer", "Jar", "Mjol",
		         "Zork", "Mad", "Cry", "Zur", "Creo", "Azak", "Azur", "Rei", "Cro",
		         "Mar", "Luk" };
		
		System.out.println("Original DataSet");
		System.out.println(Arrays.toString(dataSet));
		System.out.println(dataSet.length);
		System.out.println();
		
		StringSampler sampler = new StringSampler();
		
		System.out.println("After Systematic Sampling");
		String[] newSet = sampler.sample(dataSet);
		System.out.println(Arrays.toString(newSet));
	}
}

