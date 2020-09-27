package pl.korwinbieniek.Array74Exercises;

import java.util.ArrayList;
import java.util.Arrays;

public class Ar20 {
    public void convertArrayToArrayList()
    {
        String[] arr = {"Python","Java","Ruby","CPP","C"};

        ArrayList<String> list = new ArrayList<String>(Arrays.asList(arr));

        System.out.println(list);
    }
}
