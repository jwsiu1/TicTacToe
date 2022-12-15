public class BoardClass {
    //only one board is used and is shared
    public static char[][] gameboard;
    
    /**
     * Creates the board that is size x size and initializes values within the board
     * to be empty.
     * @param size
     */
    public static void createBoard(int size) {
        gameboard = new char[size][size];
        for(int i=0; i<size; i++) {
            for(int j=0; j<size; j++) {
                gameboard[i][j] = ' ';
            }
        }
    }
}
