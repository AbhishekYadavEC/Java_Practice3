package services;

import model.User;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import java.time.LocalDate;

public class UserValidator implements Validator {
    @Override
   public boolean supports(Class<?> aClass) {
       return User.class.equals(aClass);
   }

    @Override
    public void validate(Object o, Errors errors) {
        User user=(User)o;
        if(!user.getUserName().matches("[A-Z][a-z]")){
            errors.rejectValue("userName","USER-Invalid","userName is invalid");
        }
        if(!user.getPassword().matches("@,{8,}")){
            errors.rejectValue("password","Password-Invalid","password is invalid");
        }
        if(user.getHobbies().size()<2){
            errors.rejectValue("preferLoc","USER.LIMITEXCEED","please select atleast two");
        }
        if(user.getAge()<18){
              errors.rejectValue("age","Age-Invalid","age must be greater than 18");
        }
        if (!user.getDateOfBirth().isBefore(LocalDate.now())){
              errors.rejectValue("dateOfBirth","Invalid DateofBirth","Please give valid date of birth");
        }
    }
}
