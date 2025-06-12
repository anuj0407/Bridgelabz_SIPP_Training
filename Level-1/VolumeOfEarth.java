class VolumeOfEarth{
public static void main(String[] args){
int earthRadiusInKm = 6378;
double earthRadiusInMile = earthRadiusInKm * 0.621371;
double volOfEarthInCubicKm = (4/(double)3) * 3.14 * (earthRadiusInKm * earthRadiusInKm * earthRadiusInKm);
double volOfEarthInCubicMile = (4/(double)3) * 3.14 * (earthRadiusInMile * earthRadiusInMile * earthRadiusInMile);
System.out.println("The volume of earth in cubic kilometers is " + volOfEarthInCubicKm + " and cubic miles is " + volOfEarthInCubicMile);
}
}