package com;


import org.apache.commons.codec.binary.Base64;
import org.apache.commons.compress.compressors.xz.XZCompressorInputStream;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.io.ByteArrayInputStream;
import java.io.IOException;

@org.springframework.stereotype.Controller
public class DecodeController {


    @RequestMapping(value = "/decoder", method = RequestMethod.GET)
    public ModelAndView showView(){
        ModelAndView mv = new ModelAndView("decoder");
        return mv;
    }

    @RequestMapping(value = "/decoder", method = RequestMethod.POST)
    public ModelAndView showDecodeText(@RequestParam(value = "textForEncode") String textForEncode) throws IOException {

        String result;

        try{
            byte[] buf = new byte[100];

            ByteArrayInputStream bin = new ByteArrayInputStream(Base64.decodeBase64(textForEncode));
            XZCompressorInputStream xzIn = new XZCompressorInputStream(bin);
            xzIn.read(buf);
            xzIn.close();
            result = new String(buf);
        }
        catch(Exception e){
            result="Эта строка не подходит. Попробуй ещё раз";
        }

        ModelAndView mv = new ModelAndView("decoder");
        mv.addObject("result", result);
        return mv;
    }
}