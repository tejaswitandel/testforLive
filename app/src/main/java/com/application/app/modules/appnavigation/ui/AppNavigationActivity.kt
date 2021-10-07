package com.application.app.modules.appnavigation.ui

import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityAppNavigationBinding
import com.application.app.modules.aboutus.ui.AboutUsActivity
import com.application.app.modules.aboutus1.ui.AboutUs1Activity
import com.application.app.modules.appnavigation.`data`.viewmodel.AppNavigationVM
import kotlin.String
import kotlin.Unit

public class AppNavigationActivity :
    BaseActivity<ActivityAppNavigationBinding>(R.layout.activity_app_navigation) {
  private val viewModel: AppNavigationVM by viewModels<AppNavigationVM>()

  public override fun setUpClicks(): Unit {
    binding.linear4.setOnClickListener {

      val destIntent = AboutUs1Activity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.linear3.setOnClickListener {

      val destIntent = AboutUsActivity.getIntent(this, null)
      startActivity(destIntent)

    }
  }

  public override fun onInitialized(): Unit {
    binding.appNavigationVM = viewModel
  }

  public companion object {
    public const val TAG: String = "APP_NAVIGATION_ACTIVITY"
  }
}
