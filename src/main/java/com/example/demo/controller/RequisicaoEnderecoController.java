package com.example.demo.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.bind.annotation.RestController;

import feign.Response;

@RestController

public class RequisicaoEnderecoController {

	private ClienteEndereco clienteEndereco;

	public RequisicaoEnderecoController(ClienteEndereco clienteEndereco) {

		this.clienteEndereco = clienteEndereco;
	}

	@GetMapping("{address}")
	public ResponseEntity<?> consulta(@PathVariable String address) {

		System.out.println(address);

//		EnderecoResponse endereco = clienteEndereco.consultaEndereco(address);


//
//		return ResponseEntity.ok(endereco);

		String response = clienteEndereco.getPosts(address);
		
		return ResponseEntity.ok(response);

	}


}
