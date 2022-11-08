import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        double height=s.nextDouble();
        double weight=s.nextDouble();
        String result=String.format("%.2f",weight/(height*height));
        System.out.println("Ç†Ç»ÇΩÇÃBMI"+result+"Ç≈Ç∑ÅB");
    }
}

