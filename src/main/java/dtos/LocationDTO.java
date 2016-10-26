package dtos;

public class LocationDTO {

    private int locationId;
    private String name;

    public LocationDTO(int locationId, String name) {
        this.locationId = locationId;
        this.name = name;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    public int getLocationId() {
        return locationId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    /*
     * Testing purposes
     */
    @Override
    public String toString() {
        return "LocationDTO{" + "locationId=" + locationId + ", name=" + name + '}';
    }

}
