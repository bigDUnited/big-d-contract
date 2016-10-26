package dtos;

import java.util.Date;

public class ReservationSummaryDTO {

    private String from, to;
    private Date date;
    private String ferryName;
    private int numberOfPeople;
    private String vehicleType;
    private int referenceNumber;

    public ReservationSummaryDTO(String from, String to, Date date, String ferryName,
            int numberOfPeople, String vehicleType, int referenceNumber) {
        this.from = from;
        this.to = to;
        this.date = date;
        this.ferryName = ferryName;
        this.numberOfPeople = numberOfPeople;
        this.vehicleType = vehicleType;
        this.referenceNumber = referenceNumber;
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

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public int getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(int referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    @Override
    public String toString() {
        return "ReservationSummaryDTO{" + "from=" + from + ", to=" + to
                + ", date=" + date + ", ferryName=" + ferryName + ", numberOfPeople="
                + numberOfPeople + ", vehicleType=" + vehicleType + ", referenceNumber="
                + referenceNumber + '}';
    }

}
