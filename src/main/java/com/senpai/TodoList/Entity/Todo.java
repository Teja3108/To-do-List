package com.senpai.TodoList.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "todo")
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String todo;
    private String time;
}
