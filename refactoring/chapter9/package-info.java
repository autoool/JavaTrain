/**
 * 
 */
/**
 * @author Administrator
 * 章节九 简化条件表达式
 * Decompose Conditional （分解条件式）
 * Consolidate Conditional Expression （合并条件式）
 * Consolidate Duplicate Conditional Fragments （合并重复的条件片段）
 * Remove Control Flag　（移除控制标记）
 * Replace Nested Conditional with Guard Clauses （以卫语句取代嵌套条件式）
 * 何为卫语句？
 * 条件通常有两种呈现形式。第一种形式是：所有分支都属于正常行为。第二种形式是：条件式提供的答案中只有一种是正常行为，其他都是不常见的情况。
 * 如果两条分支都是正常行为，就应该使用形如[if...then...]的条件式；如果某个条件极其罕见，就应该单独检查该条件，并在该条件为真时立刻从函数返回。
 * 这样的单独检查常常被称为[卫语句（guard clauses）]。
 * Replace Conditional with Polymorphism （以多态取代条件式）
 * 如何实现？
 * Introduce Null Object （引入Null对象）
 * 如何实现？
 * Introduce Assertion （引入断言）
 * 
 */
package chapter9;