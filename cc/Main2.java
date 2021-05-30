package cc;

import java.util.*;

class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            // Number of Seasons
            t--;
            int S = sc.nextInt();
            // Intro time array
            int[] intro = new int[S];
            for (int i = 0; i < S; i++) {
                intro[i] = sc.nextInt();
            }
            // Number of episodes array;
            int[] ep = new int[S];
            for (int i = 0; i < S; i++) {
                ep[i] = sc.nextInt();
            }
            // Calculating totalep
            int total_ep = 0;
            for (int i = 0; i < S; i++) {
                total_ep += ep[i];
            }
            // time of each episode
            int[] epTime = new int[total_ep];
            for (int i = 0; i < total_ep; i++) {
                epTime[i] = sc.nextInt();
            }
            int total_watchTime = 0;
            int total_introTime = 0;
            int single_introTime = 0;
            for (int i = 0; i < total_ep; i++) {
                total_watchTime += epTime[i];
            }
            for (int i = 0; i < S; i++) {
                total_introTime += ep[i] * intro[i];
                single_introTime += intro[i];
            }
            int woIntro = total_watchTime - total_introTime;
            int finalWatchTime = woIntro + single_introTime;
            System.out.println(finalWatchTime);
        }
    }
}