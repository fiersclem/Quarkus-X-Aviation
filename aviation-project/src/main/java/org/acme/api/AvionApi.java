package org.acme.api;

import org.acme.entity.AvionLigne;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import java.util.List;

@Path("/api/avions")
public class AvionApi {
    @GET
    public List<AvionLigne> getAllAvions() {
        return AvionLigne.listAll();
    }
}