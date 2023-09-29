package com.farrel.todoapp.view;

import com.farrel.todoapp.service.TodoService;
import com.farrel.todoapp.util.InputUtil;

import java.util.Scanner;

public class TodoView {

    private final TodoService todoService;

    public TodoView(TodoService todoService) {
        this.todoService = todoService;
    }

    public void showMenu() {
        while (true) {
            System.out.println("\n==== MAIN MENU ====");
            System.out.println("1. Show Todo List");
            System.out.println("2. Add a new Todo");
            System.out.println("3. Update a Todo status");
            System.out.println("4. Delete a Todo");
            System.out.println("5. Quit app");

            String chosenMenu = InputUtil.input("Choose menu (number only): ");

            if (chosenMenu.equals("1")) {
                showTodo();
            } else if (chosenMenu.equals("2")) {
                addTodo();
            } else if (chosenMenu.equals("5")) {
                break;
            } else {
                System.out.println("Input Not Valid");
            }
        }
    }

    private void showTodo() {

        System.out.println("\nFilter Option");
        System.out.println("1. Show all");
        System.out.println("2. Finished Todo");
        System.out.println("3. Unfinished Todo");
        
        String chosenFilterOption = InputUtil.input("Select filter:");
        
        Boolean status;
        if (chosenFilterOption.equals("1")) {
            status = null;
        } else if (chosenFilterOption.equals("2")) {
            status = true;
        } else if (chosenFilterOption.equals("3")) {
            status = false;
        } else {
            System.out.println("Input not valid");
            return;
        }

        todoService.showTodo(status);
    }

    private void addTodo() {
        System.out.println("\nADD NEW TODO");

        String todoDescription = InputUtil.input("Input Todo:");
        todoService.addTodo(todoDescription);
    }

    //TODO: by Putri
    private void deleteTodo() {

    }

    //TODO: by Putri
    private void updateTodoStatus() {

    }
}
