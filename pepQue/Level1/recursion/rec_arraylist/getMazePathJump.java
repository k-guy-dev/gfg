package pepQue.Level1.recursion.rec_arraylist;

import java.util.*;

class getMazePathJump {
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {

        // baseCase
        if (sr == dr && sc == dc) {
            ArrayList<String> bres = new ArrayList<String>();
            bres.add("");
            return bres;
        }

        ArrayList<String> paths = new ArrayList<String>();

        // Moving Horizontally
        for (int ms = 1; ms <= dc - sc; ms++) {
            ArrayList<String> hpath = getMazePaths(sr, sc + ms, dr, dc);
            for (String s : hpath) {
                paths.add("h" + ms + hpath);
            }
        }
        // Moving Vertically
        for (int ms = 1; ms <= dc - sc; ms++) {
            ArrayList<String> vpath = getMazePaths(sr + ms, sc, dr, dc);
            for (String s : vpath) {
                paths.add("v" + ms + vpath);
            }
        }
        // Moving Diagonally
        for (int ms = 1; ms <= dr - sr && ms <= dc - sc; ms++) {
            ArrayList<String> dpath = getMazePaths(sr + ms, sc + ms, dr, dc);
            for (String s : dpath) {
                paths.add("d" + ms + dpath);
            }
        }
        return paths;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<String> res = getMazePaths(1, 1, n, m);
        System.out.println(res);
    }
}