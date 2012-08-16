package org.jclouds.cinderella.services;

import org.jclouds.ec2.services.InstanceClientLiveTest;
import org.testng.annotations.Test;

@Test(groups = "live", singleThreaded = true, testName = "CinderellaInstanceClientLiveTest")
public class CinderellaInstanceClientLiveTest extends InstanceClientLiveTest {
   public CinderellaInstanceClientLiveTest() {
      provider = "cinderella";
   }

}
