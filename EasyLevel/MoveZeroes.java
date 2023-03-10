package EasyLevel;

public class MoveZeroes {
    public void moveZeroes(int[] arr) {
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[j]=arr[i];
                j++;
            }
        }
        for(;j<arr.length;j++){
            arr[j]=0;
        }
        
    }
}
