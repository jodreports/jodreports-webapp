package org.jodreports.web.samples;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import java.util.Date;

/** A Spring MVC form controller for the Letter example. */
public class LetterFormController extends SimpleFormController {

  public LetterFormController() {
    setCommandClass(Recipient.class);
  }

  protected ModelAndView onSubmit(Object command) throws Exception {
    Recipient recipient = (Recipient) command;
    ModelAndView modelAndView = new ModelAndView(getSuccessView(), "recipient", recipient);
    modelAndView.addObject("date", new Date());
    return modelAndView;
  }
}
