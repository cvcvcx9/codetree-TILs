import java.util.*;

public class Main {
    public static int MAX_N = 100;

    public static int[][] matrix = new int[MAX_N][MAX_N];


    public static boolean isHappy(int[] arr, int m){
        int cnt = 0;
        for (int i = 0; i<arr.length-1;i++){
            if(arr[i] == arr[i+1]){
                cnt++;
            }
            if (cnt >= m){
                return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        for(int i = 0; i<n; i++){
            for (int j = 0; j<n; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        int happyCnt = 0;
        if (m == 1){
            happyCnt = n*n;
        }else{
            for(int i = 0; i<n; i++){
                if(isHappy(matrix[i],m)){
                    happyCnt++;
                }
                int tmp = 0;
                for (int j=0; j<n-1; j++){
                    if(matrix[j][i] == matrix[j+1][i]){
                        tmp++;
                    }
                }
                if (tmp >= m){
                        happyCnt++;
                        break;
                    }
            }
        }
        System.out.println(happyCnt);


    }
}