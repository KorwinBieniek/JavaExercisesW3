package pl.korwinbieniek.Ex101to110;

public class Ex110 {
    public void isPowerOf(int n)
    {

    int test = 0;
    if(n< 1)

    {
        System.out.print(Boolean.toString(false));
        test = 1;
    }
		if((n &(n -1))!=0)

    {
        System.out.print(Boolean.toString(false));
        test = 1;
    }
		if(test==0)

    {
        System.out.print(Boolean.toString((n & 0x55555555) != 0));
    }
		System.out.print("\n");
    }
}
