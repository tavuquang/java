import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static int a = 5;
    public static void main(String[] args) throws FileNotFoundException {
        int a,b,c;
        Scanner sc = new Scanner(new File("input.txt"));

        System.out.print("Nhập a: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        System.out.println("a = "+a); // in a
        System.out.println("b = "+b); // in b
        System.out.println("c = "+c); // in c
    }
}