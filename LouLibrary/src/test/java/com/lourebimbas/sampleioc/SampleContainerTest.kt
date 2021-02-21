package com.lourebimbas.sampleioc

import org.junit.Test

import org.junit.Assert.*

class ExampleUnitTest {
    @Test
    fun sample_container_says_hi_to_other_obect() {
        val ben = TestObject("Ben")
        val lou = TestObject("Lou")

        assert(lou.sayHi(ben) == SampleContainer.affirmative_response)

    }

    @Test
    fun sample_container_says_hi_to_its_own_object(){
        val lou = TestObject("Lou")
        val lou2 = lou

        assert(lou.sayHi(lou2) == SampleContainer.negative_response)
    }

    @Test
    fun sample_container_fail_to_say_hi(){
        val lou = TestObject("Lou")
        val lou2 = lou

        assertFalse(lou.sayHi(lou2) == SampleContainer.affirmative_response)
    }
    data class TestObject(val name : String) : SampleContainer<TestObject>
}