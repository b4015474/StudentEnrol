package com.enrol

class Student {

String name

String studentID

Date dob

bool isFundingAvailable

String email

String username

String password

String course

    static constraints = 

{title blank:false, nullable:false

name blank:false, nullable:false

studentID blank:false, nullable:false

dob blank:false, nullable:false

email blank:false, nullable:false, email:true

username blank:false, nullable:false, unique:true

password blank:false, nullable:false

isFundingAvailable blank:false

course blank:false, nullable:false

}
