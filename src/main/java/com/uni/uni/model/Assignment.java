package com.uni.uni.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;



@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Assignment {
	
	public Assignment(int id, String name, String deadline) {
		this.id = id;
		this.name = name;
		this.deadline = deadline;
	}
	
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDeadline() {
		return deadline;
	}

	public void setDeadline(String deadline) {
		this.deadline = deadline;
	}

	@NotNull
    private int id;
    
    @NotEmpty(message="Mandatory field")
    private String name;
    
    @NotNull(message="Mandatory field")
    private String deadline;
}
