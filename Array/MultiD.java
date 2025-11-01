// Drawback of array : they have fixed size and type which are immutable 
class MultiD{  
    public static void main(String[] arr){
        int nums[][]=new int[3][4];

        for(int i=0;i<3;i++){ // default values assigned is 0 if not declared @
            for(int j=0;j<4;j++){
                System.out.print(nums[i][j]+ " ");
            }
            System.out.println();
        }

        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                nums[i][j]=(int)(Math.random()*100);
            }
            
        }
        for(int n[] :nums){
            for(int m:n){
                System.out.print(m+ " ");
            }
            System.out.println();
        }
    }
}