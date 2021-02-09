package pepQue.Level1.recursion.rec_arraylist;

import java.util.*;

class getKpc {

    static String[] coded = { ".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static ArrayList<String> getKpc(String str) {

        if (str.length() == 0) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        char ch = str.charAt(0);
        String ros = str.substring(1);

        ArrayList<String> rres = getKpc(ros);
        ArrayList<String> mres = new ArrayList<>();

        String ch_coded = coded[Integer.parseInt(Character.toString(ch))];

        for (int i = 0; i < ch_coded.length(); i++) {
            for (String s : rres) {
                mres.add(ch_coded.charAt(i) + s);
            }
        }
        return mres;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        ArrayList<String> al = new ArrayList<>();

        al = getKpc(s);
        System.out.println(al);
    }
}