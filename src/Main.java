import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Random r1 = new Random();
        int r2 = r1.nextInt(50);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess the number!!!");
        boolean isNotNumber = false;
        int guess = 0;

        do{
            try {

                int counter = 0;
                boolean ctrl = false;
                while(!ctrl){
                    guess = Integer.parseInt(scanner.nextLine());
                    counter++;
                    if(guess == r2){
                        System.out.println("You guessed it correct!!!" + " It took you " + counter + " steps to guess");
                        break;
                    }else if (guess>r2){
                        System.out.println("Your guess is too high \n Try Again!!");
                    }else{
                        System.out.println("Your guess is too low \n Try Again!!");
                    }
                }


            }catch (Exception e){
                System.out.println("Please input only numerical values [0-9]!!!!!");
                isNotNumber = true;
            }



        }while (isNotNumber);














    }
}
