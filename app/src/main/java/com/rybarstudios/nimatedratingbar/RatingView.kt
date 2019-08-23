package com.rybarstudios.nimatedratingbar

import android.content.Context
import android.util.AttributeSet
import android.widget.LinearLayout
import kotlin.collections.ArrayList

private const val INITIAL_RATING = 3
private const val MAX_RATING = 5

class RatingView(context: Context?, attrs: AttributeSet?) : LinearLayout(context, attrs) {

    val ratingSymbols = ArrayList<Int>(MAX_RATING)

    init {



        for (i in ratingSymbols) {
            ratingSymbols.add(R.drawable.avd_empty_to_filled_star)
        }

    }
}