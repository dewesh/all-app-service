package com.appster.services.common.dto;

import com.appster.services.common.enums.MatchAlgoEnum;

/**
 * Created by dagraw2 on 6/26/18.
 */
public class MatchResult extends Result {
    private String matchAlgoEnum;
    private Boolean isMatched = false;
    public MatchResult(Integer result, Double accuracy, String matchAlgoEnum) {
        super(result, accuracy);
        this.matchAlgoEnum = matchAlgoEnum;
    }

    public String getMatchAlgoEnum() {
        return matchAlgoEnum;
    }

    public void setMatchAlgoEnum(String matchAlgoEnum) {
        this.matchAlgoEnum = matchAlgoEnum;
    }

    public MatchResult withMatchingAlgo(String matchingAlgo) {
        setMatchAlgoEnum(matchingAlgo);
        return this;
    }

    public Boolean getMatched() {
        return isMatched;
    }

    public void setMatched(Boolean matched) {
        isMatched = matched;
    }

    public MatchResult withMatch(Boolean isMatched) {
        setMatched(isMatched);
        return this;
    }
}
