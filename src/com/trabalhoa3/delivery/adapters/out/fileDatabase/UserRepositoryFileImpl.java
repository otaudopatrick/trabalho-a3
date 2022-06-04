package com.trabalhoa3.delivery.adapters.out.fileDatabase;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.UUID;

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
        return null;
    }

    @Override
    public List<User> findAll(int page, int size) {
        return null;
    }

}
