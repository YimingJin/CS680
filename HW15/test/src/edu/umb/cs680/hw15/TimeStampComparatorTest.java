package edu.umb.cs680.hw15;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.LinkedList;
import static org.junit.jupiter.api.Assertions.*;
public class TimeStampComparatorTest {
    LocalDateTime localTime = LocalDateTime.now();
    APFS ApfsFileSystem = APFS.getAPFSFileSystem();
    ApfsDirectory root = (ApfsDirectory) ApfsFileSystem.initFileSystem("Apfs", 500);
    ApfsDirectory applications = new ApfsDirectory(root, "applications", 0, localTime,"ApfsFile",localTime);
    ApfsDirectory home = new ApfsDirectory(root, "home", 0, localTime,"ApfsFile",localTime);
    ApfsDirectory code = new ApfsDirectory(home, "code", 0, localTime,"ApfsFile",localTime);
    ApfsFile a = new ApfsFile(applications, "a", 10, localTime,"ApfsFile",localTime);
    ApfsFile b = new ApfsFile(applications, "b", 15, localTime,"ApfsFile",localTime);
    ApfsFile c = new ApfsFile(home, "c", 20, localTime,"ApfsFile",localTime);
    ApfsFile d = new ApfsFile(home, "d", 50, localTime,"ApfsFile",localTime);
    ApfsFile e = new ApfsFile(code, "e", 10, localTime,"ApfsFile",localTime);
    ApfsFile f = new ApfsFile(code, "f", 20, localTime,"ApfsFile",localTime);
    ApfsLink x = new ApfsLink(home, "x", 0, localTime, "MyFile", localTime, applications);
    ApfsLink y = new ApfsLink(code, "y", 0, localTime,"ApfsFile",localTime,b);
    @Test
    public void GetChildrenTest() {
        ApfsDirectory dir = root;
        LinkedList<ApfsElement> actual = dir.getChildren((ApfsElement o1, ApfsElement o2) -> o2.getLastModified().compareTo(o1.getLastModified()));
        ApfsElement[] expected = { applications, home };
        assertArrayEquals(expected, actual.toArray());
    }
    @Test
    public void getSubDirectoriesTest() {
        ApfsDirectory dir = home;
        LinkedList<ApfsDirectory> actual = dir.getSubDirectories((ApfsElement o1, ApfsElement o2) -> o2.getLastModified().compareTo(o1.getLastModified()));
        ApfsDirectory[] expected = { code };
        assertArrayEquals(expected, actual.toArray());
    }
    @Test
    public void getFilesTest() {
        ApfsDirectory dir = home;
        LinkedList<ApfsFile> actual = dir.getFiles((ApfsElement o1, ApfsElement o2) -> o2.getLastModified().compareTo(o1.getLastModified()));
        ApfsFile[] expected = { c, d };
        assertArrayEquals(expected, actual.toArray());
    }
}
