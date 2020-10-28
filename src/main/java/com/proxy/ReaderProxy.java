package com.proxy;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.domain.User;

@FeignClient(name="zuul-ms", url="${zuul-url}")  //zuul-ms
public interface ReaderProxy {

	@GetMapping("/read-ms/read")				 //read-ms/uri
	public List<User> read();

}



	