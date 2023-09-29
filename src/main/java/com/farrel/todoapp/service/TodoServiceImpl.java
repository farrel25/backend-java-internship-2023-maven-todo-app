package com.farrel.todoapp.service;

import com.farrel.todoapp.entity.Todo;
import com.farrel.todoapp.repository.TodoRepository;

import java.util.List;

public class TodoServiceImpl implements TodoService{

    private final TodoRepository todoRepository;

    public TodoServiceImpl(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @Override
    public void showTodo(Boolean status) {
        List<Todo> todoList = status == null ? todoRepository.findAll() : todoRepository.findByStatus(status);

        System.out.println("\n TODO LIST");
        for (int number = 1; number <= todoList.size(); number++) {
            Todo todo = todoList.get(number - 1);
            String todoStatus = todo.getStatus() ? "Done" : "Need to do";
            System.out.println(number + ". " + todo.getDescription() + " (" + todoStatus + ")");
        }
    }

    @Override
    public void addTodo(String todoDescription) {
        Todo todo = new Todo();
        todo.setDescription(todoDescription);
        todo.setStatus(false);

        todoRepository.addOne(todo);
        System.out.println("Todo successfully added");
    }

    //TODO: by Putri
    @Override
    public void deleteTodo(Integer id) {

    }

    //TODO: by Putri
    @Override
    public void updateTodoStatus(Integer id, Boolean status) {

    }
}
