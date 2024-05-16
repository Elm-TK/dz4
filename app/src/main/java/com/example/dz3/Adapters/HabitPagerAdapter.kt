package com.example.dz3.adapters

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.dz3.fragments.ListHabitFragment
import com.example.dz3.models.HabitType

class HabitPagerAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {

    override fun getItemCount(): Int = 2

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> ListHabitFragment.newInstance(1, HabitType.GOOD)
            1 -> ListHabitFragment.newInstance(1, HabitType.BAD)
            else -> throw IllegalArgumentException("Invalid position: $position")
        }
    }
}
