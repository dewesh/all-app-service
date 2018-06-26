package com.appster.services.common.dto;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by dagraw2 on 6/26/18.
 */
public class MatchingAppResponse {
    private Person matcher;
    private Set<PersonMatchResult> matchMatrix = new HashSet<>();

    public Person getMatcher() {
        return matcher;
    }

    public void setMatcher(Person matcher) {
        this.matcher = matcher;
    }

    public Set<PersonMatchResult> getMatchMatrix() {
        return matchMatrix;
    }

    public void setMatchMatrix(Set<PersonMatchResult> matchMatrix) {
        this.matchMatrix = matchMatrix;
    }

    public MatchingAppResponse withMatcher(Person matcher) {
        setMatcher(matcher);
        return this;
    }

    public MatchingAppResponse withMatchMatrixRow(PersonMatchResult personMatch) {
        this.matchMatrix.add(personMatch);
        return this;
    }
}
