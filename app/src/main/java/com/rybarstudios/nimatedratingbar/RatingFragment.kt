package com.rybarstudios.nimatedratingbar

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment

class RatingFragment : DialogFragment() {

    /*companion object {
        fun newInstance(): RatingFragment {
            return RatingFragment()
        }
    }*/

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return LayoutInflater.from(context).inflate(R.layout.display_fragment, container, false)
    }
}