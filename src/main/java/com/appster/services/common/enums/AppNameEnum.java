package com.appster.services.common.enums;

import com.appster.services.common.dto.MatchResult;
import com.appster.services.common.dto.MatchingAppResponse;
import com.appster.services.common.dto.Person;
import com.appster.services.common.dto.PersonMatchResult;
import javafx.util.Pair;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Created by dagraw2 on 6/26/18.
 */
public enum AppNameEnum {
    basicApp("basicApp", "basicApp", Arrays.asList(MatchAlgoEnum.NAME_MATCH, MatchAlgoEnum.PHONE_NUMBER_MATCH))
    ,isSheTheOne("isSheTheOne","isSheTheOne",Arrays.asList(MatchAlgoEnum.NAME_MATCH));

    String appName;
    String appId;
    List<MatchAlgoEnum> matchAlgoEnumList;

    AppNameEnum(String appName, String appId, List<MatchAlgoEnum> matchAlgos) {
        this.appName = appName;
        this.appId = appId;
        this.matchAlgoEnumList = matchAlgos;
    }

    public MatchingAppResponse provideMatch(Person matcher, List<Person> matcheeList) {
        MatchingAppResponse matchingAppResponse = new MatchingAppResponse();
        matchingAppResponse.setMatcher(matcher);
        for(Person matchee: matcheeList) {
            PersonMatchResult personMatchResult = new PersonMatchResult().withPerson(matchee);
            for (MatchAlgoEnum algo : matchAlgoEnumList) {
                MatchResult matchresulr = algo.matchPersons(new Pair<>(matcher, matchee));
                personMatchResult.addMatchResult(matchresulr);
            }
            matchingAppResponse.withPersonMatchResultRow(personMatchResult);
        }
        return matchingAppResponse;
    }
}
