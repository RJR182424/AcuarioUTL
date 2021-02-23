package edu.utl.dsm501.acuario.rest;
import com.google.gson.Gson;
import edu.utl.dsm501.acuario.control.ControlPeces;
import edu.utl.dsm501.acuario.modelo.peces;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("peces")
public class RESTPeces extends Application {

    @Path("getAll")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAll() {
        ControlPeces cp = new ControlPeces();
        String out = "";
        try {
            List<peces> peces = cp.selectAll();
            Gson gson = new Gson();
            out = gson.toJson(peces);
        } catch (Exception e) {
            e.printStackTrace();
            out = "{\"error:\"" + e.toString() + "\"}";
        }
        return Response.status(Response.Status.OK).entity(out).build();
    }
}
