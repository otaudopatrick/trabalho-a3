package com.trabalhoa3.delivery.adapters.out.fileDatabase;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.UUID;

import com.trabalhoa3.delivery.domain.entities.Client;
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
    public Client save(Client client) {
        UUID uuid = UUID.randomUUID();
        String[] userData = { uuid.toString(), client.getName(), client.getEmail() };
        FileIO.writeFile(this.FILE_PATH, userData);
        return null;
    }

    @Override
    public Client findByEmail(String email) {
        List<List<String>> users = this.findAll();
        for (List<String> user : users) {
            boolean isUserContaisnerEmail = user.contains(email);
            if (isUserContaisnerEmail) {
                Client clientFromDb = new Client(user.get(1), user.get(2), user.get(3));
                return clientFromDb;
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
            e.printStackTrace();
        } catch (IOException e) {
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
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}
