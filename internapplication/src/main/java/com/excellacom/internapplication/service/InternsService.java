package com.excellacom.internapplication.service;

import com.excellacom.internapplication.dto.InternsDTO;
import com.excellacom.internapplication.dto.InternsSaveDTO;
import com.excellacom.internapplication.dto.InternsUpdateDto;

import java.util.List;

public interface InternsService {
    String addStudent(InternsSaveDTO internsSaveDTO);

    List<InternsDTO> saveInterns();


    String updateInterns(InternsUpdateDto internsupdateDTO);
}
