import java.util.Scanner;

public class Quest3 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int num1,num2,soma,mut,divisao,sub;
        num1= sc.nextInt();
        num2= sc.nextInt();
        soma=num1+num2;
        mut=num1*num2;
        divisao=num1/num2;
        sub=num1-num2;
        System.out.printf("O valor um é %d\n",num1);
        System.out.printf("O valor dois é %d\n",num2);
        System.out.printf("O valor da soma é %d\n",soma);
        System.out.printf("O valor da mut é %d\n",mut);
        System.out.printf("O valor da divisao é %d\n",divisao);
        System.out.printf("O valor da sub é %d\n",sub);
        sc.close();


    }
}
