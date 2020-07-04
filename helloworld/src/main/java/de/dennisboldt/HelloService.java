package de.dennisboldt;

import java.util.LinkedList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class HelloService {

	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })

	public List<Data> getPropertyJSON() {
		List<Data> list = new LinkedList<>();
		list.add(new Data("value1"));
		list.add(new Data("value2"));
		return list;
	}

}
