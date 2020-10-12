// f(n) = Σ f(i-1).f(n-i)
package Binary_Tree.BT;

class CatalnNo {
    int catalan(int n) {
        int res = 0;

        // Base case
        if (n <= 1) {
            return 1;
        }
        for (int i = 0; i < n; i++) {
            res += catalan(i) * catalan(n - i - 1);
        }
        return res;
    }

    public static void main(String[] args) {
        CatalnNo cn = new CatalnNo();
        for (int i = 0; i < 10; i++) {
            System.out.print(cn.catalan(i) + " ");
        }

    }
}