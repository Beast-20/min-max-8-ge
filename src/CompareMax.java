class CompareMax<T extends Comparable<T>> {
    public static <T extends Comparable<T>> T testMaximum(T var1, T var2, T var3) {
        T max = var1;

        if (var2.compareTo(max) > 0) {
            max = var2;
        }

        if (var3.compareTo(max) > 0) {
            max = var3;
        }

        return max;
    }
}
