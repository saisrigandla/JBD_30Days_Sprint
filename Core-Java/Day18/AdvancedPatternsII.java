public class SlopeRec {
    public static void main(String[] args) {
     int n= 5;
      
/*Print half Pyramid. 
    1
   1 2
  1 2 3
 1 2 3 4
1 2 3 4 5 */
                for(int i=1; i<=n; i++ ){
                    for(int j = 1; j<=n-i; j++){
                        System.out.print(" ");
                    }
                    for(int j = 1; j<=i; j++){
                        System.out.print(j+" ");
                    }
                    for(int j = n-i; j>=1; j--){
                        System.out.print(" ");
                    }
                    System.out.println();
                }



/* Print Inverted Half Pyramid.
11111
2222
333
44
5
 */
               for(int i=1; i<=n;i++){
                for(int j=n; j>=i; j--){
                    System.out.print(i);
                }
                System.out.println();

               }
    }
}
                   
