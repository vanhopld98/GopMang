import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array1 = new int[5];
        int[] array2 = new int[5];
        int[] array3 = new int[10];
        int index = 0;
        NhapMang1(array1);
        NhapMang2(array2);
        GopMang(array1, array2, array3, index);
        System.out.println("Array 3 :");
        for (int element : array3) {
            System.out.print(element+" , ");
        }
    }

    public static int[] GopMang(int[] array1, int[] array2, int[] array3, int index) {
        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
        }
        for (int i = array1.length; i < array3.length; i++) {
            array3[i] = array2[index];
            index++;
        }
        return array3;
    }

    public static int[] NhapMang1(int[] array1) {
        System.out.println("Nhập mảng 1 ( 5 phần tử )");
        for (int i = 0; i < array1.length; i++) {
            System.out.println("Phần tử thứ " + i + " :");
            array1[i] = scanner.nextInt();
        }
        return array1;
    }

    public static int[] NhapMang2(int[] array2) {
        System.out.println("Nhập mảng 2 ( 5 phần tử )");
        for (int i = 0; i < array2.length; i++) {
            System.out.println("Phần tử thứ " + i + " :");
            array2[i] = scanner.nextInt();
        }
        return array2;
    }
}