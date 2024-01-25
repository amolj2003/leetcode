 class Main {
    public static void rainwater(int num1[]) {
        int n = num1.length;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];

        leftMax[0] = num1[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], num1[i]);
        }

        rightMax[n - 1] = num1[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], num1[i]);
        }

        int trappedWater = 0;
        for (int i = 0; i < n; i++) {
            trappedWater += Math.min(leftMax[i], rightMax[i]) - num1[i];
        }

        System.out.println(trappedWater);
    }

    public static void main(String[] args) {
        int[] num1 = {4, 2, 0, 6, 3, 2, 5};
        rainwater(num1);
    }
}
