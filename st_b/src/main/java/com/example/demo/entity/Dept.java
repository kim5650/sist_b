package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(name="dept")
public class Dept {
	
	@Id
	private int dno;
	private String dname;
	private String dloc;
	
}
