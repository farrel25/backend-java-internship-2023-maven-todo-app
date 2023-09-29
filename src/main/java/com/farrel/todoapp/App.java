package com.farrel.todoapp;

import com.farrel.todoapp.repository.TodoRepository;
import com.farrel.todoapp.repository.TodoRepositoryImpl;
import com.farrel.todoapp.service.TodoService;
import com.farrel.todoapp.service.TodoServiceImpl;
import com.farrel.todoapp.view.TodoView;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        TodoRepository todoRepository = new TodoRepositoryImpl();
        TodoService todoService = new TodoServiceImpl(todoRepository);
        TodoView todoView = new TodoView(todoService);

        todoView.showMenu();
    }
}
