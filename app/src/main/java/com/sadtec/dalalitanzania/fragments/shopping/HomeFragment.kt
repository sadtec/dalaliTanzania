package com.sadtec.dalalitanzania.fragments.shopping

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.google.android.material.tabs.TabLayoutMediator
import com.sadtec.dalalitanzania.R
import com.sadtec.dalalitanzania.adapter.HomeViewerPageAdapter
import com.sadtec.dalalitanzania.databinding.FragmentHomeBinding
import com.sadtec.dalalitanzania.fragments.categories.BeautyHealthFragment
import com.sadtec.dalalitanzania.fragments.categories.ElectronicsFragment
import com.sadtec.dalalitanzania.fragments.categories.EquipmentFragment
import com.sadtec.dalalitanzania.fragments.categories.FashionFragment
import com.sadtec.dalalitanzania.fragments.categories.HomeEquipmentFragment
import com.sadtec.dalalitanzania.fragments.categories.MainCategoriesFragment
import com.sadtec.dalalitanzania.fragments.categories.PhoneFragment
import com.sadtec.dalalitanzania.fragments.categories.RealEstateFragment
import com.sadtec.dalalitanzania.fragments.categories.ServicesFragment
import com.sadtec.dalalitanzania.fragments.categories.VehiclesFragment

class HomeFragment: Fragment(R.layout.fragment_home) {
    private lateinit var binding: FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
binding=FragmentHomeBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val categoriesFragments = arrayListOf<Fragment>(
            MainCategoriesFragment(),
            PhoneFragment(),
            ElectronicsFragment(),
            HomeEquipmentFragment(),
            RealEstateFragment(),
            VehiclesFragment(),
            FashionFragment(),
            ServicesFragment(),
            EquipmentFragment(),
            BeautyHealthFragment(),

            )
val viewPager2Adapter=HomeViewerPageAdapter(categoriesFragments,childFragmentManager,lifecycle)
        binding.viewpagerHome.adapter=viewPager2Adapter
        TabLayoutMediator(binding.tbTabLayout,binding.viewpagerHome)  {tab,position ->
            when (position) {
                0 -> tab.text = "Main"
                1 -> tab.text = "Phone"
                2 -> tab.text = "Electronics"
                3 -> tab.text = "Home tools"
                4 -> tab.text = "Real estate"
                5 -> tab.text = "Vehicle"
                6 -> tab.text = "Fashion"
                7 -> tab.text = "Equipment"
                8 -> tab.text = "Beauty&Health"
            }
        }.attach()
    }






}


