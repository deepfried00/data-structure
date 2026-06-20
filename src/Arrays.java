public class Arrays{
    public static void main(String[] args) {
        int[][] arr = {
                {4,3,8},
                {2,5,-1},
                {-6,16,9},
                {4,13,11},
        };
        int[][] swp = swapp(arr);
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
        // transpose
        int[][] an = {
                {1,2,3},
                {2,3,4},
                {4,6,6},
        };
        int[][] at = rotant(an);
        // rotate by +90
        printt(at);
        System.out.println();
        int[][] ate = rotcloc(an);
        printt(ate);
        System.out.println();
// rotate +180
        int[][] te = rotant(rotant(an));
        printt(te);
        System.out.println();
        // rotate -180
        int[][] ep = rotcloc(rotcloc(an));
        printt(ep);

    }
    public static int[][] tranpose(int[][] an){
        int[][] at = new int[(an[0].length)][an.length];
        for(int i = 0; i< at[0].length; i++){
            for(int j = 0; j < at.length;j++){
                at[j][i] = an[i][j];
            }
        }
        return at;
    }
    public static int[][] swapp(int[][] arr){
        int[][] at = new int[arr.length][arr[0].length];
        for(int i = 0; i< at.length; i++){
            for(int j = 0; j < at[0].length;j++){
                at[i][j] = arr[i][j];
            }
        }
        for(int i = 0; i< at.length; i++){
            for(int j = 0; j <(at[0].length)/2; j++){ // m/2= m
                int temp = at[i][j]; // 1
                at[i][j] = arr[i][(at[0].length-1-j)]; //1
                at[i][(at[0].length-1-j)] = temp; //1
            }
        }
        return at;
    }
    public static void printt(int[][] at){
        for(int i = 0; i < at.length; i++){
            for(int j = 0; j < at[0].length;j++){
                System.out.print(at[i][j]+ " ");
            }
            System.out.println();
        }
    }
    public static int[][] rotant(int[][] at){
    int[][] a = swapp(tranpose(at));
    return a;
    }
    public static int[][] rotcloc(int[][] at){
        int a[][] = tranpose(swapp(at));
        return a;
    }
}
