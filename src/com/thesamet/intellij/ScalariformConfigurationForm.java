package com.thesamet.intellij;

import javax.swing.*;

/**
 * Created by nadavsr on 5/31/14.
 */
public class ScalariformConfigurationForm {
    private JCheckBox alignParametersCheckBox;
    private JCheckBox alignArgumentsCheckBox;
    private JCheckBox alignSingleLineCaseCheckBox;
    private JCheckBox compactControlReadabilityCheckBox;
    private JCheckBox compactStringConcatenationCheckBox;
    private JCheckBox doubleIndentClassDeclarationCheckBox;
    private JCheckBox formatXMLCheckBox;
    private JCheckBox indentPackageBlocksCheckBox;
    private JCheckBox indentWithTabsCheckBox;
    private JCheckBox multilineScalaDocCommentsStartCheckBox;
    private JCheckBox placeScalaDocAsterisksBeneathCheckBox;
    private JCheckBox preserveSpaceBeforeArgumentsCheckBox;
    private JCheckBox rewriteArrowSymbolsCheckBox;
    private JCheckBox spaceBeforeColonCheckBox;
    private JCheckBox spaceInsideParenthesisCheckBox;
    private JCheckBox spacesWithinPatternBindersCheckBox;
    private JPanel rootComponent;
    private JCheckBox indentLocalDefsCheckBox;
    private JCheckBox spaceInsideBracketsCheckBox;
    private JTextField indentSpaces;
    private JTextField maxArrowIndent;
    private JCheckBox spacesAroundMultiImportsCheckBox;
    private JCheckBox autoFormatOnSaveCheckBox;

    public JPanel getRootComponent() {
        return rootComponent;
    }

    public void setData(ScalariformApplicationComponent data) {
        alignParametersCheckBox.setSelected(data.isAlignParameters());
        alignArgumentsCheckBox.setSelected(data.isAlignArguments());
        alignSingleLineCaseCheckBox.setSelected(data.isAlignSingleLineCase());
        compactControlReadabilityCheckBox.setSelected(data.isCompactControlReadability());
        compactStringConcatenationCheckBox.setSelected(data.isCompactStringConcatenation());
        doubleIndentClassDeclarationCheckBox.setSelected(data.isDoubleIndentClassDeclaration());
        formatXMLCheckBox.setSelected(data.isFormatXML());
        indentPackageBlocksCheckBox.setSelected(data.isIndentPackageBlocks());
        indentWithTabsCheckBox.setSelected(data.isIndentWithTabs());
        multilineScalaDocCommentsStartCheckBox.setSelected(data.isMultilineScalaDocCommentsStartOnFirstLine());
        placeScalaDocAsterisksBeneathCheckBox.setSelected(data.isPlaceScalaDocAsteriskBeneathSecondAsterisk());
        preserveSpaceBeforeArgumentsCheckBox.setSelected(data.isPreserveSpaceBeforeArguments());
        rewriteArrowSymbolsCheckBox.setSelected(data.isRewriteArrowSymbols());
        spaceBeforeColonCheckBox.setSelected(data.isSpaceBeforeColon());
        spaceInsideParenthesisCheckBox.setSelected(data.isSpaceInsideParenthesis());
        spacesWithinPatternBindersCheckBox.setSelected(data.isSpacesWithinPatternBinders());
        indentSpaces.setText(data.getIndentSpaces().toString());
        maxArrowIndent.setText(data.getAlignSingleLineCaseStatementsMaxArrowIndent().toString());
        indentLocalDefsCheckBox.setSelected(data.isIndentLocalDefs());
        spaceInsideBracketsCheckBox.setSelected(data.isSpaceInsideBrackets());
        spacesAroundMultiImportsCheckBox.setSelected(data.isSpacesAroundMultiImports());
        autoFormatOnSaveCheckBox.setSelected(data.isAutoFormatOnSave());
    }

