package com.kenshi.showhidenavigation.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.kenshi.showhidenavigation.R
import com.kenshi.showhidenavigation.databinding.ActivityMainBinding
import com.kenshi.showhidenavigation.navigation.KeepStateNavigator

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        //initNavigation()

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment

        val navController = navHostFragment.navController

        // KeepStateNavigator navController 에 추가
        val navigator = KeepStateNavigator(
            this,
            navHostFragment.childFragmentManager,
            R.id.nav_host_fragment
        )
        navController.navigatorProvider.addNavigator(navigator)

        // navigation graph 세팅
        navController.setGraph(R.navigation.nav_graph)

        // 바텀 네비게이션 뷰와 navController 연결
        binding.bottomNavigationView.setupWithNavController(navController)

    }

//    private fun initNavigation() {
//        val navHostFragment =
//            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
//
//        val navController = navHostFragment.navController
//
//        // KeepStateNavigator navController 에 추가
//        val navigator = KeepStateNavigator(
//            this,
//            navHostFragment.childFragmentManager,
//            R.id.nav_host_fragment
//        )
//        navController.navigatorProvider.addNavigator(navigator)
//
//        // navigation graph 세팅
//        navController.setGraph(R.navigation.nav_graph)
//
//        // 바텀 네비게이션 뷰와 navController 연결
//        binding.bottomNavigationView.setupWithNavController(navController)
//    }
}