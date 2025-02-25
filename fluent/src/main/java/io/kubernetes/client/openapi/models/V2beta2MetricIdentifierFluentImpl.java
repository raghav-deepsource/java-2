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
public class V2beta2MetricIdentifierFluentImpl<A extends io.kubernetes.client.openapi.models.V2beta2MetricIdentifierFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V2beta2MetricIdentifierFluent<A>{
  public V2beta2MetricIdentifierFluentImpl() {
  }
  public V2beta2MetricIdentifierFluentImpl(io.kubernetes.client.openapi.models.V2beta2MetricIdentifier instance) {
    this.withName(instance.getName());

    this.withSelector(instance.getSelector());

  }
  private java.lang.String name;
  private io.kubernetes.client.openapi.models.V1LabelSelectorBuilder selector;
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
  
  /**
   * This method has been deprecated, please use method buildSelector instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1LabelSelector getSelector() {
    return this.selector!=null ?this.selector.build():null;
  }
  public io.kubernetes.client.openapi.models.V1LabelSelector buildSelector() {
    return this.selector!=null ?this.selector.build():null;
  }
  public A withSelector(io.kubernetes.client.openapi.models.V1LabelSelector selector) {
    _visitables.get("selector").remove(this.selector);
    if (selector!=null){ this.selector= new io.kubernetes.client.openapi.models.V1LabelSelectorBuilder(selector); _visitables.get("selector").add(this.selector);} return (A) this;
  }
  public java.lang.Boolean hasSelector() {
    return this.selector != null;
  }
  public io.kubernetes.client.openapi.models.V2beta2MetricIdentifierFluent.SelectorNested<A> withNewSelector() {
    return new io.kubernetes.client.openapi.models.V2beta2MetricIdentifierFluentImpl.SelectorNestedImpl();
  }
  public io.kubernetes.client.openapi.models.V2beta2MetricIdentifierFluent.SelectorNested<A> withNewSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item) {
    return new io.kubernetes.client.openapi.models.V2beta2MetricIdentifierFluentImpl.SelectorNestedImpl(item);
  }
  public io.kubernetes.client.openapi.models.V2beta2MetricIdentifierFluent.SelectorNested<A> editSelector() {
    return withNewSelectorLike(getSelector());
  }
  public io.kubernetes.client.openapi.models.V2beta2MetricIdentifierFluent.SelectorNested<A> editOrNewSelector() {
    return withNewSelectorLike(getSelector() != null ? getSelector(): new io.kubernetes.client.openapi.models.V1LabelSelectorBuilder().build());
  }
  public io.kubernetes.client.openapi.models.V2beta2MetricIdentifierFluent.SelectorNested<A> editOrNewSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item) {
    return withNewSelectorLike(getSelector() != null ? getSelector(): item);
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V2beta2MetricIdentifierFluentImpl that = (V2beta2MetricIdentifierFluentImpl) o;
    if (name != null ? !name.equals(that.name) :that.name != null) return false;
    if (selector != null ? !selector.equals(that.selector) :that.selector != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(name,  selector,  super.hashCode());
  }
  public class SelectorNestedImpl<N> extends io.kubernetes.client.openapi.models.V1LabelSelectorFluentImpl<io.kubernetes.client.openapi.models.V2beta2MetricIdentifierFluent.SelectorNested<N>> implements io.kubernetes.client.openapi.models.V2beta2MetricIdentifierFluent.SelectorNested<N>,io.kubernetes.client.fluent.Nested<N>{
    SelectorNestedImpl(io.kubernetes.client.openapi.models.V1LabelSelector item) {
      this.builder = new io.kubernetes.client.openapi.models.V1LabelSelectorBuilder(this, item);
    }
    SelectorNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1LabelSelectorBuilder(this);
    }
    io.kubernetes.client.openapi.models.V1LabelSelectorBuilder builder;
    public N and() {
      return (N) V2beta2MetricIdentifierFluentImpl.this.withSelector(builder.build());
    }
    public N endSelector() {
      return and();
    }
    
  }
  
}