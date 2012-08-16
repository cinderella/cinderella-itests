package org.jclouds.vblob.blobstore;

import org.jclouds.s3.blobstore.integration.S3BlobLiveTest;
import org.testng.annotations.Test;

@Test(groups =  "live", testName = "VBlobBlobLiveTest")
public class VBlobBlobLiveTest extends S3BlobLiveTest {
   
   public VBlobBlobLiveTest() {
      provider = "vblob";
   }
   
}
