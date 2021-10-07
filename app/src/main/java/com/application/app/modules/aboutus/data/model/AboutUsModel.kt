package com.application.app.modules.aboutus.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class AboutUsModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtAboutUs: String? = MyApp.getInstance().resources.getString(R.string.lbl_about_us)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtLoremIpsum: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_lorem_ipsum)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtLoremIpsumDol: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_dol)

)
