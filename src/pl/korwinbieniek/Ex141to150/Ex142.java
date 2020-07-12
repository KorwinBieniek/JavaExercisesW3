package pl.korwinbieniek.Ex141to150;

public class Ex142 {
    public int isAnagram(String x, String y)
    {
        char[] xc = x.toCharArray();
        char[] yc = y.toCharArray();
        int j = x.length()-1;
        for (int i = 0; i < x.length(); i++)
        {
            if(xc[i] != yc[j])
            {
                System.out.println("not anagram");
                return 0;
            }
            j--;
        }
        System.out.println("anagram");
        return 1;
    }
}
