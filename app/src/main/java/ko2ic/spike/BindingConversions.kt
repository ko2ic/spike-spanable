package ko2ic.spike

import android.graphics.drawable.Drawable
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ImageSpan
import android.widget.TextView
import androidx.databinding.BindingAdapter

object BindingConversions {

    @JvmStatic
    @BindingAdapter(value = ["android:spannableText", "android:imageIcon"], requireAll = true)
    fun bindSpannableText(
        view: TextView,
        text: String,
        imageIcon: Drawable
    ) {
        val span = SpannableString(text)
        imageIcon.setBounds(0, 0, imageIcon.intrinsicWidth, imageIcon.intrinsicHeight)
        val image = ImageSpan(imageIcon, ImageSpan.ALIGN_CENTER)
        val startIndex = text.indexOf("%icon%")
        span.setSpan(image, startIndex, startIndex + 6, Spannable.SPAN_INCLUSIVE_INCLUSIVE)
        view.text = span
    }

}