package com.challenge.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity(name = "submission")
@EntityListeners(AuditingEntityListener.class)
public class Submission {

	@ManyToOne
	@NotNull
	@Column(name = "user_id")
	private User userId;
	@ManyToOne
	@NotNull
	private Challenge challenge;

}