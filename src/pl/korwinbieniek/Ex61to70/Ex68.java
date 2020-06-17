package pl.korwinbieniek.Ex61to70;

public class Ex68 {
    public void copyOf3LastChars(String x)
    {
        for (int i = 0; i < 4; i++) {
            System.out.print(x.substring(x.length()-3) + " ");
        }
    }
}
