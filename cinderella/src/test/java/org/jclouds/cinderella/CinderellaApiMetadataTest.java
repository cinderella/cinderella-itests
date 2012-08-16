package org.jclouds.cinderella;

import org.jclouds.compute.internal.BaseComputeServiceApiMetadataTest;
import org.testng.annotations.Test;

@Test(groups = "unit", testName = "CinderellaApiMetadataTest")
public class CinderellaApiMetadataTest extends BaseComputeServiceApiMetadataTest {

   public CinderellaApiMetadataTest() {
      super(new CinderellaApiMetadata());
   }
}
