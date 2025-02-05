import java.util.Scanner;

public class Quest10 {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        double raio,area;
        System.out.println("Escreva o valor do raio ");
        raio= sc.nextDouble();
        area=3.1416*(Math.pow(raio,2));
        System.out.println(area);
        sc.close();
    }
}
