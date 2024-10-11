package com.example.tech_craft

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CodeSnippetsAdapter( private val snippets: List<CodeSnippets>) :
        RecyclerView.Adapter<CodeSnippetsAdapter.CodeSnippetsViewHolder>() {

    class CodeSnippetsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        //Initialize the views
        val snippetCode: TextView = itemView.findViewById(R.id.snippetCode)
        val snippetTitle: TextView = itemView.findViewById(R.id.snippetTitle)
        val snippetLanguage: TextView = itemView.findViewById(R.id.snippetLanguage)

    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CodeSnippetsViewHolder {
        //Inflate the view layout
        val view = LayoutInflater.from(parent.context).inflate(R.layout.snippet_item, parent, false)
        return CodeSnippetsViewHolder(view)
    }

    override fun onBindViewHolder(
        holder: CodeSnippetsViewHolder,
        position: Int
    ) {
        //Bind the data to the views

        val snippet = snippets[position]

        // Since 'code' is an Int, we convert it to String for displaying in the TextView
        holder.snippetCode.text = snippet.code.toString()

        // Bind the 'title' instead of 'description'
        holder.snippetTitle.text = snippet.title

        // Bind the 'language' property
        holder.snippetLanguage.text = snippet.language

    }

    override fun getItemCount(): Int {
      return  snippets.size //Return  the last size
    }


}