package edu.umb.cs680.hw12;

import java.util.Comparator;

public class ReverseAlphabeticalComparator implements Comparator<ApfsElement> {
    public int compare(ApfsElement apfselement1, ApfsElement apfselement2) {
        return apfselement2.getName().compareTo(apfselement1.getName());
    }
}
