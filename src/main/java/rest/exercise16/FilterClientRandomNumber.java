package rest.exercise16;

import jakarta.ws.rs.client.ClientRequestContext;
import jakarta.ws.rs.client.ClientResponseContext;
import jakarta.ws.rs.client.ClientResponseFilter;

import java.io.IOException;

public class FilterClientRandomNumber implements ClientResponseFilter {
    @Override
    public void filter(ClientRequestContext request, ClientResponseContext response) throws IOException {
        System.out.println("Filter Response Length: " + response.getLength());
    }
}
