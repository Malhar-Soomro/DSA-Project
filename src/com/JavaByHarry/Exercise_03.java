package com.JavaByHarry;
import java.util.Scanner;
import java.util.Random;
class Game{
    private int userInput;
    private int guessOfNumber;
     int computerInput;

    Scanner sc = new Scanner(System.in);
    Game(){
        Random rn = new Random();
        computerInput = rn.nextInt(100);
    }

    public void setUserInput(int userInput){
        this.userInput=userInput;
    }

    public void setGuessOfNumber() {
        guessOfNumber = 0;
    }

    public int getGuessOfNumber() {
        return guessOfNumber;
    }
//    public void  correct(){
//        if(userInput==computerInput){
//            System.out.println("Correct number guessed by user");
//        }
//        else {
//            System.out.println("Not  guessed correctly");
//        }
//    }
    public void play(){
        for(int i = 0 ; i < 10; i++){
        if(userInput==computerInput){
            System.out.println("Correct number guessed by user");
            System.out.println("Guesses:: "+guessOfNumber);
            System.out.println("Computer input is: "+computerInput);
            break;
        }
        else if(userInput<computerInput) {
            System.out.println("Please input the greater number");
            guessOfNumber++;
            userInput = sc.nextInt();
        }
        else {
            System.out.println("Please input the less number");
            guessOfNumber++;
            userInput = sc.nextInt();
        }
    }
}
}
public class Exercise_03 {
    public static void main(String[] args) {
     Game gammer = new Game();
     gammer.setUserInput(74);
     gammer.play();


    }
}
