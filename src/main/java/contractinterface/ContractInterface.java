package contractinterface;

import dtos.JourneysDTO;
import dtos.LocationDTO;
import dtos.ReservationSummaryDTO;
import dtos.RouteDTO;
import java.util.List;

public interface ContractInterface {

    public List<LocationDTO> getLocations();

    public List<RouteDTO> getRoutes(int locationId);

    public JourneysDTO getJourney(int routeId);

    public ReservationSummaryDTO makeReservation(int journeyId, int numOfPeople, String vehicleType);
}
