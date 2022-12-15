public class GameLogic {
    /**
     * Method that checks if there is a winner after every turn.
     * @param size
     * @param item
     * @param consecutive
     * @return
     */
    public static boolean checkBoard(int size, char item, int consecutive) {
        for(int i=0; i<size; i++) {
            for(int j=0; j<size; j++) {
                //Checks to see if there are any winners horizontally
                if(i+consecutive <= size) {
                    if(BoardClass.gameboard[i][j] == item && BoardClass.gameboard[i+1][j] == item) {
                        for(int k=0; k<consecutive; k++) {
                            if(BoardClass.gameboard[i+k][j] != item) {
                                return false;
                            }
                            else if(k == consecutive-1) {
                                return true;
                            }
                        }
                    }
                }
                //Checks to see if there are any winners vertically
                if(j+consecutive <= size) {
                    if(BoardClass.gameboard[i][j] == item && BoardClass.gameboard[i][j+1] == item) {
                        for(int k=0; k<consecutive; k++) {
                            if(BoardClass.gameboard[i][j+k] != item) {
                                return false;
                            }
                            else if(k == consecutive-1) {
                                return true;
                            }
                        }
                    }
                }
                //Checks to see if there are any winners top to bottom, left to right
                if(i+consecutive <= size && j+consecutive <= size) {
                    if(BoardClass.gameboard[i][j] == item && BoardClass.gameboard[i+1][j+1] == item) {
                        for(int k=0; k<consecutive; k++) {
                            if(BoardClass.gameboard[i+k][j+k] != item) {
                                return false;
                            }
                            else if(k == consecutive-1) {
                                return true;
                            }
                        }
                    }
                }
                //Checks to see if there are any winners bottom to top, left to right
                if(i+consecutive <= size && j-consecutive >= 0) {
                    if(BoardClass.gameboard[i][j] == item && BoardClass.gameboard[i+1][j-1] == item) {
                        for(int k=0; k<consecutive; k++) {
                            if(BoardClass.gameboard[i+k][j-k] != item) {
                                return false;
                            }
                            else if(k == consecutive-1) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
    /**
     * Method that checks to see whether the board is full or
     * if there is still empty space.
     * @param size
     * @return
     */
    public static boolean isFull(int size) {
        for(int i=0; i<size; i++) {
            for(int j=0; j<size; j++) {
                if(BoardClass.gameboard[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
}
