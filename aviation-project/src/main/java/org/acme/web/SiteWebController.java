package org.acme.web;

import org.acme.entity.CompagnieAerienne;
import org.acme.entity.AvionLigne;
import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/web")
public class SiteWebController {

    @Inject
    Template compagnies;
    
    @Inject
    Template avions;

    @GET
    @Path("/compagnies")
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance getCompagnies(@QueryParam("id") String idCompagnie) {
        CompagnieAerienne selected = null;
        if (idCompagnie != null) {
            selected = CompagnieAerienne.findById(idCompagnie);
        }
        return compagnies
            .data("allCompagnies", CompagnieAerienne.listAll())
            .data("selected", selected);
    }

    @GET
    @Path("/avions")
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance getAvions(@QueryParam("id") String idAvion) {
        AvionLigne selected = null;
        if (idAvion != null) {
            selected = AvionLigne.findById(idAvion);
        }
        return avions
            .data("allAvions", AvionLigne.listAll())
            .data("selected", selected);
    }
}