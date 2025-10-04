class PascalsTriangle {

    static List<List<Integer>> rows(int count) {
        List<List<Integer>> results = []
        if (count == 0) {return results}
        for (n in 0..count-1) {
            List<Integer> layer = []
            for (k in 0..n) {
                layer << formula(n, k)
            }
            results << layer
        }
        return results
    }

    static int formula(int n, int k) {
        final fac_n = factorial(n)
        final fac_k = factorial(k)
        final fac_nk = factorial(n-k)

        return (fac_n/(fac_k*fac_nk))
    }

    static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factiorials for negative numbers are undefined")
        }
        return n == 0 ? 1 : (1..n).inject(1) { acc, i -> acc * i}
    }
}
