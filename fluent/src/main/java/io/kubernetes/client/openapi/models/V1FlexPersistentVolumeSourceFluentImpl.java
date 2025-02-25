package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.util.LinkedHashMap;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Map;

 /**
  * Generated
  */
public class V1FlexPersistentVolumeSourceFluentImpl<A extends io.kubernetes.client.openapi.models.V1FlexPersistentVolumeSourceFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1FlexPersistentVolumeSourceFluent<A>{
  public V1FlexPersistentVolumeSourceFluentImpl() {
  }
  public V1FlexPersistentVolumeSourceFluentImpl(io.kubernetes.client.openapi.models.V1FlexPersistentVolumeSource instance) {
    this.withDriver(instance.getDriver());

    this.withFsType(instance.getFsType());

    this.withOptions(instance.getOptions());

    this.withReadOnly(instance.getReadOnly());

    this.withSecretRef(instance.getSecretRef());

  }
  private java.lang.String driver;
  private java.lang.String fsType;
  private java.util.Map<java.lang.String,java.lang.String> options;
  private java.lang.Boolean readOnly;
  private io.kubernetes.client.openapi.models.V1SecretReferenceBuilder secretRef;
  public java.lang.String getDriver() {
    return this.driver;
  }
  public A withDriver(java.lang.String driver) {
    this.driver=driver; return (A) this;
  }
  public java.lang.Boolean hasDriver() {
    return this.driver != null;
  }
  
  /**
   * Method is deprecated. use withDriver instead.
   */
  @java.lang.Deprecated
  public A withNewDriver(java.lang.String original) {
    return (A)withDriver(new String(original));
  }
  public java.lang.String getFsType() {
    return this.fsType;
  }
  public A withFsType(java.lang.String fsType) {
    this.fsType=fsType; return (A) this;
  }
  public java.lang.Boolean hasFsType() {
    return this.fsType != null;
  }
  
  /**
   * Method is deprecated. use withFsType instead.
   */
  @java.lang.Deprecated
  public A withNewFsType(java.lang.String original) {
    return (A)withFsType(new String(original));
  }
  public A addToOptions(java.lang.String key,java.lang.String value) {
    if(this.options == null && key != null && value != null) { this.options = new java.util.LinkedHashMap(); }
    if(key != null && value != null) {this.options.put(key, value);} return (A)this;
  }
  public A addToOptions(java.util.Map<java.lang.String,java.lang.String> map) {
    if(this.options == null && map != null) { this.options = new java.util.LinkedHashMap(); }
    if(map != null) { this.options.putAll(map);} return (A)this;
  }
  public A removeFromOptions(java.lang.String key) {
    if(this.options == null) { return (A) this; }
    if(key != null && this.options != null) {this.options.remove(key);} return (A)this;
  }
  public A removeFromOptions(java.util.Map<java.lang.String,java.lang.String> map) {
    if(this.options == null) { return (A) this; }
    if(map != null) { for(Object key : map.keySet()) {if (this.options != null){this.options.remove(key);}}} return (A)this;
  }
  public java.util.Map<java.lang.String,java.lang.String> getOptions() {
    return this.options;
  }
  public <K,V>A withOptions(java.util.Map<java.lang.String,java.lang.String> options) {
    if (options == null) { this.options =  null;} else {this.options = new java.util.LinkedHashMap(options);} return (A) this;
  }
  public java.lang.Boolean hasOptions() {
    return this.options != null;
  }
  public java.lang.Boolean getReadOnly() {
    return this.readOnly;
  }
  public A withReadOnly(java.lang.Boolean readOnly) {
    this.readOnly=readOnly; return (A) this;
  }
  public java.lang.Boolean hasReadOnly() {
    return this.readOnly != null;
  }
  
  /**
   * This method has been deprecated, please use method buildSecretRef instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1SecretReference getSecretRef() {
    return this.secretRef!=null ?this.secretRef.build():null;
  }
  public io.kubernetes.client.openapi.models.V1SecretReference buildSecretRef() {
    return this.secretRef!=null ?this.secretRef.build():null;
  }
  public A withSecretRef(io.kubernetes.client.openapi.models.V1SecretReference secretRef) {
    _visitables.get("secretRef").remove(this.secretRef);
    if (secretRef!=null){ this.secretRef= new io.kubernetes.client.openapi.models.V1SecretReferenceBuilder(secretRef); _visitables.get("secretRef").add(this.secretRef);} return (A) this;
  }
  public java.lang.Boolean hasSecretRef() {
    return this.secretRef != null;
  }
  public io.kubernetes.client.openapi.models.V1FlexPersistentVolumeSourceFluent.SecretRefNested<A> withNewSecretRef() {
    return new io.kubernetes.client.openapi.models.V1FlexPersistentVolumeSourceFluentImpl.SecretRefNestedImpl();
  }
  public io.kubernetes.client.openapi.models.V1FlexPersistentVolumeSourceFluent.SecretRefNested<A> withNewSecretRefLike(io.kubernetes.client.openapi.models.V1SecretReference item) {
    return new io.kubernetes.client.openapi.models.V1FlexPersistentVolumeSourceFluentImpl.SecretRefNestedImpl(item);
  }
  public io.kubernetes.client.openapi.models.V1FlexPersistentVolumeSourceFluent.SecretRefNested<A> editSecretRef() {
    return withNewSecretRefLike(getSecretRef());
  }
  public io.kubernetes.client.openapi.models.V1FlexPersistentVolumeSourceFluent.SecretRefNested<A> editOrNewSecretRef() {
    return withNewSecretRefLike(getSecretRef() != null ? getSecretRef(): new io.kubernetes.client.openapi.models.V1SecretReferenceBuilder().build());
  }
  public io.kubernetes.client.openapi.models.V1FlexPersistentVolumeSourceFluent.SecretRefNested<A> editOrNewSecretRefLike(io.kubernetes.client.openapi.models.V1SecretReference item) {
    return withNewSecretRefLike(getSecretRef() != null ? getSecretRef(): item);
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1FlexPersistentVolumeSourceFluentImpl that = (V1FlexPersistentVolumeSourceFluentImpl) o;
    if (driver != null ? !driver.equals(that.driver) :that.driver != null) return false;
    if (fsType != null ? !fsType.equals(that.fsType) :that.fsType != null) return false;
    if (options != null ? !options.equals(that.options) :that.options != null) return false;
    if (readOnly != null ? !readOnly.equals(that.readOnly) :that.readOnly != null) return false;
    if (secretRef != null ? !secretRef.equals(that.secretRef) :that.secretRef != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(driver,  fsType,  options,  readOnly,  secretRef,  super.hashCode());
  }
  public class SecretRefNestedImpl<N> extends io.kubernetes.client.openapi.models.V1SecretReferenceFluentImpl<io.kubernetes.client.openapi.models.V1FlexPersistentVolumeSourceFluent.SecretRefNested<N>> implements io.kubernetes.client.openapi.models.V1FlexPersistentVolumeSourceFluent.SecretRefNested<N>,io.kubernetes.client.fluent.Nested<N>{
    SecretRefNestedImpl(io.kubernetes.client.openapi.models.V1SecretReference item) {
      this.builder = new io.kubernetes.client.openapi.models.V1SecretReferenceBuilder(this, item);
    }
    SecretRefNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1SecretReferenceBuilder(this);
    }
    io.kubernetes.client.openapi.models.V1SecretReferenceBuilder builder;
    public N and() {
      return (N) V1FlexPersistentVolumeSourceFluentImpl.this.withSecretRef(builder.build());
    }
    public N endSecretRef() {
      return and();
    }
    
  }
  
}