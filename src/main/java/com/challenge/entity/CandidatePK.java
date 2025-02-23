package com.challenge.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class CandidatePK implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "user_id")
	Integer userId;

	@Column(name = "acceleration_id")
	Integer accelerationId;

	@Column(name = "company_id")
	Integer companyId;

}
