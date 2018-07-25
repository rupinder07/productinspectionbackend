package com.nagp.productinspection.resources.inspections;

import com.nagp.productinspection.resources.inspections.dto.InspectionDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class InspectionResource {

    @GetMapping("/inspection")
    @ResponseBody
    public List<InspectionDto> getAll() {
        final List<InspectionDto> inspections = new ArrayList<>();
        inspections.add(new InspectionDto("1","Inspection 1", "22/7/2018", "Gurgaon"));
        inspections.add(new InspectionDto("2","Inspection 2", "23/7/2018", "Noida"));
        inspections.add(new InspectionDto("3","Inspection 3", "24/7/2018", "Delhi"));
        inspections.add(new InspectionDto("4","Inspection 4", "25/7/2018", "Mars"));
        inspections.add(new InspectionDto("5","Inspection 5", "25/7/2018", "Mars"));
        inspections.add(new InspectionDto("6","Inspection 6", "25/7/2018", "Mars"));
        inspections.add(new InspectionDto("7","Inspection 7", "25/7/2018", "Mars"));
        inspections.add(new InspectionDto("8","Inspection 8", "25/7/2018", "Mars"));
        return inspections;
    }

}
