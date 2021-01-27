package io.github.fernandoschimidt.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.fernandoschimidt.todo.model.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}
