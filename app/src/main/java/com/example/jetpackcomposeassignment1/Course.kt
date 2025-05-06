package com.example.jetpackcomposeassignment1

data class Course(
    val title: String,
    val code: String,
    val creditHours: Int,
    val description: String,
    val prerequisites: String
)

object SampleData {
    val courseList = listOf(
        Course(
            "Introduction to Programming",
            "CS101",
            3,
            "Learn the basics of programming using Kotlin.",
            "None"
        ),
        Course(
            "Data Structures",
            "CS202",
            4,
            "Study common data structures like arrays, linked lists, trees, and graphs.",
            "CS101"
        ),
        Course(
            "Databases",
            "CS301",
            3,
            "Introduction to relational databases and SQL.",
            "CS202"
        ),
        Course(
            "Operating Systems",
            "CS303",
            3,
            "Covers concepts of process management, memory, and file systems in operating systems.",
            "CS202"
        ),
        Course(
            "Computer Networks",
            "CS304",
            3,
            "Understand the fundamentals of networking, including protocols, TCP/IP, and routing.",
            "CS202"
        ),
        Course(
            "Web Development",
            "CS305",
            3,
            "Covers HTML, CSS, JavaScript, and building dynamic websites.",
            "CS101"
        ),
        Course(
            "Mobile App Development",
            "CS306",
            4,
            "Build native Android applications using Kotlin and Jetpack Compose.",
            "CS305"
        ),
        Course(
            "Software Engineering",
            "CS307",
            3,
            "Learn about the software development life cycle, agile methods, and testing.",
            "CS202"
        ),
        Course(
            "Machine Learning",
            "CS401",
            4,
            "Introduction to machine learning concepts, models, and applications.",
            "CS202"
        ),
        Course(
            "Capstone Project",
            "CS499",
            3,
            "Team-based project applying all knowledge from previous courses.",
            "Completion of 100+ credits"
        )
    )
}
