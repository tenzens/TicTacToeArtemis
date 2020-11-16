package bonn.uni.alpro;

import java.util.Objects;

public class Board {
    public Cell[][] cells;
    public String playerTurn;

    public Board(){
        cells = new Cell[3][3];
        playerTurn = "X";

        for (int i = 0;i<cells.length;i++){
            for (int j = 0; j<cells[i].length;j++){
                // Assign a new Instance of the class Cell to cells[i][j]
            }
        }
    }

    public void printBoard(){
        for (int i = 0;i<cells.length;i++){
            for (int j = 0; j<cells[i].length;j++){
                System.out.print(cells[i][j].player + "|");
            }
            System.out.println("\n-----");
        }
    }

    public void makeMove(int x, int y){
        // Handle case if the cell is already occupied and quit method (return)

        cells[x][y].player = playerTurn;
        // Set empty-property of Cell to false

        if(playerTurn.equals(Cell.PLAYER_1)){
            playerTurn = Cell.PLAYER_2;
        } else {
            playerTurn = Cell.PLAYER_1;
        }
    }

    public String getWinner(){
        for (int i = 0; i< cells.length;i++){
            /*
                This if compares each row for containing the same symbol and not being empty
             */
            if(!cells[i][0].player.equals(Cell.EMPTY) && cells[i][0].player.equals(cells[i][1].player) && cells[i][1].player.equals(cells[i][2].player)){
                return cells[i][0].player;
            }
        }

        // Program the same check for columns

        if(!cells[1][1].player.equals(Cell.EMPTY) && cells[1][1].player.equals(cells[0][0].player) && cells[1][1].player.equals(cells[2][2].player)){
            return cells[1][1].player;
        }

        // Check other diagonal as well for a winner

        return Cell.EMPTY;
    }

    public boolean hasWinner(){
        return !getWinner().equals(Cell.EMPTY);
    }

    public boolean isDraw() {
        for (int i = 0;i<cells.length;i++){
            for (int j = 0; j<cells[i].length;j++){
                if(cells[i][j].player.equals(Cell.EMPTY)){
                    return false;
                }
            }
        }
        return true;
    }
}
