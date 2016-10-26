package dtos;

import java.util.Date;

public class JourneySummaryDTO {

    private String journeyId;
    private Date date;
    private String ferryName;

    public JourneySummaryDTO(String journeyId, Date date, String ferryName) {
        this.journeyId = journeyId;
        this.date = date;
        this.ferryName = ferryName;
    }

    public String getJourneyId() {
        return journeyId;
    }

    public void setJourneyId(String journeyId) {
        this.journeyId = journeyId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
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
        return "JourneySummaryDTO{" + "journeyId=" + journeyId + ", date="
                + date + ", ferryName=" + ferryName + '}';
    }

}
