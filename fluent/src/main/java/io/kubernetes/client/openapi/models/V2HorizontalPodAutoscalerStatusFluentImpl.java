package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.util.function.Predicate;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Iterator;
import java.util.List;
import java.lang.Boolean;
import java.lang.Integer;
import java.time.OffsetDateTime;
import java.lang.Long;
import java.util.Collection;
import java.lang.Object;

 /**
  * Generated
  */
public class V2HorizontalPodAutoscalerStatusFluentImpl<A extends io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerStatusFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerStatusFluent<A>{
  public V2HorizontalPodAutoscalerStatusFluentImpl() {
  }
  public V2HorizontalPodAutoscalerStatusFluentImpl(io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerStatus instance) {
    this.withConditions(instance.getConditions());

    this.withCurrentMetrics(instance.getCurrentMetrics());

    this.withCurrentReplicas(instance.getCurrentReplicas());

    this.withDesiredReplicas(instance.getDesiredReplicas());

    this.withLastScaleTime(instance.getLastScaleTime());

    this.withObservedGeneration(instance.getObservedGeneration());

  }
  private java.util.ArrayList<io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerConditionBuilder> conditions;
  private java.util.ArrayList<io.kubernetes.client.openapi.models.V2MetricStatusBuilder> currentMetrics;
  private java.lang.Integer currentReplicas;
  private java.lang.Integer desiredReplicas;
  private java.time.OffsetDateTime lastScaleTime;
  private java.lang.Long observedGeneration;
  public A addToConditions(java.lang.Integer index,io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerCondition item) {
    if (this.conditions == null) {this.conditions = new java.util.ArrayList<io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerConditionBuilder>();}
    io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerConditionBuilder builder = new io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerConditionBuilder(item);_visitables.get("conditions").add(index >= 0 ? index : _visitables.get("conditions").size(), builder);this.conditions.add(index >= 0 ? index : conditions.size(), builder); return (A)this;
  }
  public A setToConditions(java.lang.Integer index,io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerCondition item) {
    if (this.conditions == null) {this.conditions = new java.util.ArrayList<io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerConditionBuilder>();}
    io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerConditionBuilder builder = new io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerConditionBuilder(item);
    if (index < 0 || index >= _visitables.get("conditions").size()) { _visitables.get("conditions").add(builder); } else { _visitables.get("conditions").set(index, builder);}
    if (index < 0 || index >= conditions.size()) { conditions.add(builder); } else { conditions.set(index, builder);}
     return (A)this;
  }
  public A addToConditions(io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerCondition... items) {
    if (this.conditions == null) {this.conditions = new java.util.ArrayList<io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerConditionBuilder>();}
    for (io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerCondition item : items) {io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerConditionBuilder builder = new io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerConditionBuilder(item);_visitables.get("conditions").add(builder);this.conditions.add(builder);} return (A)this;
  }
  public A addAllToConditions(java.util.Collection<io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerCondition> items) {
    if (this.conditions == null) {this.conditions = new java.util.ArrayList<io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerConditionBuilder>();}
    for (io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerCondition item : items) {io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerConditionBuilder builder = new io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerConditionBuilder(item);_visitables.get("conditions").add(builder);this.conditions.add(builder);} return (A)this;
  }
  public A removeFromConditions(io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerCondition... items) {
    for (io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerCondition item : items) {io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerConditionBuilder builder = new io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerConditionBuilder(item);_visitables.get("conditions").remove(builder);if (this.conditions != null) {this.conditions.remove(builder);}} return (A)this;
  }
  public A removeAllFromConditions(java.util.Collection<io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerCondition> items) {
    for (io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerCondition item : items) {io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerConditionBuilder builder = new io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerConditionBuilder(item);_visitables.get("conditions").remove(builder);if (this.conditions != null) {this.conditions.remove(builder);}} return (A)this;
  }
  public A removeMatchingFromConditions(java.util.function.Predicate<io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerConditionBuilder> predicate) {
    if (conditions == null) return (A) this;
    final Iterator<io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerConditionBuilder> each = conditions.iterator();
    final List visitables = _visitables.get("conditions");
    while (each.hasNext()) {
      io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerConditionBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  /**
   * This method has been deprecated, please use method buildConditions instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerCondition> getConditions() {
    return conditions != null ? build(conditions) : null;
  }
  public java.util.List<io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerCondition> buildConditions() {
    return conditions != null ? build(conditions) : null;
  }
  public io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerCondition buildCondition(java.lang.Integer index) {
    return this.conditions.get(index).build();
  }
  public io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerCondition buildFirstCondition() {
    return this.conditions.get(0).build();
  }
  public io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerCondition buildLastCondition() {
    return this.conditions.get(conditions.size() - 1).build();
  }
  public io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerCondition buildMatchingCondition(java.util.function.Predicate<io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerConditionBuilder> predicate) {
    for (io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerConditionBuilder item: conditions) { if(predicate.test(item)){ return item.build();} } return null;
  }
  public java.lang.Boolean hasMatchingCondition(java.util.function.Predicate<io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerConditionBuilder> predicate) {
    for (io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerConditionBuilder item: conditions) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withConditions(java.util.List<io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerCondition> conditions) {
    if (this.conditions != null) { _visitables.get("conditions").removeAll(this.conditions);}
    if (conditions != null) {this.conditions = new java.util.ArrayList(); for (io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerCondition item : conditions){this.addToConditions(item);}} else { this.conditions = null;} return (A) this;
  }
  public A withConditions(io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerCondition... conditions) {
    if (this.conditions != null) {this.conditions.clear();}
    if (conditions != null) {for (io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerCondition item :conditions){ this.addToConditions(item);}} return (A) this;
  }
  public java.lang.Boolean hasConditions() {
    return conditions != null && !conditions.isEmpty();
  }
  public io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerStatusFluent.ConditionsNested<A> addNewCondition() {
    return new io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerStatusFluentImpl.ConditionsNestedImpl();
  }
  public io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerStatusFluent.ConditionsNested<A> addNewConditionLike(io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerCondition item) {
    return new io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerStatusFluentImpl.ConditionsNestedImpl(-1, item);
  }
  public io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerStatusFluent.ConditionsNested<A> setNewConditionLike(java.lang.Integer index,io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerCondition item) {
    return new io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerStatusFluentImpl.ConditionsNestedImpl(index, item);
  }
  public io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerStatusFluent.ConditionsNested<A> editCondition(java.lang.Integer index) {
    if (conditions.size() <= index) throw new RuntimeException("Can't edit conditions. Index exceeds size.");
    return setNewConditionLike(index, buildCondition(index));
  }
  public io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerStatusFluent.ConditionsNested<A> editFirstCondition() {
    if (conditions.size() == 0) throw new RuntimeException("Can't edit first conditions. The list is empty.");
    return setNewConditionLike(0, buildCondition(0));
  }
  public io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerStatusFluent.ConditionsNested<A> editLastCondition() {
    int index = conditions.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last conditions. The list is empty.");
    return setNewConditionLike(index, buildCondition(index));
  }
  public io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerStatusFluent.ConditionsNested<A> editMatchingCondition(java.util.function.Predicate<io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerConditionBuilder> predicate) {
    int index = -1;
    for (int i=0;i<conditions.size();i++) { 
    if (predicate.test(conditions.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching conditions. No match found.");
    return setNewConditionLike(index, buildCondition(index));
  }
  public A addToCurrentMetrics(java.lang.Integer index,io.kubernetes.client.openapi.models.V2MetricStatus item) {
    if (this.currentMetrics == null) {this.currentMetrics = new java.util.ArrayList<io.kubernetes.client.openapi.models.V2MetricStatusBuilder>();}
    io.kubernetes.client.openapi.models.V2MetricStatusBuilder builder = new io.kubernetes.client.openapi.models.V2MetricStatusBuilder(item);_visitables.get("currentMetrics").add(index >= 0 ? index : _visitables.get("currentMetrics").size(), builder);this.currentMetrics.add(index >= 0 ? index : currentMetrics.size(), builder); return (A)this;
  }
  public A setToCurrentMetrics(java.lang.Integer index,io.kubernetes.client.openapi.models.V2MetricStatus item) {
    if (this.currentMetrics == null) {this.currentMetrics = new java.util.ArrayList<io.kubernetes.client.openapi.models.V2MetricStatusBuilder>();}
    io.kubernetes.client.openapi.models.V2MetricStatusBuilder builder = new io.kubernetes.client.openapi.models.V2MetricStatusBuilder(item);
    if (index < 0 || index >= _visitables.get("currentMetrics").size()) { _visitables.get("currentMetrics").add(builder); } else { _visitables.get("currentMetrics").set(index, builder);}
    if (index < 0 || index >= currentMetrics.size()) { currentMetrics.add(builder); } else { currentMetrics.set(index, builder);}
     return (A)this;
  }
  public A addToCurrentMetrics(io.kubernetes.client.openapi.models.V2MetricStatus... items) {
    if (this.currentMetrics == null) {this.currentMetrics = new java.util.ArrayList<io.kubernetes.client.openapi.models.V2MetricStatusBuilder>();}
    for (io.kubernetes.client.openapi.models.V2MetricStatus item : items) {io.kubernetes.client.openapi.models.V2MetricStatusBuilder builder = new io.kubernetes.client.openapi.models.V2MetricStatusBuilder(item);_visitables.get("currentMetrics").add(builder);this.currentMetrics.add(builder);} return (A)this;
  }
  public A addAllToCurrentMetrics(java.util.Collection<io.kubernetes.client.openapi.models.V2MetricStatus> items) {
    if (this.currentMetrics == null) {this.currentMetrics = new java.util.ArrayList<io.kubernetes.client.openapi.models.V2MetricStatusBuilder>();}
    for (io.kubernetes.client.openapi.models.V2MetricStatus item : items) {io.kubernetes.client.openapi.models.V2MetricStatusBuilder builder = new io.kubernetes.client.openapi.models.V2MetricStatusBuilder(item);_visitables.get("currentMetrics").add(builder);this.currentMetrics.add(builder);} return (A)this;
  }
  public A removeFromCurrentMetrics(io.kubernetes.client.openapi.models.V2MetricStatus... items) {
    for (io.kubernetes.client.openapi.models.V2MetricStatus item : items) {io.kubernetes.client.openapi.models.V2MetricStatusBuilder builder = new io.kubernetes.client.openapi.models.V2MetricStatusBuilder(item);_visitables.get("currentMetrics").remove(builder);if (this.currentMetrics != null) {this.currentMetrics.remove(builder);}} return (A)this;
  }
  public A removeAllFromCurrentMetrics(java.util.Collection<io.kubernetes.client.openapi.models.V2MetricStatus> items) {
    for (io.kubernetes.client.openapi.models.V2MetricStatus item : items) {io.kubernetes.client.openapi.models.V2MetricStatusBuilder builder = new io.kubernetes.client.openapi.models.V2MetricStatusBuilder(item);_visitables.get("currentMetrics").remove(builder);if (this.currentMetrics != null) {this.currentMetrics.remove(builder);}} return (A)this;
  }
  public A removeMatchingFromCurrentMetrics(java.util.function.Predicate<io.kubernetes.client.openapi.models.V2MetricStatusBuilder> predicate) {
    if (currentMetrics == null) return (A) this;
    final Iterator<io.kubernetes.client.openapi.models.V2MetricStatusBuilder> each = currentMetrics.iterator();
    final List visitables = _visitables.get("currentMetrics");
    while (each.hasNext()) {
      io.kubernetes.client.openapi.models.V2MetricStatusBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  /**
   * This method has been deprecated, please use method buildCurrentMetrics instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V2MetricStatus> getCurrentMetrics() {
    return currentMetrics != null ? build(currentMetrics) : null;
  }
  public java.util.List<io.kubernetes.client.openapi.models.V2MetricStatus> buildCurrentMetrics() {
    return currentMetrics != null ? build(currentMetrics) : null;
  }
  public io.kubernetes.client.openapi.models.V2MetricStatus buildCurrentMetric(java.lang.Integer index) {
    return this.currentMetrics.get(index).build();
  }
  public io.kubernetes.client.openapi.models.V2MetricStatus buildFirstCurrentMetric() {
    return this.currentMetrics.get(0).build();
  }
  public io.kubernetes.client.openapi.models.V2MetricStatus buildLastCurrentMetric() {
    return this.currentMetrics.get(currentMetrics.size() - 1).build();
  }
  public io.kubernetes.client.openapi.models.V2MetricStatus buildMatchingCurrentMetric(java.util.function.Predicate<io.kubernetes.client.openapi.models.V2MetricStatusBuilder> predicate) {
    for (io.kubernetes.client.openapi.models.V2MetricStatusBuilder item: currentMetrics) { if(predicate.test(item)){ return item.build();} } return null;
  }
  public java.lang.Boolean hasMatchingCurrentMetric(java.util.function.Predicate<io.kubernetes.client.openapi.models.V2MetricStatusBuilder> predicate) {
    for (io.kubernetes.client.openapi.models.V2MetricStatusBuilder item: currentMetrics) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withCurrentMetrics(java.util.List<io.kubernetes.client.openapi.models.V2MetricStatus> currentMetrics) {
    if (this.currentMetrics != null) { _visitables.get("currentMetrics").removeAll(this.currentMetrics);}
    if (currentMetrics != null) {this.currentMetrics = new java.util.ArrayList(); for (io.kubernetes.client.openapi.models.V2MetricStatus item : currentMetrics){this.addToCurrentMetrics(item);}} else { this.currentMetrics = null;} return (A) this;
  }
  public A withCurrentMetrics(io.kubernetes.client.openapi.models.V2MetricStatus... currentMetrics) {
    if (this.currentMetrics != null) {this.currentMetrics.clear();}
    if (currentMetrics != null) {for (io.kubernetes.client.openapi.models.V2MetricStatus item :currentMetrics){ this.addToCurrentMetrics(item);}} return (A) this;
  }
  public java.lang.Boolean hasCurrentMetrics() {
    return currentMetrics != null && !currentMetrics.isEmpty();
  }
  public io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerStatusFluent.CurrentMetricsNested<A> addNewCurrentMetric() {
    return new io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerStatusFluentImpl.CurrentMetricsNestedImpl();
  }
  public io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerStatusFluent.CurrentMetricsNested<A> addNewCurrentMetricLike(io.kubernetes.client.openapi.models.V2MetricStatus item) {
    return new io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerStatusFluentImpl.CurrentMetricsNestedImpl(-1, item);
  }
  public io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerStatusFluent.CurrentMetricsNested<A> setNewCurrentMetricLike(java.lang.Integer index,io.kubernetes.client.openapi.models.V2MetricStatus item) {
    return new io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerStatusFluentImpl.CurrentMetricsNestedImpl(index, item);
  }
  public io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerStatusFluent.CurrentMetricsNested<A> editCurrentMetric(java.lang.Integer index) {
    if (currentMetrics.size() <= index) throw new RuntimeException("Can't edit currentMetrics. Index exceeds size.");
    return setNewCurrentMetricLike(index, buildCurrentMetric(index));
  }
  public io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerStatusFluent.CurrentMetricsNested<A> editFirstCurrentMetric() {
    if (currentMetrics.size() == 0) throw new RuntimeException("Can't edit first currentMetrics. The list is empty.");
    return setNewCurrentMetricLike(0, buildCurrentMetric(0));
  }
  public io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerStatusFluent.CurrentMetricsNested<A> editLastCurrentMetric() {
    int index = currentMetrics.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last currentMetrics. The list is empty.");
    return setNewCurrentMetricLike(index, buildCurrentMetric(index));
  }
  public io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerStatusFluent.CurrentMetricsNested<A> editMatchingCurrentMetric(java.util.function.Predicate<io.kubernetes.client.openapi.models.V2MetricStatusBuilder> predicate) {
    int index = -1;
    for (int i=0;i<currentMetrics.size();i++) { 
    if (predicate.test(currentMetrics.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching currentMetrics. No match found.");
    return setNewCurrentMetricLike(index, buildCurrentMetric(index));
  }
  public java.lang.Integer getCurrentReplicas() {
    return this.currentReplicas;
  }
  public A withCurrentReplicas(java.lang.Integer currentReplicas) {
    this.currentReplicas=currentReplicas; return (A) this;
  }
  public java.lang.Boolean hasCurrentReplicas() {
    return this.currentReplicas != null;
  }
  public java.lang.Integer getDesiredReplicas() {
    return this.desiredReplicas;
  }
  public A withDesiredReplicas(java.lang.Integer desiredReplicas) {
    this.desiredReplicas=desiredReplicas; return (A) this;
  }
  public java.lang.Boolean hasDesiredReplicas() {
    return this.desiredReplicas != null;
  }
  public java.time.OffsetDateTime getLastScaleTime() {
    return this.lastScaleTime;
  }
  public A withLastScaleTime(java.time.OffsetDateTime lastScaleTime) {
    this.lastScaleTime=lastScaleTime; return (A) this;
  }
  public java.lang.Boolean hasLastScaleTime() {
    return this.lastScaleTime != null;
  }
  public java.lang.Long getObservedGeneration() {
    return this.observedGeneration;
  }
  public A withObservedGeneration(java.lang.Long observedGeneration) {
    this.observedGeneration=observedGeneration; return (A) this;
  }
  public java.lang.Boolean hasObservedGeneration() {
    return this.observedGeneration != null;
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V2HorizontalPodAutoscalerStatusFluentImpl that = (V2HorizontalPodAutoscalerStatusFluentImpl) o;
    if (conditions != null ? !conditions.equals(that.conditions) :that.conditions != null) return false;
    if (currentMetrics != null ? !currentMetrics.equals(that.currentMetrics) :that.currentMetrics != null) return false;
    if (currentReplicas != null ? !currentReplicas.equals(that.currentReplicas) :that.currentReplicas != null) return false;
    if (desiredReplicas != null ? !desiredReplicas.equals(that.desiredReplicas) :that.desiredReplicas != null) return false;
    if (lastScaleTime != null ? !lastScaleTime.equals(that.lastScaleTime) :that.lastScaleTime != null) return false;
    if (observedGeneration != null ? !observedGeneration.equals(that.observedGeneration) :that.observedGeneration != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(conditions,  currentMetrics,  currentReplicas,  desiredReplicas,  lastScaleTime,  observedGeneration,  super.hashCode());
  }
  public class ConditionsNestedImpl<N> extends io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerConditionFluentImpl<io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerStatusFluent.ConditionsNested<N>> implements io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerStatusFluent.ConditionsNested<N>,io.kubernetes.client.fluent.Nested<N>{
    ConditionsNestedImpl(java.lang.Integer index,io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerCondition item) {
      this.index = index;
      this.builder = new io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerConditionBuilder(this, item);
    }
    ConditionsNestedImpl() {
      this.index = -1;
      this.builder = new io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerConditionBuilder(this);
    }
    io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerConditionBuilder builder;
    java.lang.Integer index;
    public N and() {
      return (N) V2HorizontalPodAutoscalerStatusFluentImpl.this.setToConditions(index,builder.build());
    }
    public N endCondition() {
      return and();
    }
    
  }
  public class CurrentMetricsNestedImpl<N> extends io.kubernetes.client.openapi.models.V2MetricStatusFluentImpl<io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerStatusFluent.CurrentMetricsNested<N>> implements io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerStatusFluent.CurrentMetricsNested<N>,io.kubernetes.client.fluent.Nested<N>{
    CurrentMetricsNestedImpl(java.lang.Integer index,io.kubernetes.client.openapi.models.V2MetricStatus item) {
      this.index = index;
      this.builder = new io.kubernetes.client.openapi.models.V2MetricStatusBuilder(this, item);
    }
    CurrentMetricsNestedImpl() {
      this.index = -1;
      this.builder = new io.kubernetes.client.openapi.models.V2MetricStatusBuilder(this);
    }
    io.kubernetes.client.openapi.models.V2MetricStatusBuilder builder;
    java.lang.Integer index;
    public N and() {
      return (N) V2HorizontalPodAutoscalerStatusFluentImpl.this.setToCurrentMetrics(index,builder.build());
    }
    public N endCurrentMetric() {
      return and();
    }
    
  }
  
}