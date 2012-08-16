package org.jclouds.cinderella.services;

import org.jclouds.ec2.services.AMIClientLiveTest;
import org.testng.annotations.Test;

@Test(groups = "live", singleThreaded = true, testName = "CinderellaAMIClientLiveTest")
public class CinderellaAMIClientLiveTest extends AMIClientLiveTest {
   public CinderellaAMIClientLiveTest() {
      provider = "cinderella";
   }

}
