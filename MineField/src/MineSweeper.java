import java.util.Random;
import java.util.Scanner;

public class MineSweeper {

    int row, col, size;
    int[][] gameMap;
    int[][] userMap;
    boolean game = true;
    Random rand = new Random();
    Scanner input = new Scanner(System.in);

    MineSweeper() {
        prepareGame();
    }

    public void run() {
        int r, c,tempc,tempr;
        int succes = 0;
        print(gameMap);
        System.out.println("Oyun başladı");

        while (game) {
            print(userMap);
            System.out.print("Satır : ");
            tempr = input.nextInt();
            System.out.print("Sütun : ");
            tempc = input.nextInt();

            c = tempc-1;
            r = tempr-1;

            if (r < 0 || r >= row || c < 0 || c >= col) {
                System.out.println("Geçersiz kordinat!!.");
                continue;
            }
            if (gameMap[r][c] != -1) {
                check(r, c);
                succes++;
                if (succes == (size - (size / 4))) {
                    System.out.println("Tebrikler!!!!, Hiç bir mayına basmadınız.");
                    break;
                }
            } else {
                game = false;
                System.out.println("Mayına bastınız. Oyun bitti!!.");
            }
        }
    }

    public void check(int r, int c) {
        if (userMap[r][c] == 0) {
            if ((c < col - 1) && (gameMap[r][c + 1] == -1)) {
                userMap[r][c]++;
            }
            if ((c < col - 1) && (r < row - 1) && (gameMap[r + 1][c + 1] == -1)) {
                userMap[r][c]++;
            }
            if ((c < col - 1) && (r > 0) && (gameMap[r - 1][c + 1] == -1)) {
                userMap[r][c]++;
            }
            if ((c >0) && (r < row - 1) && (gameMap[r + 1][c - 1] == -1)) {
                userMap[r][c]++;
            }
            if ((c >0) && (r >0) && (gameMap[r - 1][c - 1] == -1)) {
                userMap[r][c]++;
            }
            if ((c > 0) && (gameMap[r][c - 1] == -1)) {
                userMap[r][c]++;
            }
            if ((r > 0) && (gameMap[r - 1][c] == -1)) {
                userMap[r][c]++;
            }
            if ((r < row - 1) && (gameMap[r + 1][c] == -1)) {
                userMap[r][c]++;
            }
            if (userMap[r][c] == 0) {
                userMap[r][c] = -2;
            }
        }
    }

    public void prepareGame() {

        int randRow, randCol, mineCount;
        System.out.print("Hazırlamak istediğiniz haritanın satır sayısını giriniz : ");
        this.row = input.nextInt();
        System.out.print("Hazırlamak istediğiniz haritanın kolon sayısını giriniz : ");
        this.col = input.nextInt();
        this.size = row * col;
        this.gameMap = new int[row][col];
        this.userMap = new int[row][col];

        mineCount = size / 4;
        while (mineCount > 0) {
            randRow = rand.nextInt(row);
            randCol = rand.nextInt(col);
            if (gameMap[randRow][randCol] != -1) {
                gameMap[randRow][randCol] = -1;
                mineCount--;
            }
        }
    }

    public void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 0) {
                    System.out.print(" - ");
                } else if (arr[i][j] == -1) {
                    System.out.print(" * ");
                } else {
                    System.out.print(" " + arr[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
