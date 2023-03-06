package Game;

import java.util.Scanner;

public class TickTackToe extends Game {
    String[][] state;
    Scanner sc;
    String winner;
    String lastMark;
    int[] lastmove;
    int moves;

    public TickTackToe() {
        super();
        sc = new Scanner(System.in);
    }

    @Override
    void initializeGame() {
        state = new String[][] {
                {" "," "," "},
                {" "," "," "},
                {" "," "," "}
        };
        moves = 0;
        this.lastmove = new int[] {0,0};
        this.lastMark="O";

    }

    @Override
    void makePlay(int player) {
        String mark = player==0 ? "O" : "X";
        draw(mark);

        String in = "";
        int[] inputArr;
        while (true) {
            in = sc.nextLine();
            inputArr = cleanInput(in);
            if (inputArr[0] > 3 || inputArr[0] < 0 &&
                inputArr[1] > 3 || inputArr[1] < 0) {
                System.out.println("Input was not valid!");
                draw(mark);
                continue;
            }

            state[inputArr[0]][inputArr[1]] = mark;
            lastmove = inputArr;
            lastMark = mark;
            moves++;
            break;
        }
    }

    @Override
    boolean endOfGame() {
        Boolean won = false;

        // Check rows
        for (int i = 0; true; i++) {
            if (!this.state[lastmove[0]][i].equals(this.lastMark)) {
                break;
            }
            if (i==2) {
                won = true;
                break;
            }

        }

        if (!won) {
            // Check columns
            for (int i = 0; true; i++) {
                if (!this.state[i][lastmove[1]].equals(this.lastMark)) {
                    break;
                }

                if (i==2) {
                    won = true;
                    break;
                }

            }
        }

        // Diagonal
        if (!won && lastmove[0]==lastmove[1]) {
            for (int i = 0; true; i++) {
                if (!this.state[i][i].equals(this.lastMark)) {
                    break;
                }

                if (i==2) {
                    won = true;
                    break;
                }
            }
        }

        if (!won && lastmove[0]+lastmove[1] == 2) {
            for (int i = 0; true; i++) {
                if (!this.state[2-i][i].equals(this.lastMark)) {
                    break;
                }

                if (i==2) {
                    won = true;
                    break;
                }
            }
        }

        if (won) {
            this.winner = this.lastMark=="O" ? "Player 1" : "Player 2";
            return true;
        }

        if (!won && moves==9) {
            this.winner = "Tie";
        }

        return false;
    }

    @Override
    void printWinner() {
        if (this.winner.equals("Tie")) {
            System.out.println("      The game ended on a Tie     ");
        } else {
            System.out.println("The winner of the game is "+ this.winner);
        }
    }

    private int[] cleanInput(String toClean) {
        toClean.replaceAll("[\\s\\t\\n]", "");
        String[] split = toClean.split(",");
        int[] arr = new int[2];
        arr[0] = Integer.parseInt(split[0])-1;
        arr[1] = Integer.parseInt(split[1])-1;

        return arr;

    }

    private void draw(String mark) {
        System.out.println("Current state of the board\n");
        System.out.println("\t\t\t+---+---+---+");
        for (String[] row : this.state) {
            System.out.print("\t\t\t| ");
            for (int i = 0; i < 3; i++) {
                System.out.print(row[i]+" | ");
            }
            System.out.println();
            System.out.println("\t\t\t+---+---+---+");
        }

        System.out.println("\nTurn of player "+ mark);
        System.out.println("Where to place mark? (eg. 1,3; 2,2)");
    }
}
