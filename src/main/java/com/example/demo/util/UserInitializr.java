package com.example.demo.util;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.dao.UserRepository;
import com.example.demo.dto.Users;

@Component
public class UserInitializr implements CommandLineRunner{
	
	@Autowired UserRepository rep;

	@Override
	public void run(String... args) throws Exception {
		rep.save(new Users("Admin","$2a$11$rbk9NyK0RdK3HBe9hzPOGODDK24.kIZlL4mhUIqlsaZlSK441FWDW",Arrays.asList("ROLE_ADMIN","ROLE_USER")));//Admin1234
		rep.save(new Users("User","$2a$11$5dxK0k7hqARbDshDvXJsMuIcO4rJt/7Tc33HWA2/im.uDv0Duvabq",Arrays.asList("ROLE_USER")));//User1234
	}

}
