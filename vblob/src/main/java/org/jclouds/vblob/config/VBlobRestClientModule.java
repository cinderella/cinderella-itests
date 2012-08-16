package org.jclouds.vblob.config;

import javax.inject.Singleton;

import org.jclouds.rest.ConfiguresRestClient;
import org.jclouds.s3.S3AsyncClient;
import org.jclouds.s3.S3Client;
import org.jclouds.s3.config.S3RestClientModule;
import org.jclouds.vblob.VBlobAsyncClient;

import com.google.common.reflect.TypeToken;
import com.google.inject.Provides;

@ConfiguresRestClient
public class VBlobRestClientModule extends S3RestClientModule<S3Client, VBlobAsyncClient> {
   public VBlobRestClientModule() {
      super(TypeToken.of(S3Client.class), TypeToken.of(VBlobAsyncClient.class));
   }

   @Provides
   @Singleton
   S3AsyncClient provideS3AsyncClient(VBlobAsyncClient in) {
      return in;
   }

}
