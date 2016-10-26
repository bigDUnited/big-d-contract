package dtos;

import java.util.Date;
import java.util.List;

public class JourneysDTO {

    private List<JourneySummaryDTO> journeysList;
    private Date from;
    private Date to;

    public JourneysDTO(List<JourneySummaryDTO> journeysList, Date from, Date to) {
        this.journeysList = journeysList;
        this.from = from;
        this.to = to;
    }

    public List<JourneySummaryDTO> getJourneysList() {
        return journeysList;
    }

    public void setJourneysList(List<JourneySummaryDTO> journeysList) {
        this.journeysList = journeysList;
    }

    public Date getFrom() {
        return from;
    }

    public void setFrom(Date from) {
        this.from = from;
    }

    public Date getTo() {
        return to;
    }

    public void setTo(Date to) {
        this.to = to;
    }

   

    /*
     * Testing purposes
     */
    @Override
    public String toString() {
        return "JourneysDTO{" + "journeysList=" + journeysList + ", from=" + from
                + ", to=" + to + '}';
    }
}
