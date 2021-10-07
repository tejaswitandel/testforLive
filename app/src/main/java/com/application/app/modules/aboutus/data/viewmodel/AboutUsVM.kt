package com.application.app.modules.aboutus.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.aboutus.`data`.model.AboutUsModel

public class AboutUsVM : ViewModel() {
  public val aboutUsModel: MutableLiveData<AboutUsModel> = MutableLiveData(AboutUsModel())
}
