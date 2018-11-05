package com.udacity.gradle.builditbigger;

import android.content.Context;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.when;

import static org.junit.Assert.*;

public class RetrieveAndShowJokesAsyncTaskTest {

    @Mock
    private Context mockApplicationContext;

RetrieveAndShowJokesAsyncTask task;
    @Before
    public void InitializeObjects(){
        task = new RetrieveAndShowJokesAsyncTask();
        MockitoAnnotations.initMocks(this);


    }

    @Test
    public void StringRetrievedByAsyncTaskIsNull(){

        assertNotNull(task.doInBackground(mockApplicationContext));
    }

}