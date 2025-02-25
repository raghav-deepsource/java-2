package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V1beta2PriorityLevelConfigurationSpecBuilder extends io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationSpecFluentImpl<io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationSpecBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationSpec,io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationSpecBuilder>{
  public V1beta2PriorityLevelConfigurationSpecBuilder() {
    this(false);
  }
  public V1beta2PriorityLevelConfigurationSpecBuilder(java.lang.Boolean validationEnabled) {
    this(new V1beta2PriorityLevelConfigurationSpec(), validationEnabled);
  }
  public V1beta2PriorityLevelConfigurationSpecBuilder(io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationSpecFluent<?> fluent) {
    this(fluent, false);
  }
  public V1beta2PriorityLevelConfigurationSpecBuilder(io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationSpecFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V1beta2PriorityLevelConfigurationSpec(), validationEnabled);
  }
  public V1beta2PriorityLevelConfigurationSpecBuilder(io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationSpecFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationSpec instance) {
    this(fluent, instance, false);
  }
  public V1beta2PriorityLevelConfigurationSpecBuilder(io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationSpecFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationSpec instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withLimited(instance.getLimited());

    fluent.withType(instance.getType());

    this.validationEnabled = validationEnabled; 
  }
  public V1beta2PriorityLevelConfigurationSpecBuilder(io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationSpec instance) {
    this(instance,false);
  }
  public V1beta2PriorityLevelConfigurationSpecBuilder(io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationSpec instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withLimited(instance.getLimited());

    this.withType(instance.getType());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationSpecFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationSpec build() {
    V1beta2PriorityLevelConfigurationSpec buildable = new V1beta2PriorityLevelConfigurationSpec();
    buildable.setLimited(fluent.getLimited());
    buildable.setType(fluent.getType());
    return buildable;
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1beta2PriorityLevelConfigurationSpecBuilder that = (V1beta2PriorityLevelConfigurationSpecBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}