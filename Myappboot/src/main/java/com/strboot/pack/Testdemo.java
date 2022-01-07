package com.strboot.pack;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController

public class Testdemo {
  @RequestMapping("/")
 public String sample() {
  return "uma";
}
}