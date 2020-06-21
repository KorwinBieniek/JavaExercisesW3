package pl.korwinbieniek.Ex91to100;

public class Ex91 {
    public void timeToCompile()
    {
        long startTime = System.nanoTime();
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        long estimatedTime = System.nanoTime() - startTime;
        System.out.println("Time to compile this program is: " + estimatedTime + " nanoseconds");

    }
}
