package org.acme.api;

import org.acme.entity.CompagnieAerienne;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import java.util.List;

@Path("/api/compagnies")
public class CompagnieApi {
    @GET
    public List<CompagnieAerienne> getAllCompagnies() {
        return CompagnieAerienne.listAll();
    }
}