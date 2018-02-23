/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.baustro.testdevsu.controller;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/hello")
public class Rest_Controller {
 @RequestMapping(value = "/{name}", method = RequestMethod.GET)
 public String hello(HttpServletRequest request,@PathVariable String name) {
  String result="Hello "+name+ " from "+ request.getRemoteHost();
  return result;
 }
}