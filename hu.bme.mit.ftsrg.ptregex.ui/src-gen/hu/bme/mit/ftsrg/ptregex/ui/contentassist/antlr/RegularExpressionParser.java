/*
 * generated by Xtext
 */
package hu.bme.mit.ftsrg.ptregex.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import hu.bme.mit.ftsrg.ptregex.services.RegularExpressionGrammarAccess;

public class RegularExpressionParser extends AbstractContentAssistParser {
	
	@Inject
	private RegularExpressionGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected hu.bme.mit.ftsrg.ptregex.ui.contentassist.antlr.internal.InternalRegularExpressionParser createParser() {
		hu.bme.mit.ftsrg.ptregex.ui.contentassist.antlr.internal.InternalRegularExpressionParser result = new hu.bme.mit.ftsrg.ptregex.ui.contentassist.antlr.internal.InternalRegularExpressionParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getMultExpressionAccess().getAlternatives_1(), "rule__MultExpression__Alternatives_1");
					put(grammarAccess.getParenExpressionAccess().getAlternatives(), "rule__ParenExpression__Alternatives");
					put(grammarAccess.getParameterAccess().getAlternatives(), "rule__Parameter__Alternatives");
					put(grammarAccess.getFixParameterAccess().getAlternatives(), "rule__FixParameter__Alternatives");
					put(grammarAccess.getRegexModelAccess().getGroup(), "rule__RegexModel__Group__0");
					put(grammarAccess.getAlphabetAccess().getGroup(), "rule__Alphabet__Group__0");
					put(grammarAccess.getAlphabetAccess().getGroup_4(), "rule__Alphabet__Group_4__0");
					put(grammarAccess.getAlphabetAccess().getGroup_4_1(), "rule__Alphabet__Group_4_1__0");
					put(grammarAccess.getFunctorAccess().getGroup(), "rule__Functor__Group__0");
					put(grammarAccess.getFunctorAccess().getGroup_1(), "rule__Functor__Group_1__0");
					put(grammarAccess.getExpressionDeclarationAccess().getGroup(), "rule__ExpressionDeclaration__Group__0");
					put(grammarAccess.getExpressionDeclarationAccess().getGroup_2(), "rule__ExpressionDeclaration__Group_2__0");
					put(grammarAccess.getExpressionDeclarationAccess().getGroup_2_2(), "rule__ExpressionDeclaration__Group_2_2__0");
					put(grammarAccess.getChoiceAccess().getGroup(), "rule__Choice__Group__0");
					put(grammarAccess.getChoiceAccess().getGroup_1(), "rule__Choice__Group_1__0");
					put(grammarAccess.getChoiceAccess().getGroup_1_1(), "rule__Choice__Group_1_1__0");
					put(grammarAccess.getSequenceAccess().getGroup(), "rule__Sequence__Group__0");
					put(grammarAccess.getSequenceAccess().getGroup_1(), "rule__Sequence__Group_1__0");
					put(grammarAccess.getMultExpressionAccess().getGroup(), "rule__MultExpression__Group__0");
					put(grammarAccess.getMultExpressionAccess().getGroup_1_0(), "rule__MultExpression__Group_1_0__0");
					put(grammarAccess.getMultExpressionAccess().getGroup_1_1(), "rule__MultExpression__Group_1_1__0");
					put(grammarAccess.getMultExpressionAccess().getGroup_1_2(), "rule__MultExpression__Group_1_2__0");
					put(grammarAccess.getParenExpressionAccess().getGroup_0(), "rule__ParenExpression__Group_0__0");
					put(grammarAccess.getAnyAccess().getGroup(), "rule__Any__Group__0");
					put(grammarAccess.getInverseAccess().getGroup(), "rule__Inverse__Group__0");
					put(grammarAccess.getInverseAccess().getGroup_4(), "rule__Inverse__Group_4__0");
					put(grammarAccess.getTimedExpressionAccess().getGroup(), "rule__TimedExpression__Group__0");
					put(grammarAccess.getEventAccess().getGroup(), "rule__Event__Group__0");
					put(grammarAccess.getEventAccess().getGroup_1(), "rule__Event__Group_1__0");
					put(grammarAccess.getEventAccess().getGroup_1_2(), "rule__Event__Group_1_2__0");
					put(grammarAccess.getSingletonParameterAccess().getGroup(), "rule__SingletonParameter__Group__0");
					put(grammarAccess.getRegexModelAccess().getAlphabetAssignment_0(), "rule__RegexModel__AlphabetAssignment_0");
					put(grammarAccess.getRegexModelAccess().getDeclarationsAssignment_1(), "rule__RegexModel__DeclarationsAssignment_1");
					put(grammarAccess.getAlphabetAccess().getFunctorsAssignment_4_0(), "rule__Alphabet__FunctorsAssignment_4_0");
					put(grammarAccess.getAlphabetAccess().getFunctorsAssignment_4_1_1(), "rule__Alphabet__FunctorsAssignment_4_1_1");
					put(grammarAccess.getFunctorAccess().getNameAssignment_0(), "rule__Functor__NameAssignment_0");
					put(grammarAccess.getFunctorAccess().getArityAssignment_1_1(), "rule__Functor__ArityAssignment_1_1");
					put(grammarAccess.getExpressionDeclarationAccess().getNameAssignment_1(), "rule__ExpressionDeclaration__NameAssignment_1");
					put(grammarAccess.getExpressionDeclarationAccess().getVarsAssignment_2_1(), "rule__ExpressionDeclaration__VarsAssignment_2_1");
					put(grammarAccess.getExpressionDeclarationAccess().getVarsAssignment_2_2_1(), "rule__ExpressionDeclaration__VarsAssignment_2_2_1");
					put(grammarAccess.getExpressionDeclarationAccess().getBodyAssignment_4(), "rule__ExpressionDeclaration__BodyAssignment_4");
					put(grammarAccess.getChoiceAccess().getElementsAssignment_1_1_1(), "rule__Choice__ElementsAssignment_1_1_1");
					put(grammarAccess.getSequenceAccess().getElementsAssignment_1_1(), "rule__Sequence__ElementsAssignment_1_1");
					put(grammarAccess.getMultExpressionAccess().getNAssignment_1_2_2(), "rule__MultExpression__NAssignment_1_2_2");
					put(grammarAccess.getInverseAccess().getExcludesAssignment_3(), "rule__Inverse__ExcludesAssignment_3");
					put(grammarAccess.getInverseAccess().getExcludesAssignment_4_1(), "rule__Inverse__ExcludesAssignment_4_1");
					put(grammarAccess.getTimedExpressionAccess().getBodyAssignment_1(), "rule__TimedExpression__BodyAssignment_1");
					put(grammarAccess.getTimedExpressionAccess().getTimeoutAssignment_4(), "rule__TimedExpression__TimeoutAssignment_4");
					put(grammarAccess.getEventAccess().getFunctorAssignment_0(), "rule__Event__FunctorAssignment_0");
					put(grammarAccess.getEventAccess().getParametersAssignment_1_1(), "rule__Event__ParametersAssignment_1_1");
					put(grammarAccess.getEventAccess().getParametersAssignment_1_2_1(), "rule__Event__ParametersAssignment_1_2_1");
					put(grammarAccess.getFixIntParameterAccess().getBodyAssignment(), "rule__FixIntParameter__BodyAssignment");
					put(grammarAccess.getFixStringParameterAccess().getBodyAssignment(), "rule__FixStringParameter__BodyAssignment");
					put(grammarAccess.getVarParameterAccess().getVarAssignment(), "rule__VarParameter__VarAssignment");
					put(grammarAccess.getVarAccess().getNameAssignment(), "rule__Var__NameAssignment");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			hu.bme.mit.ftsrg.ptregex.ui.contentassist.antlr.internal.InternalRegularExpressionParser typedParser = (hu.bme.mit.ftsrg.ptregex.ui.contentassist.antlr.internal.InternalRegularExpressionParser) parser;
			typedParser.entryRuleRegexModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public RegularExpressionGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(RegularExpressionGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
