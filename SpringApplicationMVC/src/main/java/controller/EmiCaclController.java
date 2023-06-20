package controller;

import model.Emi;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

public class EmiCaclController {
    //Qns 10
    //Here we are findout the EMI with the help of below program.
    @RequestMapping("calcemi")
    public String gotToEmiForm(Model model){
        model.addAttribute("emi",new Emi ());
        return "emiForm";
    }

    @RequestMapping("/calcEmi")
    public ModelAndView calcEmi(@ModelAttribute("emi") Emi emiObj) throws InvalidInputException {
        //if details are invalid throw exception
        if (!(emiObj.getPrincipal() > 0 || emiObj.getRateOfInt() > 0 || emiObj.getTimeInYears() > 0 )) {
            throw new InvalidInputException("Either principal,rate of interest or time is provided wrong.");
        }

        ModelAndView modelAndView = new ModelAndView();
        double emiAns = emiObj.calculateEmi();
        System.out.println(emiAns);
        modelAndView.addObject("ans",emiAns);
        modelAndView.setViewName("emiAns");
        return modelAndView;
    }
}
