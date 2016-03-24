package hu.bme.mit.inf.safetylogic.patterns.util;

import org.eclipse.incquery.runtime.api.IMatchProcessor;

import hu.bme.mit.inf.safetylogic.model.railroadmodel.Train;
import hu.bme.mit.inf.safetylogic.patterns.TrainIsGoingToHitMatch;

/**
 * A match processor tailored for the hu.bme.mit.inf.safetylogic.patterns.trainIsGoingToHit pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class TrainIsGoingToHitProcessor implements IMatchProcessor<TrainIsGoingToHitMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pT1 the value of pattern parameter t1 in the currently processed match
   * @param pT2 the value of pattern parameter t2 in the currently processed match
   * 
   */
  public abstract void process(final Train pT1, final Train pT2);
  
  @Override
  public void process(final TrainIsGoingToHitMatch match) {
    process(match.getT1(), match.getT2());
  }
}