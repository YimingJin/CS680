package edu.umb.cs680.hw08;

import java.time.LocalDateTime;

public class Link extends FSElement {
    private FSElement target = null;
    public Link(Directory parent, String name, int size, LocalDateTime creationTime, FSElement target) {
        super(parent, name, size, creationTime);
        this.target = target;
    }
    public void setTarget(FSElement target) {
        this.target = target;
    }
    public FSElement getTarget() {
        return this.target;
    }
    public Boolean isDirectory() {
        return false;
    }
    public Boolean isFile() {
        return false;
    }
    public Boolean isLink() {
        return true;
    }
}
