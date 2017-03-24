public class Operation {
    public int odd_count(int[] array) {
        int count = 0;
        // 在这里写代码

        for (int a : array) {
            if (a % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
