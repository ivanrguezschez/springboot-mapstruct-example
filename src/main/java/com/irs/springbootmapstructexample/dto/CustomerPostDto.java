package com.irs.springbootmapstructexample.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class CustomerPostDto {

	@JsonProperty("id")
	private Integer id;

	@Email
	@NotNull
	@JsonProperty("email")
	private String email;
	
	@NotNull
	@JsonProperty("password")
	private String password;
	
	@JsonProperty("name")
	private String name;
	
	@JsonProperty("surname")
	private String surname;
}
