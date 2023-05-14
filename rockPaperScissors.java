import java.util.Random;

import java.util.Scanner;


class HelloWorld {

  public static String generateComputerChoice(Random random) {
    int randomNumber;
    randomNumber = random.nextInt(3) + 1;

    String computerChoice = "";

    if(randomNumber == 1) {
      computerChoice = "rock";
    } else if(randomNumber == 2) {
      computerChoice = "paper";
    } else if(randomNumber == 3) {
      computerChoice = "scissors";
    }
    System.out.println("\nThe Computer has already made a choice.");
    return computerChoice;

  }

  public static String userChoice(Scanner scanner) {

    String userWordChoice = "";

    System.out.println("\nPlease make your choice");
    userWordChoice = scanner.nextLine();
    return userWordChoice;

  }

  public static String chooseWinner(String computerChoice, String userChoice) {

    String winner = "No Winner";
    String customMessage = "Both chose same";
    String finalMessage = "";

    String rockCustomMessage = "The rock smashes the scissor";
    String paperCustomMessage = "Paper wraps rock";
    String scissorCustomMessage = "Scissors cuts paper";

    if(computerChoice.equals("rock") && userChoice.equalsIgnoreCase("scissors")) {
      winner = "Computer";
      customMessage = rockCustomMessage;
    } else if(computerChoice.equals("scissors") && userChoice.equalsIgnoreCase("rock")) {
      winner = "You";
      customMessage = rockCustomMessage;
    }

    if(computerChoice.equals("scissors") && userChoice.equalsIgnoreCase("paper")) {
      winner = "Computer";
      customMessage = scissorCustomMessage;
    } else if(computerChoice.equals("paper") && userChoice.equalsIgnoreCase("scissors")) {
      winner = "You";
      customMessage = scissorCustomMessage;
    }

    if(computerChoice.equals("paper") && userChoice.equalsIgnoreCase("rock")) {
      winner = "Computer";
      customMessage = paperCustomMessage;
    } else if(computerChoice.equals("rock") && userChoice.equalsIgnoreCase("paper")) {
      winner = "You";
      customMessage = paperCustomMessage;
    }

    finalMessage = winner + " won, " + customMessage;
    return finalMessage;
  }

  public static void main(String[] args) {

    Random random = new Random();
    Scanner scanner = new Scanner(System.in);

    String computerChoice;
    String userChoice;
    String winner;

    computerChoice = generateComputerChoice(random);
    userChoice = userChoice(scanner);
    winner = chooseWinner(computerChoice, userChoice);

    System.out.println( "\nYou choose : " + userChoice + "\nComputer choose : " +computerChoice );
    System.out.println( winner );

  }
}