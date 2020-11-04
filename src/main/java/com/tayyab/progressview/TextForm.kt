@file:Suppress("unused")

package com.ontech.progressview

import android.content.Context
import android.graphics.Typeface
import androidx.annotation.ColorInt
import androidx.annotation.Px
import androidx.core.content.ContextCompat

@DslMarker
annotation class TextFormDsl

/** creates an instance of [TextForm] from [TextForm.Builder] using kotlin dsl. */
fun textForm(context: Context, block: TextForm.Builder.() -> Unit): TextForm =
  TextForm.Builder(context).apply(block).build()

/**
 * TextFrom is an attribute class what has some attributes about TextView
 * for customizing popup texts easily.
 */
class TextForm(builder: Builder) {

  val text = builder.text
  @Px
  val textSize = builder.textSize
  @ColorInt
  val textColor = builder.textColor
  val textStyle = builder.textTypeface
  val textStyleObject = builder.textTypefaceObject

  /** Builder class for [TextForm]. */
  @TextFormDsl
  class Builder(context: Context) {
    @JvmField
    var text: String? = ""
    @JvmField @Px
    var textSize: Float = 12f
    @JvmField @ColorInt
    var textColor = ContextCompat.getColor(context, R.color.white)
    @JvmField
    var textTypeface = Typeface.NORMAL
    @JvmField
    var textTypefaceObject: Typeface? = null

    fun setText(value: String): Builder = apply { this.text = value }
    fun setTextSize(@Px value: Float): Builder = apply { this.textSize = value }
    fun setTextColor(@ColorInt value: Int): Builder = apply { this.textColor = value }
    fun setTextTypeface(value: Int): Builder = apply { this.textTypeface = value }
    fun setTextTypeface(value: Typeface): Builder = apply { this.textTypefaceObject = value }
    fun build(): TextForm {
      return TextForm(this)
    }
  }
}
