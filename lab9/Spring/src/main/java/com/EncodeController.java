package com;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.compress.compressors.xz.XZCompressorOutputStream;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import java.io.ByteArrayOutputStream;
import java.io.IOException;

@org.springframework.stereotype.Controller
public class EncodeController {


    @RequestMapping(value = "/encoder", method = RequestMethod.GET)
    public ModelAndView showView(){
        ModelAndView mv = new ModelAndView("encoder");
        return mv;
    }

    @RequestMapping(value = "/encoder", method = RequestMethod.POST)
    public ModelAndView showDecodeText(@RequestParam(value = "textForDecode") String textForDecode) throws IOException {

        String result;

        try{
            ByteArrayOutputStream bout = new ByteArrayOutputStream();
            XZCompressorOutputStream xzOut = new XZCompressorOutputStream(bout);
            xzOut.write(textForDecode.getBytes());
            xzOut.close();
            result = Base64.encodeBase64String(bout.toByteArray());
        }
        catch(Exception e){
            result="Эта строка не подходит. Попробуй ещё раз";
        }

        ModelAndView mv = new ModelAndView("encoder");
        mv.addObject("result", result);
        return mv;
    }
}