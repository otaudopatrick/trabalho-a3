package com.trabalhoa3.delivery.adapters.out.fileDatabase;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.UUID;
import java.util.function.Consumer;

import com.trabalhoa3.delivery.domain.entities.User;
import com.trabalhoa3.delivery.domain.ports.UserRepository;
import com.trabalhoa3.delivery.util.FileIO;

public class UserRepositoryFileImpl implements UserRepository {
    private final String FILE_NAME = "user";
    private final Path BASE_PATH = Paths.get("src", "com", "trabalhoa3", "delivery", "database", "files");
    private final String FILE_EXTENSION_TYPE = ".csv";
    private Path FILE_PATH;

    public UserRepositoryFileImpl() {
        this.FILE_PATH = Paths.get(this.BASE_PATH.toAbsolutePath().toString(),
                this.FILE_NAME.concat(this.FILE_EXTENSION_TYPE));
    }

    @Override
    public User save(User user) {
        UUID uuid = UUID.randomUUID();
        String[] userData = { uuid.toString(), user.getName(), user.getEmail() };
        FileIO.writeFile(this.FILE_PATH, userData);
        return null;
    }

    @Override
    public User findByEmail(String email) {
        List<List<String>> users = this.findAll();
        for (List<String> user : users) {
            boolean isUserContaisnerEmail = user.contains(email);
            if (isUserContaisnerEmail) {
                User userFromDb = new User(user.get(1), user.get(2), user.get(3));
                return userFromDb;
            }
        }
        return null;
    }

    @Override
    public List<List<String>> findAll() {
        try {
            List<List<String>> usersList = FileIO.readFile(this.FILE_PATH.toAbsolutePath().toString());
            return usersList;
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<List<String>> findAll(int page, int size) {
        try {
            List<List<String>> usersList = FileIO.readFile(this.FILE_PATH.toAbsolutePath().toString());
            System.out.println(usersList);
            return usersList;
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }

}
