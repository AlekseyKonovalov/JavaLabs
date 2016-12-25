package com;
import org.hibernate.mapping.Collection;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.sql.SQLException;

@Controller
public class mainController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView showView() throws SQLException {

        //Collection allRecords= (Collection) Factory.getInstance().getusrRecordI().getUserRecords();
        ModelAndView mv = new ModelAndView("index");
        //mv.getModel().put("records", allRecords);
        return mv;
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public ModelAndView addNewRecord(@RequestParam(value = "nameUser") String nameUser,
                                     @RequestParam(value = "textUser") String textUser) throws IOException, SQLException {

        String username = nameUser;
        String text = textUser;

        UserRecord record = new UserRecord(username, text);
       // Factory.getInstance().getusrRecordI().addRecord(record);

       // Collection allRecords= (Collection) Factory.getInstance().getusrRecordI();
        ModelAndView mv = new ModelAndView("index");
        //mv.getModel().put("records", allRecords);
        return mv;
    }
}
