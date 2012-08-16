package org.jclouds.cinderella.services;

import org.jclouds.ec2.services.ElasticIPAddressClientLiveTest;
import org.testng.annotations.Test;

@Test(groups = "live", singleThreaded = true, testName = "CinderellaElasticIPAddressClientLiveTest")
public class CinderellaElasticIPAddressClientLiveTest extends ElasticIPAddressClientLiveTest {
   public CinderellaElasticIPAddressClientLiveTest() {
      provider = "cinderella";
   }

}
