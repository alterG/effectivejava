package varargs;

public class Main {

    public static void main(String[] args) {

        printArr(new int[]{6,7,8});
    }

    public static void printArr(int... args) {
        for (int arg : args) {
            System.out.print(arg + " ");
        }
    }
}
