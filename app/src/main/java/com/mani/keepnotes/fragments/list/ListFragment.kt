package com.mani.keepnotes.fragments.list

import android.os.Bundle
import android.view.*
import androidx.appcompat.widget.SearchView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.mani.keepnotes.R
import com.mani.keepnotes.databinding.FragmentListBinding

class ListFragment : Fragment() {
lateinit var binding : FragmentListBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
//        val view =inflater.inflate(R.layout.fragment_list, container, false)
         binding = FragmentListBinding.inflate(inflater,container,false)
        binding.floatingActionButton.setOnClickListener {
            findNavController().navigate(R.id.action_listFragment_to_addFragment)
        }

        binding.root.setOnClickListener {
            findNavController().navigate(R.id.action_listFragment_to_updateFragment)
        }
        // Set Menu
        setHasOptionsMenu(true)


        return binding.root

    }
    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.list_fragment_menu, menu)
        
    }



}