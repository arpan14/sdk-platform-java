package com.google.api.generator.gapic.composer.grpc.spanner;

import com.google.api.generator.gapic.composer.spanner.SpannerOptionsStubClassComposer;
import com.google.api.generator.gapic.model.GapicClass;
import com.google.api.generator.gapic.model.GapicContext;
import com.google.api.generator.gapic.model.Service;
import com.google.api.generator.test.framework.Assert;
import com.google.api.generator.test.protoloader.GrpcTestProtoLoader;
import org.junit.Test;

public class SpannerOptionsStubClassComposerTest {
  @Test
  public void generateServiceClasses() {
    GapicContext context = GrpcTestProtoLoader.instance().parseSpanner();
    Service spannerService = context.services().get(0);
    GapicClass clazz =
        SpannerOptionsStubClassComposer.instance().generate(context, spannerService);
    Assert.assertEmptySamples(clazz.samples());
    Assert.assertGoldenClass(this.getClass(), clazz, "SpannerAutogeneratedOptionsStub.golden");
  }
}
