package com.company;
import java.util.*;
public class anagrams {

    static boolean isAnagram(String a, String b) {
        String[] arr1 = new String[a.length()];
        String[] arr2 = new String[b.length()];
        boolean flag = true;
        if (a.length() == b.length()) {
            for (int i = 0; i < a.length(); i++) {
                arr1[i] = a.substring(i, i + 1);
                arr2[i] = b.substring(i, i + 1);

            }
            System.out.println(arr1+ "\n"+ arr2);
            if (arr1 == arr2) {
                flag = true;
            } else {
                flag = false;
            }
        } else {
            flag = false;
        }

        return flag;
    }



    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );


    }
}
