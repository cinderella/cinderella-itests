package org.jclouds.vblob.blobstore;

import org.jclouds.s3.blobstore.integration.S3BlobMapIntegrationLiveTest;
import org.testng.annotations.Test;

@Test(groups =  "live", testName = "VBlobBlobMapIntegrationLiveTest")
public class VBlobBlobMapIntegrationLiveTest extends S3BlobMapIntegrationLiveTest {
   
   public VBlobBlobMapIntegrationLiveTest() {
      provider = "vblob";
   }
   
}
