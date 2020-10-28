package com.acontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bservice.IdeleteService;
import com.domain.User;
import com.proxy.ReaderProxy;

@RestController
public class DeleteController {
	
	@Autowired
	private IdeleteService deleteService;

    @Autowired
    private ReaderProxy readerProxy;
	
	@PostMapping("/delete")
	public List<User> deleteById(@RequestBody User user) {

		deleteService.deleteUserById(user);

		List<User> userList = readerProxy.read();

		return userList;

	}

}




