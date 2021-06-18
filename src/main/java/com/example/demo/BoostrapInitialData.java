package com.example.demo;

import com.example.demo.domain.Post;
import com.example.demo.repository.PostRepository;
import com.github.javafaker.Faker;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
public class BoostrapInitialData implements CommandLineRunner {

    private final PostRepository postRepository;
    private final Faker faker = new Faker(Locale.getDefault());

    public BoostrapInitialData(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public void run(String... args) {
        for (int i = 0; i < 10; i++) {
            postRepository.save(new Post(faker.zelda().game(), faker.number().randomDigitNotZero()));
        }
    }
}
