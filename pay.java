package week1;

import java.util.Scanner;

public class pay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double  basicpay= Double.parseDouble(sc.nextLine());
        double HRA=0, DA=0;
        if(basicpay>=5000){
            HRA=0.1*basicpay;
            DA=0.2*basicpay;

        }else{
            HRA=0.2*basicpay;
            DA=0.3*basicpay;
        }

        System.out.println(HRA+" "+DA);
        System.out.println(basicpay+HRA+DA);

    }
}
