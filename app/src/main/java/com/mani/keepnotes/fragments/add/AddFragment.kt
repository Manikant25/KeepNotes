package com.mani.keepnotes.fragments.add

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import com.mani.keepnotes.R
import com.mani.keepnotes.databinding.FragmentAddBinding
import com.mani.keepnotes.databinding.FragmentListBinding

class AddFragment : Fragment() {
    lateinit var binding: FragmentAddBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        // Set Menu

        binding = FragmentAddBinding.inflate(inflater, container, false)
        setHasOptionsMenu(true)
        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.add_fragment_menu, menu)
    }

}