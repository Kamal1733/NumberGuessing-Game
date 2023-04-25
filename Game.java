package jaaaa;

import java.util.Scanner;

public class Game {
    
public static void main(String args[]){


    
    Scanner sc= new Scanner(System.in);
    int myNumber= (int)(Math.random()*100);

    int userNumber=100;





    while(true){

        System.out.println("Guess the number between 1 to 100");
        userNumber= sc.nextInt();
       if(userNumber<0 || userNumber>100){
        System.out.println("Wrong input");
        break;

       } else if(userNumber==myNumber){
            System.out.println("You guess right!!");
            System.out.println("My number was "+myNumber);
            break;
        } else if( userNumber> myNumber){
            System.out.println("Your Number is large");
        } else{
            System.out.println("Your Number is small");
        }
    }

    

}
}
