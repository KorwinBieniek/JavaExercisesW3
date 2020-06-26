package pl.korwinbieniek.Ex111to120;

public class Ex115 {
    public boolean isPalindrome(int x)
    {
        String pali = String.valueOf(x);
        int i = 0, j = pali.length() - 1;

        while(i < j) {
            if (pali.charAt(i++) != pali.charAt(j--))
                return false;
        }
        return true;
    }
}
