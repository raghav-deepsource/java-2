package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

 /**
  * Generated
  */
public class V2beta2ResourceMetricStatusFluentImpl<A extends io.kubernetes.client.openapi.models.V2beta2ResourceMetricStatusFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V2beta2ResourceMetricStatusFluent<A>{
  public V2beta2ResourceMetricStatusFluentImpl() {
  }
  public V2beta2ResourceMetricStatusFluentImpl(io.kubernetes.client.openapi.models.V2beta2ResourceMetricStatus instance) {
    this.withCurrent(instance.getCurrent());

    this.withName(instance.getName());

  }
  private io.kubernetes.client.openapi.models.V2beta2MetricValueStatusBuilder current;
  private java.lang.String name;
  
  /**
   * This method has been deprecated, please use method buildCurrent instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V2beta2MetricValueStatus getCurrent() {
    return this.current!=null ?this.current.build():null;
  }
  public io.kubernetes.client.openapi.models.V2beta2MetricValueStatus buildCurrent() {
    return this.current!=null ?this.current.build():null;
  }
  public A withCurrent(io.kubernetes.client.openapi.models.V2beta2MetricValueStatus current) {
    _visitables.get("current").remove(this.current);
    if (current!=null){ this.current= new io.kubernetes.client.openapi.models.V2beta2MetricValueStatusBuilder(current); _visitables.get("current").add(this.current);} return (A) this;
  }
  public java.lang.Boolean hasCurrent() {
    return this.current != null;
  }
  public io.kubernetes.client.openapi.models.V2beta2ResourceMetricStatusFluent.CurrentNested<A> withNewCurrent() {
    return new io.kubernetes.client.openapi.models.V2beta2ResourceMetricStatusFluentImpl.CurrentNestedImpl();
  }
  public io.kubernetes.client.openapi.models.V2beta2ResourceMetricStatusFluent.CurrentNested<A> withNewCurrentLike(io.kubernetes.client.openapi.models.V2beta2MetricValueStatus item) {
    return new io.kubernetes.client.openapi.models.V2beta2ResourceMetricStatusFluentImpl.CurrentNestedImpl(item);
  }
  public io.kubernetes.client.openapi.models.V2beta2ResourceMetricStatusFluent.CurrentNested<A> editCurrent() {
    return withNewCurrentLike(getCurrent());
  }
  public io.kubernetes.client.openapi.models.V2beta2ResourceMetricStatusFluent.CurrentNested<A> editOrNewCurrent() {
    return withNewCurrentLike(getCurrent() != null ? getCurrent(): new io.kubernetes.client.openapi.models.V2beta2MetricValueStatusBuilder().build());
  }
  public io.kubernetes.client.openapi.models.V2beta2ResourceMetricStatusFluent.CurrentNested<A> editOrNewCurrentLike(io.kubernetes.client.openapi.models.V2beta2MetricValueStatus item) {
    return withNewCurrentLike(getCurrent() != null ? getCurrent(): item);
  }
  public java.lang.String getName() {
    return this.name;
  }
  public A withName(java.lang.String name) {
    this.name=name; return (A) this;
  }
  public java.lang.Boolean hasName() {
    return this.name != null;
  }
  
  /**
   * Method is deprecated. use withName instead.
   */
  @java.lang.Deprecated
  public A withNewName(java.lang.String original) {
    return (A)withName(new String(original));
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V2beta2ResourceMetricStatusFluentImpl that = (V2beta2ResourceMetricStatusFluentImpl) o;
    if (current != null ? !current.equals(that.current) :that.current != null) return false;
    if (name != null ? !name.equals(that.name) :that.name != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(current,  name,  super.hashCode());
  }
  public class CurrentNestedImpl<N> extends io.kubernetes.client.openapi.models.V2beta2MetricValueStatusFluentImpl<io.kubernetes.client.openapi.models.V2beta2ResourceMetricStatusFluent.CurrentNested<N>> implements io.kubernetes.client.openapi.models.V2beta2ResourceMetricStatusFluent.CurrentNested<N>,io.kubernetes.client.fluent.Nested<N>{
    CurrentNestedImpl(io.kubernetes.client.openapi.models.V2beta2MetricValueStatus item) {
      this.builder = new io.kubernetes.client.openapi.models.V2beta2MetricValueStatusBuilder(this, item);
    }
    CurrentNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V2beta2MetricValueStatusBuilder(this);
    }
    io.kubernetes.client.openapi.models.V2beta2MetricValueStatusBuilder builder;
    public N and() {
      return (N) V2beta2ResourceMetricStatusFluentImpl.this.withCurrent(builder.build());
    }
    public N endCurrent() {
      return and();
    }
    
  }
  
}