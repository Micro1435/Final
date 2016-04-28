package com.example.michael.montella_final;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class WorkoutActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout);

        int workoutNum = (Integer)getIntent().getExtras().get("workoutid");
        String type = (String)getIntent().getExtras().get("workouttype");

        Workout workout;

        switch (type) {
            case "Cardio":
                workout = Workout.cardio[workoutNum];
                break;
            case "Strength":
                workout = Workout.strength[workoutNum];
                break;
            case "Flexibility":
                workout = Workout.stretching[workoutNum];
                break;
            default:
                workout = Workout.cardio[workoutNum];
        }

        TextView workoutName = (TextView) findViewById(R.id.workout_name);
        workoutName.setText(workout.getName());


    }
}
