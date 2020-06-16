package pl.korwinbieniek.Ex31to40;

public class Ex39 {
    public int countCombinations()
    {
        int amount = 0;
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 5; j++) {
                for (int k = 1; k < 5; k++) {
                    if(k != j && k != i && i != j)
                    {
                        amount++;
                        System.out.println(i + "" + j + "" + k);
                    }
                }
            }
        }
        return amount;
    }
}
