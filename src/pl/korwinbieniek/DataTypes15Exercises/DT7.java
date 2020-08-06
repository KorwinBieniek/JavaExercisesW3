package pl.korwinbieniek.DataTypes15Exercises;

public class DT7 {
    public void timeMeter(float timeh, float timem, float times, float distance)
    {
        float time = (timeh * 3600) + (timem * 60) + times;
        float  kmh = (distance/1000.0f)/(time/3600.0f);
        float  ms = distance / time;
        float  milh = kmh / 1.609f;
        System.out.println("KM/H " + kmh + "\nM/S " + ms + "\nMILES/H " + milh);
    }
}
