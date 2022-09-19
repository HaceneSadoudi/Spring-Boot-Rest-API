package com.sadoudi.tmh.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {

	@GetMapping("/testSuccess")
	@ResponseStatus(HttpStatus.OK)
	public String testSuccess() {
		return "success";
	}

	@GetMapping("/testNotFound")
	public ResponseEntity<String> testNotFound() {
		return new ResponseEntity<String>("not found", HttpStatus.NOT_FOUND);
	}

	@GetMapping("/testError")
	public ResponseEntity<String> testError() {
		return new ResponseEntity<String>("error", HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
