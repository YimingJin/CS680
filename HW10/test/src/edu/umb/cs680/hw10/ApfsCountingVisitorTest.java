package edu.umb.cs680.hw10;

import edu.umb.cs680.hw10.apfs.*;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class ApfsCountingVisitorTest {
    LocalDateTime localTime = LocalDateTime.now();
    APFS ApfsFileSystem = APFS.getAPFSFileSystem();
    ApfsDirectory root = (ApfsDirectory) ApfsFileSystem.initFileSystem("Apfs", 500);
    ApfsDirectory applications = new ApfsDirectory(root, "applications", 0, localTime,"ApfsFile",localTime);
    ApfsDirectory home = new ApfsDirectory(root, "home", 0, localTime,"ApfsFile",localTime);
    ApfsDirectory code = new ApfsDirectory(home, "code", 0, localTime,"ApfsFile",localTime);
    ApfsFile a = new ApfsFile(applications, "a", 5, localTime,"ApfsFile",localTime);
    ApfsFile b = new ApfsFile(applications, "b", 20, localTime,"ApfsFile",localTime);
    ApfsFile c = new ApfsFile(home, "c", 30, localTime,"ApfsFile",localTime);
    ApfsFile d = new ApfsFile(home, "d", 40, localTime,"ApfsFile",localTime);
    ApfsFile e = new ApfsFile(code, "e", 15, localTime,"ApfsFile",localTime);
    ApfsFile f = new ApfsFile(code, "f", 15, localTime,"ApfsFile",localTime);
    ApfsLink x = new ApfsLink(home, "x", 0, localTime, "ApfsFile", localTime, applications);
    ApfsLink y = new ApfsLink(code, "y", 0, localTime,"ApfsFile",localTime,b);
    @Test
    public void verifyVisitorRoot() {
        ApfsCountingVisitor visitor = new ApfsCountingVisitor();
        root.accept(visitor);
        assertEquals(4,visitor.getDirNum());
        assertEquals(6,visitor.getFileNum());
        assertEquals(2,visitor.getLinkNum());
    }

    @Test
    public void verifyVisitorHome() {
        ApfsCountingVisitor visitor = new ApfsCountingVisitor();
        home.accept(visitor);
        assertEquals(2,visitor.getDirNum());
        assertEquals(4,visitor.getFileNum());
        assertEquals(2,visitor.getLinkNum());
    }
    @Test
    public void verifyVisitorCode() {
        ApfsCountingVisitor visitor = new ApfsCountingVisitor();
        code.accept(visitor);
        assertEquals(1,visitor.getDirNum());
        assertEquals(2,visitor.getFileNum());
        assertEquals(1,visitor.getLinkNum());
    }
}