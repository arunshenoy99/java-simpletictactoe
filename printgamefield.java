package tictactoe;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a;
        System.out.print("Enter cells: ");
        a = sc.nextLine();
        int c=1;
        System.out.println("---------");
        for (int i=0;i<3;i++) {
            System.out.print("|");
            for (int j=0;j<7;j++) {
                if (j%2==0)
                    System.out.print(" ");
                else 
                    System.out.print(a.charAt(c++));
            }
            System.out.println("|");
        }
        System.out.println("---------");
    }
}