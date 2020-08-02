package pl.korwinbieniek.DataTypes15Exercises;

public class DT4 {
    public void MinToYears(int minutes)
    {
        int years = minutes/525949;
        int days = (minutes/ 60 / 24) % 365;

        System.out.println(years + " " + days);
    }
}
