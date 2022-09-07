package com.project.code.webservices.Model;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

import jakarta.validation.Constraint;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;

public class User {
	public Integer id;
	@Size(min=2, message = "Name should have minimum 2 characters")
	public String name;
	@Past(message = "Birthday can't be in future")
	public LocalDate birthDate;

	public User(Integer id, String name, LocalDate birthDate) {
		super();
		this.id = id;
		this.name = name;
		this.birthDate = birthDate;
	}

	public final Integer getId() {
		return id;
	}

	public final void setId(Integer id) {
		this.id = id;
	}

	public final String getName() {
		return name;
	}

	public final void setName(String name) {
		this.name = name;
	}

	public final LocalDate getBirthDate() {
		return birthDate;
	}

	public final void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", birthDate=" + birthDate + "]";
	}

}
