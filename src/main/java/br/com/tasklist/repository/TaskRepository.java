package br.com.tasklist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.tasklist.models.Task;

public interface TaskRepository extends JpaRepository<Task, Long>{

}
