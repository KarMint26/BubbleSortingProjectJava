import java.util.ArrayList;
import java.util.Scanner;

public class BubbleSortApp {
    public static Scanner scanner;
    public static BubbleSort bubbleSort = new BubbleSort();
    public static String inputData(String x){
        scanner = new Scanner(System.in);
        System.out.print(x + " : ");
        return scanner.nextLine();
    }
    public static int[] convertIntegers(ArrayList<Integer> integers) {
        int[] ret = new int[integers.size()];
        for (int i=0; i < ret.length; i++)
        {
            ret[i] = integers.get(i);
        }
        return ret;
    }
    public static String[] convertStrings(ArrayList<String> strings) {
        String[] ret = new String[strings.size()];
        for (int i=0; i < ret.length; i++)
        {
            ret[i] = strings.get(i);
        }
        return ret;
    }
    public static void integerSorting(){
        ArrayList <Integer> listIntData = new ArrayList<Integer>();
        System.out.println("\nInteger Sorting");
        for (int i = 1; i < 6; i++) {
            try {
                int data = Integer.parseInt(inputData("Masukkan Angka ke - " + i));
                listIntData.add(data);
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        int[] result = convertIntegers(listIntData);
        int[] resultData = bubbleSort.getResultOfSortingInt(result);

        System.out.println("\nResult is : ");
        for(int x : resultData){
            System.out.println(x);
        }
    }
    public static void stringSorting(){
        ArrayList <String> listStringData = new ArrayList<String>();
        System.out.println("\nString Sorting");
        for (int i = 1; i < 6; i++) {
            try {
                String data = inputData("Masukkan Kata ke - " + i);
                listStringData.add(data);
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        String[] result = convertStrings(listStringData);
        String[] resultData = bubbleSort.getResultOfSortingString(result);

        System.out.println("\nResult is : ");
        for(String x : resultData){
            System.out.println(x);
        }
    }
    public static void main(String[] args) {
        label:
        while(true){
            System.out.println("\n*** Program Sorting ***");
            System.out.println("1. Integer Sort");
            System.out.println("2. String Sort");
            System.out.println("x. Exit");
            String choose = inputData("\nMasukkan Pilihan Anda");

            switch (choose){
                case "1" -> {
                    integerSorting();
                }
                case "2" -> {
                    stringSorting();
                }
                case "x" -> {
                    break label;
                }
                default -> {
                    System.out.println("\nYour Choose is Not Available");
                }
            }
        }

        System.out.println();
    }
}
