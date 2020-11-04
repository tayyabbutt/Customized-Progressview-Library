package com.ontech.progressview

import android.animation.Animator
import android.animation.Animator.AnimatorListener

fun Animator.doStartAndFinish(
  start: () -> Unit,
  finish: () -> Unit
) {
  addListener(object : AnimatorListener {
    override fun onAnimationStart(p0: Animator?) = start()
    override fun onAnimationEnd(p0: Animator?) = finish()
    override fun onAnimationCancel(p0: Animator?) = Unit
    override fun onAnimationRepeat(p0: Animator?) = Unit
  })
}
