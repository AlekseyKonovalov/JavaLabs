package com.example;
import org.hibernate.mapping.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@Controller
public class mainController  {
    @Autowired
    private UserRecRep userRecRep;
    private  List<UserRecord> listUserRecords=null;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView showView() throws SQLException {

        ModelAndView mv = new ModelAndView("index");
        listUserRecords = userRecRep.findAll();
        mv.addObject("records",listUserRecords);
        return mv;
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public ModelAndView addNewRecord(@RequestParam(value = "nameUser") String nameUser,
                                     @RequestParam(value = "textUser") String textUser) throws IOException, SQLException {


        ModelAndView mv = new ModelAndView("index");

        UserRecord record = new UserRecord(nameUser, textUser);
        userRecRep.save(record);

        listUserRecords = userRecRep.findAll();
        mv.addObject("records",listUserRecords);

        return mv;
    }
}
