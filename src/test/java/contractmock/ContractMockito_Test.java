package contractmock;

import contractinterface.ContractInterface;
import dtos.LocationDTO;
import java.util.Arrays;
import java.util.List;
import static org.hamcrest.CoreMatchers.is;
import org.hamcrest.MatcherAssert;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

public class ContractMockito_Test {

    //define the object
    private static ContractInterface contract;

    @BeforeClass
    public static void setUpClass() {
        //initialize the facade
        //contract = new Contract();
        
        //Mock the contract
        contract = Mockito.mock(ContractInterface.class);

        
    }

    @AfterClass
    public static void tearDownClass() {
        contract = null;
    }

    @Test
    public void hello() {

        Mockito.when(
                contract.getLocations()
        ).thenAnswer(new Answer() {
            List<LocationDTO> mockedLocDTOlist;

            @Override
            public Object answer(InvocationOnMock invocation) throws Throwable {
                System.out.println("Hello from the mocked shit");
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

        List<LocationDTO> locDTOlist = contract.getLocations();
        MatcherAssert.assertThat(locDTOlist.size(), is(5));
    }
}
