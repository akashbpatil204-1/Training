package com.sapient.springdemo.model;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlElement;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "Dependent")
@Data



/*
 * @OneToMany(fetch = FetchType.EAGER, cascade=CascadeType.ALL)
 * 
 * @JoinColumn(name="employee_id")
 * 
 * @XmlElement private List<Dependent> dependents;
 */
public class Dependent implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;

    @Override
    public String toString() {
        return "Dependent{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}