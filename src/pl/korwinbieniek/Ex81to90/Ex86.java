package pl.korwinbieniek.Ex81to90;

public class Ex86 {
    public int returnOne(int n) {
        int i = 0;
        while (n != 1) {
            System.out.println(n);
            if (n % 2 == 0) {
                n = n / 2;
                i += 1;
            } else {
                n = (3 * n + 1) / 2;
                i += 1;
            }
        }
        System.out.println("1\nAmount of operations to get one equals: ");
        return i;
    }
}
