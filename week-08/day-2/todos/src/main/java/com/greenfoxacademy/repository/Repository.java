package com.greenfoxacademy.repository;

import com.greenfoxacademy.model.Todo;
import org.springframework.data.repository.CrudRepository;


public interface Repository extends CrudRepository<Todo, Long> {
}
