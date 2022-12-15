public class PlayerClass {
    char item = ' ';
    //gives each player object their own item
    public void setItem(char character) {
        item = character;
    }
    //gets item of player object
    public char getItem() {
        return item;
    }
    /**
     * Method that changes the position of the board
     * to item.
     * @param row
     * @param column
     * @param item
     */
    public static void changePosition(int row, int column, char item) {
        BoardClass.gameboard[row][column] = item;
    }
    /**
     * Method to check whether a spot has been already taken or not.
     * @param row
     * @param column
     * @return
     */
    public static boolean positionTaken(int row, int column) {
        if(BoardClass.gameboard[row][column] != ' ') {
            return true;
        }
        return false;
    }
}

