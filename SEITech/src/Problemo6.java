public class Problemo6 {

    public void tranpose(int[][] M){
         int n = M.length, m = M[0].length;
        int M_transpose[][] = new int[m][n];
        for(int i = 0; i < n ; i++) {
            for (int j = 0; j < m; j++) {
                M_transpose[j][i] = M[i][j];
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(M_transpose[i][j] + "    ");
            }
            System.out.println();
        }

    }




}
