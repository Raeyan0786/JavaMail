package com.example.SendEmail.Controllers;

import com.example.SendEmail.Objects.Message;
import com.example.SendEmail.SendMail.MailHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @Autowired
    @Qualifier("blue")
    Message c;

    @Autowired
    @Qualifier("mail")
    Message d;

    @GetMapping("msg")
    public String getCarColor()
    {
        return c.getText();
    }

    @GetMapping("send")
    public String sendmail()
    {
        try{
            MailHandler mailHandler = new MailHandler();
            mailHandler.sendMail(d.getText().toString());
            System.out.println("working fine");
        }
        catch (Exception e){
            return "mail not sent";
        }
        return "mail send";
    }
}
