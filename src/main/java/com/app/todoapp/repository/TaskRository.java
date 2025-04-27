package com.app.todoapp.repository;

import com.app.todoapp.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;



public interface TaskRository extends JpaRepository<Task, Long>{

}
