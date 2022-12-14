package com.neuedu.prohs.pojo;


import java.io.Serializable;

public class MedicalTechnology implements Serializable {

    private int id;
    private String techCode;
    private String techName;
    private String techFormat;
    private double techPrice;
    private String techType;
    private String priceType;
    private int deptmentId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTechCode() {
        return techCode;
    }

    public void setTechCode(String techCode) {
        this.techCode = techCode;
    }

    public String getTechName() {
        return techName;
    }

    public void setTechName(String techName) {
        this.techName = techName;
    }

    public String getTechFormat() {
        return techFormat;
    }

    public void setTechFormat(String techFormat) {
        this.techFormat = techFormat;
    }

    public double getTechPrice() {
        return techPrice;
    }

    public void setTechPrice(double techPrice) {
        this.techPrice = techPrice;
    }

    public String getTechType() {
        return techType;
    }

    public void setTechType(String techType) {
        this.techType = techType;
    }

    public String getPriceType() {
        return priceType;
    }

    public void setPriceType(String priceType) {
        this.priceType = priceType;
    }

    public int getDeptmentId() {
        return deptmentId;
    }

    public void setDeptmentId(int deptmentId) {
        this.deptmentId = deptmentId;
    }

    @Override
    public String toString() {
        return "MedicalTechnology{" +
                "id=" + id +
                ", techCode='" + techCode + '\'' +
                ", techName='" + techName + '\'' +
                ", techFormat='" + techFormat + '\'' +
                ", techPrice=" + techPrice +
                ", techType='" + techType + '\'' +
                ", priceType='" + priceType + '\'' +
                ", deptmentId=" + deptmentId +
                '}';
    }
}
