package controller;


import model.Customer;
import model.LoanAgreement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import service.ServiceLayerImp;
import services.DOBPropertyEditor;


import java.time.LocalDate;

@Controller
public class GreetController {
    @InitBinder
    public void initBinder(WebDataBinder webDataBinder)
    {
        webDataBinder.registerCustomEditor(LocalDate.class,"dateOfBirth",new DOBPropertyEditor ());
    }
    @Autowired
    ServiceLayerImp service;
    //Qns1
    @RequestMapping("SayHello")
    public ModelAndView greet(@RequestParam(value = "username") String name){
        System.out.println("I am here....."+name);
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("display");
        modelAndView.addObject("username",name);
        return modelAndView;
    }
    //Qns 2
    @RequestMapping("Forward")
    public String forward(){
       // return
        return "forward:/SayHello";
    }

    //Qns 3
    @RequestMapping("Redirect")
    public String redirect(){

        return "redirect:/SayHello?username=Abhishek";
    }
    //Qns 4
    @RequestMapping("referer")
    public String getReferrer(@RequestHeader (value="referer") String referrers){
        if (referrers == null){
            return "error";
        }else{
            return "home";
        }
    }
    //Qns 5,6,7,8
    //here this is controller view
    @RequestMapping("registercustomer")
    public String register(Model model){
        model.addAttribute("customer",new Customer ());
        return "customer";
    }

    //here we are working on the information handler
    /*@RequestMapping(path="/saveCustomer",method = RequestMethod.POST)
    public String handleForm(@ModelAttribute("customer") Customer newcustomer)
    {
        newcustomer.getCustomerId ();
        newcustomer.getCustomerName ();
        newcustomer.getDateOfBirth ();
        newcustomer.getAadhar ();
        return "success";
    }*/

/*

    //Qns 9
    @RequestMapping("registeruser")
    public String userRegister(Model model){
        model.addAttribute ("userForm",new User ());
        return "userForm";
    }



    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public ModelAndView registerUser(@ModelAttribute("user") User user){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("display");
        int age = calculateAge(user.getBirthDate ());
        if (age < 21) {
            modelAndView.setViewName("error");
            return modelAndView;
        }
        user.setUserId(generateUserId());
        user.setAge(age);
        modelAndView.addObject("user", user);
        return modelAndView;
    }

    private int calculateAge(Date birthDate) {
        Calendar dob = Calendar.getInstance();
        dob.setTime(birthDate);
        Calendar today = Calendar.getInstance();
        int age = today.get(Calendar.YEAR) - dob.get(Calendar.YEAR);
        if (today.get(Calendar.MONTH) < dob.get(Calendar.MONTH)) {
            age--;
        } else if (today.get(Calendar.MONTH) == dob.get(Calendar.MONTH)
                && today.get(Calendar.DAY_OF_MONTH) < dob.get(Calendar.DAY_OF_MONTH)) {
            age--;
        }
        return age;
    }
    //here we are generate Unique userId
    private int generateUserId() {
        UUID idOne = UUID.randomUUID();
        String str=""+idOne;
        int uid=str.hashCode();
        String filterStr=""+uid;
        str=filterStr.replaceAll("-", "");
        return Integer.parseInt(str);

    }
*/
    //Qns2 day7

@RequestMapping("deatailsOfCustomerAndLoan")
public String registerCustomerApplyLoanPage(@ModelAttribute("customer")Customer customer, @ModelAttribute("loanAgreement") LoanAgreement loanAgreement){
    return "registercustomerloan";
}




    @RequestMapping(value = "deatailsOfCustomerAndLoan",method = RequestMethod.POST)
    public ModelAndView saveRegisterCustomerApplyLoanPage(@ModelAttribute("customerDetails")Customer customer, @ModelAttribute("loanAgreement")LoanAgreement loanAgreement, @RequestParam("formName")String form){
        if (form.equalsIgnoreCase("customer")){
            service.registerCustomer(customer);
            loanAgreement.setCustomerId(customer.getCustomerId());
        }else{
            service.insertloan(loanAgreement);
        }
        return new ModelAndView("registercustomerloan");
    }

    @RequestMapping(value = "/fetch/details/")
    public ModelAndView fetchDetails(Model model){
        model.addAttribute("details", service.getDetails());
        return new ModelAndView("displayDetails");
    }
}



