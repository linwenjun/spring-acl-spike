package cn.thoughtworks.school.training.demo.controller;

import cn.thoughtworks.school.training.demo.Repository.TodoRepository;
import cn.thoughtworks.school.training.demo.entity.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PostFilter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoController {

    @Autowired
    TodoRepository todoRepository;

    @GetMapping
    @PostFilter("hasPermission(filterObject, 'READ')")
    public List<Todo> getOne() {
        return todoRepository.findAll();
    }
}
