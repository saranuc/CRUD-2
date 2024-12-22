package com.excellacom.internapplication.controller;

import com.excellacom.internapplication.dto.InternsDTO;
import com.excellacom.internapplication.dto.InternsSaveDTO;
import com.excellacom.internapplication.dto.InternsUpdateDto;
import com.excellacom.internapplication.entity.Interns;
import com.excellacom.internapplication.service.InternsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/intern")
public class IntersController {

    @Autowired
    private InternsService internsService;

    @PostMapping(path = "/add")
    public String saveStudent(@RequestBody InternsSaveDTO internsSaveDTO) {
        String id = internsService.addStudent(internsSaveDTO);
        return id;
    }

    @GetMapping(path = "/get")
    public List<InternsDTO> getInterns() {
        List<InternsDTO> allInterns = internsService.saveInterns();
        return allInterns;
    }

    @PutMapping(path = "/update")
    public String updateInterns(@RequestBody InternsUpdateDto internsupdateDTO) {
        String idd = internsService.updateInterns(internsupdateDTO);
        return idd;
    }
}
