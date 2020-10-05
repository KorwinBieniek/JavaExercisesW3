package pl.korwinbieniek.StringExercises;

import java.util.Arrays;

public class Str45 {
    public String reverseWordsInSentence(String str) {
        String[] strings = str.split(" ");
        String[] reverseStrings = new String[strings.length];

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strings.length; i++) {
            sb = new StringBuilder(strings[i]);
            sb.reverse();
            reverseStrings[i] = sb.toString();
        }

        StringBuilder finalString = new StringBuilder();
        for (int i = 0; i < strings.length; i++) {
            finalString.append(reverseStrings[i] + " ");
        }
        return finalString.toString();

        /*String[] reverseStrings = new String[strings.length];

        int x = 0;
        int j = 0;

        while (x < strings.length)
        {
            char[] arr;
            arr = strings[x].toCharArray();
            char[] arr2 = new char[strings[x].length()];
            j=0;
            for (int i = arr.length-1; i >= 0; i--) {

                arr2[j] = arr[i];

                j++;
            }
            reverseStrings[x] = Arrays.toString(arr2);
            System.out.print(" ");
            x++;

        }
        StringBuilder finalString = new StringBuilder();
        for (int i = 0; i < strings.length; i++) {
            finalString.append(reverseStrings[i]);
        }
        return finalString.toString();*/
    }
}
