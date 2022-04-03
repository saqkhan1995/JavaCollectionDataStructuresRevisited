package SortingCollections;

import java.util.Arrays;

public class aSortingArrays {

    public static void main(String[] args) {

        // QuickSort - To Sort primitive types (int, float, double, char etc.)
        // MergeSort - To Sort reference type (Integer, String ...)

        int[] nums = {1, 10, 5, 2, -5, 12, 14, 0, 1, 2};

        Arrays.sort(nums);

        //Ascending
        for (int n : nums) {
            System.out.print(n + " ");
        }

        System.out.println();

        //Descending
        for (int i=nums.length-1;i>=0;i--) {
            System.out.print(nums[i] + " ");
        }

        System.out.println();


        String[] names = {"Kevin", "Daniel", "Katy", "Ana", "Joe", "Adam"};

        Arrays.sort(names);

        //Ascending
        for (String n : names) {
            System.out.print(n + " ");
        }

        System.out.println();

        //Descending
        for (int i=names.length-1;i>=0;i--) {
            System.out.print(names[i] + " ");
        }
    }
}
