package edu.umb.cs680.hw07;

import java.util.LinkedList;

public class FileSystem {
    private static FileSystem fileSystem = null;
    private LinkedList<Directory> rootDirs = new LinkedList<Directory>();
    private FileSystem() {}
    public static FileSystem getFileSystem() {
        if (fileSystem == null)
            fileSystem = new FileSystem();
        return fileSystem;
    }
    public LinkedList<Directory> getRootDirs() {
        return this.rootDirs;
    }
    public void addRootDir(Directory rootDir) {
        this.rootDirs.add(rootDir);
    }
}