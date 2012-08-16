package org.jclouds.vblob;

import org.jclouds.blobstore.internal.BaseBlobStoreApiMetadataTest;
import org.testng.annotations.Test;

@Test(groups = "unit", testName = "VBlobApiMetadataTest")
public class VBlobApiMetadataTest extends BaseBlobStoreApiMetadataTest {

   public VBlobApiMetadataTest() {
      super(new VBlobApiMetadata());
   }
}
