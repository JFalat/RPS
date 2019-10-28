import java.util.Random;
import java.util.Scanner;

class Main {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    Choice choice1 = Choice.valueOf(scan.nextLine().toUpperCase());
    Choice choice2=null;

    Random random = new Random();
    int index = random.nextInt(3);


    if(index==0){
      choice2=Choice.valueOf("Rock".toUpperCase());
    }
    else if(index==1){
      choice2=Choice.valueOf("Paper".toUpperCase());
    }
    else if(index==2){
      choice2=Choice.valueOf("Scissors".toUpperCase());
    }

    System.out.println(choice2);

    if (choice1 == choice2) {
      System.out.println("Draw");

    } else {
      switch (choice1) {
        case PAPER:
          System.out.println(choice2 == Choice.ROCK ? "paper win" : choice2+" win");
          break;

        case ROCK:
          System.out.println(choice2 == Choice.SCISSORS ? "win" : "loose");
          break;

        case SCISSORS:
          System.out.println(choice2 == Choice.PAPER ? "win" : "loose");
          break;

      }
    }
  }
}



