class Solution {
    public int[][] generateMatrix(int n) {

        int[][] arr = new int[n][n];

        int srow=0;
        int scol=0;
        int erow=n-1;
        int ecol=n-1;
        int count=1;

        while(count<=(n*n)){

        for(int j=scol;j<=ecol;j++){
            arr[srow][j]=count;
            count++;
        }

        for(int i=srow+1;i<=erow;i++){
            arr[i][ecol]=count;
            count++;
        }

        for(int j=ecol-1;j>=scol;j--){
            arr[erow][j]=count;
            count++;
        }

        for(int i=erow-1;i>srow;i--){
            arr[i][scol]=count;
            count++;
        }

        srow++;
        scol++;
        erow--;
        ecol--;
        } 

       

       int[][] newArr = new int[arr.length][arr[0].length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                newArr[i][j] = arr[i][j];
            }
        }

        return newArr;
    }
}

