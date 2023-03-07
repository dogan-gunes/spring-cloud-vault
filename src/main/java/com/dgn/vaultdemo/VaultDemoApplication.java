package com.dgn.vaultdemo;

import com.dgn.vaultdemo.model.User;
import com.dgn.vaultdemo.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class VaultDemoApplication implements CommandLineRunner {
    private final UserRepository userRepository;

    public VaultDemoApplication(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(VaultDemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
		User user = new User("DOĞAN","GÜNEŞ");
		userRepository.saveAll(Arrays.asList(user));

    }
}
