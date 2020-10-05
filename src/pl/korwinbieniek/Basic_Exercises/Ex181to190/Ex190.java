package pl.korwinbieniek.Basic_Exercises.Ex181to190;

public class Ex190 {
    public String[] findMissingString(String str1, String str2)
    {
        String[] s1 = str1.split(" ");
        String[] s2 = str2.split(" ");
        String[] missing = new String[s1.length - s2.length];
        int c = 0;

        for (int i = 0; i < s1.length; i++) {
            int flag = 0;
            for (int j = 0; j < s2.length; j++) {
                if (s1[i].equals(s2[j])) {
                    flag = 1;
                    break;
                }
            }
            if(flag == 0)
                missing[c++] = s1[i];
        }
        return missing;
    }
}
