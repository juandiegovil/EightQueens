public class main {
    public static void main(String[] args) throws CloneNotSupportedException {
        EightQueens myBoard = new EightQueens();
        myBoard.setQueen(2, 6);
        myBoard.setQueen(3, 4);
        //myBoard.setQueens(8);
        System.out.println(myBoard.setQueens(6));
        //myBoard.setQueen(0, 0);
        //System.out.println(myBoard.setQueens(0));
        //EightQueens myBoard2 = (EightQueens)myBoard.clone();
        //myBoard2.emptySquare(7, 7);
        //myBoard.setQueen(1, 1);
        //myBoard2.setQueen(2, 2);
        //myBoard.emptySquare(7, 7);
        display board = new display(myBoard);
        //myBoard.emptySquare(1, 1);
        //System.out.println();
        //display board2 = new display(myBoard2);
    }
}

class display {
    public display(){
    }

    public display(EightQueens myBoard){
        for (int i = 0; i < myBoard.chessBoard.length; i++){
            for (int j = 0; j < myBoard.chessBoard[0].length; j++) {
                System.out.print(" " + myBoard.chessBoard[i][j]);
            }
            System.out.println();
        }
    }

    public display(char[][] myBoard){
        for (int i = 0; i < myBoard.length; i++){
            for (int j = 0; j < myBoard[0].length; j++) {
                System.out.print(" " + myBoard[i][j]);
            }
            System.out.println();
        }
    }
}