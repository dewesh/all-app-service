package com.appster.services.common.dto;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by dagraw2 on 6/26/18.
 */
public class MatchingAppResponse {
    private Person matcher;
    private Set<PersonMatchResult> personMatchResults = new HashSet<>();

    public Person getMatcher() {
        return matcher;
    }

    public void setMatcher(Person matcher) {
        this.matcher = matcher;
    }

    public Set<PersonMatchResult> getPersonMatchResults() {
        return personMatchResults;
    }

    public void setPersonMatchResults(Set<PersonMatchResult> personMatchResults) {
        this.personMatchResults = personMatchResults;
    }

    public MatchingAppResponse withMatcher(Person matcher) {
        setMatcher(matcher);
        return this;
    }

    public MatchingAppResponse withPersonMatchResultRow(PersonMatchResult personMatch) {
        this.personMatchResults.add(personMatch);
        return this;
    }
}
