package tictactoe;
import java.util.*;
public class Main {
    public void verifystate(int a, int b) {
    	if (a==1 && b==1) {
    		System.out.println("Impossible");
            return;
    	}
    	else if (a==1) {
    		System.out.println("O wins");
            return;
    	}
    	else if (b==1 ) {
    		System.out.println("X wins");
            return;
    	}
	else if (flag1==0 && flag2==0 && Xcount+Ocount==9) {
            System.out.println("Draw");
            return;
        }
    }
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a;
        System.out.print("Enter cells: ");
        a = sc.nextLine();
        int c=1,Ocount=0,Xcount=0;
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
        for(int i=1;i<=9;i++){
            if(a.charAt(i)=='O')
                Ocount++;
            else if(a.charAt(i)=='X')
                Xcount++;
        }
        c=1;
        if (Xcount==Ocount-1 || Ocount==Xcount-1 || Xcount==Ocount){
        	int flag1=0,flag2=0;
            while (c<=3) {
            	int i=0;
            	int j[] = {2,3};
                if(c==3) {
                	while(i<2) {
                        if(a.charAt(c)=='O' && a.charAt(c+j[i])=='O' && a.charAt(c+(2*j[i]))=='O'){
                            flag1=1;
                        }
                        else if(a.charAt(c)=='X' && a.charAt(c+j[i])=='X' && a.charAt(c+(2*j[i]))=='X') {
                            flag2=1;
                        }
                        i++;
                    }
                }
                i=0;
                if(c==2) {
                    if(a.charAt(c)=='O' && a.charAt(c+3)=='O' && a.charAt(c+6)=='O'){
                    	flag1=1;
                    }
                    else if(a.charAt(c)=='X' && a.charAt(c+3)=='X' && a.charAt(c+6)=='X') {
                    	flag2=1;
                    }
                    i++;
                }
                i=0;
                int k[]= {1,3,4};
                if(c==1) {
                	while(i<3) {
                		if(a.charAt(c)=='O' && a.charAt(c+k[i])=='O' && a.charAt(c+(2*k[i]))=='O'){
                			flag1=1;
                        }
                        else if(a.charAt(c)=='X' && a.charAt(c+k[i])=='X' && a.charAt(c+(2*k[i]))=='X') {
                        	flag2=1;
                        }
                        i++;
                    }
                }
                c++;
            }
            if(a.charAt(4)=='O' && a.charAt(4+1)=='O' && a.charAt(4+2)=='O'){
            	flag1=1;
            }
            else if(a.charAt(4)=='X' && a.charAt(4+1)=='X' && a.charAt(4+2)=='X') {
            	flag2=1;
            }
            else if(a.charAt(7)=='O' && a.charAt(7+1)=='O' && a.charAt(7+2)=='O'){
            	flag1=1;
            }
            else if(a.charAt(7)=='X' && a.charAt(7+1)=='X' && a.charAt(7+2)=='X') {
            	flag2=1;
            }
            else if (flag1==0 && flag2==0 && Xcount==Ocount){
            	System.out.println("Game not finished");
                return;
            }
            Main ob=new Main();
            ob.verifystate(flag1,flag2);
            return;
        }
        else {
            System.out.println("Impossible");
            return;
        }
    }
}
