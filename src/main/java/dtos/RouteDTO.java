package dtos;

public class RouteDTO {

    private int routeId;
    private String departureLocation, destinationLocation;

    public RouteDTO(int routeId, String departureLocation, String destinationLocation) {
        this.routeId = routeId;
        this.departureLocation = departureLocation;
        this.destinationLocation = destinationLocation;
    }

    public int getRouteId() {
        return routeId;
    }

    public void setRouteId(int routeId) {
        this.routeId = routeId;
    }

    public String getDepartureLocation() {
        return departureLocation;
    }

    public void setDepartureLocation(String departureLocation) {
        this.departureLocation = departureLocation;
    }

    public String getDestinationLocation() {
        return destinationLocation;
    }

    public void setDestinationLocation(String destinationLocation) {
        this.destinationLocation = destinationLocation;
    }

    /*
     * Testing purposes
     */
    @Override
    public String toString() {
        return "RouteDTO{" + "routeId=" + routeId + ", departureLocation="
                + departureLocation + ", destinationLocation=" + destinationLocation
                + '}';
    }

}
