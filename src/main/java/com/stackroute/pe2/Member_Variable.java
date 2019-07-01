package com.stackroute.pe2;

public class Member_Variable {
    Member member;

    public String Display (String name, int age, double salary) {
        member = new Member(name,age,salary);
        String output;
        output = "Member's Name: "+member.getName();
        output += "\nMember's Age: "+member.getAge();
        output += "\nMember's Salary: "+member.getSalary();
        return output;
    }
}
