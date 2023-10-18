package com.senpai.TodoList.Controller;

import com.senpai.TodoList.Entity.Todo;
import com.senpai.TodoList.Service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("todos")
@CrossOrigin("*")
public class TodoController {
    @Autowired
    TodoService todoService;

    @PostMapping("addTodo")
    public Todo addList(@RequestBody Todo todo){
        return todoService.addList(todo);
    }

    @GetMapping("getTodo")
    public List<Todo> getList(){
        return todoService.getList();
    }

    @DeleteMapping("delTodo/{id}")
    public Void delTodo(@PathVariable int id) {
        todoService.delTodo(id);
        return null;
    }
}
