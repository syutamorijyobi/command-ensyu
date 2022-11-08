import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        double height=s.nextDouble();
        double weight=s.nextDouble();
        String result=String.format("%.2f",weight/(height*height));
        System.out.println("Ç†Ç»ÇΩÇÃBMI"+result+"Ç≈Ç∑ÅB");
        double height2=s.nextDouble();
        double weight2=s.nextDouble();
        String result2=String.format("%.2f",weight2/(height2*height2));
        System.out.println("Ç†Ç»ÇΩÇÃBMI"+result2+"Ç≈Ç∑ÅB");

    }
}

