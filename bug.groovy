```groovy
def myMethod(param) {
  if (param == null) {
    return null //This line is problematic
  }
  // ... rest of the method
}

println myMethod(null) //Output: null
println myMethod([:]) //Output: [:]
println myMethod(null as String) //Output: null
```