package com.example.c4q.practicalexam;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

/*
Please create a new Android Studio Project, with a single empty activity, called “LoopActivity”.
 Initialize a local repository for this project.
Create a single TextView Widget at the middle of the screen. Its text size should be 20sp.
Add the files to the local repository. Commit the project with the message “initial commit”.
Create a GitHub remote repository, then copy the link. Go back to the terminal,
and set the remote repository to the one you created on GitHub, and push to that remote repository.

add a private class that inherits from AsyncTask<Integer, Integer, Integer> -
 and has these four methods: onPreExecute(), doInBackground(Integer[] value),
 onProgressUpdate(Integer… progress), and onPostExecute(Integer result).
 
In doInBackground(), write a loop that starts at the value passed into the AsyncTask after running execute(0), 
and ends at 100,000. For every loop, run publishProcess().

In onProgressUpdate(), set the text of the text view to “Loops completed: “, 
followed by the number received from doInBackground().

In onPostExecute(), set the text of the text view “Loops completed: “, 
followed by the number received from the return in doInBackground().
 Then create an intent to a new activity called “LoginActivity”.


*/

public class LoopActivity extends AppCompatActivity {

    private TextView loopText;
    private String TAG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loop);

        loopText = findViewById(R.id.loop_text);

    }
    private class LoopNumbers extends AsyncTask<Integer, Integer, Integer>{

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        @Override
        protected void onProgressUpdate(Integer... values) {
            super.onProgressUpdate(values);
        }

        @Override
        protected void onPostExecute(Integer integer) {
            super.onPostExecute(integer);

        }

        @Override
        protected Integer doInBackground(Integer... integers) {

                int count = 0;
            for (int i = 0 ; i <= 1000000; i++) {
                    count = i;
                publishProgress(i);
                
            }
            return count;

        }
    }
}
