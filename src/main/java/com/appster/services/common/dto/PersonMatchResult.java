package com.appster.services.common.dto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by dagraw2 on 6/26/18.
 */
public class PersonMatchResult {
    private Person matchee;
    List<MatchResult> matchResults = new ArrayList<>();

    public Person getMatchee() {
        return matchee;
    }

    public void setMatchee(Person matchee) {
        this.matchee = matchee;
    }

    public List<MatchResult> getMatchResults() {
        return matchResults;
    }

    public void setMatchResults(List<MatchResult> matchResults) {
        this.matchResults = matchResults;
    }

    public PersonMatchResult withPerson(Person p) {
        setMatchee(p);
        return this;
    }

    public PersonMatchResult addMatchResult(MatchResult mr) {
        this.matchResults.add(mr);
        return this;
    }
}
