package com.example.jetpackcomposeassignment1

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun CourseListScreen(courses: List<Course>) {
    LazyColumn {
        items(courses) { course ->
            CourseCard(course = course)
        }
    }
}
