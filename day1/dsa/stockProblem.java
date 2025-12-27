public class stockProblem {
    public static void main(String[] var0) {
        int[] var1 = new int[]{7, 1, 5, 3, 6, 4,7};
        System.out.println(maxProfit(var1));
    }

    static int maxProfit(int[] var0) {
        int var1 = 0;
        int var2 = var0[0];

        for(int var3 = 1; var3 < var0.length; ++var3) {
            int var4 = var0[var3] - var2;
            if (var4 > var1) {
                var1 = var4;
            }

            if (var0[var3] < var2) {
                var2 = var0[var3];
            }
        }

        return var1;
    }
}