package core.controllers;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by tommylii on 07/12/2015.
 */
public class FootballApplicationErrorController implements ErrorController {

    private static final String PATH = "/error";

    @RequestMapping(value = PATH)
    @ResponseBody
    public String error() {
        return "Error handling";
    }

    @Override
    public String getErrorPath() {
        return PATH;
    }
}
