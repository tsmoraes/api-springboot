package com.example.demo.controller;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * 
 * @author Thiago da Silva Moraes
 */

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.domain.Post;

@SpringBootTest
public class PostsControllerTest {
	
	@Autowired
	private PostsController controller;

	@Test
	public void contextLoads() throws Exception {
		assertThat(controller).isNotNull();
	}
	
	@Test
	public void testeBuscarPorId() throws Exception {
		assertThat(controller.getPost((long) 1)).isNotNull();
	}
	
	@Test
	public void testeCriarPost() throws Exception {
		Post post = new Post("teste", 1);
		assertThat(controller.createPost(post)).isNotNull();
	}
	
	@Test
	public void testeAtualizarPost() throws Exception {
		Post post = new Post("teste", 1);
		assertThat(controller.updatePost((long) 1, post)).isNotNull();
	}
	
	@Test
	public void testeDeletarPost() throws Exception {
		assertThat(controller.deletePost((long) 1)).isNotNull();
	}
}
