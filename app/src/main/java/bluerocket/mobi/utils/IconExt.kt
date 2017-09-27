package bluerocket.mobi.utils

import android.graphics.drawable.Drawable
import com.mikepenz.iconics.IconicsDrawable
import com.mikepenz.iconics.typeface.IIcon
import bluerocket.mobi.ListApplication

/**
 * Created by air on 15/10/16.
 */

fun IIcon.colorOf(color: Int): Drawable {
  return IconicsDrawable(ListApplication.appContext, this).sizeDp(18).color(color)
}

fun IIcon.colorResOf(color: Int): Drawable {
  return IconicsDrawable(ListApplication.appContext, this).sizeDp(18).colorRes(color)
}

