# Java Map Interface

The `Map` interface in Java is used to store data in **key-value pairs**.

Unlike `List` and `Set`, `Map` is **not part of the Collection interface hierarchy**, although it belongs to the Java Collections Framework.

---

## Key Characteristics

- Stores elements as `(key, value)` pairs
- Keys are **unique**
- A key can map to **only one value**
- Duplicate keys are not allowed
- Values can be duplicated
- Lookup by key is fast in many implementations

Example:

```java
101 -> "Karan"
102 -> "Rahul"
103 -> "Aman"
```

---

## Why `Map` Cannot Be Instantiated?

`Map` is an **interface**, and interfaces cannot be instantiated directly.

❌ Wrong:

```java
Map<Integer, String> studentMap = new Map<>();
```

This causes a compilation error:

```java
Cannot instantiate the type Map
```

✅ Correct:

```java
Map<Integer, String> studentMap = new HashMap<>();
```

We create objects of classes that implement `Map`.

---

## Common Map Implementations

### 1. HashMap

```java
Map<Integer,String> map = new HashMap<>();
```

Features:

- Stores data using hashing
- Does not maintain insertion order
- Allows one `null` key
- Allows multiple `null` values
- Fast operations: O(1) average

Related classes:

- LinkedHashMap
- WeakHashMap
- IdentityHashMap

---

### 2. LinkedHashMap

```java
Map<Integer,String> map = new LinkedHashMap<>();
```

Features:

- Maintains insertion order
- Internally uses hash table + linked list

---

### 3. Hashtable (Legacy)

```java
Map<Integer,String> map = new Hashtable<>();
```

Features:

- Thread-safe
- Synchronized
- Does not allow null key/value
- Legacy class

---

### 4. TreeMap

Hierarchy:

```text
SortedMap
   ↓
NavigableMap
   ↓
TreeMap
```

Example:

```java
Map<Integer,String> map = new TreeMap<>();
```

Features:

- Stores keys in sorted order
- Uses Red-Black Tree internally
- Time complexity: O(log n)

---

### 5. ConcurrentHashMap

Hierarchy:

```text
ConcurrentMap
      ↓
ConcurrentHashMap
```

Features:

- Thread-safe
- Better performance than Hashtable
- Used in concurrent applications

---

## Interface Hierarchy

```text
Map
├── HashMap
│     ├── LinkedHashMap
│     ├── WeakHashMap
│     └── IdentityHashMap
│
├── Hashtable
│
├── SortedMap
│      └── TreeMap
│
└── ConcurrentMap
       └── ConcurrentHashMap
              └── ConcurrentSkipListMap
```

---

## Example Program

```java
import java.util.HashMap;
import java.util.Map;

public class MapDemo {

    public static void main(String[] args) {

        Map<Integer, String> studentMap = new HashMap<>();

        studentMap.put(101, "Karan");
        studentMap.put(102, "Rahul");
        studentMap.put(103, "Aman");

        System.out.println(studentMap);

        System.out.println(studentMap.get(101));

    }
}
```

Output:

```text
{101=Karan, 102=Rahul, 103=Aman}

Karan
```

---

## Best Practice

Program to interfaces, not implementations:

```java
Map<Integer,String> map = new HashMap<>();
```

Instead of:

```java
HashMap<Integer,String> map = new HashMap<>();
```

Reason:
Changing implementation later becomes easier.

Example:

```java
Map<Integer,String> map = new TreeMap<>();
```

No code changes required elsewhere.

---

## Time Complexities

| Operation | HashMap | TreeMap  |
| --------- | ------- | -------- |
| put()     | O(1)    | O(log n) |
| get()     | O(1)    | O(log n) |
| remove()  | O(1)    | O(log n) |

---

## Summary

- `Map` stores key-value pairs
- Duplicate keys are not allowed
- `Map` is an interface
- Interfaces cannot be instantiated
- `HashMap` is the most commonly used implementation
- `TreeMap` maintains sorting
- `ConcurrentHashMap` supports concurrency
