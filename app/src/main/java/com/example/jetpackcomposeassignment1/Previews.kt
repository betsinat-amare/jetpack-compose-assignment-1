package com.example.jetpackcomposeassignment1

import android.content.res.Configuration
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.jetpackcomposeassignment1.ui.theme.JetpackComposeAssignment1Theme

@Preview(showBackground = true)
@Composable
fun LightPreview() {
    JetpackComposeAssignment1Theme {
        CourseListScreen(SampleData.courseList)
    }
}

@Preview(
    showBackground = true,
    uiMode = Configuration.UI_MODE_NIGHT_YES,
    name = "Dark Mode"
)
@Composable
fun DarkPreview() {
    JetpackComposeAssignment1Theme(darkTheme = true) {
        CourseListScreen(SampleData.courseList)
    }
}
@Preview(showBackground = true)
@Composable
fun WelcomeScreenPreview() {
    JetpackComposeAssignment1Theme {
        WelcomeScreen(navController = rememberNavController())
    }
}
