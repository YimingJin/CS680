package edu.umb.cs680.hw08;

import java.time.LocalDateTime;
import java.util.LinkedList;

public class Directory extends FSElement{
    private LinkedList<FSElement> children = new LinkedList<FSElement>();
    private LinkedList<File> file = new LinkedList<File>();
    private FileSystem fileSystem;
    public Directory(Directory parent, String name, int size, LocalDateTime creationTime) {
        super(parent, name, size, creationTime);
    }
    public LinkedList<FSElement> getChildren() {
        return this.children;
    }
    public void appendChild(FSElement child) {
        this.children.add(child);
        child.setParent(this);
    }
    public int countChildren() {
        return this.children.size();
    }
    public LinkedList<Directory> getSubDirectories() {
        LinkedList<Directory> subdirectory = new LinkedList<Directory>();
        for(FSElement a : children) {
            if (a.isDirectory()) {
                subdirectory.add((Directory) a);
            }
        }
        return subdirectory;
    }
    public LinkedList<File> getFiles() {
        for(FSElement a : children) {
            if(!a.isDirectory()) {
                file.add((File) a);
            }
        }
        return this.file;
    }
    public int getTotalSize() {
        int totalsize = 0;
        for(FSElement a : children) {
            if (a.isDirectory())
                totalsize += ((Directory) a).getTotalSize();
            else
                totalsize += a.getSize();
        }
        return totalsize;
    }
    public Boolean isDirectory() {
        return true;
    }
    public Boolean isFile() {
        return false;
    }
    public Boolean isLink() {
        return false;
    }
}
