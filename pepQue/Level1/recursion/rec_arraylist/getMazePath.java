package pepQue.Level1.recursion.rec_arraylist;

import java.util.*;

class getMazePath {
    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {

        if (sr == dr && sc == dc) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        ArrayList<String> vres = new ArrayList<>();
        ArrayList<String> hres = new ArrayList<>();

        if (sc < dc) {
            hres = getMazePaths(sr, sc + 1, dr, dc);
        }
        if (sr < dr) {
            vres = getMazePaths(sr + 1, sc, dr, dc);
        }

        ArrayList<String> mres = new ArrayList<String>();

        for (String str : vres) {
            mres.add("v" + str);
        }
        for (String str : hres) {
            mres.add("h" + str);
        }
        return mres;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<String> res = getMazePaths(1, 1, n, m);
        System.out.println(res);
    }
}