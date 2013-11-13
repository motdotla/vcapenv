package com.github.vcapenv;

import org.junit.Test;
import java.io.File;
import static org.junit.Assert.*;
import static org.junit.matchers.JUnitMatchers.hasItems;

public class VcapenvTest {
  
  @Test public void testGet() {
    Vcapenv vcapenv = new Vcapenv();
    assertNotNull(vcapenv.get("sendgrid-n/a"));
  }

  @Test public void testSendGridUsername() {
    Vcapenv vcapenv = new Vcapenv();
    String expected = "orion";
    assertEquals(vcapenv.SENDGRID_USERNAME(), expected);
  }

  @Test public void testSendGridPassword() {
    Vcapenv vcapenv = new Vcapenv();
    String expected = "ofsky";
    assertEquals(vcapenv.SENDGRID_PASSWORD(), expected);
  }

  @Test public void testSendGridUsernameAndPassword() {
    Vcapenv vcapenv = new Vcapenv();
    String expected = "orion";
    assertEquals(vcapenv.SENDGRID_USERNAME(), expected);
    String expected2 = "ofsky";
    assertEquals(vcapenv.SENDGRID_PASSWORD(), expected2);
  }
}
