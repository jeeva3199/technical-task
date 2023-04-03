package technicalquestions;
// compare two arrays and return the common elements

	import java.util.ArrayList;
	import java.util.Arrays;

	public class commonelements {
	    public static void main(String[] args) {
	        int[] arr1 = {1, 2, 3, 4, 5};
	        int[] arr2 = {3, 4, 5, 6, 7};
	        int[] common = findCommonElements(arr1, arr2);
	        System.out.println("Common elements: " + Arrays.toString(common));
	    }
	    
	    public static int[] findCommonElements(int[] arr1, int[] arr2) {
	        ArrayList<Integer> commonList = new ArrayList<Integer>();
	        for (int i = 0; i < arr1.length; i++) {
	            for (int j = 0; j < arr2.length; j++) {
	                if (arr1[i] == arr2[j]) {
	                    commonList.add(arr1[i]);
	                }
	            }
	        }
	        int[] commonArray = new int[commonList.size()];
	        for (int i = 0; i < commonList.size(); i++) {
	            commonArray[i] = commonList.get(i);
	        }
	        return commonArray;
	    }
	}



