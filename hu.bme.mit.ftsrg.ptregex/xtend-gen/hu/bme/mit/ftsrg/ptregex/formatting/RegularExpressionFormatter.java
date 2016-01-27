/**
 * generated by Xtext
 */
package hu.bme.mit.ftsrg.ptregex.formatting;

import com.google.inject.Inject;
import hu.bme.mit.ftsrg.ptregex.services.RegularExpressionGrammarAccess;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter;
import org.eclipse.xtext.formatting.impl.FormattingConfig;
import org.eclipse.xtext.xbase.lib.Extension;

/**
 * This class contains custom formatting declarations.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#formatting
 * on how and when to use it.
 * 
 * Also see {@link org.eclipse.xtext.xtext.XtextFormattingTokenSerializer} as an example
 */
@SuppressWarnings("all")
public class RegularExpressionFormatter extends AbstractDeclarativeFormatter {
  @Inject
  @Extension
  private RegularExpressionGrammarAccess _regularExpressionGrammarAccess;
  
  @Override
  protected void configureFormatting(@Extension final FormattingConfig c) {
    FormattingConfig.LinewrapLocator _setLinewrap = c.setLinewrap(0, 1, 2);
    TerminalRule _sL_COMMENTRule = this._regularExpressionGrammarAccess.getSL_COMMENTRule();
    _setLinewrap.before(_sL_COMMENTRule);
    FormattingConfig.LinewrapLocator _setLinewrap_1 = c.setLinewrap(0, 1, 2);
    TerminalRule _mL_COMMENTRule = this._regularExpressionGrammarAccess.getML_COMMENTRule();
    _setLinewrap_1.before(_mL_COMMENTRule);
    FormattingConfig.LinewrapLocator _setLinewrap_2 = c.setLinewrap(0, 1, 1);
    TerminalRule _mL_COMMENTRule_1 = this._regularExpressionGrammarAccess.getML_COMMENTRule();
    _setLinewrap_2.after(_mL_COMMENTRule_1);
  }
}
