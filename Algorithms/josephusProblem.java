package apniKaksha.Algorithms;

// formula: f(n, k) = (f(n-1, k) + k-1) % n+1

public class josephusProblem {
    public static void main(String[] args) {
        int n = 5, k = 3;
        System.out.println(josephus(n, k));
    }

    private static int josephus(int n, int k) {

        // base condition
        if (n == 1)  // only one left in circle
            return 1;

        return (josephus(n - 1, k) + k - 1) % n + 1;
    }

    // linked list approach
    /*
    static void Josh(List<Integer> person, int k, int index)
  {

    // Base case , when only one person is left
    if (person.size() == 1) {
      System.out.println(person.get(0));
      return;
    }

    // find the index of first person which will die
    index = ((index + k) % person.size());

    // remove the first person which is going to be killed
    person.remove(index);

    // recursive call for n-1 persons
    Josh(person, k, index);
  }
    */
}
