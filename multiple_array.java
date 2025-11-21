
class multiple_array {

    public static void main(String[] args) {
        // System.out.println("Sant Rampal Ji Maharaj ji Blessing me");
        int threed[][][] = new int[3][4][5];

        int i, j, k;
        for (i = 0; i <= 3; i++) {
            for (j = 0; j <= 4; j++) {
                for (k = 0; k <= 5; k++) {
                    threed[i][j][k] = i * j * k;
                }
            }
        }
        //output
        for (i = 0; i <= 3; i++) {
            for (j = 0; j <= 4; j++) {
                for (k = 0; k <= 5; k++) {
                    System.out.println(threed[i][j][k] + " ");
                }

            }

        }
    }
}
