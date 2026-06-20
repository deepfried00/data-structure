public class Arrays{
    public static void main(String[] args) {
        int[][] arr = {
                {4,3,8},
                {2,5,-1},
                {-6,16,9},
                {4,13,11},
        };
        for(int i = 0; i< arr.length; i++){
            for(int j = 0; j <(arr[0].length)/2; j++){ // m/2= m
                int temp = arr[i][j]; // 1
                arr[i][j] = arr[i][(arr[0].length-1-j)]; //1
                arr[i][(arr[0].length-1-j)] = temp; //1
            }
        }

        // multiplication
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length;j++){
               arr[i][j] = 2*arr[i][j];
            }
        }
        int[][] m1 = {
                {1,-2,1},
                {2,1,3},
        };
        int[][] m2 = {
                {2,1},
                {3,2},
                {1,1},
        };
        int[][] m3 = new int[2][2];
        for(int w = 0; w < m3.length; w++) { //2
            for (int i = 0; i < m3[0].length; i++) {
                for(int j = 0; j < m2.length; j++) {
                    m3[w][i] += m1[w][j] * m2[j][i];
                }

                }
        }
        int[][] an = {
                {1,2,3},
                {2,3,4},
                {4,6,6},
        };
        int[][] at = new int[(an[0].length)][an.length];
        for(int i = 0; i< at[0].length; i++){
            for(int j = 0; j < at.length;j++){
                at[j][i] = an[i][j];
            }
        }

        for(int i = 0; i < at.length; i++){
            for(int j = 0; j < at[0].length;j++){
                System.out.print(at[i][j]+ " ");
            }
            System.out.println();
        }
    }}
