package dtos;

public class LocationDTO {

    private int locationId;
    private String locationName;

    public LocationDTO(int locationId, String locationName) {
        this.locationId = locationId;
        this.locationName = locationName;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    public int getLocationId() {
        return locationId;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    /*
     * Testing purposes
     */
    @Override
    public String toString() {
        return "LocationDTO{" + "locationId=" + locationId + ", locationName="
                + locationName + '}';
    }

}
