package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import java.time.OffsetDateTime;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1NamespaceConditionFluent<A extends io.kubernetes.client.openapi.models.V1NamespaceConditionFluent<A>> extends io.kubernetes.client.fluent.Fluent<A>{
  public java.time.OffsetDateTime getLastTransitionTime();
  public A withLastTransitionTime(java.time.OffsetDateTime lastTransitionTime);
  public java.lang.Boolean hasLastTransitionTime();
  public java.lang.String getMessage();
  public A withMessage(java.lang.String message);
  public java.lang.Boolean hasMessage();
  
  /**
   * Method is deprecated. use withMessage instead.
   */
  @java.lang.Deprecated
  public A withNewMessage(java.lang.String original);
  public java.lang.String getReason();
  public A withReason(java.lang.String reason);
  public java.lang.Boolean hasReason();
  
  /**
   * Method is deprecated. use withReason instead.
   */
  @java.lang.Deprecated
  public A withNewReason(java.lang.String original);
  public java.lang.String getStatus();
  public A withStatus(java.lang.String status);
  public java.lang.Boolean hasStatus();
  
  /**
   * Method is deprecated. use withStatus instead.
   */
  @java.lang.Deprecated
  public A withNewStatus(java.lang.String original);
  public io.kubernetes.client.openapi.models.V1NamespaceCondition.TypeEnum getType();
  public A withType(io.kubernetes.client.openapi.models.V1NamespaceCondition.TypeEnum type);
  public java.lang.Boolean hasType();
  
}