package edu.umb.cs680.hw12;

import java.util.Comparator;

public class ElementComparator implements Comparator<ApfsElement> {
    public int compare(ApfsElement apfselement1, ApfsElement apfselement2) {
        return apfselement1.getOwnerName().compareTo(apfselement2.getOwnerName());
    }
}
