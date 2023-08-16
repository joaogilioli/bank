package count.resource;

import count.model.Count;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/count")
public class CountResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Count getCount() {
        return new Count();
    }

}
