package pepQue.Level1.recursion.rec_arraylist;

import java.util.*;

class getStairPath {
    public static ArrayList<String> getStairPaths(int n) {

        if (n == 0) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        } else if (n < 0) {
            ArrayList<String> bres = new ArrayList<>();
            return bres;
        }

        ArrayList<String> paths1 = getStairPaths(n - 1);
        ArrayList<String> paths2 = getStairPaths(n - 2);
        ArrayList<String> paths3 = getStairPaths(n - 3);

        ArrayList<String> final_paths = new ArrayList<>();

        for (String str : paths1) {
            final_paths.add(1 + str);
        }
        for (String str : paths2) {
            final_paths.add(2 + str);
        }
        for (String str : paths3) {
            final_paths.add(3 + str);
        }
        return final_paths;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> res = getStairPaths(n);
        System.out.println(res);
    }
}