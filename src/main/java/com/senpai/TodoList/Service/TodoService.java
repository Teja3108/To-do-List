package com.senpai.TodoList.Service;

import com.senpai.TodoList.Entity.Todo;
import com.senpai.TodoList.Repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {
    @Autowired
    TodoRepository todoRepository;

    public Todo addList(Todo todo) {
        return todoRepository.save(todo);
    }

    public List<Todo> getList() {
        return todoRepository.findAll();
    }

    public void delTodo(int id) {

        todoRepository.deleteById(id);
    }
}
