public class HalfInvertedPyramid {
    public static void main(String[] args) {
        int n = 4;
        for(int i=n; i>0; i--){
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/*
Another Logic

int n = 4;
for(int i=1; i<=n; i++){  // Start the outer loop from 1 to n
    for(int j=n; j>=i; j--){  // Print stars from n down to the current value of i
        System.out.print("*");
    }
    System.out.println();
}
 */

/*
Expected output

****
***
**
*
 */