package dtos;

import java.util.Date;

public class ReservationSummaryDTO {

    private String departureLocation;
    private String destinationLocation;
    private Date departureDate;
    private Date arrivalDate;
    private String ferryName;
    private int numberOfPeople;
    private String vehicleType;
    private int referenceNumber; //booking reference number 

    public ReservationSummaryDTO(String departureLocation, String destinationLocation,
            Date departureDate, Date arrivalDate, String ferryName, int numberOfPeople,
            String vehicleType, int referenceNumber) {
        this.departureLocation = departureLocation;
        this.destinationLocation = destinationLocation;
        this.departureDate = departureDate;
        this.arrivalDate = arrivalDate;
        this.ferryName = ferryName;
        this.numberOfPeople = numberOfPeople;
        this.vehicleType = vehicleType;
        this.referenceNumber = referenceNumber;
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
        return "ReservationSummaryDTO{" + "departureLocation=" + departureLocation
                + ", destinationLocation=" + destinationLocation + ", departureDate="
                + departureDate + ", arrivalDate=" + arrivalDate + ", ferryName="
                + ferryName + ", numberOfPeople=" + numberOfPeople + ", vehicleType="
                + vehicleType + ", referenceNumber=" + referenceNumber + '}';
    }

}
