package com.nagp.productinspection.resources.product.dto;

import java.time.LocalDateTime;

public class ProductDto {

    private final String id;
    private final String inspectionId;
    private final String name;
    private boolean stateSatisfactory = false;
    private boolean requiresMaintenance = false;
    private LocalDateTime inspectionDateTime = LocalDateTime.now();
    private String comments = "Hello Comment!!";

    public ProductDto(final String id, final String inspectionId, final String name) {
        this.id = id;
        this.inspectionId = inspectionId;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getInspectionId() {
        return inspectionId;
    }

    public String getName() {
        return name;
    }

    public boolean isStateSatisfactory() {
        return stateSatisfactory;
    }

    public boolean isRequiresMaintenance() {
        return requiresMaintenance;
    }

    public LocalDateTime getInspectionDateTime() {
        return inspectionDateTime;
    }

    public String getComments() {
        return comments;
    }
}
