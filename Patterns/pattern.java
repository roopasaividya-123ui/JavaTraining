
public class pattern {
    public static void main(String[] args){
        int i,j,n=4;
        for(i=0;i<n;i++){
            for(j=0;j<=i;j++){
                System.out.print("*");
            }
            
         for(int k=0;k<(n-i-1)*2;k++){
                System.out.print(" ");
            }
            for(int l=0;l<=i;l++){
                System.out.print("*");
            }
            System.out.println();
        }

     }
}


