package com.azizutku.here.presentation.rooms

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.azizutku.here.R

class RoomsFragment : Fragment() {

    companion object {
        fun newInstance() = RoomsFragment()
    }

    private lateinit var viewModel: RoomsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.rooms_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(RoomsViewModel::class.java)
        // TODO: Use the ViewModel
    }

}