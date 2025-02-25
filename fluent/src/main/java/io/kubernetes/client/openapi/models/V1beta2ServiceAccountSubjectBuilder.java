package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V1beta2ServiceAccountSubjectBuilder extends io.kubernetes.client.openapi.models.V1beta2ServiceAccountSubjectFluentImpl<io.kubernetes.client.openapi.models.V1beta2ServiceAccountSubjectBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1beta2ServiceAccountSubject,io.kubernetes.client.openapi.models.V1beta2ServiceAccountSubjectBuilder>{
  public V1beta2ServiceAccountSubjectBuilder() {
    this(false);
  }
  public V1beta2ServiceAccountSubjectBuilder(java.lang.Boolean validationEnabled) {
    this(new V1beta2ServiceAccountSubject(), validationEnabled);
  }
  public V1beta2ServiceAccountSubjectBuilder(io.kubernetes.client.openapi.models.V1beta2ServiceAccountSubjectFluent<?> fluent) {
    this(fluent, false);
  }
  public V1beta2ServiceAccountSubjectBuilder(io.kubernetes.client.openapi.models.V1beta2ServiceAccountSubjectFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V1beta2ServiceAccountSubject(), validationEnabled);
  }
  public V1beta2ServiceAccountSubjectBuilder(io.kubernetes.client.openapi.models.V1beta2ServiceAccountSubjectFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta2ServiceAccountSubject instance) {
    this(fluent, instance, false);
  }
  public V1beta2ServiceAccountSubjectBuilder(io.kubernetes.client.openapi.models.V1beta2ServiceAccountSubjectFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta2ServiceAccountSubject instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withName(instance.getName());

    fluent.withNamespace(instance.getNamespace());

    this.validationEnabled = validationEnabled; 
  }
  public V1beta2ServiceAccountSubjectBuilder(io.kubernetes.client.openapi.models.V1beta2ServiceAccountSubject instance) {
    this(instance,false);
  }
  public V1beta2ServiceAccountSubjectBuilder(io.kubernetes.client.openapi.models.V1beta2ServiceAccountSubject instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withName(instance.getName());

    this.withNamespace(instance.getNamespace());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V1beta2ServiceAccountSubjectFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V1beta2ServiceAccountSubject build() {
    V1beta2ServiceAccountSubject buildable = new V1beta2ServiceAccountSubject();
    buildable.setName(fluent.getName());
    buildable.setNamespace(fluent.getNamespace());
    return buildable;
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1beta2ServiceAccountSubjectBuilder that = (V1beta2ServiceAccountSubjectBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}