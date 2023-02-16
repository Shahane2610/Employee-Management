package com.assignment.company.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@Getter
@Setter
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@JsonProperty("NAME")
	private String name;

	@JsonProperty("CODE")
	private int code;

	@JsonProperty("ROLE")
	private String role ;






}
