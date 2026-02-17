package com.snooker4real;

import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.jboss.resteasy.reactive.RestResponse;

import java.util.List;

@Path("/episodes")
public class EpisodeResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Episode> episodes() {
        return Episode.listAll();
    }

    @GET
    @Path("/{episode}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Episode> episodes(@PathParam("episode") String episode) {
        if (episode != null) {
            return Episode.findByEpisode(episode);
        }
        return Episode.listAll();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Transactional
    public Response saveEpisode(Episode episode) {
        episode.persist();
        return Response.status(RestResponse.Status.CREATED).entity(episode).build();
    }
}
