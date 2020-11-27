package edu.umb.cs680.hw10.apfs;


public class ApfsFileSearchVisitor implements ApfsVisitor {
    private String fileName;
    private ApfsFile file;
    public void visit(ApfsLink link) { return; };
    public void visit(ApfsDirectory dir) { return; };
    public void visit(ApfsFile file) {
        if(file.getName().equals(fileName)) {
            this.file = file;
        }
    }
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    public ApfsFile getFile() {
        return this.file;
    }
}
