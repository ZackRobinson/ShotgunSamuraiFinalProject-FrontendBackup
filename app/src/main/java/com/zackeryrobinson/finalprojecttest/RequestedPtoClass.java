package com.zackeryrobinson.finalprojecttest;

import java.util.Date;

/**
 * Created by Admin on 10/16/2017.
 */

public class RequestedPtoClass {
    private Date dateFrom;
    private Date dateTo;
    private String description;

    public RequestedPtoClass(Date dateFrom, Date dateTo, String description) {
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
        this.description = description;
    }

    public Date getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(Date dateFrom) {
        this.dateFrom = dateFrom;
    }

    public Date getDateTo() {
        return dateTo;
    }

    public void setDateTo(Date dateTo) {
        this.dateTo = dateTo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
