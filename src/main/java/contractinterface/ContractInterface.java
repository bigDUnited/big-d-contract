package contractinterface;

import dtos.JourneysDTO;
import dtos.LocationDTO;
import dtos.ReservationSummaryDTO;
import dtos.RouteDTO;
import java.util.List;

public interface ContractInterface {

    List<LocationDTO> getLocations();

    List<RouteDTO> getRoutes(int locationId);

    JourneysDTO getJourney(int routeId);

    ReservationSummaryDTO makeReservation(String journeyId, int numOfPeople, String vehicleType);
}
