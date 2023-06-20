package com.spring;

public class Student {
    private int stdId;
    private String stdName;
    private String stdAddress;

    public int getStdId() {
        return stdId;
    }

    public void setStdId(int stdId) {
        this.stdId = stdId;
    }

    public String getStdName() {
        return stdName;
    }

    public void setStdName(String stdName) {
        this.stdName = stdName;
    }

    public String getStdAddress() {
        return stdAddress;
    }

    public void setStdAddress(String stdAddress) {
        this.stdAddress = stdAddress;
    }

    public Student(int stdId, String stdName, String stdAddress) {
        this.stdId = stdId;
        this.stdName = stdName;
        this.stdAddress = stdAddress;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "stdId=" + stdId +
                ", stdName='" + stdName + '\'' +
                ", stdAddress='" + stdAddress + '\'' +
                '}';
    }
}
