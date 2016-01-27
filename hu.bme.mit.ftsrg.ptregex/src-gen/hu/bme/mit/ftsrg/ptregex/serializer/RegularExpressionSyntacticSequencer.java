/*
 * generated by Xtext
 */
package hu.bme.mit.ftsrg.ptregex.serializer;

import com.google.inject.Inject;
import hu.bme.mit.ftsrg.ptregex.services.RegularExpressionGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class RegularExpressionSyntacticSequencer extends AbstractSyntacticSequencer {

	protected RegularExpressionGrammarAccess grammarAccess;
	protected AbstractElementAlias match_ParenExpression_LeftParenthesisKeyword_0_0_a;
	protected AbstractElementAlias match_ParenExpression_LeftParenthesisKeyword_0_0_p;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (RegularExpressionGrammarAccess) access;
		match_ParenExpression_LeftParenthesisKeyword_0_0_a = new TokenAlias(true, true, grammarAccess.getParenExpressionAccess().getLeftParenthesisKeyword_0_0());
		match_ParenExpression_LeftParenthesisKeyword_0_0_p = new TokenAlias(true, false, grammarAccess.getParenExpressionAccess().getLeftParenthesisKeyword_0_0());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_ParenExpression_LeftParenthesisKeyword_0_0_a.equals(syntax))
				emit_ParenExpression_LeftParenthesisKeyword_0_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ParenExpression_LeftParenthesisKeyword_0_0_p.equals(syntax))
				emit_ParenExpression_LeftParenthesisKeyword_0_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     '('*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) '(' 'S' '\' excludes+=Event
	 *     (rule start) (ambiguity) '<' body=Expression
	 *     (rule start) (ambiguity) 'S' (rule start)
	 *     (rule start) (ambiguity) functor=[Functor|ID]
	 *     (rule start) (ambiguity) {Cardinality.body=}
	 *     (rule start) (ambiguity) {Choice.elements+=}
	 *     (rule start) (ambiguity) {Plus.body=}
	 *     (rule start) (ambiguity) {Sequence.elements+=}
	 *     (rule start) (ambiguity) {Star.body=}
	 */
	protected void emit_ParenExpression_LeftParenthesisKeyword_0_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '('+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) {Cardinality.body=}
	 *     (rule start) (ambiguity) {Choice.elements+=}
	 *     (rule start) (ambiguity) {Plus.body=}
	 *     (rule start) (ambiguity) {Sequence.elements+=}
	 *     (rule start) (ambiguity) {Star.body=}
	 */
	protected void emit_ParenExpression_LeftParenthesisKeyword_0_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
