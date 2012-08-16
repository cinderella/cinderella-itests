package org.jclouds.cinderella.services;

import org.jclouds.ec2.services.KeyPairClientLiveTest;
import org.testng.annotations.Test;

@Test(groups = "live", singleThreaded = true, testName = "CinderellaKeyPairClientLiveTest")
public class CinderellaKeyPairClientLiveTest extends KeyPairClientLiveTest {
   public CinderellaKeyPairClientLiveTest() {
      provider = "cinderella";
   }

}
