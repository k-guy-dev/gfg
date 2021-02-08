package Daily_Coding_Problem;

import java.util.*;

// Q: Given a string s and a list of words words, where each word is the same
// length, find all starting indices of substrings in s that is a concatenation
// of every word in words exactly once.

// For example, given s = "dogcatcatcodecatdog" and words = ["cat", "dog"],
// return [0, 13], since "dogcat" starts at index 0 and "catdog" starts at index
// 13.

// Given s = "barfoobazbitbyte" and words = ["dog", "cat"], return [] since
// there are no substrings composed of "dog" and "cat" in s.

// The order of the indices does not matter.

class prblm1 {

    static int[] words(String s, String[] words) {
        StringBuilder fb = new StringBuilder();
        StringBuilder bf = new StringBuilder();
        String front = "";
        String back = "";
        for (int i = 0; i < words.length; i++) {

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = sc.nextInt(); // length of words array
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }

    }
}