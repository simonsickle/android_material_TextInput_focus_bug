package com.example.myapplication

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment(R.layout.fragment_first) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recyclerView = view.findViewById<RecyclerView>(R.id.rvTest)
        recyclerView.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = TestAdapter()
        }
    }

    class TestViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val etLayout: TextInputLayout = itemView.findViewById(R.id.etLayout)
        val etInput: TextInputEditText = itemView.findViewById(R.id.etInput)
    }

    class TestAdapter : RecyclerView.Adapter<TestViewHolder>() {
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TestViewHolder {
            val view =
                LayoutInflater.from(parent.context).inflate(R.layout.test_rv_item, parent, false)
            return TestViewHolder(view)
        }

        override fun onBindViewHolder(holder: TestViewHolder, position: Int) {
            holder.etInput.setOnFocusChangeListener { v, hasFocus ->
                Log.e("TestAdapter", "View at $position focused? - $hasFocus")
            }
        }

        override fun getItemCount(): Int {
            return 2
        }

    }
}