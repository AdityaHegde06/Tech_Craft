package com.example.tech_craft

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.amrdeveloper.codeview.CodeView
import com.anggrayudi.storage.SimpleStorageHelper
import jp.wasabeef.richeditor.RichEditor


class MainActivity(private val snippets: Int) : ComponentActivity() {

    //Declare a private  variable for and initialized later

    private lateinit var mEditor: RichEditor
    private lateinit var codeView: CodeView
    private lateinit var boldButton: Button
    private lateinit var saveButton: Button
    private lateinit var recyclerView: RecyclerView


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // Initialize the RichEditor
        mEditor = findViewById(R.id.editor)



        //Initialize  the simple storage  for file Handling
       SimpleStorageHelper(this)


        //Initialize the bold button
        boldButton = findViewById(R.id.boldButton)
        //setup  bold functionality
        boldButton.setOnClickListener {
            mEditor.setBold()//setting text to bold

            //Initialize the Code View
            codeView = findViewById(R.id.codeView)




            //Initialize  the save button
            saveButton = findViewById(R.id.saveButton)
            saveButton.setOnClickListener {
                mEditor.html
            }


            //initialize the recyclerview for displaying code snippets
            recyclerView = findViewById(R.id.recyclerView)
            recyclerView.layoutManager = LinearLayoutManager(this)


           git
            // Sample data for demonstration
            listOf(
             CodeSnippetsItem(
                 1,
                 "fun main() { println(\"Hello, World!\") }",
                 "Basic Kotlin function"
             ),
             CodeSnippetsItem(
                 2,
                 "public static void main(String[] args) { System.out.println(\"Hello, World!\"); }",
                 "Basic Java function"
             )
         )

        }

        //Set up adapter


        val codeSnippetsAdapter = snippets
        codeSnippetsAdapter.also {
            recyclerView.adapter
        }
    }



}















