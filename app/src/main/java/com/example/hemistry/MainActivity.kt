package com.example.hemistry

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.example.hemistry.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initViews()
    }

    private fun initViews() {
        val navController = findNavController(R.id.fragment)
        val appBatConfiguration = AppBarConfiguration(
            setOf(
                R.id.tableListFragment,
                R.id.testFragment,
                R.id.settingsFragment
            ),
        )

        binding.toolbar.setupWithNavController(navController, appBatConfiguration)
        binding.bottomNavigation.setupWithNavController(
            navController
        )

        navController.addOnDestinationChangedListener { _, destination, _ ->
//            if (destination.id == R.id.detailsFragment) {
//                binding.bottomNavigation.isVisible = false
//            } else {
//                binding.bottomNavigation.isVisible = true
//            }
            binding.bottomNavigation.isVisible = destination.id != R.id.detailsFragment
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}