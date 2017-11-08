package matteo.mapapplication;


import android.location.Location;

/**
 * Created by Matteo on 23/10/2017.
 */

public class User {
    private Location location = new Location(String.valueOf(0.0));
    private String firstName;


    public Location getLocation() {
        return location;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLocation(double latitudine, double longitudine) {
        location.setLatitude(latitudine);
        location.setLongitude(longitudine);
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

}