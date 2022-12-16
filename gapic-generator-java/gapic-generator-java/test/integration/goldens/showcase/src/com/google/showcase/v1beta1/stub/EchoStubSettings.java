/*
 * Copyright 2022 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.showcase.v1beta1.stub;

import static com.google.showcase.v1beta1.EchoClient.PagedExpandLegacyMappedPagedResponse;
import static com.google.showcase.v1beta1.EchoClient.PagedExpandPagedResponse;

import com.google.api.core.ApiFunction;
import com.google.api.core.ApiFuture;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.GaxProperties;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.grpc.GaxGrpcProperties;
import com.google.api.gax.grpc.GrpcTransportChannel;
import com.google.api.gax.grpc.InstantiatingGrpcChannelProvider;
import com.google.api.gax.grpc.ProtoOperationTransformers;
import com.google.api.gax.httpjson.GaxHttpJsonProperties;
import com.google.api.gax.httpjson.HttpJsonTransportChannel;
import com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider;
import com.google.api.gax.longrunning.OperationSnapshot;
import com.google.api.gax.longrunning.OperationTimedPollAlgorithm;
import com.google.api.gax.retrying.RetrySettings;
import com.google.api.gax.rpc.ApiCallContext;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.OperationCallSettings;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.PagedCallSettings;
import com.google.api.gax.rpc.PagedListDescriptor;
import com.google.api.gax.rpc.PagedListResponseFactory;
import com.google.api.gax.rpc.ServerStreamingCallSettings;
import com.google.api.gax.rpc.StatusCode;
import com.google.api.gax.rpc.StreamingCallSettings;
import com.google.api.gax.rpc.StubSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.longrunning.Operation;
import com.google.showcase.v1beta1.BlockRequest;
import com.google.showcase.v1beta1.BlockResponse;
import com.google.showcase.v1beta1.EchoRequest;
import com.google.showcase.v1beta1.EchoResponse;
import com.google.showcase.v1beta1.ExpandRequest;
import com.google.showcase.v1beta1.PagedExpandLegacyMappedResponse;
import com.google.showcase.v1beta1.PagedExpandLegacyRequest;
import com.google.showcase.v1beta1.PagedExpandRequest;
import com.google.showcase.v1beta1.PagedExpandResponse;
import com.google.showcase.v1beta1.PagedExpandResponseList;
import com.google.showcase.v1beta1.WaitMetadata;
import com.google.showcase.v1beta1.WaitRequest;
import com.google.showcase.v1beta1.WaitResponse;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import org.threeten.bp.Duration;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Settings class to configure an instance of {@link EchoStub}.
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li>The default service address (localhost) and default port (7469) are used.
 *   <li>Credentials are acquired automatically through Application Default Credentials.
 *   <li>Retries are configured for idempotent methods but not for non-idempotent methods.
 * </ul>
 *
 * <p>The builder of this class is recursive, so contained classes are themselves builders. When
 * build() is called, the tree of builders is called to create the complete settings object.
 *
 * <p>For example, to set the total timeout of echo to 30 seconds:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * EchoStubSettings.Builder echoSettingsBuilder = EchoStubSettings.newBuilder();
 * echoSettingsBuilder
 *     .echoSettings()
 *     .setRetrySettings(
 *         echoSettingsBuilder
 *             .echoSettings()
 *             .getRetrySettings()
 *             .toBuilder()
 *             .setTotalTimeout(Duration.ofSeconds(30))
 *             .build());
 * EchoStubSettings echoSettings = echoSettingsBuilder.build();
 * }</pre>
 */
@BetaApi
@Generated("by gapic-generator-java")
public class EchoStubSettings extends StubSettings<EchoStubSettings> {
  /** The default scopes of the service. */
  private static final ImmutableList<String> DEFAULT_SERVICE_SCOPES =
      ImmutableList.<String>builder().build();

