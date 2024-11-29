package DataStructures;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] arr1 = new int[10];//Array is not resizable and is fixed- 10 is the size
        arr1 [5] =50;
        arr1 [0] = 20;
        arr1 [1] = 21;
        arr1 [7] = 34;


        double[] arr2 =new double[10];
        arr2 [2]= 2.3;
        arr2 [1]= 4.5;
        arr2 [9] = 34;
        System.out.println(arr1[0]);// printing element on second position
        System.out.println(arr1[7]);
        System.out.println(arr2[9]);


        int [] arr3 = new int []{ 21,34,23,45};
        System.out.println("First value in array " + arr3[0]);

        int arr3Length = arr3.length;
        System.out.println("Length of array is: " + arr3Length);

        System.out.println("last value in array " + arr3[3]);
        System.out.println("Last value in array (through subtraction) " + arr3[arr3Length-1]);

        int[] arr4 =  new int []{ 5, 4, 3, 2, 1, 0};
        for(int i=0; i< arr4.length; i++){
            System.out.println("\n"+ arr4[i] );
        }

        int [] arr5 = new int[5];
        for(int i=0; i<arr5.length; i++){
            arr5[i] = arr5.length-i;
        }
        for(int i=0; i< arr5.length; i++){
            System.out.println("\n"+ arr4[i] );
        }


        System.out.println();         //Shortcut of above for loop
        for (int element: arr5){
            System.out.println(element + " ");
        }

        System.out.println(Arrays.toString(arr5));


  //From
        int arr6[]= {1801,2,3,4,5,6};
        System.out.println(arr6[0]);



        // Multidimentional array are thore in which we want to store data in tabular form like tables

        //int [][] arr7 ={{ 1,2,2}, {9,8,7}};
        int arr7[][]={{1,2,2}, {9,8,7}};
        System.out.println(arr7[1][2]);



        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr)); // Output: [1, 2, 3, 4, 5]
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(Arrays.deepToString(matrix)); // Output: [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
        int[] arr8 = {5, 2, 8, 1, 3};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); // Output: [1, 2, 3, 5, 8]

        int[] arr9 = {1, 2, 3, 4, 5};
        int index = Arrays.binarySearch(arr, 3);
        System.out.println(index); // Output: 2 (index of 3)


        int[] arr10 = {1, 2, 3, 4};
        int[] newArr = Arrays.copyOf(arr, 6);
        System.out.println(Arrays.toString(newArr)); // Output: [1, 2, 3, 4, 0, 0]


        int[] arr11  = new int[5];
        Arrays.fill(arr, 7); // Fills the array with 7
        System.out.println(Arrays.toString(arr)); // Output: [7, 7, 7, 7, 7]

// Filling a range
        Arrays.fill(arr, 1, 4, 9); // Fills indices 1 to 3 with 9
        System.out.println(Arrays.toString(arr)); // Output: [7, 9, 9, 9, 7]


    }}




//Drawbacks of array: Fixed size we cannot change in future

/*String Conversion: toString(), deepToString()
Sorting: sort()
Searching: binarySearch()
Copying: copyOf(), copyOfRange()
Filling: fill()
Comparison: equals()
Stream Conversion: stream()
List Conversion: asList()
Hashing: hashCode()
Index-based Initialization: setAll()
*/