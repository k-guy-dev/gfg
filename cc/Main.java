package cc;

import java.util.*;
import java.io.*;
class Main {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int t = sc.nextInt();
       while(t>=0){
        String s = sc.nextLine();
        int count_groups = 0;
        int temp_count = 0;
           
        for(int i = 0 ; i< s.length();i++){
            if(s.charAt(i) == '1'){
                temp_count++;
            }else if(s.charAt(i) == '0'){
                if(temp_count > 0){
                    count_groups++;
                }
            }
        }
        System.out.println(count_groups);
        t--;
       }
    }
}