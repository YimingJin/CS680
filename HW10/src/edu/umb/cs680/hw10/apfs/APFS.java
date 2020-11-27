package edu.umb.cs680.hw10.apfs;

import edu.umb.cs680.hw10.fs.FSElement;
import edu.umb.cs680.hw10.fs.FileSystem;

import java.time.LocalDateTime;

public class APFS extends FileSystem {
    private LocalDateTime localTime = LocalDateTime.now();
    private static APFS instance = null;
    private ApfsDirectory root;
    public static APFS getAPFSFileSystem() {
        if (instance == null)
            instance = new APFS();
        return instance;
    }
    protected FSElement createDefaultRoot() {
        root = new ApfsDirectory(null, "root", 0, localTime, "ApfsFile", localTime);
        return root;
    }
    public ApfsDirectory getRootDir() {
        return root;
    }
}
