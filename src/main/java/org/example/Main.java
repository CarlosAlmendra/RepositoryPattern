package org.example;

import org.example.db.DatabaseInitializer;
import org.example.entities.User;
import org.example.repository.UserRepository;

import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        System.out.println("Enter 1 to add a user, 2 to list all users, or 3 to exit.");
        opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                DatabaseInitializer.init();
                UserRepository userRepository = new UserRepository();

                UUID id = UUID.randomUUID();
                User newUser = new User(id, "João da Silva", "joao@example.com", "senha123");
                userRepository.save(newUser);
                break;
            case 2:
                List<User> users = userRepository.findAll();
                for (User user : users) {
                    System.out.println("Name: " + user.getName() + " | Email: " + user.getEmail());
                }
                break;
            default:
                break;
        }
    }
}