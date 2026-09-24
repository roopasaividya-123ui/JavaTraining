public class SumDemo {
    public static void main(String[] args){
        //int [][] nums=new int [3][4];
        int [][] nums={{1,2,3},{4,5,6}};
        int sum=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[0].length;j++){
                sum+=nums[i][j];
            }
        }
        System.out.println(sum);
    }

}
