package org.jclouds.vblob.blobstore;

import org.jclouds.s3.blobstore.integration.S3InputStreamMapIntegrationLiveTest;
import org.testng.annotations.Test;

@Test(groups =  "live", testName = "VBlobInputStreamMapIntegrationLiveTest")
public class VBlobInputStreamMapIntegrationLiveTest extends S3InputStreamMapIntegrationLiveTest {
   
   public VBlobInputStreamMapIntegrationLiveTest() {
      provider = "vblob";
   }
   
}
