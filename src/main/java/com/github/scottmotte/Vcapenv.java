package com.github.vcapenv;

import java.io.*;
import java.lang.System;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.JsonNode;

public class Vcapenv {
  public JsonNode node;
  public ObjectMapper mapper;

  public Vcapenv() {
    this.node   = null; 
    this.mapper = new ObjectMapper();
    this.resetNode();
  }

  public Vcapenv get(String key) {
    this.node = (JsonNode)this.node.get(key);
    return this;
  }

  public Vcapenv get(Integer index) {
    this.node = (JsonNode)this.node.get(index);
    return this;
  }

  public String toString() {
    return this.node.toString();
  }

  public String SENDGRID_USERNAME() {
    this.resetNode();
    return this.get("sendgrid-n/a").get(0).get("credentials").get("username").toString();
  }

  public String SENDGRID_PASSWORD() {
    this.resetNode();
    return this.get("sendgrid-n/a").get(0).get("credentials").get("password").toString();
  }

  public String resetNode() {
    String vcap_services  = System.getenv("VCAP_SERVICES");

    try {
      this.node = this.mapper.readValue(vcap_services, JsonNode.class);
    } catch(IOException e){
      e.printStackTrace();
    }

    return vcap_services;
  }
}
