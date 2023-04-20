Eight Queens Java Class

The main purpose of this class is to set up 8 queens (max possible) in an 8x8 chess board in positions where none of them can kill the other (They don't intersect horizontally, vertically or diagonally). Recursion is highly used to achieve this.

To Run: Simply run the main file in folder

Functions:
- SetQueen(#, #)		//will set a single queen in position requested (0-7 for positions in chess board)
- SetQueens(#)		//will set given # of queens in positions where they can't kill any other queen, if not possible won't add any queens to board
- EmptySquare(#, #)	//will empty square of position #, # in chessboard if it's not empty already


Display Class will display the last state of the queens chess board and print true if all requested queens to be added was possible in a configuration where none of them can kill each other. Otherwise it prints false.