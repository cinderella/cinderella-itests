package org.jclouds.cinderella.services;

import org.jclouds.ec2.services.SecurityGroupClientLiveTest;
import org.testng.annotations.Test;

@Test(groups = "live", singleThreaded = true, testName = "CinderellaSecurityGroupClientLiveTest")
public class CinderellaSecurityGroupClientLiveTest extends SecurityGroupClientLiveTest {
   public CinderellaSecurityGroupClientLiveTest() {
      provider = "cinderella";
   }

}
