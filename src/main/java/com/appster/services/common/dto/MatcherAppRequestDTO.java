package com.appster.services.common.dto;

import java.util.List;

/**
 * Created by dagraw2 on 6/26/18.
 */
public class MatcherAppRequestDTO {
    private Person matcher;
    private List<Person> matcheeList;
    private String appId;
    private String appName;

    public Person getMatcher() {
        return matcher;
    }

    public void setMatcher(Person matcher) {
        this.matcher = matcher;
    }

    public List<Person> getMatcheeList() {
        return matcheeList;
    }

    public void setMatcheeList(List<Person> matcheeList) {
        this.matcheeList = matcheeList;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }
}
