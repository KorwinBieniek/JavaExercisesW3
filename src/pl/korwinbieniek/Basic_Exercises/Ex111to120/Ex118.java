package pl.korwinbieniek.Basic_Exercises.Ex111to120;

public class Ex118 {
    public void firstString(String x, String occ)
    {
        boolean flag = false;
        int z = 0;
        for (int i = 0; i < x.length(); i++) {
            if(x.charAt(i) == occ.charAt(0))
            {
                flag = true;
                for (int j = i; j < occ.length(); j++) {
                    if(x.charAt(j) != occ.charAt(z))
                    {
                        flag = false;
                    }
                    z++;
                }
        }
            
        }
        if(flag)
        System.out.println(x + " contains " + occ);
        else
            System.out.println(x + " doesn't contain " + occ);
    }
}
