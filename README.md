# SampleIOC

To implement the library please enter the following into your project's (Top Level) build.gradle

```
maven { url "https://jitpack.io" }

```

In your module level build.gradle enter the following into the dependencies section:

```

dependencies {
    implementation 'com.github.dotproduct:SampleIOC:1.0.1'
}

```

The above will insert the dependency to your project.

To use the library, implement it in the following manner

Implement the interface onto a class in your project
```
data class TestModel(val name : String) : SampleContainer<TestModel>
```

Can be used in the following manner
```
val ben = TestModel("Ben")
val lou = TestModel("Lou")

Log.i("SAYHI","SAY - 1: ${lou.sayHi(ben)}")
Log.i("SAYHI","SAY - 2: ${ben.sayHi(ben)}")

```

Now you're ready to have your code say Hi. 