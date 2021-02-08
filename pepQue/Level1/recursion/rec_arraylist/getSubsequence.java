package pepQue.Level1.recursion.rec_arraylist;

import java.util.*;

class getSubsequence {
    public static ArrayList<String> gss(String str) {

        if (str.length() == 0) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        char ch = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> rres = gss(ros);

        ArrayList<String> mres = new ArrayList<>();
        for (String rstr : rres) {
            mres.add("" + rstr);
            mres.add(ch + rstr);
        }
        return mres;
    }

    public static void main(String[] args) {

    }
}