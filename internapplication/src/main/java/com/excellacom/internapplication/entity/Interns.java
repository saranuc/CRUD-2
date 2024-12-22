package com.excellacom.internapplication.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "intern_details")
public class Interns {

    @Id
    @Column(name = "pid")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int pid;

    @Column(name = "intern_name")
    private String internName;

    @Column(name = "intern_id")
    private int internId;

    @Column(name = "college_name")
    private String collegeName;

    @Column(name = "batch_no")
    private int batchNo;

    @Column(name = "project_name")
    private String projectName;

    public Interns(int pid, String internName, int internId, String collegeName, int batchNo, String projectName) {
        this.pid = pid;
        this.internName = internName;
        this.internId = internId;
        this.collegeName = collegeName;
        this.batchNo = batchNo;
        this.projectName = projectName;
    }

    public Interns(String internName, int internId, String collegeName, int batchNo, String projectName) {
        this.internName = internName;
        this.internId = internId;
        this.collegeName = collegeName;
        this.batchNo = batchNo;
        this.projectName = projectName;
    }

    public Interns() {
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getInternName() {
        return internName;
    }

    public void setInternName(String internName) {
        this.internName = internName;
    }

    public int getInternId() {
        return internId;
    }

    public void setInternId(int internId) {
        this.internId = internId;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public int getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(int batchNo) {
        this.batchNo = batchNo;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    @Override
    public String toString() {
        return "Interns{" +
                "pid=" + pid +
                ", internName='" + internName + '\'' +
                ", internId=" + internId +
                ", collegeName='" + collegeName + '\'' +
                ", batchNo=" + batchNo +
                ", projectName='" + projectName + '\'' +
                '}';
    }
}
