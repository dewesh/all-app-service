package com.appster.services.common.dto;

import com.appster.services.common.enums.MatchAlgoEnum;

/**
 * Created by dagraw2 on 6/26/18.
 */
public class MatchResult extends Result {
    private MatchAlgoEnum matchAlgoEnum;
    private Boolean isMatched = false;
    public MatchResult(Integer result, Float accuracy, MatchAlgoEnum matchAlgoEnum) {
        super(result, accuracy);
        this.matchAlgoEnum = matchAlgoEnum;
    }

    public MatchAlgoEnum getMatchAlgoEnum() {
        return matchAlgoEnum;
    }

    public void setMatchAlgoEnum(MatchAlgoEnum matchAlgoEnum) {
        this.matchAlgoEnum = matchAlgoEnum;
    }

    public MatchResult withMatchingAlgo(MatchAlgoEnum matchingAlgo) {
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
