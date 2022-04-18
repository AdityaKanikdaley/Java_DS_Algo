package apniKaksha.Recursion;

// Q: game theory: optimal strategy to win a coin game
// not using tree as its very complicated, so, using recursive leap of faith
public class game_theory {
    public static void main(String[] args) {

        int[] a = {1, 5, 7, 3};
        System.out.println(coinMax(a, 0, a.length - 1));

        /*
        Explanation:
         index:   0 1 2 3
         value:   1 5 7 3

        case1: if I choose a[0] then -> a[0] + min{ (2,3)
                                                    (1,2) }
        case2: if I choose a[3] then -> a[3] + min{ (1,2)
                                                    (0,1) }

        Now, return MAX(case1 ,case2)
         */
    }

    static int coinMax(int[] a, int l, int r) {  // l and r are left right pointers

        if (l + 1 == r) return Math.max(a[l], a[r]);

        return Math.max(a[l] + Math.min(coinMax(a, l + 2, r), coinMax(a, l + 1, r - 1)),
                a[r] + Math.min(coinMax(a, l + 1, r - 1), coinMax(a, l, r - 2))
        );
    }
}
