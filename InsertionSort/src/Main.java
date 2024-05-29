import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int arraySize = scn.nextInt();
        int[] array = new int[arraySize];
        System.out.println("Enter the array elements: ");
        for(int i = 0; i < array.length; i++){
            array[i] = scn.nextInt();
        }
        inserstionSort(array);
        System.out.println("Sorted array----------------!");
        printArray(array);

    }

    private static void inserstionSort(int[] array) {
        for(int i = 1;i< array.length;i++){
            int temp = array[i];
            int j = i-1;

            while(j >= 0 && array[j] > temp){
                array[j+1] = array[j];
                j--;
            }
            array[j +1 ]=temp;
        }
    }

    public static void printArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }
    }
}