package dtos;

import java.util.Date;

public class JourneySummaryDTO {

    private int journeyId;
    private Date departureDate;
    private Date arrivalDate;
    private String ferryName;

    public JourneySummaryDTO(int journeyId, Date departureDate, Date arrivalDate,
            String ferryName) {
        this.journeyId = journeyId;
        this.departureDate = departureDate;
        this.arrivalDate = arrivalDate;
        this.ferryName = ferryName;
    }

    public int getJourneyId() {
        return journeyId;
    }

    public void setJourneyId(int journeyId) {
        this.journeyId = journeyId;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }

    public Date getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(Date arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public String getFerryName() {
        return ferryName;
    }

    public void setFerryName(String ferryName) {
        this.ferryName = ferryName;
    }

    /*
     * Testing purposes
     */
    @Override
    public String toString() {
        return "JourneySummaryDTO{" + "journeyId=" + journeyId + ", departureDate="
                + departureDate + ", arrivalDate=" + arrivalDate + ", ferryName="
                + ferryName + '}';
    }

}
