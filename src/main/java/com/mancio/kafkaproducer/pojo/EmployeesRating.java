package com.mancio.kafkaproducer.pojo;

import io.swagger.annotations.ApiModelProperty;


public class EmployeesRating {
    @ApiModelProperty(example = "1")
    private long id;
    @ApiModelProperty(example = "5")
    private int rating;

    public EmployeesRating(long id, int rating) {
        this.id = id;
        this.rating = rating;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
