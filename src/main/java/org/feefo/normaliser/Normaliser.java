package org.feefo.normaliser;

import java.util.Arrays;
import java.util.List;

public class Normaliser {
    private List<String> normalizedTitles = Arrays.asList("Architect", "Software engineer", "Quantity surveyor", "Accountant");
    private JobTitleMatcher matcher;

    public Normaliser() {
        matcher = new JobTitleMatcher(normalizedTitles);
    }

    public String normalise(String jobTitle) {
        return matcher.findBestMatch(jobTitle);
    }

    public static void main(String[] args) {
        Normaliser n = new Normaliser();
        String[] testTitles = {"Java engineer", "C# engineer", "Chief Accountant", "Accountant"};

        for (String title : testTitles) {
            System.out.println("Input: " + title + " -> Normalized: " + n.normalise(title) + " score: " + n.matcher.calculateSimilarity(title, n.normalise(title)));
        }
    }
}
