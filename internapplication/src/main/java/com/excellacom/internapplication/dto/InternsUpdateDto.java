package com.excellacom.internapplication.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class InternsUpdateDto {

    private int pid;
    private String internName;
    private int internId;
    private String collegeName;
    private int batchNo;
    private String projectName;
}
