package varargs;

public class Main {

    public static void main(String[] args) {
        printArr(1,2,3,4,5);
    }

    public static void printArr(int... args) {
        for (int arg : args) {
            System.out.print(arg + " ");
        }
    }
}
