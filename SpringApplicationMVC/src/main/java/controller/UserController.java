package controller;

import model.Customer;
import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import service.ServiceLayerImp;
import services.DOBPropertyEditor;

import javax.validation.Valid;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {
    @Autowired
    ServiceLayerImp service;
    @InitBinder
    public void initBinder(WebDataBinder webDataBinder)
    {
        webDataBinder.registerCustomEditor(LocalDate.class,"dateOfBirth",new DOBPropertyEditor ());
    }
    @RequestMapping("greet")
    public String firstMessage(@RequestParam("user")String name){
        System.out.println("Hello.." +name);
        return "welcome";
    }
    @RequestMapping("forward")
    public String forwardPage(@RequestParam("user")String name){
        System.out.println("Hello.." +name);
        return "forward:forwardpage/";
    }
    @RequestMapping("forwardpage")
    public String forwardpage(){

        System.out.println("Welcome to new page");
        return "welcome";
    }

    @RequestMapping("sendRedirect")
    public String redirectPage(@RequestParam("user")String name){
        System.out.println("Hello.." +name);
        return "redirect:redirectpage/";
    }
    @RequestMapping("redirectpage")
    public String redirectpage(){

        System.out.println("Welcome to new page");
        return "welcome";
    }
    @RequestMapping("requestheader")
    public String displayRequestHeader(@RequestHeader("referrer") String ref ){
        System.out.println(ref);
        if(ref==null)
            return "error";
        return "home";
    }
    @RequestMapping("registerCustomer")
    public String registerCustomer(Model model){
        model.addAttribute("customer",new Customer ());
        return "customerform";
    }

    @RequestMapping(value="process",method = RequestMethod.POST)
    public String submitCustomer(@ModelAttribute("customer")Customer newCustomer, ServiceLayerImp serviceLayerImp, @RequestParam("action") String action){
        //System.out.println(action);

        if(action.equals("Add")){
            serviceLayerImp.registerCustomer(newCustomer);}
        else if (action.equals("Update")) {
            serviceLayerImp.updateCustomer(newCustomer);

        }
        else
            serviceLayerImp.registerCustomer(newCustomer);

        return "success";
    }
    @RequestMapping("fetchCustomerName")
    public String fetchName(Model model, ServiceLayerImp serviceLayerImp){
        List<Customer> customers=new ArrayList<>();
        customers = serviceLayerImp.getAllCustomers();
        model.addAttribute("customersList",customers);
        return "display";
    }
    @RequestMapping("customers/{customerId}")
    public String getCustomerDetails(@PathVariable("customerId") int customerId, Model model,ServiceLayerImp serviceLayerImp) {
        model.addAttribute("customer", serviceLayerImp.getCustomer(customerId));
        return "customerdetails";
    }

    @ModelAttribute("locationlist")
    public List<String> getPreferredLocations(){
        List<String> preferredHolidayLocation = new ArrayList<>();
        preferredHolidayLocation.add("Delhi");
        preferredHolidayLocation.add("Shimla");
        preferredHolidayLocation.add("j&k");
        preferredHolidayLocation.add("Dehradun");
        return preferredHolidayLocation;
    }
    @RequestMapping("userregistration")
    public String registerUser(Model model){
        model.addAttribute("preferredHolidayLocation", getPreferredLocations());
        model.addAttribute("user", new User());
        return "registrationform";
    }
    /*   @RequestMapping("registration")
       public String processUser(@Valid @ModelAttribute("user")User newuser , ServiceCalculateAge service){
           int age = service.calculateAge(newuser.getDateOfBirth());
           if (age < 21){
               return "invalid";

               return "successfulregistration";
           }*/
    @RequestMapping("registration")
    public String processUser(@Valid @ModelAttribute("user") User newuser , Errors errors, ModelMap modelMap) {
     /*   new UserValidator().validate(newuser, errors);
        if (errors.hasErrors()){
            return "registrationform";}*/

        return "successfulregistration";
    }

    @ModelAttribute("hobbiesList")
    public List<String> populateLocation() {
        List<String> hobbiesList = new ArrayList<> ();
        hobbiesList.add("reading");
        hobbiesList.add("gaming");
        hobbiesList.add("travelling");
        hobbiesList.add("WatchingMovie");
        hobbiesList.add("sleeping");
        return hobbiesList;
    }
}
