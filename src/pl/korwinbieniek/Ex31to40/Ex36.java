package pl.korwinbieniek.Ex31to40;

public class Ex36 {

    public double distanceBetweenPoints(double lon1, double lat1, double lon2, double lat2)
    {
        double earthRadius = 6371.01;
        lon1 = Math.toRadians(lon1);
        lon2 = Math.toRadians(lon2);
        lat1 = Math.toRadians(lat1);
        lat2 = Math.toRadians(lat2);
        return earthRadius * Math.acos(Math.sin(lat1)*Math.sin(lat2) + Math.cos(lat1)*Math.cos(lat2)*Math.cos(lon1 - lon2));
    }

}
