package com.example.basic.MicroServices.Users;

//import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
//import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
//import org.springframework.hateoas.Resource;
///import org.springframework.hateoas.mvc.ControllerLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class UserResource {
	@Autowired
	private UsersDaoService service;

	@GetMapping("/users")
	public List<Users> retrieveAllUsers() {
		return service.findAll();
	}

	@GetMapping("/users/{id}")
	public Users retrieveUser(@PathVariable int id) {
	return service.findOne(id);
	//	return user;
		/*if(user==null)
			throw new UserNotFoundException("id-"+ id);
		
		
		//"all-users", SERVER_PATH + "/users"
		//retrieveAllUsers
		Resource<Users> resource = new Resource<Users>(user);
		
		ControllerLinkBuilder linkTo = 
				linkTo(methodOn(this.getClass()).retrieveAllUsers());
		
		resource.add(linkTo.withRel("all-users"));
		
		//HATEOAS
		
		return resource;
*/	}

	/*@DeleteMapping("/users/{id}")
	public void deleteUser(@PathVariable int id) {
		Users user = service.deleteById(id);
		
		if(user==null)
			throw new UserNotFoundException("id-"+ id);		
	}*/

	//
	// input - details of user
	// output - CREATED & Return the created URI
	
	//HATEOAS
	
	@PostMapping("/users")
	public ResponseEntity<Object> createUser(@Valid @RequestBody Users user) {
		Users savedUser = service.save(user);
		// CREATED
		// /user/{id}     savedUser.getId()
		
		URI location = ServletUriComponentsBuilder
			.fromCurrentRequest()
			.path("/{id}")
			.buildAndExpand(savedUser.getId()).toUri();
		
		return ResponseEntity.created(location).build();
		
	}
}
