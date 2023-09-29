package com.farrel.todoapp.repository;

import com.farrel.todoapp.entity.Todo;

import java.util.ArrayList;
import java.util.List;

public class TodoRepositoryImpl implements TodoRepository{

    private List<Todo> todoList = new ArrayList<>();

    @Override
    public List<Todo> findAll() {
        return todoList;
    }

    //TODO: by Putri
    @Override
    public List<Todo> findByStatus(Boolean status) {
        return null;
    }

    @Override
    public Boolean addOne(Todo todo) {
        return todoList.add(todo);
    }

    //TODO: by Putri
    @Override
    public Boolean deleteById(Integer id) {
        return null;
    }

    //TODO: by Putri
    @Override
    public Boolean updateStatusById(Integer id, Boolean status) {
        return null;
    }
}
