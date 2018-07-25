package com.nagp.productinspection.resources.inspections.dto;

public class InspectionDto {

    private String id;
    private String name;
    private String dueDate;
    private String location;

    public InspectionDto(final String id, final String name, final String dueDate, final String location) {
        this.id = id;
        this.name = name;
        this.dueDate = dueDate;
        this.location = location;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDueDate() {
        return dueDate;
    }

    public String getLocation() {
        return location;
    }
}
