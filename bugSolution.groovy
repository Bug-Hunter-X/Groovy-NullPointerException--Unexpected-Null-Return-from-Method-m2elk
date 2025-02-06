```groovy
def myMethod(param) {
  if (param == null) {
    return [] // Return an empty list instead of null
  }
  // ... rest of the method
  return param
}

println myMethod(null) //Output: []
println myMethod([:]) //Output: [:]
println myMethod(null as String) //Output: []
```