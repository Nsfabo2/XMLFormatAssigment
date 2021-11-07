package com.example.xmlformatassigment

class Student {
    var id: Int = 0
    var name: String? = null
    var marks: Float = 0.toFloat()

    override fun toString(): String {
        return " Id = $id \n Name = $name \n Marks = $marks"
    }
}