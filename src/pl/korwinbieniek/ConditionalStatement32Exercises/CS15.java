package pl.korwinbieniek.ConditionalStatement32Exercises;

public class CS15 {
    public void sumOfOdds(int num) {
        int sum = 0;
        int i = 0;

        while (num != 0) {
            i++;
            if (i % 2 != 0) {
                System.out.println(i);
                sum += i;
                num--;
            }
        }
        System.out.println("The sum of odd natural numbers upto 5 terms is: " + sum);
    }
}

