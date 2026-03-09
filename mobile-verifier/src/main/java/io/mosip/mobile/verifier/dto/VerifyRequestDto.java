package io.mosip.mobile.verifier.dto;

public class VerifyRequestDto {

    private String idNumber;
    private String phone;

    public VerifyRequestDto() {
    }

    public VerifyRequestDto(String idNumber, String phone) {
        this.idNumber = idNumber;
        this.phone = phone;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setidNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}