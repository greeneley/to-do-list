package com.example.todoList.todoList.repositories;

import com.example.todoList.todoList.models.TodoItem;
import org.springframework.data.repository.CrudRepository;

public interface TodoItemRepository extends CrudRepository<TodoItem, Long> {
}