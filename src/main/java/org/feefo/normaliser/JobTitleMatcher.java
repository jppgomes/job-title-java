package org.feefo.normaliser;

import java.util.List;

public class JobTitleMatcher {

    List<String> normalizedTitles;

    public JobTitleMatcher(List<String> normalizedTitles) {
        this.normalizedTitles = normalizedTitles;
    }

    public String findBestMatch(String inputTitle) {
        String bestMatch = "";
        double highestScore = 0.0;

        for (String normalizedTitle : normalizedTitles) {
            double score = calculateSimilarity(inputTitle, normalizedTitle);
            if (score > highestScore) {
                highestScore = score;
                bestMatch = normalizedTitle;
            }
        }

        return bestMatch;
    }

    public double calculateSimilarity(String inputTitle, String normalizedTitle) {
        String[] inputWords = inputTitle.toLowerCase().split(" ");
        String[] normalizedWords = normalizedTitle.toLowerCase().split(" ");

        int matches = 0;
        for (String inputWord : inputWords) {
            for (String normalizedWord : normalizedWords) {
                if (inputWord.equals(normalizedWord)) {
                    matches++;
                }
            }
        }

        return (double) matches / normalizedWords.length;
    }

}
