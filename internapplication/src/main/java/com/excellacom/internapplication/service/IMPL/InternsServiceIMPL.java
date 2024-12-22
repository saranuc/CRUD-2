package com.excellacom.internapplication.service.IMPL;

import com.excellacom.internapplication.dto.InternsDTO;
import com.excellacom.internapplication.dto.InternsSaveDTO;
import com.excellacom.internapplication.dto.InternsUpdateDto;
import com.excellacom.internapplication.entity.Interns;
import com.excellacom.internapplication.repo.InternsRepo;
import com.excellacom.internapplication.service.InternsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InternsServiceIMPL implements InternsService {

    @Autowired
    private InternsRepo internsRepo;

    @Override
    public String addStudent(InternsSaveDTO internsSaveDTO) {

        Interns interns = new Interns(
                internsSaveDTO.getInternName(),
                internsSaveDTO.getInternId(),
                internsSaveDTO.getCollegeName(),
                internsSaveDTO.getBatchNo(),
                internsSaveDTO.getProjectName()
        );

        internsRepo.save(interns);
        return interns.getInternName();
    }

    @Override
    public List<InternsDTO> saveInterns() {
        List<Interns> internsList = internsRepo.findAll();
        List<InternsDTO> internsDTOList = new ArrayList<>();
        for(Interns interns : internsList) {
            InternsDTO internsDTO = new InternsDTO(
                    interns.getPid(),
                    interns.getInternName(),
                    interns.getInternId(),
                    interns.getCollegeName(),
                    interns.getBatchNo(),
                    interns.getProjectName()
            );
            internsDTOList.add(internsDTO);
        }
        return internsDTOList;
    }

    @Override
    public String updateInterns(InternsUpdateDto internsupdateDTO) {
        if(internsRepo.existsById(internsupdateDTO.getPid())) {
            Interns interns  = internsRepo.getById(internsupdateDTO.getPid());
            interns.setInternName(internsupdateDTO.getInternName());
            interns.setInternId(internsupdateDTO.getInternId());
            interns.setCollegeName(internsupdateDTO.getCollegeName());
            interns.setBatchNo(internsupdateDTO.getBatchNo());
            interns.setProjectName(internsupdateDTO.getProjectName());
            internsRepo.save(interns);
        }
        else {
            return "Interns Not Found";
        }
        return " Successfully updated";
    }


}
