//Half pyramid with numbers

public class LowerTriangularNo {
    public static void main(String[] args) {

        int n=5;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(j<=i) {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
}

/*

Expected Result
1
12
123
1234
12345

 */