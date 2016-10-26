package dtos;

import java.util.List;

public class JourneysDTO {

    private List<JourneySummaryDTO> journeysList;
    private String from;
    private String to;

    public JourneysDTO(List<JourneySummaryDTO> journeysList, String from, String to) {
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

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
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
