import java.util.*;

public class TicTacToe {
    static ArrayList<Integer> playerPosition = new ArrayList<>();
    static ArrayList<Integer> cpuPosition = new ArrayList<>();
    public static void main(String[] args) {
        char[][] gameBoard = {{' ', '|', ' ', '|', ' ', },
                            {'-', '+', '-', '+', '-', },
                            {' ', '|', ' ', '|', ' ', },
                            {'-', '+', '-', '+', '-', },
                            {' ', '|', ' ', '|', ' ', }};
        printGameBoard(gameBoard);
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the placement (1 - 9) : ");
            int position = scan.nextInt();
            while (playerPosition.contains(position) || cpuPosition.contains(position)) {
                System.out.println("Position taken ! Enter the correct position");
                position = scan.nextInt();
            }
            nextMove(gameBoard, position, "player");
            String result = checkWinner();
            if (result.length() > 0) {
                System.out.println(result);
                break;
            }
            Random random = new Random();
            int cpuPos = random.nextInt(9) + 1;
            while (playerPosition.contains(cpuPosition) || cpuPosition.contains(cpuPos)) {
                cpuPos = random.nextInt(9) + 1;
            }
            nextMove(gameBoard, cpuPos, "cpu");
            printGameBoard(gameBoard);
            result = checkWinner();
            if (result.length() > 0) {
                System.out.println(result);
                break;
            }
        }
    }

    public static void printGameBoard(char[][] gameBoard) {
        for (char[] row : gameBoard) {
            for (char c : row) {
                System.out.print(c + "  ");
            }
            System.out.println();
        }
    }

    public static void nextMove(char[][] gameBoard, int position, String player) {

            char symbol = ' ';
            if (player.equals("player")) {
                symbol = 'X';
                playerPosition.add(position);
            } else if (player.equals("cpu")) {
                symbol = '0';
                cpuPosition.add(position);
            }
            switch (position){
                case 1:
                    gameBoard[0][0] = symbol;
                    break;
                case 2:
                    gameBoard[0][2] = symbol;
                    break;
                case 3:
                    gameBoard[0][4] = symbol;
                    break;
                case 4:
                    gameBoard[2][0] = symbol;
                    break;
                case 5:
                    gameBoard[2][2] = symbol;
                    break;
                case 6:
                    gameBoard[2][4] = symbol;
                    break;
                case 7:
                    gameBoard[4][0] = symbol;
                    break;
                case 8:
                    gameBoard[4][2] = symbol;
                    break;
                case 9:
                    gameBoard[4][4] = symbol;
                    break;
                default:
                    break;

            }
    }

    public static String checkWinner() {
        List topRow = Arrays.asList(1, 2, 3);
        List midRow = Arrays.asList(4, 5, 6);
        List botRow = Arrays.asList(7, 8, 9);
        List leftCol = Arrays.asList(1, 4, 7);
        List midCol = Arrays.asList(2, 5, 8);
        List rightCol = Arrays.asList(3, 6, 9);
        List dig1 = Arrays.asList(1, 5, 9);
        List dig2 = Arrays.asList(7, 5, 3);
        List<List> winning = new ArrayList<>();
        winning.add(topRow);
        winning.add(midRow);
        winning.add(botRow);
        winning.add(leftCol);
        winning.add(midCol);
        winning.add(rightCol);
        winning.add(dig1);
        winning.add(dig2);

        for (List l : winning) {
            if (playerPosition.contains(l)) {
                return "Congratulation you won";
            }else if (cpuPosition.contains(l)) {
                return "CPU wins ! Sorry";
            }else if (playerPosition.size() + cpuPosition.size() == 9) {
                return "CAT !";
            }
        }
        return "";
    }
}
