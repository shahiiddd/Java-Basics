import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            
            for (int k = 1; k <= n; k++) {
                long maxSum = 0;
                
                for (int moveIdx = 0; moveIdx < n; moveIdx++) {
                    // Create new array after moving moveIdx to end
                    int[] temp = new int[n];
                    int idx = 0;
                    for (int i = 0; i < n; i++) {
                        if (i != moveIdx) {
                            temp[idx++] = a[i];
                        }
                    }
                    temp[idx] = a[moveIdx];
                    
                    // Now sum the last k elements
                    long sum = 0;
                    for (int i = n - k; i < n; i++) {
                        sum += temp[i];
                    }
                    
                    maxSum = Math.max(maxSum, sum);
                }
                
                System.out.print(maxSum + " ");
            }
            System.out.println();
        }
    }
}
