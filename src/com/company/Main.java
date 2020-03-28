package com.company;

import java.util.*;

public class Main {

    static boolean isAnagram(String a, String b) {
        if(a.length()!=b.length()) return false;
        int[] x = new int[26];
        int[] y = new int[26];
        a.toLowerCase();
        b.toLowerCase();
        for(int i = 0; i< a.length(); i++){
            x[a.charAt(i) - 'a']++;
            y[b.charAt(i) - 'a']++;
        }

        for(int i = 0; i < 26; i++){
            if(x[i]!=y[i]) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}