package com.appster.services.common.enums;

import com.appster.services.common.dto.MatchResult;
import com.appster.services.common.dto.Person;
import javafx.util.Pair;

import java.util.function.Function;

/**
 * Created by dagraw2 on 6/26/18.
 */
public enum MatchAlgoEnum {
    NAME_MATCH(personPersonPair -> {
        return new MatchResult(88,100.0,"nameMatch");
    }),
    PHONE_NUMBER_MATCH(personPersonPair -> {
        return new MatchResult(90,88.0,"phoneNumberMatch");
    });


    Function<Pair<Person,Person>, MatchResult> executeAlgo;
    MatchAlgoEnum(Function<Pair<Person,Person>, MatchResult> algo) {
        this.executeAlgo = algo;
    }

    public MatchResult matchPersons(Pair<Person, Person> persons) {
        return executeAlgo.apply(persons);
    }
}
