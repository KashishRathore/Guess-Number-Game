import java.util.Random;
import java.util.Scanner;

class Game{
    public int number;
    public int inputNumber;
    public int noOfGuesses;

    public int getNoOfGuesses(){
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses){
        this.noOfGuesses = noOfGuesses ;
    }

    Game(){
        Random rand = new Random();
        this.number =rand.nextInt(100);
    }

    void takeUserInput(){
        System.out.println(" Guess the number between 0 to 100 : ");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
    }

    boolean isCorrectnumber(){
      noOfGuesses++;
       if(inputNumber == number){
        System.out.printf("Yes, you guessed it right, it was %d,\nYou guessed it in %d attempt" , number , noOfGuesses);
        return true;
       }
       else if(inputNumber<number){
        System.out.println("Too Low...");
       }
       else if(inputNumber>number){
        System.out.println("Too High...");
       }
    return false;
     } 
   }

public class Exercise_3 {
    public static void main(String[] args) {
        Game g = new Game();
        boolean b = false;
        while(!b){
        g.takeUserInput();
        b = g.isCorrectnumber();
        }

    }
}
