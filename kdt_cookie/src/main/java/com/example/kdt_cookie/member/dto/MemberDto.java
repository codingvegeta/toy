package com.example.kdt_cookie.member.dto;

import java.util.Objects;

public class MemberDto {
    private String id;
    private String pw;
    private String name;
    private String phone;
    private String address;
    private String addressDetail;
    private String email;
    private String gender;
    private String sns;
    private String birth;
    private String indate;
    private String ismem;
    private String addressdetail;
    private String postcode;

    public MemberDto() {
    }

    public MemberDto(String id, String pw, String name, String phone, String address, String addressDetail,
                     String email, String gender, String sns, String birth, String indate, String ismem,
                     String addressdetail, String postcode) {
        this.id = id;
        this.pw = pw;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.addressDetail = addressDetail;
        this.email = email;
        this.gender = gender;
        this.sns = sns;
        this.birth = birth;
        this.indate = indate;
        this.ismem = ismem;
        this.addressdetail = addressdetail;
        this.postcode = postcode;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddressDetail() {
        return addressDetail;
    }

    public void setAddressDetail(String addressDetail) {
        this.addressDetail = addressDetail;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSns() {
        return sns;
    }

    public void setSns(String sns) {
        this.sns = sns;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getIndate() {
        return indate;
    }

    public void setIndate(String indate) {
        this.indate = indate;
    }

    public String getIsmem() {
        return ismem;
    }

    public void setIsmem(String ismem) {
        this.ismem = ismem;
    }

    public String getAddressdetail() {
        return addressdetail;
    }

    public void setAddressdetail(String addressdetail) {
        this.addressdetail = addressdetail;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MemberDto memberDto = (MemberDto) o;
        return id.equals(memberDto.id) && pw.equals(memberDto.pw) && Objects.equals(name, memberDto.name) && Objects.equals(phone, memberDto.phone) && Objects.equals(address, memberDto.address) && Objects.equals(addressDetail, memberDto.addressDetail) && Objects.equals(email, memberDto.email) && Objects.equals(gender, memberDto.gender) && Objects.equals(sns, memberDto.sns) && Objects.equals(birth, memberDto.birth) && Objects.equals(indate, memberDto.indate) && Objects.equals(ismem, memberDto.ismem) && Objects.equals(addressdetail, memberDto.addressdetail) && Objects.equals(postcode, memberDto.postcode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, pw, name, phone, address, addressDetail, email, gender, sns, birth, indate, ismem, addressdetail, postcode);
    }

    @Override
    public String toString() {
        return "MemberDto{" +
                "id='" + id + '\'' +
                ", pw='" + pw + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", addressDetail='" + addressDetail + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", sns='" + sns + '\'' +
                ", birth='" + birth + '\'' +
                ", indate='" + indate + '\'' +
                ", ismem='" + ismem + '\'' +
                ", addressdetail='" + addressdetail + '\'' +
                ", postcode='" + postcode + '\'' +
                '}';
    }
}
