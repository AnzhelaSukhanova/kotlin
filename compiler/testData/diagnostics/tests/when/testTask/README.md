## Test task report

Generator of junit-methods: kotlin/compiler/tests-when-test-task. The gradle-task :compiler:tests-when-test-task:generateTests runs the generator. You can use __Test task__ run configuration for this.  
Test runner: kotlin/compiler/tests-common-new/tests-gen/org/jetbrains/kotlin/test/runners/DiagnosticTestGenerated.java. You can use __DiagnosticTestGenerated__ run configuration.

### Tests that should lead to compilation errors
| Test | Problem |
|------|---------|
| EmptyWhen.kt | Empty when-body |
| IncorrectBody.kt | Incorrect syntax of when-body |
| EmptyCondition.kt | Empty condition |
| EmptyConclusion.kt | Empty conclusion |
| MissingElse.kt | The required else-condition is missing |
| AnyWhen.kt | The required else-condition is missing |
| NullWhen.kt | The required else-condition is missing |
| BooleanWhen.kt | The required else-condition is missing |
| IncorrectConditionUnion.kt | Incorrect syntax of condition union|
| NoReturnValue.kt | In when-expression conclusion doesn't return value | 
| TypeMismatchConclusion.kt | Type mismatch in the conclusion | 
| NullForNonNull.kt | Null conclusion with nonnull expected |
| ValConclusion.kt | Variable definition in the conclusion |


### Tests that should pass (with warnings in some tests)
| Test | Description | 
|------|-------------|
| NestedWhen.kt | Nested when-statement |
| EnumWhen.kt | The argument is enum type |
| SealedWhen.kt | The argument is sealed class |
| NothingWhen.kt | The argument is Nothing |
| ConstantWhen.kt | The argument is constant  |
| ConditionUnion.kt | It unites some conditions |
| UnreachableCondition.kt | It has unreachable condition |
| UnreachableSubclass.kt | It has unreachable type check |
| UnreachableRanges.kt | It has unreachable range-conditions |
| UnusedWhen.kt | When-expression with only else-condition |
| IfElseIf.kt | When-statement as an if-else if chain |
| TrueCondition.kt | One condition is always true |
| EmptyRanges.kt | It has empty range-conditions |
| ReturnWhen.kt | It has one branch with return-conclusion |
| IfConclusion.kt | It has if-then-else conclusion |
| ReadWhen.kt | It read the argument |
 
### Coverage
Coverage of all packages is collected. You can see it by opening the Coverage_SORT_BY_CLASS_DESC.html.
