/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kievguide.controller;



import com.mkyong.customer.dao.UserDAO;
import javax.servlet.http.HttpServletResponse;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;


/**
 *
 * @author Maksym
 */

@Controller
public class ControllerMain {
    
    @RequestMapping(value="/firstrequest", method=RequestMethod.GET)
    public ModelAndView signInAction( HttpServletResponse response){
        ModelAndView modelAndView = new ModelAndView();
        
        modelAndView.addObject("user", "Привет");
        modelAndView.setViewName("index");
        return modelAndView;
        
    }
    
    @RequestMapping(value="/s-in", method=RequestMethod.GET)
    public ModelAndView signIn( HttpServletResponse response){
        ModelAndView modelAndView = new ModelAndView();
        
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");
         
        UserDAO test = (UserDAO) context.getBean("userDAO");
        
        modelAndView.addObject("myvalue", test.findTotalCustomer());
        modelAndView.setViewName("sign-in");
        return modelAndView;
        
    }
    
    @RequestMapping(value="/reg", method=RequestMethod.POST)
    public ModelAndView reg( HttpServletResponse response, @RequestParam("n") Integer card_n, @RequestParam("p") String pass, @RequestParam("f") MultipartFile file){
        ModelAndView modelAndView = new ModelAndView();
        
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");
        UserDAO test = (UserDAO) context.getBean("userDAO");
        
        test.insert("new", "new", 1, "photo", card_n, pass);
        
        modelAndView.setViewName("index");
        return modelAndView;
        
    }
    
    @RequestMapping(value="/s-up")
    public ModelAndView s_up( HttpServletResponse response){
        ModelAndView modelAndView = new ModelAndView();
     
        modelAndView.setViewName("sign-up");
        return modelAndView;
        
    }




    private Object ServletContext() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

            
}
