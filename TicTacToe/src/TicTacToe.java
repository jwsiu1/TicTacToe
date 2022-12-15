import java.util.Scanner;
public class TicTacToe {
    /**
     * Main method that takes in input for number of players, in a row pieces to win,
     * and coordinates to place piece.
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        System.out.println();
        Scanner input = new Scanner(System.in);
        //variables to store coordinates that player wants to change
        int row = 0;
        int column = 0;
        //variable to decide whose turn it is
        int turn = 0;
        //variable to store size of board
        int size = 0;
        //variable to store number of players
        int numPlayers = 0;
        //variable to store how many in a row pieces to win
        int winNum = 0;
        //variable to store which character to place on the board
        // depending on whose turn it is.
        char item = ' ';
        //loop to make sure number of players is valid
        System.out.print("Enter number of players (3-10): ");
        while(!input.hasNextInt()) {
            input.next();
            System.out.println("Invalid input! ");
            System.out.print("Enter number of players (3-10): ");
        }
        numPlayers = input.nextInt();
        while (numPlayers < 3 || numPlayers > 10) {
            System.out.println("Invalid input! ");
            System.out.print("Enter number of players (3-10): ");
            numPlayers = input.nextInt();
        }
        size = numPlayers + 1;
        //loop to make sure number of pieces to win is valid
        System.out.print("Enter how many pieces in a row to win (3-" + size + "): " );
        while(!input.hasNextInt()) {
            input.next();
            System.out.println("Invalid input! ");
            System.out.print("Enter how many pieces in a row to win (3-" + size + "): " );
        }
        winNum = input.nextInt();
        while (winNum < 3 || winNum > numPlayers + 1) {
            System.out.println("Invalid input! ");
            System.out.print("Enter how many pieces in a row to win (3-" + size + "): " );
            winNum = input.nextInt();
        }
        //creating player objects for each player
        PlayerClass player1 = new PlayerClass();
        PlayerClass player2 = new PlayerClass();
        PlayerClass player3 = new PlayerClass();
        PlayerClass player4 = new PlayerClass();
        PlayerClass player5 = new PlayerClass();
        PlayerClass player6 = new PlayerClass();
        PlayerClass player7 = new PlayerClass();
        PlayerClass player8 = new PlayerClass();
        PlayerClass player9 = new PlayerClass();
        PlayerClass player10 = new PlayerClass();
        //assigning pieces to players and making sure the pieces are not already taken
        if(numPlayers >= 3) {
            System.out.print("Please enter player 1's piece: ");
            player1.setItem(input.next().charAt(0));
            System.out.print("Please enter player 2's piece: ");
            player2.setItem(input.next().charAt(0));
            while(player2.getItem() == player1.getItem()) {
                System.out.println("Piece taken! ");
                System.out.print("Please enter player 2's piece: ");
                player2.setItem(input.next().charAt(0));
            }
            System.out.print("Please enter player 3's piece: ");
            player3.setItem(input.next().charAt(0));
            while(player3.getItem() == player2.getItem() || player3.getItem() == player1.getItem()) {
                System.out.println("Piece taken! ");
                System.out.print("Please enter player 3's piece: ");
                player3.setItem(input.next().charAt(0));
            }
        }
        if(numPlayers >= 4) {
            System.out.print("Please enter player 4's piece: ");
            player4.setItem(input.next().charAt(0));
            while(player4.getItem() == player3.getItem() || player4.getItem() == player2.getItem() || player4.getItem() == player1.getItem()) {
                System.out.println("Piece taken! ");
                System.out.print("Please enter player 4's piece: ");
                player4.setItem(input.next().charAt(0));
            }
        }
        if(numPlayers >= 5) {
            System.out.print("Please enter player 5's piece: ");
            player5.setItem(input.next().charAt(0));
            while(player5.getItem() == player4.getItem() || player5.getItem() == player3.getItem() || player5.getItem() == player2.getItem() 
            || player5.getItem() == player1.getItem()) {
                System.out.println("Piece taken! ");
                System.out.print("Please enter player 5's piece: ");
                player5.setItem(input.next().charAt(0));
            }
        }
        if(numPlayers >= 6) {
            System.out.print("Please enter player 6's piece: ");
            player6.setItem(input.next().charAt(0));
            while(player6.getItem() == player5.getItem() || player6.getItem() == player4.getItem() || player6.getItem() == player3.getItem() 
            || player6.getItem() == player2.getItem() || player6.getItem() == player1.getItem()) {
                System.out.println("Piece taken! ");
                System.out.print("Please enter player 6's piece: ");
                player6.setItem(input.next().charAt(0));
            }
        }
        if(numPlayers >= 7) {
            System.out.print("Please enter player 7's piece: ");
            player7.setItem(input.next().charAt(0));
            while(player7.getItem() == player6.getItem() || player7.getItem() == player5.getItem() || player7.getItem() == player4.getItem() 
            || player7.getItem() == player3.getItem() || player7.getItem() == player2.getItem() || player7.getItem() == player1.getItem()) {
                System.out.println("Piece taken! ");
                System.out.print("Please enter player 7's piece: ");
                player7.setItem(input.next().charAt(0));
            }
        }
        if(numPlayers >= 8) {
            System.out.print("Please enter player 8's piece: ");
            player8.setItem(input.next().charAt(0));
            while(player8.getItem() == player7.getItem() || player8.getItem() == player6.getItem() || player8.getItem() == player5.getItem() || 
            player8.getItem() == player4.getItem() || player8.getItem() == player3.getItem() || player8.getItem() == player2.getItem() 
            || player8.getItem() == player1.getItem()) {
                System.out.println("Piece taken! ");
                System.out.print("Please enter player 8's piece: ");
                player8.setItem(input.next().charAt(0));
            }
        }
        if(numPlayers >= 9) {
            System.out.print("Please enter player 9's piece: ");
            player9.setItem(input.next().charAt(0));
            while(player9.getItem() == player8.getItem() || player9.getItem() == player7.getItem() || player9.getItem() == player6.getItem()
                || player9.getItem() == player5.getItem() || player9.getItem() == player4.getItem() || player9.getItem() == player3.getItem() 
                || player9.getItem() == player2.getItem() || player9.getItem() == player1.getItem()) {
                System.out.println("Piece taken! ");
                System.out.print("Please enter player 9's piece: ");
                player9.setItem(input.next().charAt(0));
            }
        }
        if(numPlayers >= 10) {
            System.out.print("Please enter player 10's piece: ");
            player10.setItem(input.next().charAt(0));
            while(player10.getItem() == player9.getItem() || player10.getItem() == player8.getItem() || player10.getItem() == player7.getItem() 
            || player10.getItem() == player6.getItem() || player10.getItem() == player5.getItem() || player10.getItem() == player4.getItem() 
            || player10.getItem() == player3.getItem() || player10.getItem() == player2.getItem() || player10.getItem() == player1.getItem()) {
                System.out.println("Piece taken! ");
                System.out.print("Please enter player 10's piece: ");
                player10.setItem(input.next().charAt(0));
            }
        }
        BoardClass.createBoard(size);
        print(size);
        //main loop for tic tac toe game
        while(GameLogic.isFull(size) == false) {
            int playerNum = 0;
            playerNum = turn % numPlayers;
            int playerTurn = playerNum + 1;
            //chooses which piece to use
            if(playerTurn == 1) {
                item = player1.getItem();
            }
            if(playerTurn == 2) {
                item = player2.getItem();
            }
            if(playerTurn == 3) {
                item = player3.getItem();
            }
            if(playerTurn == 4) {
                item = player4.getItem();
            }
            if(playerTurn == 5) {
                item = player5.getItem();
            }
            if(playerTurn == 6) {
                item = player6.getItem();
            }
            if(playerTurn == 7) {
                item = player7.getItem();
            }
            if(playerTurn == 8) {
                item = player8.getItem();
            }
            if(playerTurn == 9) {
                item = player9.getItem();
            }
            if(playerTurn == 10) {
                item = player10.getItem();
            }
            System.out.println("Player " + playerTurn + "'s turn (" + item + ")");
            //loop to make sure coordinates are valid
            System.out.print("Enter coordinates: ");
            while(!input.hasNextInt()) {
                input.next();
                System.out.println();
                System.out.println("Invalid input! ");
                System.out.print("Enter coordinates: ");
            }
            row = input.nextInt();
            column = input.nextInt();
            while(row < 0 || column < 0 || row > size-1 || column > size-1 || PlayerClass.positionTaken(row, column) == true) {
                System.out.println("Invalid Input! ");
                System.out.print("Enter coordinates: ");
                row = input.nextInt();
                column = input.nextInt();
            }
            PlayerClass.changePosition(row, column, item);
            print(size);
            //checks to see if there is a winner
            if(GameLogic.checkBoard(size, item, winNum) == true) {
                System.out.println("Player " + playerTurn + " has won!");
                break;
            }
            //checks to see if the game is a tie
            if(GameLogic.isFull(size) == true) {
                System.out.println("Tie game!");
                break;
            }
            turn++;
        }
        input.close();
        System.out.println();

    }
    /**
     * Method that prints the board 
     * @param size
     */
    public static void print(int size) {
        System.out.print("  |");
        for(int p = 0; p<size; p++) {
            if(p<10) {
                System.out.print(p + " |");
            }
            else{
                System.out.print(p + "|");
            }
        }
        System.out.println();
        for(int i=0; i<size; i++) {
            for(int l=0; l<size; l++) {
                System.out.print("- - ");
            }
            System.out.println();
            if(i<10) {
                System.out.print(i + " |");
            }
            else {
                System.out.print(i + "|");
            }
            for(int j=0; j<size; j++) {
                System.out.print(BoardClass.gameboard[i][j]);
                System.out.print(" |");
            }
            System.out.println();
        }
        System.out.println();
    }
}