import java.util.*;

public class Main {
    public static final int MAX_N = 20;


    public static int n;
    public static int[][] grid = new int[MAX_N][MAX_N];

    public static int getNumOfGold(int rowS, int colS, int rowE, int colE){
        int numOfGold = 0;
        for (int i = rowS; i<= rowE;i++){
            for (int j = colS; j<= colE; j++){
                numOfGold += grid[i][j];
            }
        }
        return numOfGold;
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        int maxGold = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 0; i< n;i++){
            for (int j = 0; j<n; j++){
                grid[i][j] = sc.nextInt();
            }
        }

        for (int i= 0; i<n; i++){
            for (int j = 0; j<n; j++){
                if (i+2 >= n || j+2 >= n){
                    continue;
                }
                int numOfGold = getNumOfGold(i,j,i+2,j+2);
                maxGold = Math.max(maxGold,numOfGold);
            }
        }

        System.out.println(maxGold);

    }
}