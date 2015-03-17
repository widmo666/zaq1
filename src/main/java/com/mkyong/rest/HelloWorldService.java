package com.mkyong.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

@Path("/hello")
public class HelloWorldService {
	@GET
	@Path("/{param}")
	public Response getMsg(@PathParam("param") String msg) {
		String output = "Teraz to juz nie Jersey : " + msg;
		return Response.status(200).entity(output).build();
	}

	@GET
	@Path("/string")
	public Response getString() {
		String output = "testowa wiadomosc";
		return Response.status(200).entity(output).build();
	}

	@GET
	@Path("/users")
	@Produces()
	public String getUsersFromMoodle() {
		try {

			Client client = Client.create();

			WebResource webResource = client.resource("http://127.0.0.1:8080/moodleREST/employee/users");
			ClientResponse response = webResource.accept("application/json").get(ClientResponse.class);
			if (response.getStatus() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());
			}
			return response.getEntity(String.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "";
	}

}