package gov.goias.feign;

import lombok.Data;

@Data
public class Post {
	
	private long userId;
	private long id;
	private String title;
	private String body;

}
