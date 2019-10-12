package com.challenge.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.CreatedDate;

@Entity(name = "acceleration")
public class Acceleration {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Size(max = 100)
	private String name;
	@Size(max = 50)
	private String slug;
	@ManyToOne
	private Challenge challenge;
	@CreatedDate
	@Column(name = "created_at")
	private LocalDate createdAt;

}
