/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.baustro.testdevsu.controller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import com.baustro.testdevsu.bean.ObjMessage;
import java.util.ArrayList;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class Rest_Controller {

    @RequestMapping(value = "/{name}", method = RequestMethod.GET, headers = "Accept=application/json")
    public List<ObjMessage> hello(HttpServletRequest request, @PathVariable String name) {
        String host = request.getRemoteHost();
        List<ObjMessage> listOfMessaje = new ArrayList<ObjMessage>();
        listOfMessaje = createObjMessageList(name, host);
        return listOfMessaje;
    }

    public List<ObjMessage> createObjMessageList(String name, String host) {
        ObjMessage datatest = new ObjMessage("Hello " + name + " from " + host);
        List<ObjMessage> listOfCountries = new ArrayList<ObjMessage>();
        listOfCountries.add(datatest);
        return listOfCountries;
    }
}
