package cn.thoughtworks.school.training.demo;

import cn.thoughtworks.school.training.demo.Repository.TodoRepository;
import cn.thoughtworks.school.training.demo.entity.Todo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@WithMockUser(username = "user")
public class DemoApplicationTests {
	@Autowired
	TodoRepository todoRepository;

	@Test
	public void contextLoads() {
		List<Todo> details = todoRepository.findAll();
		System.out.println(details);
	}

}
