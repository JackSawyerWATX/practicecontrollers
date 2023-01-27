package com.jacksawyer.practicecontroller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

@RestController
public class PracticecontrollerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PracticecontrollerApplication.class, args);
	}

	@RequestMapping ("/coding")
		public String index() {
		return "Hello User!";
	}

    @RequestMapping(value="/coding/python", method=RequestMethod.GET)
    	public String python() {
        return "Python/Django is Awesome!";
    }

    @RequestMapping("/coding/java") 
		public String java() {
    	return "Java is Better!";
    }
    
    @RestController 
    public class WashController{

    @RequestMapping ("/m/{wash}/{seattle}/{redmond}")
//    	public String index(@requestParam(value="q", required=false) String searchQuery)
        public String showWash(@PathVariable("wash")
        String wash,

    @PathVariable("seattle") 
        String seattle, 

    @PathVariable("redmond")
        String redmond){
        return "State: " + wash + ", Metro: " + seattle + ", Town: " + redmond;
        }
    }
}
