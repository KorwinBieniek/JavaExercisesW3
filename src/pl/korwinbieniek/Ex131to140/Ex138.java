package pl.korwinbieniek.Ex131to140;

public class Ex138 {
    public void PrintTheLongest(String[] strings)
    {
        int max = strings[0].length();

        for (int i = 0; i < strings.length; i++) {
            if(strings[i].length() > max)
                max = strings[i].length();
        }

        for (int i = 0; i < strings.length; i++) {
            if(strings[i].length() == max)
                System.out.print(strings[i] + " ");
        }
    }
}
