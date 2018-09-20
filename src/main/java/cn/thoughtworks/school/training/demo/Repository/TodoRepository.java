package cn.thoughtworks.school.training.demo.Repository;

import cn.thoughtworks.school.training.demo.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.access.prepost.PostFilter;

import java.util.List;

public interface TodoRepository extends JpaRepository<Todo, Long> {

    @PostFilter("hasPermission(filterObject, 'READ')")
    List<Todo> findAll();
}
