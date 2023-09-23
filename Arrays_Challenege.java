Sorted Array
Create a program using arrays that sorts a list of integers in descending order.
Descending order is highest value to lowest.
In other words if the array had the values in it [106, 26, 81, 5, 15] your program should ultimately have an array with [106, 81, 26, 15, 5] in it.
Set up the program so that the numbers to sort are read in from the keyboard (Scanner).
Implement the following methods:
getIntegers has one parameter of type int which is the size of the array. It returns an array of entered integers from the keyboard.
printArray accepts an array and prints out the contents of the array. It should be printed in the following format:
Element 0 contents 106
Element 1 contents 81
Element 2 contents 26
Element 3 contents 15
Element 4 contents 5
sortIntegers accepts the unsorted array. It should sort the array and return a new array containing the sorted numbers.
The scenario is:
1. getIntegers() is called.
2. The returned array from getIntegers() is then used to call sortIntegers().
3. The returned array from sortIntegers() is then printed to the console.

SortedArray Class:

import java.util.*;
public class SortedArray {
    public static int[] getIntegers(int size){
        int[] array=new int[size];
        Scanner s=new Scanner(System.in);
        for(int i=0;i<size;i++){
            System.out.println("Enter "+i+" Numbers");
            int num=s.nextInt();
            array[i]=num;
        }
        sortIntegers(array);
        return array;

    }
    public static int[] sortIntegers(int[] arr){
        Arrays.sort(arr);
        int[] sortArray=new int[arr.length];
        int n= arr.length-1;
        for(int i=0;i< arr.length;i++){
            sortArray[i]=arr[n-i];
        }
        printArray(sortArray);
        return sortArray;
    }
    public static void printArray(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.println("Element " + i + " contents " + arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] array=getIntegers(3);
    }
}
Output:
Enter 0 Numbers
1
Enter 1 Numbers
2
Enter 2 Numbers
3
Element 0 contents 3
Element 1 contents 2
Element 2 contents 1
