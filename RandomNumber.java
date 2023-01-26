package week1;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Random r= new Random();
        int pick= r.nextInt(20);
        System.out.println("Computer Choice :"+pick);
        for(int i =0;i<6;i++){
            System.out.println("Guess a number <20");
            int user = sc.nextInt();
            if(user<pick){
                System.out.println("low");
            }
            else if(user>pick) {
                System.out.println("high");
            }
            else {
                System.out.println("Right");
                break;
            }
        }
    }
}
