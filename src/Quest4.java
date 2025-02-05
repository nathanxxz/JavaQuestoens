import java.util.Scanner;

public class Quest4 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        int resto= num % 2;
        System.out.printf("O valor do numero é %d\n",resto);
        sc.close();


    }
}