    public void getData(ScalariformApplicationComponent data) {
        data.setAlignParameters(alignParametersCheckBox.isSelected());
        data.setAlignArguments(alignArgumentsCheckBox.isSelected());
        data.setAlignSingleLineCase(alignSingleLineCaseCheckBox.isSelected());
        data.setCompactControlReadability(compactControlReadabilityCheckBox.isSelected());
        data.setCompactStringConcatenation(compactStringConcatenationCheckBox.isSelected());
        data.setDoubleIndentClassDeclaration(doubleIndentClassDeclarationCheckBox.isSelected());
        data.setFormatXML(formatXMLCheckBox.isSelected());
        data.setIndentPackageBlocks(indentPackageBlocksCheckBox.isSelected());
        data.setIndentWithTabs(indentWithTabsCheckBox.isSelected());
        data.setMultilineScalaDocCommentsStartOnFirstLine(multilineScalaDocCommentsStartCheckBox.isSelected());
        data.setPlaceScalaDocAsteriskBeneathSecondAsterisk(placeScalaDocAsterisksBeneathCheckBox.isSelected());
        data.setPreserveSpaceBeforeArguments(preserveSpaceBeforeArgumentsCheckBox.isSelected());
        data.setRewriteArrowSymbols(rewriteArrowSymbolsCheckBox.isSelected());
        data.setSpaceBeforeColon(spaceBeforeColonCheckBox.isSelected());
        data.setSpaceInsideParenthesis(spaceInsideParenthesisCheckBox.isSelected());
        data.setSpacesWithinPatternBinders(spacesWithinPatternBindersCheckBox.isSelected());
        try {
            data.setIndentSpaces(Integer.parseInt(indentSpaces.getText()));
        } catch (NumberFormatException e) {
        }
        try {
            data.setAlignSingleLineCaseStatementsMaxArrowIndent(Integer.parseInt(maxArrowIndent.getText()));
        } catch (NumberFormatException e) {
        }
        data.setIndentLocalDefs(indentLocalDefsCheckBox.isSelected());
        data.setSpaceInsideBrackets(spaceInsideBracketsCheckBox.isSelected());
        data.setSpacesAroundMultiImports(spacesAroundMultiImportsCheckBox.isSelected());
        data.setAutoFormatOnSave(autoFormatOnSaveCheckBox.isSelected());
    }

    public boolean isModified(ScalariformApplicationComponent data) {
        if (alignParametersCheckBox.isSelected() != data.isAlignParameters()) return true;
        if (alignArgumentsCheckBox.isSelected() != data.isAlignArguments()) return true;
        if (alignSingleLineCaseCheckBox.isSelected() != data.isAlignSingleLineCase()) return true;
        if (compactControlReadabilityCheckBox.isSelected() != data.isCompactControlReadability()) return true;
        if (compactStringConcatenationCheckBox.isSelected() != data.isCompactStringConcatenation()) return true;
        if (doubleIndentClassDeclarationCheckBox.isSelected() != data.isDoubleIndentClassDeclaration()) return true;
        if (formatXMLCheckBox.isSelected() != data.isFormatXML()) return true;
        if (indentPackageBlocksCheckBox.isSelected() != data.isIndentPackageBlocks()) return true;
        if (indentWithTabsCheckBox.isSelected() != data.isIndentWithTabs()) return true;
        if (multilineScalaDocCommentsStartCheckBox.isSelected() != data.isMultilineScalaDocCommentsStartOnFirstLine())
            return true;
        if (placeScalaDocAsterisksBeneathCheckBox.isSelected() != data.isPlaceScalaDocAsteriskBeneathSecondAsterisk())
            return true;
        if (preserveSpaceBeforeArgumentsCheckBox.isSelected() != data.isPreserveSpaceBeforeArguments()) return true;
        if (rewriteArrowSymbolsCheckBox.isSelected() != data.isRewriteArrowSymbols()) return true;
        if (spaceBeforeColonCheckBox.isSelected() != data.isSpaceBeforeColon()) return true;
        if (spaceInsideParenthesisCheckBox.isSelected() != data.isSpaceInsideParenthesis()) return true;
        if (spacesWithinPatternBindersCheckBox.isSelected() != data.isSpacesWithinPatternBinders()) return true;
        if (indentSpaces.getText() != null ?
                !indentSpaces.getText().equals(data.getIndentSpaces().toString()) : data.getIndentSpaces() != null)
            return true;
        if (maxArrowIndent.getText() != null ?
                !maxArrowIndent.getText().equals(data.getAlignSingleLineCaseStatementsMaxArrowIndent().toString()) :
                data.getAlignSingleLineCaseStatementsMaxArrowIndent() != null)
            return true;
        if (indentLocalDefsCheckBox.isSelected() != data.isIndentLocalDefs()) return true;
        if (spaceInsideBracketsCheckBox.isSelected() != data.isSpaceInsideBrackets()) return true;
        if (spacesAroundMultiImportsCheckBox.isSelected() != data.isSpacesAroundMultiImports()) return true;
        if (autoFormatOnSaveCheckBox.isSelected() != data.isAutoFormatOnSave()) return true;
        return false;
    }
}
