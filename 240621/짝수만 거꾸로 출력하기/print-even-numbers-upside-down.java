import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int idx = 0;
        for (int i = 0; i<n; i++){
            int tmp = sc.nextInt();
            if (tmp%2==0){
                arr[idx] = tmp;
                idx++;
            }
        }
        for (int j= idx-1; j>=0; j--){
            System.out.print(arr[j]+" ");
        }
    }
}