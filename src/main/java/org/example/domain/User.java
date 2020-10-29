package org.example.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.org.apache.xpath.internal.operations.Bool;
import org.example.config.Gender;
import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "user")
public class User implements Cloneable{

	public User() {

	}

	public User(String name, String phone, Long identity, Long creditscore, Long income,Long total, Boolean status) {

		this.setName(name);
		this.setPhone(phone);
		this.setCreditscore(creditscore);
		this.setIdentity(identity);
		this.setIncome(income);
		this.setStatus(status);
		this.setTotal(total);

	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", unique = true, nullable = false)
	private Long id;

	private String name;

	private Long identity;

	private String phone;

	private Long income;

	private Long creditscore;

	private Long total;

	private Boolean status;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getIdentity() {
		return identity;
	}

	public void setIdentity(Long identity) {
		this.identity = identity;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Long getIncome() {
		return income;
	}

	public void setIncome(Long income) {
		this.income = income;
	}

	public Long getCreditscore() {
		return creditscore;
	}

	public void setCreditscore(Long creditscore) {
		this.creditscore = creditscore;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public Long getTotal() {
		return total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}
}