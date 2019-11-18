package uz.se.g94116.model;

import android.graphics.drawable.Drawable;

import com.google.android.gms.maps.model.LatLng;

public class Student {
    private int id;
    private String fullname;
    private String phone;
    private String address;
    private Drawable avatar;
    private String bio;
    private String hobbies;
    private String birthday;
    private String email;
    private String gender;
    private String dady;
    private String mummy;

    private LatLng latLng;


    public Student(Drawable avatar, String fullname, String phone, String address) {
        this.avatar = avatar;
        this.fullname = fullname;
        this.phone = phone;
        this.address = address;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
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

    public Drawable getAvatar() {
        return avatar;
    }

    public void setAvatar(Drawable avatar) {
        this.avatar = avatar;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getDady() {
        return dady;
    }

    public void setDady(String dady) {
        this.dady = dady;
    }

    public String getMummy() {
        return mummy;
    }

    public void setMummy(String mummy) {
        this.mummy = mummy;
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

    public LatLng getLatLng() {
        return latLng;
    }

    public void setLatLng(LatLng latLng) {
        this.latLng = latLng;
    }
}
