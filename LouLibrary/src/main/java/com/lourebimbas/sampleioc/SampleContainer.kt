package com.lourebimbas.sampleioc

interface SampleContainer<T> {

    companion object {
        const val affirmative_response = "Hi!"
        const val negative_response = "You are Me!"
    }

    fun sayHi(t : T) : String {
        return if(t != this) {
                affirmative_response
            } else {
                negative_response
            }
    }
}