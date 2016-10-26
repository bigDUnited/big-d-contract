package contractmock;

import java.util.Arrays;
import java.util.List;
import contractinterface.ContractInterface;
import dtos.LocationDTO;
import dtos.RouteDTO;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;
import org.hamcrest.MatcherAssert;
import static org.hamcrest.CoreMatchers.is;

public class ContractMockito_Test {

    //define the object
    private static ContractInterface contract;

    @BeforeClass
    public static void setUpClass() {
        //Mock the contract
        contract = Mockito.mock(ContractInterface.class);
    }

    @AfterClass
    public static void tearDownClass() {
        contract = null;
    }

    @Test
    public void getLocationsMock_Test() {

        //Prebuild
        int[] localLocationIds = {0, 1, 2, 3, 4};
        String[] localLocationNames = {"București", "København", "София",
            "Bratislava", "Warszawa"};

        //Mocking
        Mockito.when(
                contract.getLocations()
        ).thenAnswer(new Answer() {
            List<LocationDTO> mockedLocDTOlist;

            @Override
            public Object answer(InvocationOnMock invocation) throws Throwable {
                mockedLocDTOlist = Arrays.asList(
                        new LocationDTO(0, "București"),
                        new LocationDTO(1, "København"),
                        new LocationDTO(2, "София"),
                        new LocationDTO(3, "Bratislava"),
                        new LocationDTO(4, "Warszawa")
                );

                return mockedLocDTOlist;
            }
        });

        //Testing
        List<LocationDTO> locDTOlist = contract.getLocations();
        MatcherAssert.assertThat(locDTOlist.size(), is(5));

        int i = 0;
        for (LocationDTO locationDTO : locDTOlist) {
            MatcherAssert.assertThat(locationDTO.getLocationId(),
                    is(localLocationIds[i]));

            MatcherAssert.assertThat(locationDTO.getLocationName(),
                    is(localLocationNames[i]));
            i++;
        }
    }

    @Test
    public void getRoutesMock_Test() {

        //Prebuild
        int locationId = 1;
        String localDepartureLocation = "София";
        String[] localDestinationLocations = {"București", "København", "Bratislava",
            "Warszawa"};

        //Mocking
        Mockito.when(
                contract.getRoutes(locationId)
        ).thenAnswer(new Answer() {
            List<RouteDTO> mockedRouteDTOlist;

            @Override
            public Object answer(InvocationOnMock invocation) throws Throwable {
                System.out.println("Hello from the mocked shit");
                mockedRouteDTOlist = Arrays.asList(
                        new RouteDTO(1, "София", "București"),
                        new RouteDTO(1, "София", "København"),
                        new RouteDTO(1, "София", "Bratislava"),
                        new RouteDTO(1, "София", "Warszawa")
                );

                return mockedRouteDTOlist;
            }
        });

        //Testing
        List<RouteDTO> routeDTOlist = contract.getRoutes(1);
        MatcherAssert.assertThat(routeDTOlist.size(), is(4));

        int i = 0;
        for (RouteDTO routeDTO : routeDTOlist) {
            MatcherAssert.assertThat(routeDTO.getRouteId(),
                    is(locationId));

            MatcherAssert.assertThat(routeDTO.getDepartureLocation(),
                    is(localDepartureLocation));

            MatcherAssert.assertThat(routeDTO.getDestinationLocation(),
                    is(localDestinationLocations[i]));

            i++;
        }
    }
}
