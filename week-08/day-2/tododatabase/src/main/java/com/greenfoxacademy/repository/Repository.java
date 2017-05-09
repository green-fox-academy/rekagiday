package com.greenfoxacademy.repository;

import com.greenfoxacademy.model.Todo;
import java.util.List;
import org.springframework.data.repository.CrudRepository;


public interface Repository extends CrudRepository<Todo, Long> {

  List<Todo> findByIsDoneFalse();

}
