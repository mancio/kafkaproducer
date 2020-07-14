package com.mancio.kafkaproducer.pojo;

import io.swagger.annotations.ApiModelProperty;

public class EmployeesRating {
    @ApiModelProperty(example = "0")
    private String id;
    @ApiModelProperty(example = "5")
    private int rating;

    public EmployeesRating(String id, int rating) {
        this.id = id;
        this.rating = rating;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
