package edu.umb.cs680.hw08;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class LinkTest {
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
    private String[] linkToStringArray(Link link) {
        String[] linkInfo = {
                String.valueOf(link.isDirectory()),
                link.getName(),
                Integer.toString(link.getSize()),
                link.getCreationTime().toString(),
                link.getParent().getName(),
                String.valueOf(link.getTarget().getName()),
                String.valueOf(link.isFile()),
                String.valueOf(link.isLink())
        };
        return linkInfo;
    }
    @Test
    public void verifyTargetEqualityG() {
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
        String[] expected = {"false", "g", "0", localdatetime3.toString(), "Home", "Applications", "false", "true"};
        Link link = this.g;
        String[] actual = linkToStringArray(g);
        assertArrayEquals(actual, expected);
    }
    @Test
    public void verifyTargetEqualityH() {
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
        String[] expected = { "false", "h", "0", localdatetime3.toString(), "Code", "b", "false", "true"};
        Link link = this.h;
        String[] actual = linkToStringArray(h);
        assertArrayEquals(actual, expected);
    }
}