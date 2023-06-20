package model;

import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.List;

public class User {
    private int userId;
    @NotBlank(message = "USERNAME SHOULD NOT BE NULL")
    @Pattern(regexp = "^[a-zA-z]+$",message = "Username must be in alphabets")
    private String userName;
    @NotBlank(message = "Password must be required ")
    @Size(min =8,message = "Minimum length of 8 is required")
    @Pattern(regexp = "^(?=.*[!@#$%^&*(),.?\\\":{}|<>]).*$",message = "Password must contain atleast 1 special character")
    private String password;
    @NotBlank(message = "Gender must be chosen")
    private String gender;
    @Size(min = 2,message = "Select atleast 2 hobbies")
    private List<String> hobbies;
    private String preferredHolidayLocation;
    private int age;
    @Past(message = "Date of birth must be in the past ")
    private LocalDate dateOfBirth;


    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public String getPreferredHolidayLocation() {
        return preferredHolidayLocation;
    }

    public void setPreferredHolidayLocation(String preferredHolidayLocation) {
        this.preferredHolidayLocation = preferredHolidayLocation;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

}
