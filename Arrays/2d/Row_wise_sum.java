public class Row_wise_sum {
    public static void main(String[] args){
        //int [][] nums=new int [3][4];
        int [][] nums={{1,2,3},{4,5,6}};
        int arr[]=new int[2];
        int k=0;
       
        for(int i=0;i<nums.length;i++){
                 int sum=0;
                for(int j=0;j<nums[i].length;j++)
                {
                    sum+=nums[i][j];
                }
                arr[k]=sum;
                k++;
        }
         for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
         }

    }
}
