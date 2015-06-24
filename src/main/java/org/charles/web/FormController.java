package org.charles.web;


import org.charles.model.Form;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FormController
{
    @RequestMapping( value = "/form", method = RequestMethod.GET )
    public String greetingForm( Model model )
    {
        model.addAttribute( "form", new Form() );
        return "form";
    }

    @RequestMapping( value = "/form", method = RequestMethod.POST )
    public String greetingSubmit( @ModelAttribute Form form, Model model )
    {
        model.addAttribute( "greeting", form );
        return "result";
    }

}