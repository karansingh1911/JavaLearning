Reactive Programming:
Declarative programming paradigm concerned with data streams and the propagation of change.

Benefit
With this paradigm, it's possible to express static(e.g., arrays) or dynamic (e.g. event emitters) data streams with ease, and also communicate that an inferred dependency with the associated execution model exists, which facilitates the automatic propagation of the changed flow.

Traditional Use cases:
User events: When user clicks a button, when I/O response happens
Biggest issue with traditional approach: idling thread

Why would we need that?
In modern application development we work with high 1.data scale, 2.high usage scale, 3.there are cloud based costing involved.
So, technically if we do one small improvement/efficiency =1000s \* efficiency(due to scaling), this is the costing that we will be saving.Often the trend is horizontal scaling, since the vertical scaling has its limits/ceiling. So we do want to optimize the code
-> costs -> performance(impacts UX), wasted hardware, we pay for sequential blocking operations and we pay for the idling threads

Even while making sync. calls async. using the CompletableFuture still there are problems: we have to do .join() which will be sort of blocking,
So there are still issues like: 1. Too much for devs to do 2. Error handling is messy 3. It's still sync after all 4. We need a new paradigm -> We need framework to support it

What's different in Reactive programming then? 1. Much simpler than manual concurrent way 2. Few reusable flexible functions 3. Combine and reuse in powerful ways

So the definition of reactive programming is: Declarative code to build asynchronous processing pipelines. It requires us to :

1. Think about different way of flow 2. Different way of thinking about data 3. Integrated with Java ->" There is a Flow interface(java 9 ) -> Looks familiar to collections+ streams

Java Stream Refreshment:
Streams in java represent sequence of data, where we focus mainly on the computations vs the collections which focus on storage + internal iteration

Stream operators: map, filter, reduce, flatmap,findFirst and ...
