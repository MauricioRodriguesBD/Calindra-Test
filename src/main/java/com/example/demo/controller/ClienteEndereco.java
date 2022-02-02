package com.example.demo.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import feign.Headers;
import feign.Response;


@FeignClient(name = "Google", url = "https://maps.googleapis.com/maps/api/geocode/json")
public interface ClienteEndereco {

//	@RequestMapping(method = RequestMethod.GET, value = "{address}")
	@GetMapping( value = "?address={address}&key=AIzaSyCQm-7NO8zqjgZ-_9NGgmSb-1upNH03D6o")
	@Headers("Content-Type: application/json")
	String  getPosts(@PathVariable  String address);
	
	

}