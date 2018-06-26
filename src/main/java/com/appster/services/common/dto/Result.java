package com.appster.services.common.dto;

/**
 * Created by dagraw2 on 6/26/18.
 */
public class Result {
    private Integer marks;
    private Double resultAccuracy;

    public Result(Integer res, Double accuracy) {
        this.marks = res;
        this.resultAccuracy = accuracy;
    }

    public Integer getMarks() {
        return marks;
    }

    public void setMarks(Integer marks) {
        this.marks = marks;
    }

    public Double getResultAccuracy() {
        return resultAccuracy;
    }

    public void setResultAccuracy(Double resultAccuracy) {
        this.resultAccuracy = resultAccuracy;
    }
}
