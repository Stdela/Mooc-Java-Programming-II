package com.mycompany.part2_02_abbreviations;

import java.util.HashMap;

public class Abbreviations {

    private String abbreviation;
    private String explanation;
    private HashMap<String, String> abrrevs;

    public Abbreviations() {
        this.abrrevs = new HashMap<>();
    }

    @Override
    public String toString() {
        return "Abbreviations{" + "abbreviation=" + abbreviation + ", explanation=" + explanation + '}';
    }

    public void addAbbreviation(String abbreviation, String explanation) {
        this.abrrevs.put(abbreviation, explanation);

    }

    public boolean hasAbbreviation(String abbreviation) {
        if (this.abrrevs.containsKey(abbreviation)) {
            return true;
        } else {
            return false;
        }

    }

    public String findExplanationFor(String abbreviation) {
        return this.abrrevs.get(abbreviation);
    }
}
