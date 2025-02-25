package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V1beta2FlowSchemaStatusBuilder extends io.kubernetes.client.openapi.models.V1beta2FlowSchemaStatusFluentImpl<io.kubernetes.client.openapi.models.V1beta2FlowSchemaStatusBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1beta2FlowSchemaStatus,io.kubernetes.client.openapi.models.V1beta2FlowSchemaStatusBuilder>{
  public V1beta2FlowSchemaStatusBuilder() {
    this(false);
  }
  public V1beta2FlowSchemaStatusBuilder(java.lang.Boolean validationEnabled) {
    this(new V1beta2FlowSchemaStatus(), validationEnabled);
  }
  public V1beta2FlowSchemaStatusBuilder(io.kubernetes.client.openapi.models.V1beta2FlowSchemaStatusFluent<?> fluent) {
    this(fluent, false);
  }
  public V1beta2FlowSchemaStatusBuilder(io.kubernetes.client.openapi.models.V1beta2FlowSchemaStatusFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V1beta2FlowSchemaStatus(), validationEnabled);
  }
  public V1beta2FlowSchemaStatusBuilder(io.kubernetes.client.openapi.models.V1beta2FlowSchemaStatusFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta2FlowSchemaStatus instance) {
    this(fluent, instance, false);
  }
  public V1beta2FlowSchemaStatusBuilder(io.kubernetes.client.openapi.models.V1beta2FlowSchemaStatusFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta2FlowSchemaStatus instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withConditions(instance.getConditions());

    this.validationEnabled = validationEnabled; 
  }
  public V1beta2FlowSchemaStatusBuilder(io.kubernetes.client.openapi.models.V1beta2FlowSchemaStatus instance) {
    this(instance,false);
  }
  public V1beta2FlowSchemaStatusBuilder(io.kubernetes.client.openapi.models.V1beta2FlowSchemaStatus instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withConditions(instance.getConditions());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V1beta2FlowSchemaStatusFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V1beta2FlowSchemaStatus build() {
    V1beta2FlowSchemaStatus buildable = new V1beta2FlowSchemaStatus();
    buildable.setConditions(fluent.getConditions());
    return buildable;
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1beta2FlowSchemaStatusBuilder that = (V1beta2FlowSchemaStatusBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}