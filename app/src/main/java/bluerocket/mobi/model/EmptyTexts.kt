package bluerocket.mobi.model

import bluerocket.mobi.utils.logd
import java.util.*

/**
 * Created by liuxiaoyuan on 2015/10/7.
 */

private val emptyTexts = arrayOf(
    "No things is good things.",
    "Everything is done.",
    "Life gives us new lessons each day not for learning but to improve our understanding.",
    "Always keep in mind you are unique – just like everybody else.",
    "Always ask yourself, If not me, then who. And if not now, then when.",
    "Success is focusing the full power of all you are on what you have a burning desire to achieve.",
    "The difference between failure and success is doing a thing nearly right and doing a thing exactly right.",
    "God gave us two ends: one to sit on and one to think with. Success depends on which one you use. Heads you win; tails, you lose.",
    "To succeed in life, you need two things: ignorance and confidence.",
    "There is no point at which you can say, “Well, I’m successful now. I might as well take a nap.",
    "The fastest way to succeed is to look as if you’re playing by somebody else’s rules, while quietly playing by your own.",
    "I think if you do something and it turns out pretty good, then you should go do something else wonderful, not dwell on it for too long. Just figure out what’s next.",
    "If you want to change the world, first change your heart."
)

fun randomEmptyText(): String {
  val n = Random().nextInt(emptyTexts.size)
  "next ${n}".logd("ListApp")
  return emptyTexts[n]
}
