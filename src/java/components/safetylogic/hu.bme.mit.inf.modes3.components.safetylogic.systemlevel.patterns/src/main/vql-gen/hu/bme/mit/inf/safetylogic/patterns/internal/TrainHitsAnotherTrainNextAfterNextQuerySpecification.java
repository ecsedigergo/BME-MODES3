/**
 * Generated from platform:/resource/hu.bme.mit.inf.modes3.components.safetylogic.systemlevel.patterns/src/main/java/hu/bme/mit/inf/safetylogic/patterns/SafetyPatterns.vql
 */
package hu.bme.mit.inf.safetylogic.patterns.internal;

import com.google.common.collect.Sets;
import hu.bme.mit.inf.safetylogic.patterns.util.NextSectionQuerySpecification;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFQuerySpecificationWithGenericMatcher;
import org.eclipse.viatra.query.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.emf.types.EStructuralFeatureInstancesKey;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.viatra.query.runtime.matchers.tuple.FlatTuple;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;

/**
 * A pattern-specific query specification that can instantiate GenericPatternMatcher in a type-safe way.
 * 
 * @see GenericPatternMatcher
 * @see GenericPatternMatch
 * 
 */
@SuppressWarnings("all")
public final class TrainHitsAnotherTrainNextAfterNextQuerySpecification extends BaseGeneratedEMFQuerySpecificationWithGenericMatcher {
  private TrainHitsAnotherTrainNextAfterNextQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryException if the pattern definition could not be loaded
   * 
   */
  public static TrainHitsAnotherTrainNextAfterNextQuerySpecification instance() throws ViatraQueryException {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: hu.bme.mit.inf.safetylogic.patterns.internal.TrainHitsAnotherTrainNextAfterNextQuerySpecification (visibility: PUBLIC, simpleName: TrainHitsAnotherTrainNextAfterNextQuerySpecification, identifier: hu.bme.mit.inf.safetylogic.patterns.internal.TrainHitsAnotherTrainNextAfterNextQuerySpecification, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: hu.bme.mit.inf.safetylogic.patterns.internal) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: hu.bme.mit.inf.safetylogic.patterns.internal.TrainHitsAnotherTrainNextAfterNextQuerySpecification (visibility: PUBLIC, simpleName: TrainHitsAnotherTrainNextAfterNextQuerySpecification, identifier: hu.bme.mit.inf.safetylogic.patterns.internal.TrainHitsAnotherTrainNextAfterNextQuerySpecification, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: hu.bme.mit.inf.safetylogic.patterns.internal) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static TrainHitsAnotherTrainNextAfterNextQuerySpecification INSTANCE = new TrainHitsAnotherTrainNextAfterNextQuerySpecification();
    
    /**
     * Statically initializes the query specification <b>after</b> the field {@link #INSTANCE} is assigned.
     * This initialization order is required to support indirect recursion.
     * 
     * <p> The static initializer is defined using a helper field to work around limitations of the code generator.
     * 
     */
    private final static Object STATIC_INITIALIZER = ensureInitialized();
    
    public static Object ensureInitialized() {
      INSTANCE.ensureInitializedInternalSneaky();
      return null;
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static TrainHitsAnotherTrainNextAfterNextQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pOffender = new PParameter("Offender", "hu.bme.mit.inf.modes3.components.safetylogic.systemlevel.model.RailRoadModel.Train", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://hu.bme.mit.inf.safetylogic.railroadmodel", "Train")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pVictim = new PParameter("Victim", "hu.bme.mit.inf.modes3.components.safetylogic.systemlevel.model.RailRoadModel.Train", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://hu.bme.mit.inf.safetylogic.railroadmodel", "Train")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pOffender, parameter_pVictim);
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.inf.safetylogic.patterns.trainHitsAnotherTrainNextAfterNext";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("Offender","Victim");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return parameters;
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
          {
              PBody body = new PBody(this);
              PVariable var_Offender = body.getOrCreateVariableByName("Offender");
              PVariable var_Victim = body.getOrCreateVariableByName("Victim");
              PVariable var_CurrentPosition = body.getOrCreateVariableByName("CurrentPosition");
              PVariable var_OldPosition = body.getOrCreateVariableByName("OldPosition");
              PVariable var_NextPosition = body.getOrCreateVariableByName("NextPosition");
              PVariable var_NextPositionAfterNextPosition = body.getOrCreateVariableByName("NextPositionAfterNextPosition");
              new TypeConstraint(body, Tuples.flatTupleOf(var_Offender), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hu.bme.mit.inf.safetylogic.railroadmodel", "Train")));
              new TypeConstraint(body, Tuples.flatTupleOf(var_Victim), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hu.bme.mit.inf.safetylogic.railroadmodel", "Train")));
              body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
                 new ExportedParameter(body, var_Offender, parameter_pOffender),
                 new ExportedParameter(body, var_Victim, parameter_pVictim)
              ));
              // 	Train.currentlyOn(Offender, CurrentPosition)
              new TypeConstraint(body, Tuples.flatTupleOf(var_Offender), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hu.bme.mit.inf.safetylogic.railroadmodel", "Train")));
              PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
              new TypeConstraint(body, Tuples.flatTupleOf(var_Offender, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hu.bme.mit.inf.safetylogic.railroadmodel", "Train", "currentlyOn")));
              new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hu.bme.mit.inf.safetylogic.railroadmodel", "RailRoadElement")));
              new Equality(body, var__virtual_0_, var_CurrentPosition);
              // 	Train.previouslyOn(Offender, OldPosition)
              new TypeConstraint(body, Tuples.flatTupleOf(var_Offender), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hu.bme.mit.inf.safetylogic.railroadmodel", "Train")));
              PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
              new TypeConstraint(body, Tuples.flatTupleOf(var_Offender, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hu.bme.mit.inf.safetylogic.railroadmodel", "Train", "previouslyOn")));
              new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hu.bme.mit.inf.safetylogic.railroadmodel", "RailRoadElement")));
              new Equality(body, var__virtual_1_, var_OldPosition);
              // 		find nextSection(OldPosition, CurrentPosition, NextPosition)
              new PositivePatternCall(body, new FlatTuple(var_OldPosition, var_CurrentPosition, var_NextPosition), NextSectionQuerySpecification.instance().getInternalQueryRepresentation());
              // 	find nextSection(CurrentPosition, NextPosition, NextPositionAfterNextPosition)
              new PositivePatternCall(body, new FlatTuple(var_CurrentPosition, var_NextPosition, var_NextPositionAfterNextPosition), NextSectionQuerySpecification.instance().getInternalQueryRepresentation());
              // 		Train.currentlyOn(Victim, NextPositionAfterNextPosition)
              new TypeConstraint(body, Tuples.flatTupleOf(var_Victim), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hu.bme.mit.inf.safetylogic.railroadmodel", "Train")));
              PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
              new TypeConstraint(body, Tuples.flatTupleOf(var_Victim, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hu.bme.mit.inf.safetylogic.railroadmodel", "Train", "currentlyOn")));
              new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_2_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hu.bme.mit.inf.safetylogic.railroadmodel", "RailRoadElement")));
              new Equality(body, var__virtual_2_, var_NextPositionAfterNextPosition);
              bodies.add(body);
          }
      } catch (ViatraQueryException ex) {
          throw processDependencyException(ex);
      }
      return bodies;
    }
  }
}
