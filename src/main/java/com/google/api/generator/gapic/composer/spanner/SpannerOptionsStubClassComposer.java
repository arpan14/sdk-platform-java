package com.google.api.generator.gapic.composer.spanner;

import com.google.api.generator.engine.ast.ClassDefinition;
import com.google.api.generator.engine.ast.MethodDefinition;
import com.google.api.generator.engine.ast.MethodInvocationExpr;
import com.google.api.generator.engine.ast.ReturnExpr;
import com.google.api.generator.engine.ast.ScopeNode;
import com.google.api.generator.engine.ast.TypeNode;
import com.google.api.generator.engine.ast.Variable;
import com.google.api.generator.engine.ast.VariableExpr;
import com.google.api.generator.gapic.model.GapicClass;
import com.google.common.collect.ImmutableList;

/**
 * Generate an Option class which represents an Option parameter in the GRPC request.
 *
 * public final class Options implements Serializable {
 *    // generate marker interfaces
 *    public interface ReadAndQueryOption extends ReadOption, QueryOption {}
 *
 *    // public methods to initialise and get
 *    public static DataBoostQueryOption dataBoostEnabled(Boolean dataBoostEnabled) {
 *     return new DataBoostQueryOption(dataBoostEnabled);
 *   }
 *
 *    static final class DataBoostQueryOption extends InternalOption implements ReadAndQueryOption {
 *     private final Boolean dataBoostEnabled;
 *
 *     DataBoostQueryOption(Boolean dataBoostEnabled) {
 *       this.dataBoostEnabled = dataBoostEnabled;
 *     }
 *
 *     @Override
 *     void appendToOptions(Options options) {
 *       options.dataBoostEnabled = dataBoostEnabled;
 *     }
 *   }
 *
 *   // member variable
 *   private Boolean dataBoostEnabled;
 *
 *   // has method
 *   boolean hasDataBoostEnabled() {
 *     return dataBoostEnabled != null;
 *   }
 *
 *   // getter method
 *   Boolean dataBoostEnabled() {
 *     return dataBoostEnabled;
 *   }
 * }
 *
 */
public class SpannerOptionsStubClassComposer {


  public static GapicClass createOptionsClass() {
    Variable variable = Variable.builder()
        .setName("word")
        .setType(TypeNode.STRING)
        .build();

    ReturnExpr returnExpr = ReturnExpr.withExpr(MethodInvocationExpr.builder()
        .setExprReferenceExpr(VariableExpr.withVariable(variable))
        .setMethodName("length")
        .setReturnType(TypeNode.INT)
        .build());

    MethodDefinition methodDefinition = MethodDefinition.builder()
        .setScope(ScopeNode.PUBLIC)
        .setIsStatic(true)
        .setReturnType(TypeNode.INT)
        .setName("length")
        //String word
        .setArguments(
            ImmutableList.of(VariableExpr.builder().setVariable(variable).setIsDecl(true).build()))
        .setReturnExpr(returnExpr)
        .build();

    ClassDefinition classDef =
        ClassDefinition.builder()
            .setPackageString(pakkage)
            .setAnnotations(createClassAnnotations(typeStore))
            .setScope(ScopeNode.PUBLIC)
            .setName(className)
            .setImplementsTypes(createClassImplements(typeStore))
            .setStatements(createFieldDeclarations(service, typeStore))
            .setMethods(createClassMethods(service, typeStore))
            .build();
    return GapicClass.create(kind, classDef);

  }

}
