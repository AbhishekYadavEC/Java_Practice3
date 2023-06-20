package service;

import model.User;

import java.time.LocalDate;
import java.time.Period;

public class ServiceCalculateAge {
     public  int calculateAge(LocalDate dateOfBirth) {
         LocalDate curDate = LocalDate.now();
         if ((dateOfBirth != null) && (curDate != null)) {
             return Period.between(dateOfBirth, curDate).getYears();
         }
         return 0;
     }

}
