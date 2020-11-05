package edu.umb.cs680.hw08;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class FileTest {
    private LocalDateTime localdatetime1 = LocalDateTime.now();
    private LocalDateTime localdatetime2 = LocalDateTime.now();
    private LocalDateTime localdatetime3 = LocalDateTime.now();
    private LocalDateTime localdatetime4 = LocalDateTime.now();
    Directory root = new Directory(null, "Root",0, localdatetime1);
    Directory home = new Directory(null, "Home", 0, localdatetime2);
    Directory applications = new Directory(null, "Applications", 0, localdatetime2);
    Directory code = new Directory(null, "Code", 0, localdatetime3);
    File a = new File(null, "a", 10, localdatetime3);
    File b = new File(null, "b", 10, localdatetime3);
    File c = new File(null, "c", 10, localdatetime3);
    File d = new File(null, "d", 10, localdatetime3);
    File e = new File(null, "e", 10, localdatetime4);
    File f = new File(null, "f", 10, localdatetime4);
    Link g = new Link(null, "g", 0, localdatetime3, applications);
    Link h = new Link(null, "h", 0, localdatetime4, b);
    private String[] fileToStringArray(File file) {
        String[] fileInfo = {
                String.valueOf(file.isDirectory()),
                file.getName(),
                Integer.toString(file.getSize()),
                file.getCreationTime().toString(),
                file.getParent().getName(),
                String.valueOf(file.isFile()),
                String.valueOf(file.isLink())
        };
        return fileInfo;
    }
    @Test
    public void verifyFileEqualityA() {
        root.appendChild(home);
        root.appendChild(applications);
        home.appendChild(code);
        applications.appendChild(a);
        applications.appendChild(b);
        home.appendChild(c);
        home.appendChild(d);
        home.appendChild(g);
        code.appendChild(e);
        code.appendChild(f);
        code.appendChild(h);
        String[] expected = { "false", "a", "10", localdatetime3.toString(), "Applications", "true", "false"};
        File file = this.a;
        String[] actual = fileToStringArray(file);
        assertArrayEquals(actual, expected);
    }
    @Test
    public void verifyFileEqualityB() {
        root.appendChild(home);
        root.appendChild(applications);
        home.appendChild(code);
        applications.appendChild(a);
        applications.appendChild(b);
        home.appendChild(c);
        home.appendChild(d);
        home.appendChild(g);
        code.appendChild(e);
        code.appendChild(f);
        code.appendChild(h);
        String[] expected = { "false", "b", "10", localdatetime3.toString(), "Applications", "true", "false"};
        File file = this.b;
        String[] actual = fileToStringArray(file);
        assertArrayEquals(actual, expected);
    }
    @Test
    public void verifyFileEqualityC() {
        root.appendChild(home);
        root.appendChild(applications);
        home.appendChild(code);
        applications.appendChild(a);
        applications.appendChild(b);
        home.appendChild(c);
        home.appendChild(d);
        home.appendChild(g);
        code.appendChild(e);
        code.appendChild(f);
        code.appendChild(h);
        String[] expected = { "false", "c", "10", localdatetime3.toString(), "Home", "true", "false"};
        File file = this.c;
        String[] actual = fileToStringArray(file);
        assertArrayEquals(actual, expected);
    }
    @Test
    public void verifyFileEqualityD() {
        root.appendChild(home);
        root.appendChild(applications);
        home.appendChild(code);
        applications.appendChild(a);
        applications.appendChild(b);
        home.appendChild(c);
        home.appendChild(d);
        home.appendChild(g);
        code.appendChild(e);
        code.appendChild(f);
        code.appendChild(h);
        String[] expected = { "false", "d", "10", localdatetime3.toString(), "Home", "true", "false"};
        File file = this.d;
        String[] actual = fileToStringArray(file);
        assertArrayEquals(actual, expected);
    }
    @Test
    public void verifyFileEqualityE() {
        root.appendChild(home);
        root.appendChild(applications);
        home.appendChild(code);
        applications.appendChild(a);
        applications.appendChild(b);
        home.appendChild(c);
        home.appendChild(d);
        home.appendChild(g);
        code.appendChild(e);
        code.appendChild(f);
        code.appendChild(h);
        String[] expected = { "false", "e", "10", localdatetime4.toString(), "Code", "true", "false"};
        File file = this.e;
        String[] actual = fileToStringArray(file);
        assertArrayEquals(actual, expected);
    }
    @Test
    public void verifyFileEqualityF() {
        root.appendChild(home);
        root.appendChild(applications);
        home.appendChild(code);
        applications.appendChild(a);
        applications.appendChild(b);
        home.appendChild(c);
        home.appendChild(d);
        home.appendChild(g);
        code.appendChild(e);
        code.appendChild(f);
        code.appendChild(h);
        String[] expected = { "false", "f", "10", localdatetime4.toString(), "Code", "true", "false"};
        File file = this.f;
        String[] actual = fileToStringArray(file);
        assertArrayEquals(actual, expected);
    }
}