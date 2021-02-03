package ca.kevin.rockassignment1.controller;

import ca.kevin.rockassignment1.domain.RPS;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class rpsController {
    private final Logger logger = LoggerFactory.getLogger(rpsController.class);

    @GetMapping(value = {"/", "/Input"})
    public String input(){
        logger.trace("Input is called");
        return "Input";
    }
    @GetMapping("/Process")
    public ModelAndView process(@ModelAttribute RPS rps){
        logger.trace("Process is called");
        logger.debug("envelope = " + rps);
        return new ModelAndView("Output", "rps", rps);
    }
}
