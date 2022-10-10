public class Main {
// Part 1
    // 1.1
public static void printNumberBackwards(int n) {
    if (n <= 0) {
        return;
    }
    System.out.print(n + " ");
    printNumberBackwards(n - 1);
}
    // 1.2
public static void printNumber(int n) {
    if (n <= 0){
        return;
    }
    printNumber(n - 1);
    System.out.print(n + " ");
}
    // 1.3
    public static void error(int n) {
        error(n - 1);
        System.out.print(n + " ");
    }
    // Part 2
        // 2.1
    public static void printArray(int[] array, int i){
    if (i >= array.length){
        return;
    }
    System.out.print(array[i] + " ");
    printArray(array, i + 1);
    }
        // 2.2
    public static int arraySum(int[] array, int i){
        if (i >= array.length){
            return 0;
        }
        return array[i] + arraySum(array, i + 1);
    }
        // 2.3
    public static int findCountInArray(int[] array, int what, int i){
        int count = 0;
        if (i >= array.length){
            return 0;
        }
        else if (array[i] == what) {
            count++;
        }
        return count + findCountInArray(array, what, i + 1);
    }
    // Part 3
        // 3.1
    public static void printString(String str){
        if (str.length() > 0) {
            System.out.println(str.charAt(0));
            printString(str.substring(1));
        }
    }
        // 3.2
    public static void printReverseString(String str){
        if (str.length() > 0) {
            printReverseString(str.substring(1));
            System.out.println(str.charAt(0));
        }
    }
        // 3.3
    public static String reverseString(String str){
        if (str.length() == 0) {
            return "";
        }
        return reverseString(str.substring(1)) + str.charAt(0);
    }



    public static void main(String[] args) {
    printNumberBackwards(9);
    System.out.println();
    System.out.println();
    printNumber(9);
    System.out.println();
    System.out.println();
    printArray(new int[] {10, 11, 12, 1, 3, 5}, 0);
    System.out.println();
    System.out.println();
    System.out.println(arraySum(new int[] {1, 0, 45, 30, 2, 6}, 0));
    System.out.println();
    System.out.println(findCountInArray(new int[] {1, 4, 8, 1, 1, 1, 2}, 1, 0));
    System.out.println();
    printString("String");
    System.out.println();
    printReverseString("String");
    System.out.println();
    System.out.println(reverseString("String"));
    }
}
