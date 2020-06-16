package pl.korwinbieniek.Ex41to50;

import java.io.File;

public class Ex45 {
    public void returnFileSize()
    {
        System.out.println("C:\\Users\\Korwin\\Documents\\Mount and Blade II Bannerlord\\Configs\\engine_config.txt : "
        + new File("engine_config.txt").length() + " bytes");
    }
}
