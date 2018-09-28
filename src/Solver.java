import edu.princeton.cs.algs4.MinPQ;

public class Solver {

    public Solver(Board initial) {
        MinPQ minPQ = new MinPQ(initial.n * initial.n);
    }

    public boolean isSolvable() {

    }

    public int moves() {

        if (!isSolvable()) {
            return -1;
        }
    }

    public Iterable<Board> solution() {

    }

    public static void main(String[] args) {
        int n=0;
        int[][] blocks = new int[n][n];
        Board board = new Board(blocks);

    }
}
