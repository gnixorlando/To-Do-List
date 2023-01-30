package br.com.tasklist.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;



@Entity
@SequenceGenerator (name="seq_task", sequenceName = "seq_task", allocationSize = 1, initialValue = 1)
public class Task implements Serializable {
	
	private static final long seriaLVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_task")
	private Long id;
	private String taskName;
	private String status;
	
	public Task () {
		
		
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Task (String taskName, String status) {
		this.taskName=taskName;
		this.status=status;
		
	}
}
