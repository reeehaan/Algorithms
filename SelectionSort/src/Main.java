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
        selectionSort(array);
        System.out.println("Sorted array----------------!");
        printArray(array);

    }
    private static void selectionSort(int[] array) {
        for(int i=0; i < array.length-1; i++){
            int min = i;
            for(int j = i+1; j < array.length ;j++){
                if(array[min]>array[j]){
                    min = j;
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }
    private static void printArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }
    }


}