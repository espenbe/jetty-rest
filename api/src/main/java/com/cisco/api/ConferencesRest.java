package com.cisco.api;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("conferences")
public class ConferencesRest {

    @Path("conferences/{id}")
    @GET
    @Produces("text/plain")
    public String getSingle(@PathParam("id")String id) {
        // Return some cliched textual content
        return id + "\n\nConference1\nconference2\n";
    }


    @Path("/json")
    @GET
    @Produces("application/json")
    public ConferenceBean getAll() throws JSONException {
        return new ConferenceBean();
    }
 }
