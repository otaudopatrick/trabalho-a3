package com.trabalhoa3.delivery.database;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import com.trabalhoa3.delivery.util.FileIO;

public class Database {
    private final Path PATH = Paths.get("src", "com", "trabalhoa3", "delivery", "database", "files");
    private final String FILE_EXTENSION_TYPE = ".csv";

    public Database() {
    }

    public void writeFile(Path filePath, String[] data) {
        FileIO.writeFile(filePath, data);
    }

    public List<List<String>> readFile(String filePath) throws FileNotFoundException, IOException {
        return FileIO.readFile(filePath);
    }

    public Path getPath(String filePath) {
        Path path = Paths.get(this.PATH.toAbsolutePath().toString(), filePath.concat(this.FILE_EXTENSION_TYPE));
        return path;
    }

    public Path getPath() {
        return this.PATH;
    }

    public String getPathToString(String filePath) {
        Path path = Paths.get(this.PATH.toAbsolutePath().toString(), filePath.concat(this.FILE_EXTENSION_TYPE));
        return path.toAbsolutePath().toString();
    }

    public String getPathToString() {
        return this.PATH.toAbsolutePath().toString();
    }

}
