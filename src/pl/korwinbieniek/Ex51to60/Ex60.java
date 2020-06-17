package pl.korwinbieniek.Ex51to60;

public class Ex60 {
    public void findPenultimate(String x)
    {
        String[] penultimate = x.split("[ ]+");
        System.out.println("Penultimate word is: " + penultimate[penultimate.length - 2]);
    }
}
