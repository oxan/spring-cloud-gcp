/*
 * Copyright 2024 Google LLC
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

package com.google.cloud.bigquery.analyticshub.v1.spring;

import com.google.api.core.BetaApi;
import com.google.cloud.spring.core.Credentials;
import com.google.cloud.spring.core.CredentialsSupplier;
import com.google.cloud.spring.core.Retry;
import javax.annotation.Generated;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/** Provides default property values for AnalyticsHubService client bean */
@Generated("by google-cloud-spring-generator")
@BetaApi("Autogenerated Spring autoconfiguration is not yet stable")
@ConfigurationProperties("com.google.cloud.bigquery.analyticshub.v1.analytics-hub-service")
public class AnalyticsHubServiceSpringProperties implements CredentialsSupplier {
  /** OAuth2 credentials to authenticate and authorize calls to Google Cloud Client Libraries. */
  @NestedConfigurationProperty
  private final Credentials credentials =
      new Credentials(
          "https://www.googleapis.com/auth/bigquery",
          "https://www.googleapis.com/auth/cloud-platform");
  /** Quota project to use for billing. */
  private String quotaProjectId;
  /** Number of threads used for executors. */
  private Integer executorThreadCount;
  /** Allow override of default transport channel provider to use REST instead of gRPC. */
  private boolean useRest = false;
  /** Allow override of retry settings at service level, applying to all of its RPC methods. */
  @NestedConfigurationProperty private Retry retry;
  /**
   * Allow override of retry settings at method-level for listDataExchanges. If defined, this takes
   * precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry listDataExchangesRetry;
  /**
   * Allow override of retry settings at method-level for listOrgDataExchanges. If defined, this
   * takes precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry listOrgDataExchangesRetry;
  /**
   * Allow override of retry settings at method-level for getDataExchange. If defined, this takes
   * precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry getDataExchangeRetry;
  /**
   * Allow override of retry settings at method-level for createDataExchange. If defined, this takes
   * precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry createDataExchangeRetry;
  /**
   * Allow override of retry settings at method-level for updateDataExchange. If defined, this takes
   * precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry updateDataExchangeRetry;
  /**
   * Allow override of retry settings at method-level for deleteDataExchange. If defined, this takes
   * precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry deleteDataExchangeRetry;
  /**
   * Allow override of retry settings at method-level for listListings. If defined, this takes
   * precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry listListingsRetry;
  /**
   * Allow override of retry settings at method-level for getListing. If defined, this takes
   * precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry getListingRetry;
  /**
   * Allow override of retry settings at method-level for createListing. If defined, this takes
   * precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry createListingRetry;
  /**
   * Allow override of retry settings at method-level for updateListing. If defined, this takes
   * precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry updateListingRetry;
  /**
   * Allow override of retry settings at method-level for deleteListing. If defined, this takes
   * precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry deleteListingRetry;
  /**
   * Allow override of retry settings at method-level for subscribeListing. If defined, this takes
   * precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry subscribeListingRetry;
  /**
   * Allow override of retry settings at method-level for getSubscription. If defined, this takes
   * precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry getSubscriptionRetry;
  /**
   * Allow override of retry settings at method-level for listSubscriptions. If defined, this takes
   * precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry listSubscriptionsRetry;
  /**
   * Allow override of retry settings at method-level for listSharedResourceSubscriptions. If
   * defined, this takes precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry listSharedResourceSubscriptionsRetry;
  /**
   * Allow override of retry settings at method-level for revokeSubscription. If defined, this takes
   * precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry revokeSubscriptionRetry;
  /**
   * Allow override of retry settings at method-level for getIamPolicy. If defined, this takes
   * precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry getIamPolicyRetry;
  /**
   * Allow override of retry settings at method-level for setIamPolicy. If defined, this takes
   * precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry setIamPolicyRetry;
  /**
   * Allow override of retry settings at method-level for testIamPermissions. If defined, this takes
   * precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry testIamPermissionsRetry;

  @Override
  public Credentials getCredentials() {
    return this.credentials;
  }

  public String getQuotaProjectId() {
    return this.quotaProjectId;
  }

  public void setQuotaProjectId(String quotaProjectId) {
    this.quotaProjectId = quotaProjectId;
  }

  public boolean getUseRest() {
    return this.useRest;
  }

  public void setUseRest(boolean useRest) {
    this.useRest = useRest;
  }

  public Integer getExecutorThreadCount() {
    return this.executorThreadCount;
  }

  public void setExecutorThreadCount(Integer executorThreadCount) {
    this.executorThreadCount = executorThreadCount;
  }

  public Retry getRetry() {
    return this.retry;
  }

  public void setRetry(Retry retry) {
    this.retry = retry;
  }

  public Retry getListDataExchangesRetry() {
    return this.listDataExchangesRetry;
  }

  public void setListDataExchangesRetry(Retry listDataExchangesRetry) {
    this.listDataExchangesRetry = listDataExchangesRetry;
  }

  public Retry getListOrgDataExchangesRetry() {
    return this.listOrgDataExchangesRetry;
  }

  public void setListOrgDataExchangesRetry(Retry listOrgDataExchangesRetry) {
    this.listOrgDataExchangesRetry = listOrgDataExchangesRetry;
  }

  public Retry getGetDataExchangeRetry() {
    return this.getDataExchangeRetry;
  }

  public void setGetDataExchangeRetry(Retry getDataExchangeRetry) {
    this.getDataExchangeRetry = getDataExchangeRetry;
  }

  public Retry getCreateDataExchangeRetry() {
    return this.createDataExchangeRetry;
  }

  public void setCreateDataExchangeRetry(Retry createDataExchangeRetry) {
    this.createDataExchangeRetry = createDataExchangeRetry;
  }

  public Retry getUpdateDataExchangeRetry() {
    return this.updateDataExchangeRetry;
  }

  public void setUpdateDataExchangeRetry(Retry updateDataExchangeRetry) {
    this.updateDataExchangeRetry = updateDataExchangeRetry;
  }

  public Retry getDeleteDataExchangeRetry() {
    return this.deleteDataExchangeRetry;
  }

  public void setDeleteDataExchangeRetry(Retry deleteDataExchangeRetry) {
    this.deleteDataExchangeRetry = deleteDataExchangeRetry;
  }

  public Retry getListListingsRetry() {
    return this.listListingsRetry;
  }

  public void setListListingsRetry(Retry listListingsRetry) {
    this.listListingsRetry = listListingsRetry;
  }

  public Retry getGetListingRetry() {
    return this.getListingRetry;
  }

  public void setGetListingRetry(Retry getListingRetry) {
    this.getListingRetry = getListingRetry;
  }

  public Retry getCreateListingRetry() {
    return this.createListingRetry;
  }

  public void setCreateListingRetry(Retry createListingRetry) {
    this.createListingRetry = createListingRetry;
  }

  public Retry getUpdateListingRetry() {
    return this.updateListingRetry;
  }

  public void setUpdateListingRetry(Retry updateListingRetry) {
    this.updateListingRetry = updateListingRetry;
  }

  public Retry getDeleteListingRetry() {
    return this.deleteListingRetry;
  }

  public void setDeleteListingRetry(Retry deleteListingRetry) {
    this.deleteListingRetry = deleteListingRetry;
  }

  public Retry getSubscribeListingRetry() {
    return this.subscribeListingRetry;
  }

  public void setSubscribeListingRetry(Retry subscribeListingRetry) {
    this.subscribeListingRetry = subscribeListingRetry;
  }

  public Retry getGetSubscriptionRetry() {
    return this.getSubscriptionRetry;
  }

  public void setGetSubscriptionRetry(Retry getSubscriptionRetry) {
    this.getSubscriptionRetry = getSubscriptionRetry;
  }

  public Retry getListSubscriptionsRetry() {
    return this.listSubscriptionsRetry;
  }

  public void setListSubscriptionsRetry(Retry listSubscriptionsRetry) {
    this.listSubscriptionsRetry = listSubscriptionsRetry;
  }

  public Retry getListSharedResourceSubscriptionsRetry() {
    return this.listSharedResourceSubscriptionsRetry;
  }

  public void setListSharedResourceSubscriptionsRetry(Retry listSharedResourceSubscriptionsRetry) {
    this.listSharedResourceSubscriptionsRetry = listSharedResourceSubscriptionsRetry;
  }

  public Retry getRevokeSubscriptionRetry() {
    return this.revokeSubscriptionRetry;
  }

  public void setRevokeSubscriptionRetry(Retry revokeSubscriptionRetry) {
    this.revokeSubscriptionRetry = revokeSubscriptionRetry;
  }

  public Retry getGetIamPolicyRetry() {
    return this.getIamPolicyRetry;
  }

  public void setGetIamPolicyRetry(Retry getIamPolicyRetry) {
    this.getIamPolicyRetry = getIamPolicyRetry;
  }

  public Retry getSetIamPolicyRetry() {
    return this.setIamPolicyRetry;
  }

  public void setSetIamPolicyRetry(Retry setIamPolicyRetry) {
    this.setIamPolicyRetry = setIamPolicyRetry;
  }

  public Retry getTestIamPermissionsRetry() {
    return this.testIamPermissionsRetry;
  }

  public void setTestIamPermissionsRetry(Retry testIamPermissionsRetry) {
    this.testIamPermissionsRetry = testIamPermissionsRetry;
  }
}