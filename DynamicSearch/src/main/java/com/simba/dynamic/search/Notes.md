# Links:
- https://blog.piinalpin.com/2022/04/searching-and-filtering-using-jpa-specification/

## JPA Criteria API
### Criteria Builder:
Criteria builder is used to build criteria queries, expressions, predicates, etc. It helps us create different parts of the query.

### Criteria Query:
It describes what we want to do in a query and also defines the type of row in the result. It is used to define the overall structure of the query.

### Predicates:
They represent a boolean expression that evaluates to either true or false; It is used to define conditions or filters on queries.

### Root:
It represents the root entity in the query. It serves as the starting point for building the queries and allows you to access the attributes and associations of the entity you're querying.

## JPA Criteria API clauses:
- `Select` clause: This determines the result type of the query and specifies which attributes or expressions should be included in the query result.
- `Where` clause: This defines the filtering conditions for the query.
- `Equality` predicate: This creates an equality comparison between two expressions.
- `And` predicate: This is used to combine multiple predicates, and it creates a predicate that evaluates to true if all the specified predicates are true.
- `In` predicate: It is used to create an inclusion condition. It checks if an expression or value is contained in a specified list of values.