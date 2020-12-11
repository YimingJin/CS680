package edu.umb.cs680.hw12;

import java.util.Comparator;

public class AlphabeticalComparator implements Comparator<ApfsElement> {
    public int compare(ApfsElement apfselement1, ApfsElement apfselement2) {
        return apfselement1.getName().compareTo(apfselement2.getName());
    }
}