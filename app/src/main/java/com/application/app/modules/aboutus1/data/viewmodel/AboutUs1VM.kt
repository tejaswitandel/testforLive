package com.application.app.modules.aboutus1.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.aboutus1.`data`.model.AboutUs1Model

public class AboutUs1VM : ViewModel() {
  public val aboutUs1Model: MutableLiveData<AboutUs1Model> = MutableLiveData(AboutUs1Model())
}
