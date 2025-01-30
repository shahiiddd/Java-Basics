public class recurssion {

        static int factorial(int n){
            if (n==0 || n==1){
                return 1;
            }
            else{
                return n*factorial(n-1);
            }
        }
        static int factorial_iterative(int n){
            if (n==0 || n==1){
                return 1;
            }
            else {
                int sum =0;
                for (int i=1;i<=n;i++){
                    sum+=i;
                    System.out.println(sum);
                }
                return sum;
            }
        }
    public static void main(String[] args) {
        System.out.println("factorial of number is :"+factorial(1));
        System.out.println("factorial of number is :"+factorial_iterative(3));
    }
        }