  private final UnaryCallSettings<EchoRequest, EchoResponse> echoSettings;
  private final ServerStreamingCallSettings<ExpandRequest, EchoResponse> expandSettings;
  private final StreamingCallSettings<EchoRequest, EchoResponse> collectSettings;
  private final StreamingCallSettings<EchoRequest, EchoResponse> chatSettings;
  private final PagedCallSettings<PagedExpandRequest, PagedExpandResponse, PagedExpandPagedResponse>
      pagedExpandSettings;
  private final UnaryCallSettings<PagedExpandLegacyRequest, PagedExpandResponse>
      pagedExpandLegacySettings;
  private final PagedCallSettings<
          PagedExpandRequest, PagedExpandLegacyMappedResponse, PagedExpandLegacyMappedPagedResponse>
      pagedExpandLegacyMappedSettings;
  private final UnaryCallSettings<WaitRequest, Operation> waitSettings;
  private final OperationCallSettings<WaitRequest, WaitResponse, WaitMetadata>
      waitOperationSettings;
  private final UnaryCallSettings<BlockRequest, BlockResponse> blockSettings;

  private static final PagedListDescriptor<PagedExpandRequest, PagedExpandResponse, EchoResponse>
      PAGED_EXPAND_PAGE_STR_DESC =
          new PagedListDescriptor<PagedExpandRequest, PagedExpandResponse, EchoResponse>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public PagedExpandRequest injectToken(PagedExpandRequest payload, String token) {
              return PagedExpandRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public PagedExpandRequest injectPageSize(PagedExpandRequest payload, int pageSize) {
              return PagedExpandRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(PagedExpandRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(PagedExpandResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<EchoResponse> extractResources(PagedExpandResponse payload) {
              return payload.getResponsesList() == null
                  ? ImmutableList.<EchoResponse>of()
                  : payload.getResponsesList();
            }
          };

  private static final PagedListDescriptor<
          PagedExpandRequest,
          PagedExpandLegacyMappedResponse,
          Map.Entry<String, PagedExpandResponseList>>
      PAGED_EXPAND_LEGACY_MAPPED_PAGE_STR_DESC =
          new PagedListDescriptor<
              PagedExpandRequest,
              PagedExpandLegacyMappedResponse,
              Map.Entry<String, PagedExpandResponseList>>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public PagedExpandRequest injectToken(PagedExpandRequest payload, String token) {
              return PagedExpandRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public PagedExpandRequest injectPageSize(PagedExpandRequest payload, int pageSize) {
              return PagedExpandRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(PagedExpandRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(PagedExpandLegacyMappedResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<Map.Entry<String, PagedExpandResponseList>> extractResources(
                PagedExpandLegacyMappedResponse payload) {
              return payload.getAlphabetizedMap() == null
                  ? Collections.<Map.Entry<String, PagedExpandResponseList>>emptySet()
                  : payload.getAlphabetizedMap().entrySet();
            }
          };

  private static final PagedListResponseFactory<
          PagedExpandRequest, PagedExpandResponse, PagedExpandPagedResponse>
      PAGED_EXPAND_PAGE_STR_FACT =
          new PagedListResponseFactory<
              PagedExpandRequest, PagedExpandResponse, PagedExpandPagedResponse>() {
            @Override
            public ApiFuture<PagedExpandPagedResponse> getFuturePagedResponse(
                UnaryCallable<PagedExpandRequest, PagedExpandResponse> callable,
                PagedExpandRequest request,
                ApiCallContext context,
                ApiFuture<PagedExpandResponse> futureResponse) {
              PageContext<PagedExpandRequest, PagedExpandResponse, EchoResponse> pageContext =
                  PageContext.create(callable, PAGED_EXPAND_PAGE_STR_DESC, request, context);
              return PagedExpandPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          PagedExpandRequest, PagedExpandLegacyMappedResponse, PagedExpandLegacyMappedPagedResponse>
      PAGED_EXPAND_LEGACY_MAPPED_PAGE_STR_FACT =
          new PagedListResponseFactory<
              PagedExpandRequest,
              PagedExpandLegacyMappedResponse,
              PagedExpandLegacyMappedPagedResponse>() {
            @Override
            public ApiFuture<PagedExpandLegacyMappedPagedResponse> getFuturePagedResponse(
                UnaryCallable<PagedExpandRequest, PagedExpandLegacyMappedResponse> callable,
                PagedExpandRequest request,
                ApiCallContext context,
                ApiFuture<PagedExpandLegacyMappedResponse> futureResponse) {
              PageContext<
                      PagedExpandRequest,
                      PagedExpandLegacyMappedResponse,
                      Map.Entry<String, PagedExpandResponseList>>
                  pageContext =
                      PageContext.create(
                          callable, PAGED_EXPAND_LEGACY_MAPPED_PAGE_STR_DESC, request, context);
              return PagedExpandLegacyMappedPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  /** Returns the object with the settings used for calls to echo. */
  public UnaryCallSettings<EchoRequest, EchoResponse> echoSettings() {
    return echoSettings;
  }

  /** Returns the object with the settings used for calls to expand. */
  public ServerStreamingCallSettings<ExpandRequest, EchoResponse> expandSettings() {
    return expandSettings;
  }

  /** Returns the object with the settings used for calls to collect. */
  public StreamingCallSettings<EchoRequest, EchoResponse> collectSettings() {
    return collectSettings;
  }

  /** Returns the object with the settings used for calls to chat. */
  public StreamingCallSettings<EchoRequest, EchoResponse> chatSettings() {
    return chatSettings;
  }

  /** Returns the object with the settings used for calls to pagedExpand. */
  public PagedCallSettings<PagedExpandRequest, PagedExpandResponse, PagedExpandPagedResponse>
      pagedExpandSettings() {
    return pagedExpandSettings;
  }

  /** Returns the object with the settings used for calls to pagedExpandLegacy. */
  public UnaryCallSettings<PagedExpandLegacyRequest, PagedExpandResponse>
      pagedExpandLegacySettings() {
    return pagedExpandLegacySettings;
  }

  /** Returns the object with the settings used for calls to pagedExpandLegacyMapped. */
  public PagedCallSettings<
          PagedExpandRequest, PagedExpandLegacyMappedResponse, PagedExpandLegacyMappedPagedResponse>
      pagedExpandLegacyMappedSettings() {
    return pagedExpandLegacyMappedSettings;
  }

  /** Returns the object with the settings used for calls to wait. */
  public UnaryCallSettings<WaitRequest, Operation> waitSettings() {
    return waitSettings;
  }

  /** Returns the object with the settings used for calls to wait. */
  public OperationCallSettings<WaitRequest, WaitResponse, WaitMetadata> waitOperationSettings() {
    return waitOperationSettings;
  }

  /** Returns the object with the settings used for calls to block. */
  public UnaryCallSettings<BlockRequest, BlockResponse> blockSettings() {
    return blockSettings;
  }

  public EchoStub createStub() throws IOException {
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(GrpcTransportChannel.getGrpcTransportName())) {
      return GrpcEchoStub.create(this);
    }
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(HttpJsonTransportChannel.getHttpJsonTransportName())) {
      return HttpJsonEchoStub.create(this);
    }
    throw new UnsupportedOperationException(
        String.format(
            "Transport not supported: %s", getTransportChannelProvider().getTransportName()));
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return InstantiatingExecutorProvider.newBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return "localhost:7469";
  }

  /** Returns the default mTLS service endpoint. */
  public static String getDefaultMtlsEndpoint() {
    return "localhost:7469";
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return DEFAULT_SERVICE_SCOPES;
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return GoogleCredentialsProvider.newBuilder()
        .setScopesToApply(DEFAULT_SERVICE_SCOPES)
        .setUseJwtAccessWithScope(true);
  }

  /** Returns a builder for the default gRPC ChannelProvider for this service. */
  public static InstantiatingGrpcChannelProvider.Builder defaultGrpcTransportProviderBuilder() {
    return InstantiatingGrpcChannelProvider.newBuilder()
        .setMaxInboundMessageSize(Integer.MAX_VALUE);
  }

  /** Returns a builder for the default REST ChannelProvider for this service. */
  @BetaApi
  public static InstantiatingHttpJsonChannelProvider.Builder
      defaultHttpJsonTransportProviderBuilder() {
    return InstantiatingHttpJsonChannelProvider.newBuilder();
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return defaultGrpcTransportProviderBuilder().build();
  }

  @BetaApi("The surface for customizing headers is not stable yet and may change in the future.")
  public static ApiClientHeaderProvider.Builder defaultGrpcApiClientHeaderProviderBuilder() {
    return ApiClientHeaderProvider.newBuilder()
        .setGeneratedLibToken("gapic", GaxProperties.getLibraryVersion(EchoStubSettings.class))
        .setTransportToken(
            GaxGrpcProperties.getGrpcTokenName(), GaxGrpcProperties.getGrpcVersion());
  }

  @BetaApi("The surface for customizing headers is not stable yet and may change in the future.")
  public static ApiClientHeaderProvider.Builder defaultHttpJsonApiClientHeaderProviderBuilder() {
    return ApiClientHeaderProvider.newBuilder()
        .setGeneratedLibToken("gapic", GaxProperties.getLibraryVersion(EchoStubSettings.class))
        .setTransportToken(
            GaxHttpJsonProperties.getHttpJsonTokenName(),
            GaxHttpJsonProperties.getHttpJsonVersion());
  }

  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return EchoStubSettings.defaultGrpcApiClientHeaderProviderBuilder();
  }

  /** Returns a new gRPC builder for this class. */
  public static Builder newBuilder() {
    return Builder.createDefault();
  }

  /** Returns a new REST builder for this class. */
  public static Builder newHttpJsonBuilder() {
    return Builder.createHttpJsonDefault();
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder(ClientContext clientContext) {
    return new Builder(clientContext);
  }

  /** Returns a builder containing all the values of this settings class. */
  public Builder toBuilder() {
    return new Builder(this);
  }

  protected EchoStubSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);

    echoSettings = settingsBuilder.echoSettings().build();
    expandSettings = settingsBuilder.expandSettings().build();
    collectSettings = settingsBuilder.collectSettings().build();
    chatSettings = settingsBuilder.chatSettings().build();
    pagedExpandSettings = settingsBuilder.pagedExpandSettings().build();
    pagedExpandLegacySettings = settingsBuilder.pagedExpandLegacySettings().build();
    pagedExpandLegacyMappedSettings = settingsBuilder.pagedExpandLegacyMappedSettings().build();
    waitSettings = settingsBuilder.waitSettings().build();
    waitOperationSettings = settingsBuilder.waitOperationSettings().build();
    blockSettings = settingsBuilder.blockSettings().build();
  }

  /** Builder for EchoStubSettings. */
  public static class Builder extends StubSettings.Builder<EchoStubSettings, Builder> {
    private final ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders;
    private final UnaryCallSettings.Builder<EchoRequest, EchoResponse> echoSettings;
    private final ServerStreamingCallSettings.Builder<ExpandRequest, EchoResponse> expandSettings;
    private final StreamingCallSettings.Builder<EchoRequest, EchoResponse> collectSettings;
    private final StreamingCallSettings.Builder<EchoRequest, EchoResponse> chatSettings;
    private final PagedCallSettings.Builder<
            PagedExpandRequest, PagedExpandResponse, PagedExpandPagedResponse>
        pagedExpandSettings;
    private final UnaryCallSettings.Builder<PagedExpandLegacyRequest, PagedExpandResponse>
        pagedExpandLegacySettings;
    private final PagedCallSettings.Builder<
            PagedExpandRequest,
            PagedExpandLegacyMappedResponse,
            PagedExpandLegacyMappedPagedResponse>
        pagedExpandLegacyMappedSettings;
    private final UnaryCallSettings.Builder<WaitRequest, Operation> waitSettings;
    private final OperationCallSettings.Builder<WaitRequest, WaitResponse, WaitMetadata>
        waitOperationSettings;
    private final UnaryCallSettings.Builder<BlockRequest, BlockResponse> blockSettings;
    private static final ImmutableMap<String, ImmutableSet<StatusCode.Code>>
        RETRYABLE_CODE_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, ImmutableSet<StatusCode.Code>> definitions =
          ImmutableMap.builder();
      definitions.put(
          "retry_policy_1_codes",
          ImmutableSet.copyOf(
              Lists.<StatusCode.Code>newArrayList(
                  StatusCode.Code.UNAVAILABLE, StatusCode.Code.UNKNOWN)));
      definitions.put(
          "no_retry_0_codes", ImmutableSet.copyOf(Lists.<StatusCode.Code>newArrayList()));
      RETRYABLE_CODE_DEFINITIONS = definitions.build();
    }

    private static final ImmutableMap<String, RetrySettings> RETRY_PARAM_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, RetrySettings> definitions = ImmutableMap.builder();
      RetrySettings settings = null;
      settings =
          RetrySettings.newBuilder()
              .setInitialRetryDelay(Duration.ofMillis(100L))
              .setRetryDelayMultiplier(2.0)
              .setMaxRetryDelay(Duration.ofMillis(3000L))
              .setInitialRpcTimeout(Duration.ofMillis(10000L))
              .setRpcTimeoutMultiplier(1.0)
              .setMaxRpcTimeout(Duration.ofMillis(10000L))
              .setTotalTimeout(Duration.ofMillis(10000L))
              .build();
      definitions.put("retry_policy_1_params", settings);
      settings =
          RetrySettings.newBuilder()
              .setInitialRpcTimeout(Duration.ofMillis(5000L))
              .setRpcTimeoutMultiplier(1.0)
              .setMaxRpcTimeout(Duration.ofMillis(5000L))
              .setTotalTimeout(Duration.ofMillis(5000L))
              .build();
      definitions.put("no_retry_0_params", settings);
      RETRY_PARAM_DEFINITIONS = definitions.build();
    }

    protected Builder() {
      this(((ClientContext) null));
    }

    protected Builder(ClientContext clientContext) {
      super(clientContext);

      echoSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      expandSettings = ServerStreamingCallSettings.newBuilder();
      collectSettings = StreamingCallSettings.newBuilder();
      chatSettings = StreamingCallSettings.newBuilder();
      pagedExpandSettings = PagedCallSettings.newBuilder(PAGED_EXPAND_PAGE_STR_FACT);
      pagedExpandLegacySettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      pagedExpandLegacyMappedSettings =
          PagedCallSettings.newBuilder(PAGED_EXPAND_LEGACY_MAPPED_PAGE_STR_FACT);
      waitSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      waitOperationSettings = OperationCallSettings.newBuilder();
      blockSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              echoSettings,
              pagedExpandSettings,
              pagedExpandLegacySettings,
              pagedExpandLegacyMappedSettings,
              waitSettings,
              blockSettings);
      initDefaults(this);
    }

    protected Builder(EchoStubSettings settings) {
      super(settings);

      echoSettings = settings.echoSettings.toBuilder();
      expandSettings = settings.expandSettings.toBuilder();
      collectSettings = settings.collectSettings.toBuilder();
      chatSettings = settings.chatSettings.toBuilder();
      pagedExpandSettings = settings.pagedExpandSettings.toBuilder();
      pagedExpandLegacySettings = settings.pagedExpandLegacySettings.toBuilder();
      pagedExpandLegacyMappedSettings = settings.pagedExpandLegacyMappedSettings.toBuilder();
      waitSettings = settings.waitSettings.toBuilder();
      waitOperationSettings = settings.waitOperationSettings.toBuilder();
      blockSettings = settings.blockSettings.toBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              echoSettings,
              pagedExpandSettings,
              pagedExpandLegacySettings,
              pagedExpandLegacyMappedSettings,
              waitSettings,
              blockSettings);
    }

    private static Builder createDefault() {
      Builder builder = new Builder(((ClientContext) null));

      builder.setTransportChannelProvider(defaultTransportChannelProvider());
      builder.setCredentialsProvider(defaultCredentialsProviderBuilder().build());
      builder.setInternalHeaderProvider(defaultApiClientHeaderProviderBuilder().build());
      builder.setEndpoint(getDefaultEndpoint());
      builder.setMtlsEndpoint(getDefaultMtlsEndpoint());
      builder.setSwitchToMtlsEndpointAllowed(true);

      return initDefaults(builder);
    }

    private static Builder createHttpJsonDefault() {
      Builder builder = new Builder(((ClientContext) null));

      builder.setTransportChannelProvider(defaultHttpJsonTransportProviderBuilder().build());
      builder.setCredentialsProvider(defaultCredentialsProviderBuilder().build());
      builder.setInternalHeaderProvider(defaultHttpJsonApiClientHeaderProviderBuilder().build());
      builder.setEndpoint(getDefaultEndpoint());
      builder.setMtlsEndpoint(getDefaultMtlsEndpoint());
      builder.setSwitchToMtlsEndpointAllowed(true);

      return initDefaults(builder);
    }

    private static Builder initDefaults(Builder builder) {
      builder
          .echoSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_1_params"));

      builder
          .expandSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_1_params"));

      builder
          .pagedExpandSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_1_params"));

      builder
          .pagedExpandLegacySettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_0_params"));

      builder
          .pagedExpandLegacyMappedSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_0_params"));

      builder
          .waitSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_0_params"));

      builder
          .blockSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_0_params"));

      builder
          .waitOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings.<WaitRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_0_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_0_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(WaitResponse.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(WaitMetadata.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelay(Duration.ofMillis(5000L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelay(Duration.ofMillis(45000L))
                      .setInitialRpcTimeout(Duration.ZERO)
                      .setRpcTimeoutMultiplier(1.0)
                      .setMaxRpcTimeout(Duration.ZERO)
                      .setTotalTimeout(Duration.ofMillis(300000L))
                      .build()));

      return builder;
    }

    /**
     * Applies the given settings updater function to all of the unary API methods in this service.
     *
     * <p>Note: This method does not support applying settings to streaming methods.
     */
    public Builder applyToAllUnaryMethods(
        ApiFunction<UnaryCallSettings.Builder<?, ?>, Void> settingsUpdater) {
      super.applyToAllUnaryMethods(unaryMethodSettingsBuilders, settingsUpdater);
      return this;
    }

    public ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders() {
      return unaryMethodSettingsBuilders;
    }

    /** Returns the builder for the settings used for calls to echo. */
    public UnaryCallSettings.Builder<EchoRequest, EchoResponse> echoSettings() {
      return echoSettings;
    }

    /** Returns the builder for the settings used for calls to expand. */
    public ServerStreamingCallSettings.Builder<ExpandRequest, EchoResponse> expandSettings() {
      return expandSettings;
    }

    /** Returns the builder for the settings used for calls to collect. */
    public StreamingCallSettings.Builder<EchoRequest, EchoResponse> collectSettings() {
      return collectSettings;
    }

    /** Returns the builder for the settings used for calls to chat. */
    public StreamingCallSettings.Builder<EchoRequest, EchoResponse> chatSettings() {
      return chatSettings;
    }

    /** Returns the builder for the settings used for calls to pagedExpand. */
    public PagedCallSettings.Builder<
            PagedExpandRequest, PagedExpandResponse, PagedExpandPagedResponse>
        pagedExpandSettings() {
      return pagedExpandSettings;
    }

    /** Returns the builder for the settings used for calls to pagedExpandLegacy. */
    public UnaryCallSettings.Builder<PagedExpandLegacyRequest, PagedExpandResponse>
        pagedExpandLegacySettings() {
      return pagedExpandLegacySettings;
    }

    /** Returns the builder for the settings used for calls to pagedExpandLegacyMapped. */
    public PagedCallSettings.Builder<
            PagedExpandRequest,
            PagedExpandLegacyMappedResponse,
            PagedExpandLegacyMappedPagedResponse>
        pagedExpandLegacyMappedSettings() {
      return pagedExpandLegacyMappedSettings;
    }

    /** Returns the builder for the settings used for calls to wait. */
    public UnaryCallSettings.Builder<WaitRequest, Operation> waitSettings() {
      return waitSettings;
    }

    /** Returns the builder for the settings used for calls to wait. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<WaitRequest, WaitResponse, WaitMetadata>
        waitOperationSettings() {
      return waitOperationSettings;
    }

    /** Returns the builder for the settings used for calls to block. */
    public UnaryCallSettings.Builder<BlockRequest, BlockResponse> blockSettings() {
      return blockSettings;
    }

    @Override
    public EchoStubSettings build() throws IOException {
      return new EchoStubSettings(this);
    }
  }
}