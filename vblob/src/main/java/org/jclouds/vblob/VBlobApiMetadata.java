package org.jclouds.vblob;

import static org.jclouds.s3.reference.S3Constants.PROPERTY_S3_VIRTUAL_HOST_BUCKETS;

import java.util.Properties;

import org.jclouds.apis.ApiMetadata;
import org.jclouds.s3.S3ApiMetadata;
import org.jclouds.s3.S3AsyncClient;
import org.jclouds.s3.S3Client;
import org.jclouds.s3.blobstore.config.S3BlobStoreContextModule;
import org.jclouds.vblob.config.VBlobRestClientModule;

import com.google.common.collect.ImmutableSet;
import com.google.inject.Module;

public class VBlobApiMetadata extends S3ApiMetadata {
   /** The serialVersionUID */
   private static final long serialVersionUID = 820062881469203616L;
   
   private static Builder builder() {
      return new Builder();
   }

   @Override
   public Builder toBuilder() {
      return builder().fromApiMetadata(this);
   }

   public VBlobApiMetadata() {
      this(builder());
   }

   protected VBlobApiMetadata(Builder builder) {
      super(builder);
   }
   
   public static Properties defaultProperties() {
      Properties properties = S3ApiMetadata.defaultProperties();
      properties.setProperty(PROPERTY_S3_VIRTUAL_HOST_BUCKETS, "false");
      return properties;
   }

   public static class Builder extends S3ApiMetadata.Builder {
      protected Builder(){
         super(S3Client.class, S3AsyncClient.class);
         id("vblob")
         .name("VBlob (S3 clone) API")
         .version("2006-03-01")
         .defaultProperties(VBlobApiMetadata.defaultProperties())
         .defaultModules(ImmutableSet.<Class<? extends Module>>of(VBlobRestClientModule.class, S3BlobStoreContextModule.class));
      }
      
      @Override
      public VBlobApiMetadata build() {
         return new VBlobApiMetadata(this);
      }

      @Override
      public Builder fromApiMetadata(ApiMetadata in) {
         super.fromApiMetadata(in);
         return this;
      }
   }

}
