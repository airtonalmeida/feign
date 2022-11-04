package gov.goias.feign;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/", path = "/")
public class Controller {
	
private final Client client;
	
	public Controller(Client client) {
		this.client = client;
		
	}
	
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Post> get() {
		
		return client.getPosts();
		
		
	}

}
