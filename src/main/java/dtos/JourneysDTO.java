package dtos;

import java.util.List;

public class JourneysDTO {

    private List<JourneySummaryDTO> journeysList;
    private String departureLocation;
    private String destinationLocation;

    public JourneysDTO(List<JourneySummaryDTO> journeysList, String departureLocation, String destinationLocation) {
        this.journeysList = journeysList;
        this.departureLocation = departureLocation;
        this.destinationLocation = destinationLocation;
    }

    public List<JourneySummaryDTO> getJourneysList() {
        return journeysList;
    }

    public void setJourneysList(List<JourneySummaryDTO> journeysList) {
        this.journeysList = journeysList;
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
        return "JourneysDTO{" + "journeysList=" + journeysList + ", departureLocation="
                + departureLocation + ", destinationLocation=" + destinationLocation + '}';
    }

}
