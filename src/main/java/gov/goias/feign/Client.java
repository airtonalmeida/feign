package gov.goias.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(url = "https://jsonplaceholder.typicode.com/", value = "jplaceholder")
public interface Client {
	
	@GetMapping(path = "/posts") 
    List<Post> getPosts();

}
