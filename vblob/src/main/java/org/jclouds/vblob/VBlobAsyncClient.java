package org.jclouds.vblob;

import static org.jclouds.blobstore.attr.BlobScopes.CONTAINER;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.jclouds.blobstore.attr.BlobScope;
import org.jclouds.blobstore.functions.ReturnFalseOnContainerNotFound;
import org.jclouds.rest.annotations.BinderParam;
import org.jclouds.rest.annotations.Endpoint;
import org.jclouds.rest.annotations.ExceptionParser;
import org.jclouds.rest.annotations.ParamValidators;
import org.jclouds.rest.annotations.QueryParams;
import org.jclouds.rest.annotations.RequestFilters;
import org.jclouds.rest.annotations.SkipEncoding;
import org.jclouds.s3.Bucket;
import org.jclouds.s3.S3AsyncClient;
import org.jclouds.s3.S3Client;
import org.jclouds.s3.binders.BindAsHostPrefixIfConfigured;
import org.jclouds.s3.filters.RequestAuthorizeSignature;
import org.jclouds.s3.predicates.validators.BucketNameValidator;

import com.google.common.util.concurrent.ListenableFuture;

@SkipEncoding('/')
@RequestFilters(RequestAuthorizeSignature.class)
@BlobScope(CONTAINER)
public interface VBlobAsyncClient extends S3AsyncClient {

   /**
    * @see S3Client#bucketExists
    */
   @Override
   @GET
   @Path("/")
   @Endpoint(Bucket.class)
   @QueryParams(keys = "max-keys", values = "0")
   @ExceptionParser(ReturnFalseOnContainerNotFound.class)
   ListenableFuture<Boolean> bucketExists(
            @Bucket @BinderParam(BindAsHostPrefixIfConfigured.class) @ParamValidators(BucketNameValidator.class) String bucketName);

}
